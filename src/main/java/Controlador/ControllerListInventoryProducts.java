package Controlador;

import Vista.*;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import Modelo.*;

public class ControllerListInventoryProducts {  
   
    private static Producto producto;
    private static DB db;
    private static GeneralInventary inventarioGeneral = new GeneralInventary();
    private static ModifyInventary modificacionInventario = new ModifyInventary();

    public static void cambiarPanelInventarioG(Inventary inventario){
        inventarioGeneral.setVisible(true);
        inventario.setPanelContenedor(inventarioGeneral);
    }
     
     public static void cambiarPanelInventarioModifi(Inventary inventario){
        modificacionInventario.setVisible(true);
        inventario.setPanelContenedor(modificacionInventario);
     }
     
     public static void borrarPaneles(JPanel panel){
        panel.remove(inventarioGeneral);
        panel.remove(modificacionInventario);
        inventarioGeneral.setVisible(false);
        modificacionInventario.setVisible(false);
        panel.revalidate();
        panel.repaint();
     }

     public static void eliminarRegistros(GeneralInventary productoG){

         db = new DB();
         if(productoG.getCampoIdNE()!=null || productoG.getCampoIdNE()!=""){
            db.eliminar(Integer.parseInt(productoG.getCampoIdNE()));
         }

        
     }

     public static void Actualizar(ModifyInventary productoN){

      DB db = new DB();
      int id = Integer.parseInt(productoN.getCampoId());
      String desc = productoN.getCampoDesc();
      String talla = productoN.getCampoTalla();
      String marca = productoN.getCampoMarca();
      String tipo =  productoN.getCampoTipo();
      double precio = productoN.getCampoPrecio();
      String edadDirigida = productoN.getCampoEdadDirigida();
      int cantidad = productoN.getCampoCantidad();
      String sexo = productoN.getCampoSexo();
     
      producto = new Producto(id, desc, talla, marca, tipo, precio, edadDirigida, cantidad, sexo);
      db.actualizarProducto(producto);

     }

     public static void subir(ModifyInventary productoN){
          
      DB db = new DB();
      int id = Integer.parseInt(productoN.getCampoId());
      String desc = productoN.getCampoDesc();
      String talla = productoN.getCampoTalla();
      String marca = productoN.getCampoMarca();
      String tipo =  productoN.getCampoTipo();
      double precio = productoN.getCampoPrecio();
      String edadDirigida = productoN.getCampoEdadDirigida();
      int cantidad = productoN.getCampoCantidad();
      String sexo = productoN.getCampoSexo();
     
      producto = new Producto(id, desc, talla, marca, tipo, precio, edadDirigida, cantidad, sexo);
      db.insertarProducto(producto);
     
 }
     
     public static void borrarCampos(GeneralInventary inventarioGeneral){
              
          inventarioGeneral.setCampoDescYTipoNE("");
          inventarioGeneral.setCampoCantidad("");
          inventarioGeneral.setCampoIdNE("");
          inventarioGeneral.setCampoPrecioNE("");
     }

     
   //Ve a recuperar los paneles para registrar. Busca en el repositorio o en la copia que tienes en documentos


   public static void enviaDatosTabla(JTable tabla){
    
             db = new DB();
            ArrayList<Producto> listaProductos = db.dameLista();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id"); modelo.addColumn("Descripcion"); modelo.addColumn("Talla"); modelo.addColumn("Marca");
            modelo.addColumn("Tipo"); modelo.addColumn("Precio"); modelo.addColumn("Edad dirigida"); modelo.addColumn("Cantidad");
            modelo.addColumn("Sexo");
         
            for(Producto productos : listaProductos){
   
               Object[] filas = new Object[9];
   
                  filas[0] = productos.getId();
                  filas[1] = productos.getDesc();
                  filas[2] = productos.getTamaño();
                  filas[3] = productos.getMarca();
                  filas[4] = productos.getTipo();
                  filas[5] = productos.getPrecio();
                  filas[6] = productos.getEdadDirigida();
                  filas[7] = productos.getCantidad();
                  filas[8] = productos.getSexo();
                  modelo.addRow(filas);
            }
            tabla.setModel(modelo);
           
         }
}
