package Modelo;

import java.sql.*;
import java.util.*;
import javax.swing.*;

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
           cierraConexion(miConexion);
        }
         return miConexion;
    }


    public void insertarProveedor(Proveedores proveedor){
              
        Connection conecta = dameConexion();
        PreparedStatement ps = null;
        
        try{
         
            ps = conecta.prepareCall("Insert into proveedor (id_de_proveedor, nombre, fechaNacimiento, cedula, email, empresa, articulos) values(?,?,?,?,?,?,?)");
               
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
               cierraConexion(conecta);
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Ya hay un proveedor con ese nombre. Por favor, escriba otro");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido. Excepcion tipo: "+e.getMessage());
            }
        }

        public void actualizaProveedor(Proveedores proveedor, String idProv){
            Connection conecta = dameConexion();
            PreparedStatement ps = null;
            
            try{
            
                ps = conecta.prepareCall("Update proveedor set id_de_proveedor = ?, nombre = ?, fechaNacimiento = ?, cedula = ?,email = ?, empresa = ?, articulos = ? where id_de_proveedor ='"+idProv+"'");
                   
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
                   cierraConexion(conecta);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Un error ha ocurrido. Excepcion tipo: "+e.getMessage());
                }
          
    }

    public void eliminar(String nombreP){
          
       Connection conecta = dameConexion();
        Statement ps = null;
            
        try{
          conecta.setAutoCommit(false);
            ps = conecta.createStatement();
            ps.executeUpdate("Delete from proveedor where nombre = '"+nombreP+"'");
            conecta.commit();
            ps.close();
            cierraConexion(conecta);
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

     public ArrayList<Proveedores> dameLista(){

      Connection conecta = dameConexion();
      ArrayList<Proveedores> lista = new ArrayList<>();
      Statement ps;
      ResultSet rs = null;


        try{
            ps = conecta.createStatement();
            rs = ps.executeQuery("select * from proveedores group by empresa");

              while(rs.next()){

              String idProveedor = rs.getString(1);
              String nombre = rs.getString(2);
              String fechaNacimiento = rs.getString(3);
              String cedula = rs.getString(4);
              String email = rs.getString(5);
              String empresa = rs.getString(6);
              String articulos = rs.getString(7);
                
                Proveedores proveedor = new Proveedores(idProveedor, nombre, fechaNacimiento, cedula, email, empresa, articulos);
                 lista.add(proveedor);
               }
               rs.close();
               cierraConexion(conecta);
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getCause());   
            cierraConexion(conecta);
          }
         return lista;
   }
  
     
     public ArrayList<Proveedores> mostrar(String nombreProv){

        Connection conecta = dameConexion();
        ArrayList<Proveedores> listaEspecifica = new ArrayList<>();
        Statement ps;
        ResultSet rs = null;


          try{
              ps = conecta.createStatement();

              if(!nombreProv.equals("")) {rs = ps.executeQuery("select * from proveedor where nombre = '"+nombreProv+"'");
          }
              else { rs = ps.executeQuery("Select * from proveedor group by empresa");
        }
              while(rs.next()){

                String idProveedor = rs.getString(1);
                String nombre = rs.getString(2);
                String edad  = rs.getString(3);
                String cedula = rs.getString(4); 
                String email = rs.getString(5);
                String empresa = rs.getString(6);
                String articulo= rs.getString(7);
                
               
                Proveedores proveedor = new Proveedores(idProveedor, nombre, edad, cedula, email, empresa, articulo);
                 listaEspecifica.add(proveedor);
               }
               rs.close();
               cierraConexion(conecta);
          }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
            return null;
          }
        return listaEspecifica;
     }

    public void cierraConexion(Connection conexion){
        try{
            conexion.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getCause());
        }

    }

  }
  
