package Controlador;

import Modelo.*;
import DAO.*;
import Vista_Formulario.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class ControllerSalidasP {

    private static SalidasDao sDao;

    public static void eliminar(JTable tabla){

        int fila = tabla.getSelectedRow();
        sDao = new SalidasDao();

        if(fila>=0){
            String id_de_factura = (String) tabla.getValueAt(fila, 0);
            sDao.eliminar(id_de_factura);
            enviaDatosTabla(tabla, "");
        }
    }

    public static void insertar(JTable tabla, PanelSalida pSalida) throws SQLIntegrityConstraintViolationException{

        sDao = new SalidasDao();

        try{

        String nFactura = pSalida.getCampoNFactura();
        String codigoP = pSalida.getCampoIdProducto();
        String desc = pSalida.getCampoDescripcion();
        String fecha = pSalida.getCampoFecha();
        double precio = pSalida.getCampoPrecio();
        int cantidad = pSalida.getCampoCantidad();
        String cedula = pSalida.getCampoCliente();

                SalidasProduct salida = new SalidasProduct(nFactura, codigoP, desc, fecha, precio, cantidad, cedula);
                sDao.insertarSalidaP(salida, codigoP, cantidad);
                enviaDatosTabla(tabla, "");

         }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error en la clase ControllerSalidasP de tipo: "+ex.getMessage());
        }
    }

    public static void enviaDatosTabla(JTable tabla, String nombre){

        sDao = new SalidasDao();
        ArrayList<SalidasProduct> listaEntradas = sDao.mostrar(nombre);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id de factura"); modelo.addColumn("Codigo de producto");
        modelo.addColumn("Descripción del producto"); modelo.addColumn("Fecha");
        modelo.addColumn("Precio de factura"); modelo.addColumn("Cantidad de entrada");
        modelo.addColumn("Cedula del cliente");

             for(SalidasProduct productos : listaEntradas){
                  
                   Object[] filas = new Object[9];
                       filas[0] = productos.getNumFactura();
                       filas[1] = productos.getCodigoProducto();
                       filas[2] = productos.getDescripcionProducto();
                       filas[3] = productos.getFecha();
                       filas[4] = productos.getPrecio();
                       filas[5] = productos.getCantidad();
                       filas[6] = productos.getIdCliente();
                       modelo.addRow(filas);
             }
   tabla.setModel(modelo);
}

    public static void mostrarBusqueda(String id){



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

    public static void mandaCampos(JTable tabla, PanelSalida entradas){

        int fila = tabla.getSelectedRow();
      
        if(fila>=0){
           entradas.setCampoNFactura((String) tabla.getValueAt(fila, 0));
           entradas.setCampoIdProducto((String) tabla.getValueAt(fila, 1));
           entradas.setCampoDescripcion((String) tabla.getValueAt(fila, 2));
           entradas.setCampoFecha((String) tabla.getValueAt(fila, 3));
           entradas.setCampoPrecio(String.valueOf(tabla.getValueAt(fila, 4)));
           entradas.setCampoCantidad(String.valueOf(tabla.getValueAt(fila, 5)));
           entradas.setCampoCliente((String) tabla.getValueAt(fila, 6));
        }

    }


    public static void limpiaCampos(PanelSalida entrada){
           entrada.setCampoNFactura("");
           entrada.setCampoIdProducto("");
           entrada.setCampoDescripcion("");
           entrada.setCampoFecha("");
           entrada.setCampoPrecio(null);
           entrada.setCampoCantidad("");
           entrada.setCampoCliente("");
    }


    public static boolean validarNumerosEnteros(String texto){//para id y cantidad
        return texto.matches("^-?[0-9]{0,99999}+$");//los corchetes validan entre el 0, hasta el 99999
     }

     public static boolean validarNumerosDecimales(String texto){//este es para que permitas a precio ser un double
        return texto.matches("^-?[0-9]+([\\.][0-9]+)$");//los parentesis es como "es opcional que este esto"
     }


}

