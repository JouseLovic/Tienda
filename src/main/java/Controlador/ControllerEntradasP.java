package Controlador;

import Modelo.*;
import DAO.*;
import Vista_Formulario.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class ControllerEntradasP {

    private static EntradasDao eDao;
    private static boolean Exist;
    private static boolean sumaCantidad;
    private static boolean nBillExist;
    private static nProductoDao nDao;

    public static void eliminar(JTable tabla, String nBillOriginal){

        eDao = new EntradasDao();
        eDao.eliminar(nBillOriginal);
        enviaDatosTabla(tabla, "");

    }
    
    public static void compruebaCampos(Producto productos, PanelEntrada entrada, String descripcion, String seccion, String marca, String idProveedor){

        if(!productos.getSeccion().equalsIgnoreCase(seccion)){
            entrada.setLabelSeccion("La seccion no corresponde al producto");
        }

        if(!productos.getDesc().equalsIgnoreCase(descripcion)){
            entrada.setLabelDesc("La descripción no corresponde al producto");
        }

        if(!productos.getMarca().equalsIgnoreCase(marca)){
            entrada.setLabelMarca("La marca no corresponde al producto");
        }
        if(!productos.getIdProveedor().equalsIgnoreCase(idProveedor)){
            entrada.setLabelProveedor("Proveedor invalido");
        }
    }

    public static void insertar(JTable tabla, PanelEntrada entrada, String nBillOriginal) throws SQLIntegrityConstraintViolationException{

        eDao = new EntradasDao();
        Exist = false;
        sumaCantidad = false;
        nBillExist = false;
        ArrayList<Producto> comparativa = null;
        nDao = new nProductoDao();
        comparativa = nDao.mostrarTodos("");


         try{
            String nFactura = entrada.getCampoNFactura();
            String codigoP = entrada.getCampoCodigoProducto();
            String desc = entrada.getCampoDescripcion();
            String fecha = entrada.getCampoFecha();
            double precio = entrada.getCampoPrecio();
            int cantidad = Integer.parseInt(entrada.getCampoCantidad());
            String seccion = entrada.getCampoSeccionE();
            String marca = entrada.getCampoMarcaE();
            String idProveedor = entrada.getCampoProveedor();

             if(nFactura.equalsIgnoreCase(nBillOriginal)) {
                 JOptionPane.showMessageDialog(null, "This bill is exist. Please, change it");
                 nBillExist = true;
             }

                for (Producto productos : comparativa){
                        if(!nBillExist && productos.getId().equalsIgnoreCase(codigoP) && productos.getDesc().equalsIgnoreCase(desc) && productos.getSeccion().equalsIgnoreCase(seccion) && productos.getMarca().equalsIgnoreCase(marca) && productos.getIdProveedor().equals(idProveedor)){
                            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea sumar la cantidad de entrada al producto ya existente que tiene el id de: "+codigoP+"?");
                                if(opcion == 0){
                                    Exist = true;
                                    sumaCantidad = true;
                                    break;
                                }
                        }
                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getDesc().equalsIgnoreCase(desc)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }

                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getSeccion().equalsIgnoreCase(seccion)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }

                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getIdProveedor().equalsIgnoreCase(idProveedor)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }

                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getMarca().equalsIgnoreCase(marca)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }
                    }

            if(!Exist && !nBillExist){
                EntradaProductos EntryProducts = new EntradaProductos(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarEntradaP(EntryProducts);
                enviaDatosTabla(tabla, "");
            }
            else if(sumaCantidad && !nBillExist){
                EntradaProductos EntryProducts = new EntradaProductos(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarProductoExistente(EntryProducts);
                enviaDatosTabla(tabla, "");
            }

            }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "El precio o la cantidad estan vacios. Por favor, llenelos");
        }
    }

    public static void enviaDatosTabla(JTable tabla, String nombre){

        eDao = new EntradasDao();
        ArrayList<EntradaProductos> listaEntradas = eDao.mostrar(nombre);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id de factura"); modelo.addColumn("Codigo de producto");
        modelo.addColumn("Descripcion del producto"); modelo.addColumn("Fecha");
        modelo.addColumn("Precio de factura"); modelo.addColumn("Cantidad de entrada");
        modelo.addColumn("Seccion del producto"); modelo.addColumn("Marca del producto");
        modelo.addColumn("id del proveedor");

             for(EntradaProductos productos : listaEntradas){
                  
                   Object[] filas = new Object[9];
                       filas[0] = productos.getNumFactura();
                       filas[1] = productos.getCodigoProducto();
                       filas[2] = productos.getDescripcionProducto();
                       filas[3] = productos.getFecha();
                       filas[4] = productos.getPrecio();
                       filas[5] = productos.getCantidad();
                       filas[6] = productos.getSeccion();
                       filas[7] = productos.getMarca();
                       filas[8] = productos.getIdProveedor();
                       modelo.addRow(filas);
             }
   tabla.setModel(modelo);
}

    public static void bloqueaLetrasPrecio(int keyNumeros, KeyEvent a){

        boolean numeros = keyNumeros>=48 && keyNumeros>=69;

            if(numeros){
                a.consume();
            }
  
    }

    public static void bloqueaLetrasCantidad(int keyNumeros, KeyEvent a){

        boolean numeros = keyNumeros>=48 && keyNumeros>69;

            if(numeros){
                a.consume();
            }
     
    }

    public static void mandaProveedor(JTable tabla, String proveedor, PanelEntrada entradas){

            if(!proveedor.equals("Ninguno"))  entradas.setCampoProveedor(proveedor);
        
            else if(proveedor.equals("Ninguno"))  entradas.setCampoProveedor(null);

    }

    public static void llenaComboBox(JComboBox<String> laLista){

        eDao = new EntradasDao();
        ArrayList<Proveedores> lista = eDao.buscaProveedores();

        for(Proveedores idP : lista){
            laLista.addItem(idP.getIdProveedor());
        }
    }

    public static void mandaCampos(JTable tabla, PanelEntrada entradas){

        int fila = tabla.getSelectedRow();
      
            if(fila>=0){
                entradas.setCampoNFactura((String) tabla.getValueAt(fila, 0));
                entradas.setCampoCodigoProducto((String) tabla.getValueAt(fila, 1));
                entradas.setCampoDescripcion((String) tabla.getValueAt(fila, 2));
                entradas.setCampoFecha((String) tabla.getValueAt(fila, 3));
                entradas.setCampoPrecio(String.valueOf(tabla.getValueAt(fila, 4)));
                entradas.setCampoCantidad(String.valueOf(tabla.getValueAt(fila, 5)));
                entradas.setCampoSeccionE((String) tabla.getValueAt(fila, 6));
                entradas.setCampoMarcaE((String) tabla.getValueAt(fila, 7));
                entradas.setCampoProveedor((String) tabla.getValueAt(fila, 8));
            }

    }


    public static void limpiaCampos(PanelEntrada entrada){
            Exist = false;
                entrada.setCampoNFactura("");
                entrada.setCampoCodigoProducto("");
                entrada.setCampoDescripcion("");
                entrada.setCampoFecha("");
                entrada.setSeleccionLista(0);
                entrada.setCampoPrecio("");
                entrada.setCampoCantidad("");
                entrada.setCampoSeccionE("");
                entrada.setCampoMarcaE("");
                 entrada.setCampoProveedor("");
    }


    public static boolean validarNumerosEnteros(String texto){//para id y cantidad
        return texto.matches("^-?[0-9]{0,99999}+$");//los corchetes validan entre el 0, hasta el 99999
     }

     public static boolean validarNumerosDecimales(String texto){//este es para que permitas a precio ser un double
        return texto.matches("^-?[0-9]+([\\.][0-9]+)$");//los parentesis es como "es opcional que este esto"
     }

     public static void setExist(boolean reemplaza){
         Exist = reemplaza;
     }


}
