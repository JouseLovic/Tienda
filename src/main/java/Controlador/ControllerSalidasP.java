package Controlador;

import Modelo.*;
import Vista.FormularioNCliente;
import DAO.*;
import Vista.Vista_Formulario.PanelSalida;
import Vista.Vista_Formulario.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class ControllerSalidasP {

    private static SalidasDao sDao;
    private static ClientesDao cDao;
    private static nProductoDao pDao = new nProductoDao();
    private static ArrayList<Producto> listaP;
    private static ArrayList<Clientes> listaExistClintes;
    private static boolean Exist = false;
    private static boolean cExist = false;
    private static boolean cantidadMayorQue = false;

    public static void eliminar(JTable tabla){

        int fila = tabla.getSelectedRow();
        sDao = new SalidasDao();

            if(fila>=0){
                String idFactura = (String) tabla.getValueAt(fila, 0);
                sDao.eliminar(idFactura);
                enviaDatosTabla(tabla, "");
            }
        }

    public static void insert(JTable tabla, PanelSalida pSalida){

        sDao = new SalidasDao();
        cDao = new ClientesDao();
        int cantidadOriginal = 0;
        Exist = false;
        cExist = false;
        cantidadMayorQue = false;
        listaP = null;
        listaP = pDao.mostrar("");
        listaExistClintes = cDao.searchClients();

            try{

                String nFactura = pSalida.getCampoNFactura();
                String codigoP = pSalida.getCampoIdProducto();
                String desc = pSalida.getCampoDescripcion();
                String fecha = pSalida.getCampoFecha();
                double precio = pSalida.getCampoPrecio();
                int cantidad = pSalida.getCampoCantidad();
                String cedula = pSalida.getCampoCliente();

                for(Clientes cliente : listaExistClintes){
                            if(cliente.getCedula().equals(cedula)){
                                     cExist = true;
                            }
                    }
                
                    for(Producto productos : listaP){

                        if(productos.getId().equals(codigoP) && productos.getDesc().equals(desc) && productos.getCantidad()>=cantidad){
                            Exist = true;  
                            cantidadMayorQue = true;
                        }
                        else if(productos.getId().equals(codigoP) && !productos.getDesc().equals(desc)){
                            Exist = false; 
                        }
                        
                        else if(productos.getId().equals(codigoP) && productos.getCantidad()<cantidad){
                            Exist = true;
                            cantidadMayorQue = false;
                        }

                        if(productos.getId().equals(codigoP)){
                           cantidadOriginal = productos.getCantidad();
                        }
                    }
                        if(Exist && cExist && cantidadMayorQue){
                            SalidasProduct salida = new SalidasProduct(nFactura, codigoP, desc, fecha, precio, cantidad, cedula);
                            sDao.insertarSalidaP(salida, codigoP, cantidad);
                            enviaDatosTabla(tabla, pSalida.getCampoBuscar());
                        }
                        if(!cExist){
                            PanelSalida.setLabelCedula("Esta cedula no esta registrada");
                            int options = JOptionPane.showConfirmDialog(null, "¿Desea crear un cliente con esta cedula?");
                                if(options == 0){
                                    FormularioNCliente nuevoCliente = new FormularioNCliente(null, false);
                                    nuevoCliente.setVisible(true);
                                    FormularioNCliente.setCampoCedula(cedula);
                                }
                        }
                        if(!Exist){
                            JOptionPane.showMessageDialog(null, "El producto no esta registrado");
                        }
                        else if(!cantidadMayorQue){
                                JOptionPane.showMessageDialog(null, "La cantidad ingresada es mayor a la cantidad que esta registrada en el inventario, que es de: "+cantidadOriginal);
                        }           
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error en la clase ControllerSalidasP de tipo: "+ex.getMessage());
            }
        }
        
        public static void actualizarSalida(JTable tabla, int fila, PanelSalida salida){

                sDao = new SalidasDao();
                pDao = new nProductoDao();
                int cantidadProducto = 0;
                cantidadMayorQue = false;
                ArrayList<Producto> listaComprobatoria = pDao.mostrar("");
                String idProductoOriginal = null;
                String idFacturaOriginal = null;
                int cantidadOriginal = 0;

                    if(fila>=0){
                        idProductoOriginal = (String) tabla.getValueAt(fila, 1);
                        idFacturaOriginal = (String) tabla.getValueAt(fila, 0);
                        cantidadOriginal = (int) tabla.getValueAt(fila, 5);
                    }

                String idFactura = salida.getCampoNFactura();
                String idProducto = salida.getCampoIdProducto();
                String desc = salida.getCampoDescripcion();
                String fecha = salida.getCampoFecha();
                Double precio = salida.getCampoPrecio();
                int cantidad = salida.getCampoCantidad();
                int cantidadP = salida.getCampoCantidad();
                String idCliente = salida.getCampoCliente();

                for(Producto productos : listaComprobatoria){

                    if(productos.getId().equals(idProducto) && productos.getCantidad()>=cantidad){
                        cantidadMayorQue = true;
                    }
                    else if(productos.getId().equals(idProducto) && productos.getCantidad()<cantidad){
                        cantidadMayorQue = false;
                    }

                    if(productos.getId().equals(idProducto)){
                        cantidadProducto = productos.getCantidad();
                    }
                }
                    if(cantidadMayorQue){
                            if(cantidad > cantidadOriginal){
                                cantidad -= cantidadOriginal;
                                pDao.restarCantidadOpcion(idProducto, cantidad);
                            }
                            else if(cantidad < cantidadOriginal){
                                cantidadOriginal -= cantidad;
                                pDao.sumaCantidadOpcion(idProducto, cantidadOriginal);
                            } 
                    SalidasProduct sProducto = new SalidasProduct(idFactura, idProducto, desc, fecha, precio, cantidadP, idCliente);
                    sDao.updateOut(sProducto, idFacturaOriginal);  
                    enviaDatosTabla(tabla, salida.getCampoBuscar());
                }
                else{
                    JOptionPane.showMessageDialog(null, "La cantidad que desea ingresar es mayor a la cantidad que hay en el inventario, la cual es de: "+cantidadProducto);
                }
            }

        public static void enviaDatosTabla(JTable tabla, String nombre){

            sDao = new SalidasDao();
            ArrayList<SalidasProduct> listaEntradas = sDao.mostrar(nombre);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id de factura"); modelo.addColumn("Codigo de producto");
            modelo.addColumn("Descripción del producto"); modelo.addColumn("Fecha");
            modelo.addColumn("Precio de compra"); modelo.addColumn("Cantidad de salida");
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
        return texto.matches("^-?\\D{0,99999}+$");//los corchetes validan entre el 0, hasta el 99999
     }

     public static boolean validarNumerosDecimales(String texto){//este es para que permitas a precio ser un double
        return texto.matches("^-?\\d+([\\.]\\d+)$");//los parentesis es como "es opcional que este esto"
     }


}

