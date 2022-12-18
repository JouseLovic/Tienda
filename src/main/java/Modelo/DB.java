package Modelo;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class DB {

    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    private Connection miConexion;

    public DB(){
        miConexion = null;
    }

    public Connection dameConexion(){

        try {
           miConexion = DriverManager.getConnection(url, user, pass);
             System.out.println("Conexion exitosa");
              return miConexion;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Excepción: "+e.getClass());
             return null;
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Excepción: "+ex.getClass());
            return null;
        }
    }


    public void insertarProducto(Producto producto){
              
        PreparedStatement ps = null;
       
          try{
            
              ps = miConexion.prepareCall("Insert into productos_generales (id, descripcion, talla, marca, tipo, precio, edadDirigida, cantidad, sexo) values(?,?,?,?,?,?,?,?,?)");
              
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
               ps.close();
            }catch(Exception ex){
                  JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
           }
        }

        public void actualizarProducto(Producto producto){
            PreparedStatement ps = null;
           
              try{
                 ps = miConexion.prepareCall("Update productos_generales set id = ?, descripcion = ?, talla = ?, marca = ?, tipo = ?, precio = ?, edadDirigida = ?, cantidad = ?, sexo = ?");
                   
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
                  ps.close();

               }catch(Exception ex){
                      JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
               }
    }

    public void eliminar(String id){
          
        Statement ps = null;
            
        try{

           ps = miConexion.createStatement();
           ps.executeUpdate("Delete from productos_generales where id = "+id);
          
            ps.close();
           JOptionPane.showMessageDialog(null, "El registro se ha eliminado exitosamente");
      
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
       }
     }

     public ArrayList<Producto> dameLista(){

        ArrayList<Producto> lista = new ArrayList<>();
        Statement ps;
        ResultSet rs = null;
           
          try{
              ps = miConexion.createStatement();
              rs = ps.executeQuery("Select * from productos_generales order by id");

                while(rs.next()){
                   
                  String id = rs.getString(1);
                  String Descripcion = rs.getString(2);
                  String talla = rs.getString(3);
                  String marca = rs.getString(4);
                  String tipo = rs.getString(5);
                  Double precio = rs.getDouble(6);
                  String edadDirigida = rs.getString(7);
                  int cantidad = rs.getInt(8);
                  String sexo = rs.getString(9);
              
                   Producto producto = new Producto(id, Descripcion, talla, marca, tipo, precio, edadDirigida, cantidad, sexo);
                   lista.add(producto);
                 }
                 rs.close();

          }catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getCause());   
         }
           return lista;
     }
    



    public void cierraConexion(){
        try{
            miConexion.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getCause());
        }

    }



}
