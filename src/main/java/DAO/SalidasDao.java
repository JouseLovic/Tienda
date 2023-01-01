package DAO;

import Modelo.*;
import Vista.Window;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SalidasDao {
              
         private DB db;
          
        public ArrayList<Clientes> BuscaClientes(){
          db = new DB();
          Connection conexion = db.dameConexion();
          ArrayList<Clientes> listaComparacion = new ArrayList<>();
    
          Statement ps = null;
          ResultSet rs = null;
    
          try {
    
              ps = conexion.createStatement();
              rs = ps.executeQuery("Select * from cliente order by cedula asc");
    
              while(rs.next()){
      
                String nombre = rs.getString(1);
                String fechaNacimiento = rs.getString(2);
                String cedula = rs.getString(3);
                  
                  Clientes cliente = new Clientes(nombre, fechaNacimiento, cedula);
                  listaComparacion.add(cliente);
              }
              rs.close();
              ps.close();
              db.cierraConexion(conexion);
          } catch (Exception e) {
             e.printStackTrace();
          }
            return listaComparacion;
        }
    
        public void insertarSalidaP(SalidasProduct salida, String idProducto, int cantidad_a_restar){
            db = new DB();      
            Connection conecta = db.dameConexion();
            String estado = "Salida";

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
            
            try{
             conecta.setAutoCommit(false);
              
              restarCantidad = conecta.prepareCall("{call restarCantidadProducto(?,?)}");
              salidaP = conecta.prepareCall("{call creaSalida(?,?,?,?,?,?,?)}");
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

                    factura.setString(1, idFactura);
                    factura.setString(2, fecha);
                    factura.setDouble(3, precio);
                    factura.setInt(4, cantidad);
                    factura.setString(5, estado);

                    salidaP.executeQuery();
                    factura.executeQuery();
                    restarCantidad.executeQuery();
                   
                    conecta.commit();//Con esto le confirmamos la transferencia
                    salidaP.close();
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
    
            try{
              conecta.setAutoCommit(false);
              int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar realmente esta entrada? se eliminara la factura y el registro.");
              
                if(opcion == 0){

                  salidaP = conecta.prepareCall("{call eliminaSalida_productos(?)}");
                  factura = conecta.prepareCall("{call eliminaFactura(?)}");

                  salidaP.setString(1, codigoFactura);
                  factura.setString(1, codigoFactura);

                  conecta.commit();
                  JOptionPane.showMessageDialog(null, "El registro se ha eliminado exitosamente");
                  salidaP.close();
                  factura.close();
                  db.cierraConexion(conecta);
              }
              else{
                System.out.println("No se elimino");
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




