
package Repository;

import Model.*;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VendorRepo {
      
      private DB db;

    public void insertarProveedor(Vendor proveedor){
        db = new DB();
        Connection conecta = db.dameConexion();
        PreparedStatement ps = null;
        
        try{
         
            ps = conecta.prepareCall("Insert into proveedor (id_proveedor, nombre, fechaNacimiento, cedula, email, empresa, articulos) values(?,?,?,?,?,?,?)");
               
               String idProveedor = proveedor.getIdProveedor();
               String nombre = proveedor.getNombre();
               String edad = proveedor.getFechaNacimiento();
               String cedula = proveedor.getCedula();
               String email = proveedor.getEmail();
               String empresa = proveedor.getEmpresa();
               String articulo = proveedor.getArticulos();
              
              ps.setString(1, idProveedor);
              ps.setString(2, nombre);
              ps.setString(3, edad);
              ps.setString(4, cedula);
              ps.setString(5, email);
              ps.setString(6, empresa);
              ps.setString(7, articulo);
              ps.execute();
               
              JOptionPane.showMessageDialog(null, "El registro se subio exitosamente");
               ps.close();
               db.cierraConexion(conecta);
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Ya hay un proveedor con ese nombre. Por favor, escriba otro");
                db.cierraConexion(conecta);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido. Excepcion tipo: "+e.getMessage());
                db.cierraConexion(conecta);
            }
        }

        public void actualizaProveedor(Vendor proveedor, String idProv){
            db = new DB();
            Connection conecta = db.dameConexion();
            PreparedStatement ps = null;
            
            try{
            
                ps = conecta.prepareCall("Update proveedor set id_proveedor = ?, nombre = ?, fechaNacimiento = ?, cedula = ?,email = ?, empresa = ?, articulos = ? where id_proveedor ='"+idProv+"'");
                   
                   String idProveedor = proveedor.getIdProveedor(); 
                   String nombre = proveedor.getNombre();
                   String edad = proveedor.getFechaNacimiento();
                   String cedula = proveedor.getCedula();
                   String email = proveedor.getEmail();
                   String empresa = proveedor.getEmpresa();
                   String articulo = proveedor.getArticulos();
                  
                  ps.setString(1, idProveedor);
                  ps.setString(2, nombre);
                  ps.setString(3, edad);
                  ps.setString(4, cedula);
                  ps.setString(5, email);
                  ps.setString(6, empresa);
                  ps.setString(7, articulo);
                  ps.executeUpdate();
                   
                  JOptionPane.showMessageDialog(null, "El registro se actualizó correctamente se subio exitosamente");
                   ps.close();
                   db.cierraConexion(conecta);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Un error ha ocurrido. Excepcion tipo: "+e.getMessage());
                }
          
    }

    public void eliminar(String nombreP){
       db = new DB();
       Connection conecta = db.dameConexion();
        Statement ps = null;
            
        try{
          conecta.setAutoCommit(false);
            ps = conecta.createStatement();
            ps.executeUpdate("Delete from proveedor where nombre = '"+nombreP+"'");
            conecta.commit();
            ps.close();
            db.cierraConexion(conecta);
           JOptionPane.showMessageDialog(null, "El registro se ha eliminado exitosamente");
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getCause());  
              try {
                conecta.rollback();
              } catch (SQLException e) {
                e.printStackTrace();
              }
       }
     }

     public ArrayList<Vendor> mostrar(){
        db = new DB();
        Connection conecta = db.dameConexion();
        ArrayList<Vendor> listaEspecifica = new ArrayList<>();
        Statement ps;
        ResultSet rs = null;


          try{
              ps = conecta.createStatement();

              rs = ps.executeQuery("Select * from proveedor order by id_proveedor");
        
              while(rs.next()){

                String idProveedor = rs.getString(1);
                String nombre = rs.getString(2);
                String edad  = rs.getString(3);
                String cedula = rs.getString(4); 
                String email = rs.getString(5);
                String empresa = rs.getString(6);
                String articulo= rs.getString(7);
                
               
                 Vendor proveedor = new Vendor(idProveedor, nombre, edad, cedula, email, empresa, articulo);
                 listaEspecifica.add(proveedor);
               }
               rs.close();
               db.cierraConexion(conecta);
          }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
            return null;
          }catch(NullPointerException ex){
            ex.printStackTrace();
            return null;
          }
        return listaEspecifica;
     }

    public int getQuantityVendors(){
        db = new DB();
        Connection conecta = db.dameConexion();
        int quantity = 0;
        Statement ps;
        ResultSet rs = null;


        try{
            ps = conecta.createStatement();

            rs = ps.executeQuery("Select * from proveedor order by id_proveedor");

            while(rs.next()){
                quantity++;
            }
            rs.close();
            db.cierraConexion(conecta);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());

        }catch(NullPointerException ex){
            ex.printStackTrace();
        }
        return quantity;
    }

      
      
      
      
}
