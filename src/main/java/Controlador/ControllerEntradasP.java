package Controlador;

import Modelo.DBProd;
import Modelo.DB_entrada;
import Modelo.EntradaProductos;
import Modelo.Producto;
import Vista_Formulario.PanelEntrada;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ControllerEntradasP {

    private static PanelEntrada entradas = new PanelEntrada();
    private static DB_entrada db;

    public static void eliminar(JTable tabla){

        int fila = tabla.getSelectedRow();
        db = new DB_entrada();

        if(fila>=0){
            String id_de_factura = (String) tabla.getValueAt(fila, 0);
            String codigo_Producto = (String) tabla.getValueAt(fila, 1);
            db.eliminar(codigo_Producto, id_de_factura);
            enviaDatosTabla(tabla, "");
        }
    }

    public static void insertar(JTable tabla, PanelEntrada entrada){

        db = new DB_entrada();
        String nFactura = entrada.getCampoNFactura();
        String codigoP = entrada.getCampoCodigoProducto();
        String desc = entrada.getCampoDescripcion();
        String fecha = entrada.getCampoFecha();
        double precio = entrada.getCampoPrecio();
        int cantidad = Integer.parseInt(entrada.getCampoCantidad());
        String seccion = entrada.getCampoSeccionE();
        String marca = entrada.getCampoMarcaE();
        String idProveedor = entrada.getCampoProveedor();

        EntradaProductos EntryProducts = new EntradaProductos(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
        db.insertarEntradaP(EntryProducts);
        enviaDatosTabla(tabla, "");
    }

    public static void enviaDatosTabla(JTable tabla, String nombre){

        db = new DB_entrada();
        ArrayList<EntradaProductos> listaEntradas = db.mostrar(nombre);
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

    public static void mostrarBusqueda(String id){



    }

    public static void llenaComboBox(PanelEntrada entrada){

        

    }

    public static void mandaCampos(JTable tabla, PanelEntrada entradas){

        int fila = tabla.getSelectedRow();
      
        if(fila>=0){
           entradas.setCampoNFactura((String) tabla.getValueAt(fila, 0));
           entradas.setCampoCodigoProducto((String) tabla.getValueAt(fila, 1));
            
        }

    }


    public static void limpiaCampos(PanelEntrada lEntrada){





    }



}
