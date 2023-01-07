
package DAO;

import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FacturaEDao {
      
      private DB db;

    public void insertarFactura(Factura_entrada facturaE){
         db = new DB();     
        Connection conecta = db.dameConexion();
        PreparedStatement ps = null;
        
          try{

              ps = conecta.prepareCall("Insert into factura_entrada (id_factura, fecha, precio, cantidad, producto, id_proveedor) values(?,?,?,?,?,?)");
              
              String nFactura = facturaE.getNFactura();
              String fecha = facturaE.getFecha();
              Double precio = facturaE.getPrecio();
              int cantidad = facturaE.getCantidad();
              String descripcion = facturaE.getDescProducto();
              String idProveedor = facturaE.getIdProveedor();

              ps.setString(1, nFactura);
              ps.setString(2, fecha);
              ps.setDouble(3, precio);
              ps.setInt(4, cantidad);
              ps.setString(5, descripcion);
              ps.setString(6, idProveedor);
          
               ps.close();
               db.cierraConexion(conecta);
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Un producto ya tiene ese id. Por favor, escriba otro");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido. Excepcion tipo: "+e.getMessage());
            }
        }

        public void actualizarFactura(Factura_entrada facturaE, String idP){
              db = new DB();
            Connection conecta = db.dameConexion();
            CallableStatement factuEntrada = null;
            CallableStatement factura = null;
           
              try{
                conecta.setAutoCommit(false);
                factuEntrada = conecta.prepareCall("{call actualizaFacturaE(?,?,?,?,?,?,?)}");
                factura = conecta.prepareCall("{call actualizaFactura(?,?,?,?,?,?)}");

                 String nFactura = facturaE.getNFactura();
                 String fecha = facturaE.getFecha();
                 Double precio = facturaE.getPrecio();
                 int cantidad = facturaE.getCantidad();
                 String descripcion = facturaE.getDescProducto();
                 String idProveedor = facturaE.getIdProveedor();
   
                 factuEntrada.setString(1, nFactura);
                 factuEntrada.setString(2, fecha);
                 factuEntrada.setDouble(3, precio);
                 factuEntrada.setInt(4, cantidad);
                 factuEntrada.setString(5, descripcion);
                 factuEntrada.setString(6, idProveedor);
                 factuEntrada.setString(7, idP);

                 factura.setString(1, nFactura);
                 factura.setString(2, fecha);
                 factura.setDouble(3, precio);
                 factura.setInt(4, cantidad);
                 factura.setString(5, "Entrada");
                 factura.setString(6, idP);

                 factuEntrada.executeUpdate();
                 factura.executeUpdate();

                 conecta.commit();
                 JOptionPane.showMessageDialog(null, "Registros actualizados");
                 factuEntrada.close();
                  
                  db.cierraConexion(conecta);
               }catch(Exception ex){
                      JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
                      ex.printStackTrace();
                      try {
                        conecta.rollback();
                      } catch (SQLException e) {
                        e.printStackTrace();
                      }
               }
    }

    public void eliminarFactura(String id){
          db = new DB();
       Connection conecta =db. dameConexion();
       CallableStatement factura_E = null;
       CallableStatement factura = null;
            
        try{
           conecta.setAutoCommit(false);
           factura_E = conecta.prepareCall("{call eliminaFactura_entrada(?)}");
           factura = conecta.prepareCall("{call eliminaFactura (?)}");

           factura_E.setString(1, id);
           factura.setString(1, id);
           
           factura_E.executeQuery();
           factura.executeQuery();

           conecta.commit();
           JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
           factura_E.close();
           db.cierraConexion(conecta);
        }catch(Exception ex){
              try {
                conecta.rollback();
              } catch (SQLException e) {
                e.printStackTrace();
              }
              JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
       }
     }

        public ArrayList<Factura_entrada> mostrarFacturas(String nombre){
            db = new DB();
            Connection conecta = db.dameConexion();
            ArrayList<Factura_entrada> listaEspecifica = new ArrayList<>();
            Statement ps = null;
            ResultSet rs = null;


              try{
                ps = conecta.createStatement();

                  if(!nombre.equals("")){  rs = ps.executeQuery("Select * from factura_entrada where id_de_factura like'%"+nombre+"%'");}
                  else { rs = ps.executeQuery("Select * from factura_entrada group by id_de_factura");}
            
                    while(rs.next()){
                   
                      String idFactura = rs.getString(1);
                      String fecha = rs.getString(2);
                      Double precio = rs.getDouble(3);
                      int cantidad = rs.getInt(4);
                      String descripcion = rs.getString(5);
                      String idProveedor = rs.getString(6);
                
                      Factura_entrada factura_E = new Factura_entrada(idFactura, fecha, precio, cantidad, descripcion, idProveedor);
                      listaEspecifica.add(factura_E);
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
