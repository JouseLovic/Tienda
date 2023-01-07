package Controlador;

import Modelo.*;
import Vista_Register.PanelNuevaFactura;

import java.awt.event.*;
import java.sql.*;
import java.util.*;
import DAO.*;
import javax.swing.*;
import javax.swing.table.*;

public class ControllerFacturasEntry {
  
    private static FacturaEDao fDao;
    private static nProveedorDao proveedor;

    public static void eliminar(JTable tabla){

        int fila = tabla.getSelectedRow();
        fDao = new FacturaEDao();

        if(fila>=0){
            String id_de_factura = (String) tabla.getValueAt(fila, 0);
            fDao.eliminarFactura(id_de_factura);
            enviaDatosTabla(tabla, "");
        }
    }

    public static void insertarFacturaE(JTable tabla, PanelNuevaFactura facturaN) throws SQLIntegrityConstraintViolationException{

        fDao = new FacturaEDao();

        try{
        String nFactura = facturaN.getCampoNFactura();
        String fecha = facturaN.getCampoFecha();
        Double precio = Double.parseDouble(facturaN.getCampoPrecio());
        Integer cantidad = Integer.parseInt(facturaN.getCampoCantidad());
        String desc = facturaN.getCampoDesc();
        String idProveedor = facturaN.getCampoIdProveedor();
      

                Factura_entrada factura_E = new Factura_entrada(nFactura, fecha, precio, cantidad, desc, idProveedor);
                fDao.insertarFactura(factura_E);
                enviaDatosTabla(tabla, "");

         }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio");
    }
}

    public static void enviaDatosTabla(JTable tabla, String nombre){

        fDao = new FacturaEDao();
        ArrayList<Factura_entrada> listaEntradas = fDao.mostrarFacturas(nombre);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id de factura"); modelo.addColumn("Fecha"); modelo.addColumn("Precio de factura");
        modelo.addColumn("Cantidad"); modelo.addColumn("Descripcion del producto"); 
        modelo.addColumn("id del proveedor");

             for(Factura_entrada facturaE : listaEntradas){
                  
                   Object[] filas = new Object[6];
                       filas[0] = facturaE.getNFactura();
                       filas[1] = facturaE.getFecha();
                       filas[2] = facturaE.getPrecio();
                       filas[3] = facturaE.getCantidad();
                       filas[4] = facturaE.getDescProducto();
                       filas[5] = facturaE.getIdProveedor();
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

    public static void blockFieldWords(JTextField keyTamaño, KeyEvent a){

        if(keyTamaño.getText().length()>=11){
            a.consume();
        }
    }

    public static void mandaProveedor(JTable tabla, String proveedor, PanelNuevaFactura factura){

        if(!proveedor.equals("Null"))  factura.setCampoIdProveedor(proveedor);  
        else if(proveedor.equals("Null")) factura.setCampoIdProveedor(null);

    }
    
    public static void llenaComboBox(JComboBox<String> laLista){

        proveedor = new nProveedorDao();
        ArrayList<Proveedores> lista = null;
        lista = proveedor.mostrar();
  
        for(Proveedores idProv : lista){
            laLista.addItem(idProv.getIdProveedor());
        }
    }

    public static void mandaCampos(JTable tabla, PanelNuevaFactura factura_E){

        int fila = tabla.getSelectedRow();
      
        if(fila>=0){
            factura_E.setCampoNFactura((String) tabla.getValueAt(fila, 0));
            factura_E.setCampoFecha((String) tabla.getValueAt(fila, 1));
            factura_E.setCampoPrecio(String.valueOf(tabla.getValueAt(fila, 2)));
            factura_E.setCampoCantidad(String.valueOf(tabla.getValueAt(fila, 3)));
            factura_E.setCampoDesc((String) tabla.getValueAt(fila, 4));
            factura_E.setCampoIdProveedor((String) tabla.getValueAt(fila, 5));
        }

    }


    public static void limpiaCampos(PanelNuevaFactura entrada){
           entrada.setCampoNFactura("");
           entrada.setCampoDesc("");
           entrada.setCampoFecha("");
           entrada.setListaProveedor("Null");
           entrada.setCampoPrecio(null);
           entrada.setCampoCantidad("");
           entrada.setCampoIdProveedor("");
    }

    
    public static boolean validarNumerosEnteros(String texto){//para id y cantidad
        return texto.matches("^-?[0-9]{0,99999}+$");//los corchetes validan entre el 0, hasta el 99999
     }

     public static boolean validarNumerosDecimales(String texto){//este es para que permitas a precio ser un double
        return texto.matches("^-?[0-9]+([\\.][0-9]+)$");//los parentesis es como "es opcional que este esto"
     }


    }
