package Modelo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DBProv {
    
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    private Connection miConexion;

    public Connection dameConexion(){
        miConexion = null;

        try {
           miConexion = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Excepción: "+e.getClass());
        }
         return miConexion;
    }


    public void insertarProveedor(Proveedores proveedor){
              
        Connection conecta = dameConexion();
        PreparedStatement ps = null;
       
          try{

              ps = conecta.prepareCall("Insert into proveedor (id, descripcion, talla, marca, tipo, precio, edadDirigida, cantidad, sexo) values(?,?,?,?,?,?,?,?,?)");
              
               String nombre = proveedor.getNombre();
               int desc = proveedor.getEdad();
               String talla = proveedor.getTamaño();
               String marca = proveedor.getMarca();
               String tipo =proveedor.getTipo();
               double precio = proveedor.getPrecio();
               String edadDirigda = proveedor.getEdadDirigida();
               int cantidad = proveedor.getCantidad();
               String sexo = proveedor.getSexo();
           
              ps.setInt(1, id);
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
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Un producto ya tiene ese id. Por favor, escriba otro");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido. Excepcion tipo: "+e.getMessage());
            }
        }

        public void actualizarProducto(Producto producto, int idP){

            Connection conecta = dameConexion();
            PreparedStatement ps = null;
           
              try{
                 ps = conecta.prepareCall("Update productos_generales set id = ?, descripcion = ?, talla = ?, marca = ?, tipo = ?, precio = ?, edadDirigida = ?, cantidad = ?, sexo = ? where id = "+idP+"");
                
                int id = producto.getId();
                String desc = producto.getDesc();
                String talla = producto.getTamaño();
                String marca = producto.getMarca();
                String tipo = producto.getTipo();
                double precio = producto.getPrecio();
                String edadDirigda = producto.getEdadDirigida();
                int cantidad = producto.getCantidad();
                String sexo = producto.getSexo();
                   
                  ps.setInt(1, id);
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

    public void eliminar(int id){
          
       Connection conecta = dameConexion();
        Statement ps = null;
            
        try{

           ps = conecta.createStatement();
           ps.executeUpdate("Delete from productos_generales where id = "+id);
            ps.close();
           JOptionPane.showMessageDialog(null, "El registro se ha eliminado exitosamente");
      
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getCause());  
       }
     }

     public ArrayList<Producto> dameLista(){

        Connection conecta = dameConexion();
        ArrayList<Producto> lista = new ArrayList<>();
        Statement ps;
        ResultSet rs = null;


          try{
              ps = conecta.createStatement();
              rs = ps.executeQuery("select * from productos_generales group by id");

                while(rs.next()){
                   
                  int id = rs.getInt(1);
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
