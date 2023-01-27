
package DAO;

import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Vista.*;


public class EntradasDao {
      
     private DB db;
      
    public ArrayList<Proveedores> buscaProveedores(){
      db = new DB();
      Connection conexion = db.dameConexion();
      ArrayList<Proveedores> listaComparacion = new ArrayList<>();

      Statement ps = null;
      ResultSet rs = null;

      try {

          ps = conexion.createStatement();
          rs = ps.executeQuery("Select * from proveedor order by id_proveedor");

          while(rs.next()){
  
            String idProveedor = rs.getString(1);
            String nombre = rs.getString(2);
            String fechaNacimiento = rs.getString(3);
            String cedula = rs.getString(4);
            String email = rs.getString(5);
            String empresa = rs.getString(6);
            String articulos = rs.getString(7);
              
              Proveedores proveedor = new Proveedores(idProveedor, nombre, fechaNacimiento, cedula, email, empresa, articulos);
               listaComparacion.add(proveedor);
          }
          rs.close();
          ps.close();
          db.cierraConexion(conexion);
      } catch (SQLException e) {
         e.printStackTrace();
         JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la clase 'EntradasDao' debido a: "+e.getCause());
      }catch(NullPointerException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "La conexion es nula. Por favor, asegurese de que el servidor este encendido");        
      }
        return listaComparacion;
    }

    public void insertarEntradaP(EntradaProductos entrada){
        db = new DB();      
        Connection conecta = db.dameConexion();
        String estadoE = "Entrada";
        CallableStatement entryP = null;
        CallableStatement product = null;
        CallableStatement factura_entrada = null;
        CallableStatement factura = null;
        
        try{
         conecta.setAutoCommit(false);
          
          entryP = conecta.prepareCall("{call creaEntrada(?,?,?,?,?,?,?,?,?)}");
          product = conecta.prepareCall("{call creaProducto_entrada(?,?,?,?,?,?)}");
          factura_entrada = conecta.prepareCall("{call creaFactura_entrada(?,?,?,?,?,?)}");
          factura = conecta.prepareCall("{call creaFactura(?,?,?,?,?)}");

               String idFactura = entrada.getNumFactura();
               String codigoP = entrada.getCodigoProducto();
               String descripcionP = entrada.getDescripcionProducto();
               String fecha = entrada.getFecha();
               Double precio = entrada.getPrecio();
               int cantidad = entrada.getCantidad();
               String seccion = entrada.getSeccion();
               String marca = entrada.getMarca();
               String idProv = entrada.getIdProveedor();
           
               entryP.setString(1, idFactura);
               entryP.setString(2, codigoP);
               entryP.setString(3, descripcionP);
               entryP.setString(4, fecha);
               entryP.setDouble(5, precio);
               entryP.setInt(6, cantidad);
               entryP.setString(7, seccion);
               entryP.setString(8, marca);
               entryP.setString(9, idProv);

               product.setString(1, codigoP);
               product.setString(2, descripcionP);
               product.setInt(3, cantidad);
               product.setString(4, seccion);
               product.setString(5, marca);
               product.setString(6, idProv);

               factura_entrada.setString(1, idFactura);
               factura_entrada.setString(2, fecha);
               factura_entrada.setDouble(3, precio);
               factura_entrada.setInt(4, cantidad);
               factura_entrada.setString(5, descripcionP);
               factura_entrada.setString(6, idProv);

               factura.setString(1, idFactura);
               factura.setString(2, fecha);
               factura.setDouble(3, precio);
               factura.setInt(4, cantidad);
               factura.setString(5, estadoE);

               entryP.executeQuery();
               product.executeQuery();
               factura_entrada.executeQuery();
               factura.executeQuery();
               
                conecta.commit();//Con esto le confirmamos la transferencia
                entryP.close();
                product.close();
                factura_entrada.close();
                factura.close();
                db.cierraConexion(conecta);
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "You are trying to enter an existing invoice or product. If you are looking to enter an amount\n" +
                        "for a product that already exists, correctly type the values corresponding to that product, which are:\n" +
                        "A new invoice number, Description, Section, Brand and supplier id");
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


        public void insertarProductoExistente(EntradaProductos entrada){
          db = new DB();      
          Connection conecta = db.dameConexion();
          String estadoE = "Entrada";
          CallableStatement entryP = null;
          CallableStatement sumaCantidad = null;
          CallableStatement factura_entrada = null;
          CallableStatement factura = null;
          
          try{
           conecta.setAutoCommit(false);
            
           entryP = conecta.prepareCall("{call creaEntrada(?,?,?,?,?,?,?,?,?)}");
            sumaCantidad = conecta.prepareCall("{call sumaCantidadProducto(?,?)}");
            factura_entrada = conecta.prepareCall("{call creaFactura_entrada(?,?,?,?,?,?)}");
            factura = conecta.prepareCall("{call creaFactura(?,?,?,?,?)}");
  
                 String idFactura = entrada.getNumFactura();
                 String codigoP = entrada.getCodigoProducto();
                 String descripcionP = entrada.getDescripcionProducto();
                 String fecha = entrada.getFecha();
                 Double precio = entrada.getPrecio();
                 int cantidad = entrada.getCantidad();
                 String seccion = entrada.getSeccion();
                 String marca = entrada.getMarca();
                 String idProv = entrada.getIdProveedor();
             
                entryP.setString(1, idFactura);
                 entryP.setString(2, codigoP);
                 entryP.setString(3, descripcionP);
                 entryP.setString(4, fecha);
                 entryP.setDouble(5, precio);
                 entryP.setInt(6, cantidad);
                 entryP.setString(7, seccion);
                 entryP.setString(8, marca);
                 entryP.setString(9, idProv);

                 sumaCantidad.setString(1, codigoP);
                 sumaCantidad.setInt(2, cantidad);

                 factura_entrada.setString(1, idFactura);
                 factura_entrada.setString(2, fecha);
                 factura_entrada.setDouble(3, precio);
                 factura_entrada.setInt(4, cantidad);
                 factura_entrada.setString(5, descripcionP);
                 factura_entrada.setString(6, idProv);
  
                 factura.setString(1, idFactura);
                 factura.setString(2, fecha);
                 factura.setDouble(3, precio);
                 factura.setInt(4, cantidad);
                 factura.setString(5, estadoE);
  
                 entryP.executeQuery();
                 sumaCantidad.executeQuery();
                 factura_entrada.executeQuery();
                 factura.executeQuery();
                 
                  conecta.commit();//Con esto le confirmamos la transferencia
                  entryP.close();
                  sumaCantidad.close();
                  factura_entrada.close();
                  factura.close();
                  db.cierraConexion(conecta);
              }catch(SQLIntegrityConstraintViolationException ex){
                  JOptionPane.showMessageDialog(null, "Problema encontrado en 'EntradasDao' debido a: "+ex.getMessage());
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
        CallableStatement entryPs = null;
        CallableStatement factura_E = null;
        CallableStatement factura = null;

        try{
          conecta.setAutoCommit(false);
          int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar realmente esta entrada? \nse eliminaran la facturas que corresponden a este mismo id ");
          
          if(opcion == 0){
          entryPs = conecta.prepareCall("{call eliminaEntrada (?)}");
          factura_E = conecta.prepareCall("{call eliminaFactura_entrada (?)}");
          factura = conecta.prepareCall("{call eliminaFactura (?)}");

          entryPs.setString(1, codigoFactura);
          factura_E.setString(1, codigoFactura);
          factura.setString(1, codigoFactura);

          entryPs.executeQuery();
          factura_E.executeQuery();
          factura.executeQuery();

          conecta.commit();
          entryPs.close();
          factura_E.close();
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

     public ArrayList<EntradaProductos> mostrar(String idF){
        db = new DB();
        Connection conecta = db.dameConexion();
        ArrayList<EntradaProductos> listaEspecifica = new ArrayList<>();
        Statement ps;
        ResultSet rs = null;

          try{
              ps = conecta.createStatement();

              if(!idF.equals(""))  rs = ps.executeQuery("Select * from entrada_de_productos where id_de_factura like '%"+idF+"%'");
              else  rs = ps.executeQuery("Select * from entrada_de_productos order by id_de_factura");

              while(rs.next()){

                String idFactura = rs.getString(1);
                String codigoP = rs.getString(2);
                String desc  = rs.getString(3);
                String fecha = rs.getString(4); 
                Double precio = rs.getDouble(5);
                int cantidad = rs.getInt(6);
                String seccion = rs.getString(7);
                String marca = rs.getString(8);
                String idProveedor = rs.getString(9);

                EntradaProductos entradas = new EntradaProductos(idFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                 listaEspecifica.add(entradas);
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
