
package Dao;

import Modelo.DB;
import Modelo.Producto;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ProductoDao {
     
          private Connection conexion = null;
          private List<Producto> listaProductos = new ArrayList<>();

          public ProductoDao(){
               DB db = new DB();
               conexion = db.dameConexion();
           }

     public void insertarProducto(Producto producto){
              
             PreparedStatement ps = null;
            
               try{
               
                   ps = conexion.prepareCall("Insert into productos_generales (id, descripcion, talla, marca, tipo, precio, edadDirigida, cantidad, sexo) values(?,?,?,?,?,?,?,?,?)");
                   
                    String id = producto.getId();
                    String desc = producto.getDesc();
                    String talla = producto.getTamaño();
                    String marca = producto.getMarca();
                    String tipo = producto.getTipo();
                    double precio = producto.getPrecio();
                    String edadDirigda = producto.getEdadDirigida();
                    int cantidad = producto.getCantidad();
                    String sexo = producto.getSexo();
                
                   ps.setString(1, id);
                   ps.setString(2, desc);
                   ps.setString(3, talla);
                   ps.setDouble(6, precio);
                   ps.setString(4, marca);
                   ps.setString(5, tipo);
                   ps.setString(7, edadDirigda);
                   ps.setInt(8, cantidad);
                   ps.setString(9, sexo);
                   ps.execute();
                   
                   JOptionPane.showMessageDialog(null, "El registro se subio exitosamente");
               
                 }catch(Exception ex){
                       JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
                }
      }
     
     public void actualizarProducto(Producto producto){
             PreparedStatement ps = null;
            
               try{
                  ps = conexion.prepareCall("Update productos_generales set id = ?, descripcion = ?, talla = ?, marca = ?, tipo = ?, precio = ?, edadDirigida = ?, cantidad = ?, sexo = ?");
                    
                 String id = producto.getId(); 
                 String desc = producto.getDesc();
                 String talla = producto.getTamaño();
                 String marca = producto.getMarca();
                 String tipo = producto.getTipo();
                 double precio = producto.getPrecio();
                 String edadDirigda = producto.getEdadDirigida();
                 int cantidad = producto.getCantidad();
                 String sexo = producto.getSexo();
                    
                 ps.setString(1, id);
                 ps.setString(2, desc);
                 ps.setString(3, talla);
                 ps.setString(4, marca);
                 ps.setString(5, tipo);
                 ps.setDouble(6, precio);
                 ps.setString(7, edadDirigda);
                 ps.setInt(8, cantidad);
                 ps.setString(9, sexo);
                 ps.executeUpdate();
                   
                   JOptionPane.showMessageDialog(null, "El registro se ha actualizado exitosamente");
               
                }catch(Exception ex){
                       JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
                }
           
     }
     
     public void eliminar(Producto producto){
          
        PreparedStatement ps = null;
            
        try{

           ps = conexion.prepareCall("Delete from productos_generales where id = ?");
           
           String id = producto.getId(); 
      
           ps.setString(1, id);
           ps.executeQuery();
    
           JOptionPane.showMessageDialog(null, "El registro se ha eliminado exitosamente");
      
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
       }
     }
     


     public void buscar(){
          
     }
     
     
}
  /*public List<Producto> listaProductos(Producto producto){
          
             PreparedStatement ps = null;
                 ResultSet rs = null;
          
               try{
               
                   ps = conexion.prepareCall("");
                   rs = ps.executeQuery();
                   
                   while(rs.next()){
                        
                       String id = producto.getId();
                       String desc = producto.getDesc();
                       String talla = producto.getTamaño();
                       String marca = producto.getMarca();
                       String tipo = producto.getTipo();
                       double precio = producto.getPrecio();
                       String edadDirigda = producto.getEdadDirigida();
                       int cantidad = producto.getCantidad();
                       String sexo = producto.getSexo();
                        
                       
                     Producto productos = new Producto(id, desc, talla, marca, tipo, precio, edadDirigda, cantidad, sexo);
                     listaProductos.add(productos);
                        
                   }
     
               
                    return listaProductos;
                 }catch(Exception ex){
                       JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());
                       return null;
          }
         
     }*/