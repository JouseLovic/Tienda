package DAO;

import Modelo.*;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SalidasDao {
              
         private DB db;
         final String estado = "Salida";

        public void insertarSalidaP(SalidasProduct salida, String idProducto, int cantidad_a_restar){
            db = new DB();      
            Connection conecta = db.dameConexion();

            String idFactura = salida.getNumFactura();
            String codigoProducto = salida.getCodigoProducto();
            String descripcion = salida.getDescripcionProducto();
            String fecha = salida.getFecha();
            Double precio = salida.getPrecio();
            int cantidad = salida.getCantidad();
            String cedula = salida.getIdCliente();

            CallableStatement restarCantidad = null;
            CallableStatement salidaP = null;
            CallableStatement factura = null;
            CallableStatement facturaSalida = null;
            
            try{
             conecta.setAutoCommit(false);
              
              restarCantidad = conecta.prepareCall("{call restarCantidadProducto(?,?)}");
              salidaP = conecta.prepareCall("{call creaSalida(?,?,?,?,?,?,?)}");
              facturaSalida = conecta.prepareCall("{call creaFactura_salida(?,?,?,?,?,?)}");
              factura = conecta.prepareCall("{call creaFactura(?,?,?,?,?)}");
    
                    restarCantidad.setString(1, idProducto);
                    restarCantidad.setInt(2, cantidad_a_restar);
               
                    salidaP.setString(1, idFactura);
                    salidaP.setString(2, codigoProducto);
                    salidaP.setString(3, descripcion);
                    salidaP.setString(4, fecha);
                    salidaP.setDouble(5, precio);
                    salidaP.setInt(6, cantidad);
                    salidaP.setString(7, cedula);

                    facturaSalida.setString(1, idFactura);
                    facturaSalida.setString(2, fecha);
                    facturaSalida.setDouble(3, precio);
                    facturaSalida.setInt(4, cantidad);
                    facturaSalida.setString(5, idProducto);
                    facturaSalida.setString(6, cedula);

                    factura.setString(1, idFactura);
                    factura.setString(2, fecha);
                    factura.setDouble(3, precio);
                    factura.setInt(4, cantidad);
                    factura.setString(5, estado);

                    salidaP.executeQuery();
                    factura.executeQuery();
                    facturaSalida.executeQuery();
                    restarCantidad.executeQuery();
                   
                    conecta.commit();//Con esto le confirmamos la transferencia
                    salidaP.close();
                    facturaSalida.close();
                    factura.close();
                    restarCantidad.close();
                    db.cierraConexion(conecta);
                }catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "Ya hay una factura, o un id de producto con ese identificador. Por favor, escriba otro"+ex.getMessage());
                    try {
                      conecta.rollback();//regresamos el estado anterior de los datos en caso de error    
                    } catch (SQLException e) {
                      e.printStackTrace();
                    }
                } catch (SQLException e) {
                  try {
                    conecta.rollback();
                  } catch (SQLException ex) {
                    e.printStackTrace();
                  }
                    e.printStackTrace();
                }
            }
    
        public void eliminar(String codigoFactura){
            db = new DB();
            Connection conecta = db.dameConexion();
            CallableStatement salidaP = null;
            CallableStatement factura = null;
            CallableStatement facturaSalida = null;
          
            try{
              conecta.setAutoCommit(false);
              int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar realmente esta salida del producto, sin la eliminación de su correspondiente factura?");
              
                if(opcion == 0){

                  salidaP = conecta.prepareCall("{call eliminaSalida(?)}");
                  salidaP.setString(1, codigoFactura);

                  salidaP.executeQuery();

                  conecta.commit();
                  salidaP.close();
                  db.cierraConexion(conecta);
                }
                else if(opcion == 1){
                
                    int opcion2 = JOptionPane.showConfirmDialog(null, "Entonces si desea eliminar la salida junto con sus correspondientes facturas, confirme");
              
                        if(opcion2 == 0){

                          salidaP = conecta.prepareCall("{call eliminaSalida(?)}");
                          factura = conecta.prepareCall("{call eliminaFactura(?)}");
                          facturaSalida = conecta.prepareCall("{call eliminaFactura_salida(?)}");

                          salidaP.setString(1, codigoFactura);
                          factura.setString(1, codigoFactura);
                          facturaSalida.setString(1, codigoFactura);

                          salidaP.executeQuery();
                          facturaSalida.executeQuery();
                          factura.executeQuery();

                          conecta.commit();
                          salidaP.close();
                          facturaSalida.close();
                          factura.close();
                          db.cierraConexion(conecta);
                        }
                    }
              }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Un error inesperado a ocurrido en: \n"+ex.getMessage());  
                try {
                  conecta.rollback();
                } catch (SQLException e) {
                  e.printStackTrace();
                }
              }
          }

        public void updateOut(SalidasProduct productOut, String idFacturaOriginal){

              db = new DB();
              Connection conexion = db.dameConexion();
              CallableStatement update = null;
              CallableStatement facturaUp = null;
              CallableStatement factura = null;

              String idFactura = productOut.getNumFactura();
              String idProducto = productOut.getCodigoProducto();
              String descripcion = productOut.getDescripcionProducto();
              String fecha = productOut.getFecha();
              Double precio = productOut.getPrecio();
              int cantidad = productOut.getCantidad();
              String idCliente = productOut.getIdCliente();

                try {
                  
                  conexion.setAutoCommit(false);

                  update = conexion.prepareCall("{call actualizaSalida(?,?,?,?,?,?,?,?)}");
                  facturaUp = conexion.prepareCall("{call actualizaFacturaS(?,?,?,?,?,?,?)}");
                  factura = conexion.prepareCall("{call actualizaFactura(?,?,?,?,?,?)}");

                  update.setString(1, idFactura);
                  update.setString(2, idProducto);
                  update.setString(3, descripcion);
                  update.setString(4, fecha);
                  update.setDouble(5, precio);
                  update.setInt(6, cantidad);
                  update.setString(7, idCliente);
                  update.setString(8, idFacturaOriginal);

                  facturaUp.setString(1, idFactura);
                  facturaUp.setString(2, fecha);
                  facturaUp.setDouble(3, precio);
                  facturaUp.setInt(4, cantidad);
                  facturaUp.setString(5, idProducto);
                  facturaUp.setString(6, idCliente);
                  facturaUp.setString(7, idFacturaOriginal);

                  factura.setString(1, idFactura);
                  factura.setString(2, fecha);
                  factura.setDouble(3, precio);
                  factura.setInt(4, cantidad);
                  factura.setString(5, estado);
                  factura.setString(6, idFacturaOriginal);

                  update.executeUpdate();
                  facturaUp.executeUpdate();
                  factura.executeUpdate();
                  System.out.println("Se actualizó");
                  conexion.commit();
                  update.close();
                  factura.close();
                  facturaUp.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                    try {
                      conexion.rollback();
                    } catch (SQLException e) {
                      e.printStackTrace();
                    }
                }
          }
    
        public ArrayList<SalidasProduct> mostrar(String idF){
            db = new DB();
            Connection conecta = db.dameConexion();
            ArrayList<SalidasProduct> listaEspecifica = new ArrayList<>();
            Statement ps;
            ResultSet rs = null;
    
    
              try{
                  ps = conecta.createStatement();
    
                  if(!idF.equals(""))  rs = ps.executeQuery("Select * from salida_de_productos where id_de_factura like '%"+idF+"%'");
                  else  rs = ps.executeQuery("Select * from salida_de_productos order by id_de_factura");
    
                  while(rs.next()){
    
                    String idFactura = rs.getString(1);
                    String codigoP = rs.getString(2);
                    String desc  = rs.getString(3);
                    String fecha = rs.getString(4); 
                    Double precio = rs.getDouble(5);
                    int cantidad = rs.getInt(6);
                    String cedula = rs.getString(7);
    
                    SalidasProduct salida = new SalidasProduct(idFactura, codigoP, desc, fecha, precio, cantidad, cedula);
                     listaEspecifica.add(salida);
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




