
package Controlador;

import Dao.ProductoDao;
import Modelo.Producto;
import Vista_Formulario.PanelNuevoProducto;

public class ControllerNewProduct {
     
     private static Producto producto;
     private static ProductoDao productoDao; //Descomenta cuando el localhost este activo sino dara error
    
     
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
          
         productoDao = new ProductoDao();
          
         
         String id = productoN.getCampoId();
         String desc = productoN.getCampoDesc();
         String talla = productoN.getCampoTalla();
         String marca = productoN.getCampoMarca();
         String tipo =  productoN.getCampoTipo();
         double precio = productoN.getCampoPrecio();
         String edadDirigida = productoN.getCampoEdadDirigida();
         int cantidad = productoN.getCampoCantidad();
         String sexo = productoN.getCampoSexo();
         
         if(!id.equals("")){
               producto = new Producto(id, desc, talla, marca, tipo, precio, edadDirigida, cantidad, sexo);
               productoDao.insertarProducto(producto);
         }
         else{
           
         }
         
         
     }
     
     public static void cancelar(){
        //En vez de hacer que cambie de panel, haz que todo lo subido de la tabla se elimine y no haya logrado mandar nada a 
        //la DB
     }
     
     
     
     
}
