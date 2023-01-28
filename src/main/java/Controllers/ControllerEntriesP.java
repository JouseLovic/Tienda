package Controllers;

import Model.*;
import Repository.*;
import ViewFormulary.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class ControllerEntriesP {

    private static EntriesRepo eDao;
    private static boolean Exist;
    private static boolean sumaCantidad;
    private static boolean nBillExist;
    private static ProductRepo nDao;

    public static void eliminar(JTable tabla, String nBillOriginal){

        eDao = new EntriesRepo();
        eDao.eliminar(nBillOriginal);
        enviaDatosTabla(tabla, "");

    }
    
    public static void compruebaCampos(Product productos, PanelEntrada entrada, String descripcion, String seccion, String marca, String idProveedor){

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

        eDao = new EntriesRepo();
        Exist = false;
        sumaCantidad = false;
        nBillExist = false;
        ArrayList<Product> comparativa = null;
        nDao = new ProductRepo();
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

                for (Product productos : comparativa){
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
                EntriesProducts EntryProducts = new EntriesProducts(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarEntradaP(EntryProducts);
                enviaDatosTabla(tabla, "");
            }
            else if(sumaCantidad && !nBillExist){
                EntriesProducts EntryProducts = new EntriesProducts(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarProductoExistente(EntryProducts);
                enviaDatosTabla(tabla, "");
            }

            }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "El precio o la cantidad estan vacios. Por favor, llenelos");
        }
    }

    public static void enviaDatosTabla(JTable tabla, String nombre){

        eDao = new EntriesRepo();
        ArrayList<EntriesProducts> listEntries = eDao.mostrar(nombre);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id de factura"); model.addColumn("Codigo de producto");
        model.addColumn("Descripcion del producto"); model.addColumn("Fecha");
        model.addColumn("Precio de factura"); model.addColumn("Cantidad de entrada");
        model.addColumn("Seccion del producto"); model.addColumn("Marca del producto");
        model.addColumn("id del proveedor");

             for(EntriesProducts productos : listEntries){
                  
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
                       model.addRow(filas);
             }
   tabla.setModel(model);
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

        eDao = new EntriesRepo();
        ArrayList<Vendor> lista = eDao.buscaProveedores();

        for(Vendor idP : lista){
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
