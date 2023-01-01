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
    private static boolean Exist = false, sumaCantidad = false;

    public static void eliminar(JTable tabla){

        int fila = tabla.getSelectedRow();
        eDao = new EntradasDao();

        if(fila>=0){
            String id_de_factura = (String) tabla.getValueAt(fila, 0);
            eDao.eliminar(id_de_factura);
            enviaDatosTabla(tabla, "");
        }
    }

    public static void insertar(JTable tabla, PanelEntrada entrada) throws SQLIntegrityConstraintViolationException{

        eDao = new EntradasDao();
        ArrayList<Producto> comparativa = new nProductoDao().mostrar("");
        
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

            for (Producto productos : comparativa){
                if(productos.getId().equals(codigoP) && productos.getDesc().equals(desc) && productos.getSeccion().equals(seccion) && productos.getMarca().equals(marca) && productos.getIdProveedor().equals(idProveedor)){
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Desea sumar la cantidad de entrada al producto ya existente que tiene el id de: "+codigoP+"?");
                    if(opcion == 0){
                    Exist = true;
                    sumaCantidad = true;
                    }
                }
                else if(productos.getId().equals(codigoP) && !productos.getDesc().equals(desc) || !productos.getSeccion().equals(seccion) || !productos.getMarca().equals(marca) || !productos.getIdProveedor().equals(idProveedor)){
                    JOptionPane.showMessageDialog(null, "Revise alguno de los campos. A pesar de que el producto ya existe, uno de los valores introducidos no corresponde a este mismo \n"+" Seleccione la fila del producto, o escriba los valores que corresponden al producto: "+codigoP);
                    Exist = true;
                    sumaCantidad = false;//busca la forma de que ese joption pane no se repite tres veces
                }
                else if(!productos.getId().equals(codigoP)){
                    Exist = false;
                    sumaCantidad = false;
                }
            }

            if(Exist == false){
                EntradaProductos EntryProducts = new EntradaProductos(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarEntradaP(EntryProducts);
                enviaDatosTabla(tabla, "");
                }

            if(sumaCantidad == true){
                EntradaProductos EntryProducts = new EntradaProductos(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarProductoExistente(EntryProducts);
                enviaDatosTabla(tabla, "");
            }


            }catch(NumberFormatException ex){
                if(entrada.evaluaCampoPrecio().equals("") || entrada.evaluaCampoPrecio().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
                }
                
                else if(entrada.getCampoCodigoProducto().equals("") || entrada.getCampoCodigoProducto().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
                }
                
                else if(entrada.getCampoCantidad().equals("") || entrada.getCampoCantidad().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
                }
                
                else if(entrada.getCampoCantidad().equals("") || entrada.getCampoCantidad().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
                }

            else if(entrada.getCampoNFactura().equals("") || entrada.getCampoNFactura().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
            }
            
            else if(entrada.getCampoDescripcion().equals("") || entrada.getCampoDescripcion().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
            }

            else if(entrada.getCampoFecha().equals("") || entrada.getCampoFecha().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
            }

            else if(entrada.getCampoMarcaE().equals("") || entrada.getCampoMarcaE().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
            }

            else if(entrada.getCampoSeccionE().equals("") || entrada.getCampoSeccionE().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
            }

            else if(entrada.getCampoProveedor().equals("") || entrada.getCampoProveedor().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
            }
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

        int fila = tabla.getSelectedRow();

        if(!proveedor.equals("Null"))  entradas.setCampoProveedor(proveedor);
        
        else if(proveedor.equals("Null"))  entradas.setCampoProveedor(null);

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
           entrada.setCampoPrecio(null);
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
