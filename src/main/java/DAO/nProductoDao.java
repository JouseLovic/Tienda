
package DAO;

import Modelo.*;
import java.sql.*;
import java.util.ArrayList;

import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JOptionPane;

public class nProductoDao {
 
       private DB db;
  
       public void confirmarVendida(String vendido, String idP){

        db = new DB();
        Connection conecta = db.dameConexion();
        PreparedStatement ps = null;

            try {
                ps = conecta.prepareCall("Update productos_generales set Producto_vendido = ?, cantidad = '"+0+"'  where id = '"+idP+"'");
                ps.setString(1, vendido);
                ps.executeUpdate();  
                ps.close();
                
            }catch(Exception ex){
                System.out.println(ex.getCause());
                JOptionPane.showMessageDialog(null, "Error en la clase 'nProductoDao' debido a: "+ex.getMessage());
            }

    }

    public void insertarProducto(Producto producto){
         db = new DB();
         Connection conecta = db.dameConexion();
         PreparedStatement ps = null;
        
       
          try{

              ps = conecta.prepareCall("Insert into productos_generales (id, descripcion, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, id_proveedor, Producto_vendido) values(?,?,?,?,?,?,?,?,?,?,?)");
              
               String id = producto.getId();
               String desc = producto.getDesc();
               String talla = producto.getTamaño();
               String marca = producto.getMarca();
               String seccion = producto.getSeccion();
               double precio = producto.getPrecio();
               String edadDirigda = producto.getEdadDirigida();
               int cantidad = producto.getCantidad();
               String sexo = producto.getSexo();
               String idProveedor = producto.getIdProveedor();
               String vendido = producto.getVendido();
           
              ps.setString(1, id);
              ps.setString(2, desc);
              ps.setString(3, talla);
              ps.setDouble(6, precio);
              ps.setString(4, marca);
              ps.setString(5, seccion);
              ps.setString(7, edadDirigda);
              ps.setInt(8, cantidad);
              ps.setString(9, sexo);
              ps.setString(10, idProveedor);
              ps.setString(11, vendido);
              ps.execute();
               
               ps.close();
               db.cierraConexion(conecta);
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Un producto ya tiene ese id. Por favor, escriba otro");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido. Excepcion tipo: "+e.getMessage());
            }
        }

        public void actualizarProducto(Producto producto, String idP){
              db = new DB();
            Connection conecta = db.dameConexion();
            PreparedStatement ps = null;
           
              try{
                 ps = conecta.prepareCall("Update productos_generales set id = ?, descripcion = ?, talla = ?, marca = ?, seccion = ?, precio = ?, edadDirigida = ?, cantidad = ?, sexo = ?, id_proveedor = ?, Producto_vendido = ?  where id = '"+idP+"'");
                
                String id = producto.getId();
                String desc = producto.getDesc();
                String talla = producto.getTamaño();
                String marca = producto.getMarca();
                String seccion = producto.getSeccion();
                double precio = producto.getPrecio();
                String edadDirigda = producto.getEdadDirigida();
                int cantidad = producto.getCantidad();
                String sexo = producto.getSexo();
                String vendido = producto.getVendido();
                String idProveedor = producto.getIdProveedor();
                   
                  ps.setString(1, id);
                  ps.setString(2, desc);
                  ps.setString(3, talla);
                  ps.setString(4, marca);
                  ps.setString(5, seccion);
                  ps.setDouble(6, precio);
                  ps.setString(7, edadDirigda);
                  ps.setInt(8, cantidad);
                  ps.setString(9, sexo);
                  ps.setString(10, idProveedor);
                  ps.setString(11, vendido);
                  ps.executeUpdate();

                  ps.close();
                  db.cierraConexion(conecta);
               }catch(Exception ex){
                      JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
                      ex.printStackTrace();
               }
    }

    public void sumaCantidadOpcion(String idProducto, int cantidad){

      db = new DB();
      Connection conexion = db.dameConexion();
      CallableStatement suma = null;

      try {
        
        conexion.setAutoCommit(false);

        suma = conexion.prepareCall("{call sumaCantidadProducto(?,?)}");

        suma.setString(1, idProducto);
        suma.setInt(2, cantidad);

        suma.executeQuery();

        conexion.commit();
        suma.close();
        db.cierraConexion(conexion);
      } catch (Exception e) {
           e.printStackTrace();
              try {
                conexion.rollback();
              } catch (SQLException e1) {
                 e1.printStackTrace();
              }
      }
  }

  public void restarCantidadOpcion(String idProducto, int cantidad){

    db = new DB();
    Connection conexion = db.dameConexion();
    CallableStatement resta = null;

        try {
      
          conexion.setAutoCommit(false);

          resta = conexion.prepareCall("{call restarCantidadProducto(?,?)}");

          resta.setString(1, idProducto);
          resta.setInt(2, cantidad);

          resta.executeQuery();

          conexion.commit();
          resta.close();
          db.cierraConexion(conexion);
        } catch (Exception e) {
            e.printStackTrace();
              try {
                  conexion.rollback();
              } catch (SQLException e1) {
                    e1.printStackTrace();
              }
        }
  }

    public void eliminar(String id){
          db = new DB();
       Connection conecta =db. dameConexion();
        Statement ps = null;
            
        try{

           ps = conecta.createStatement();
           ps.executeUpdate("Delete from productos_generales where id = '"+id+"'");
           ps.close();
           db.cierraConexion(conecta);
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
       }
     }

    public synchronized int mostrarCantidad(){
        db = new DB();
        int cantidadAux = 0;
        Connection conecta = db.dameConexion();
        Statement ps = null;
        ResultSet rs = null;

        try{
            ps = conecta.createStatement();
            rs = ps.executeQuery("Select * from productos_generales");

            while(rs.next()){

                int cantidad = rs.getInt(8);
                cantidadAux += (cantidad);
            }
            rs.close();
            db.cierraConexion(conecta);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
            db.cierraConexion(conecta);
            return 0;
        }
        return cantidadAux;
    }

     public ArrayList<Producto> mostrarTodos(String nombre){
      db = new DB();
        Connection conecta = db.dameConexion();
        ArrayList<Producto> listaEspecifica = new ArrayList<>();
        Statement ps = null;
        ResultSet rs = null;


          try{
              ps = conecta.createStatement();

              if(!nombre.equalsIgnoreCase("")){
                  rs = ps.executeQuery("Select * from productos_generales where id like'%"+nombre+"%'");
              }
              else {
                  rs = ps.executeQuery("Select * from productos_generales order by id");
              }
            
                while(rs.next()){
                   
                    String id = rs.getString(1);
                    String Descripcion = rs.getString(2);
                    String talla = rs.getString(3);
                    String marca = rs.getString(4);
                    String seccion = rs.getString(5);
                    Double precio = rs.getDouble(6);
                    String edadDirigida = rs.getString(7);
                    int cantidad = rs.getInt(8);
                    String sexo = rs.getString(9);
                    String idProveedor = rs.getString(10);
                    String vendido = rs.getString(11);

                     Producto producto = new Producto(id, Descripcion, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                     listaEspecifica.add(producto);
                   }
                   rs.close();
               db.cierraConexion(conecta);
          }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
            db.cierraConexion(conecta);
            return null;
          }
        return listaEspecifica;
     }

     public ArrayList<Producto> mostrarSeleccionDesc(String texto){
            db = new DB();
      Connection conecta = db.dameConexion();
      ArrayList<Producto> listaEspecifica = new ArrayList<>();
      Statement ps = null;
      ResultSet rs = null;

        try{
            ps = conecta.createStatement();
            if(!texto.equalsIgnoreCase("")){
              rs = ps.executeQuery("Select * from productos_generales where descripcion like'%"+texto+"%'");
            }
            else if(texto.equalsIgnoreCase("")){
              rs = ps.executeQuery("Select * from productos_generales order by descripcion");
            }
  
              while(rs.next()){
                 
                  String id = rs.getString(1);
                  String Descripcion = rs.getString(2);
                  String talla = rs.getString(3);
                  String marca = rs.getString(4);
                  String seccion = rs.getString(5);
                  Double precio = rs.getDouble(6);
                  String edadDirigida = rs.getString(7);
                  int cantidad = rs.getInt(8);
                  String sexo = rs.getString(9);
                  String idProveedor = rs.getString(10);
                  String vendido = rs.getString(11);
              
                   Producto producto = new Producto(id, Descripcion, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                   listaEspecifica.add(producto);
                 }
                 rs.close();
             db.cierraConexion(conecta);
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
            db.cierraConexion(conecta);
          return null;
        }
      return listaEspecifica;
   }


   public ArrayList<Producto> mostrarSeleccionSeccion(String texto){
      db = new DB();
    Connection conecta = db.dameConexion();
    ArrayList<Producto> listaEspecifica = new ArrayList<>();
    Statement ps = null;
    ResultSet rs = null;

      try{
          ps = conecta.createStatement();
          if(!texto.equals("")){
            rs = ps.executeQuery("Select * from productos_generales where seccion like'%"+texto+"%'");
          }
          else if(texto.equals("")){
            rs = ps.executeQuery("Select * from productos_generales order by seccion");
          }
      

            while(rs.next()){
               
                String id = rs.getString(1);
                String Descripcion = rs.getString(2);
                String talla = rs.getString(3);
                String marca = rs.getString(4);
                String seccion = rs.getString(5);
                Double precio = rs.getDouble(6);
                String edadDirigida = rs.getString(7);
                int cantidad = rs.getInt(8);
                String sexo = rs.getString(9);
                String idProveedor = rs.getString(10);
                String vendido = rs.getString(11);
            
                 Producto producto = new Producto(id, Descripcion, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                 listaEspecifica.add(producto);
               }
               rs.close();
           db.cierraConexion(conecta);
      }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
            db.cierraConexion(conecta);
        return null;
      }
    return listaEspecifica;
 }

      public ArrayList<Producto> mostrarSeleccionMarca(String texto){
      db = new DB();
            Connection conecta = db.dameConexion();
            ArrayList<Producto> listaEspecifica = new ArrayList<>();
             Statement ps = null;
            ResultSet rs = null;

                  try{
                        ps = conecta.createStatement();
                        if(!texto.equalsIgnoreCase("")){
                          rs = ps.executeQuery("Select * from productos_generales where marca like'%"+texto+"%'");
                        }
                        else if(texto.equalsIgnoreCase("")){
                          rs = ps.executeQuery("Select * from productos_generales order by marca");
                        }

                              while(rs.next()){
             
                                    String id = rs.getString(1);
                                    String Descripcion = rs.getString(2);
                                    String talla = rs.getString(3);
                                    String marca = rs.getString(4);
                                    String seccion = rs.getString(5);
                                    Double precio = rs.getDouble(6);
                                    String edadDirigida = rs.getString(7);
                                    int cantidad = rs.getInt(8);
                                    String sexo = rs.getString(9);
                                    String idProveedor = rs.getString(10);
                                    String vendido = rs.getString(11);
          
                              Producto producto = new Producto(id, Descripcion, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                              listaEspecifica.add(producto);
                        }
                        rs.close();
                        db.cierraConexion(conecta);
                  }catch(SQLException ex){
                        JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
                        db.cierraConexion(conecta);
             return null;
            }
      return listaEspecifica;
      }

    public ArrayList<Producto> mostrarSeleccionId(String texto){
        db = new DB();
        Connection conecta = db.dameConexion();
        ArrayList<Producto> listaEspecifica = new ArrayList<>();
        Statement ps = null;
        ResultSet rs = null;

            try{
                ps = conecta.createStatement();
                if(!texto.equalsIgnoreCase("")){
                  rs = ps.executeQuery("Select * from productos_generales where id like'%"+texto+"%'");
                }
                else if(texto.equalsIgnoreCase("")){
                  rs = ps.executeQuery("Select * from productos_generales order by id asc");
                }
  

                  while(rs.next()){
             
                    String id = rs.getString(1);
                    String Descripcion = rs.getString(2);
                    String talla = rs.getString(3);
                    String marca = rs.getString(4);
                    String seccion = rs.getString(5);
                    Double precio = rs.getDouble(6);
                    String edadDirigida = rs.getString(7);
                    int cantidad = rs.getInt(8);
                    String sexo = rs.getString(9);
                    String idProveedor = rs.getString(10);
                    String vendido = rs.getString(11);
          
                      Producto producto = new Producto(id, Descripcion, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                      listaEspecifica.add(producto);
                }
              rs.close();
              db.cierraConexion(conecta);
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
              db.cierraConexion(conecta);
              return null;
          }
    return listaEspecifica;
  }

      
}
