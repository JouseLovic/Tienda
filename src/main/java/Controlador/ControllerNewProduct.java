
package Controlador;

import Modelo.DB;
import Modelo.Producto;
import Vista_Formulario.PanelNuevoProducto;

public class ControllerNewProduct {

     static PanelNuevoProducto nProducto = new PanelNuevoProducto();
     private static Producto producto;
     
     public static void borrarCampos(PanelNuevoProducto producto){
          
          producto.setCampoDesc("");
          producto.setCampoCantidad("");
          producto.setCampoEdadDirigida("");
          producto.setCampoId("");
          producto.setCampoMarca("");
          producto.setCampoPrecio("");
          producto.setCampoTalla("");
          producto.setCampoTipo("");
          producto.setCampoSexo("");
          
     }
     
     public static void limpiarTabla(){
          
          
          
     }
     
     public static void eliminar(){
          
     }
     
     public static void subir(PanelNuevoProducto productoN){
          
          DB db = new DB();
          db.dameConexion();
          
         String id = productoN.getCampoId();
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
     
     public static void cancelar(){
        //En vez de hacer que cambie de panel, haz que todo lo subido de la tabla se elimine y no haya logrado mandar nada a 
        //la DB

        
     }

     
}
