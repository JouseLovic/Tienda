package Modelo;

import java.lang.reflect.Executable;
import java.sql.*;
import java.util.ArrayList;


import javax.swing.JOptionPane;

public class DB_entrada {

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

    public ArrayList<Proveedores> buscaProveedores(Proveedores proveedor){

      ArrayList<Proveedores> listaComparacion = new ArrayList<>();
      



      return listaComparacion;
    }


    public void insertarEntradaP(EntradaProductos entrada){
              
        Connection conecta = dameConexion();
        CallableStatement entryP = null;
        CallableStatement product = null;
        
        try{
         conecta.setAutoCommit(false);
          
          entryP = conecta.prepareCall("{call creaEntrada(?,?,?,?,?,?,?,?,?)}");
          product = conecta.prepareCall("{call creaProducto_entrada(?,?,?,?,?,?)}");

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

               entryP.execute();
               product.execute();
               
              conecta.commit();//Con esto le confirmamos la transferencia
              JOptionPane.showMessageDialog(null, "El registro se subio exitosamente");
              entryP.close();
              product.close();
             cierraConexion(conecta);
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Ya hay una factura con ese id. Por favor, escriba otro");
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

    public void eliminar(String codigoProducto, String codigoFactura){
          
       Connection conecta = dameConexion();
        Statement productosPs = null;
        Statement entryPs = null;
        try{
          conecta.setAutoCommit(false);
          productosPs = conecta.createStatement(); entryPs = conecta.createStatement();
          productosPs.executeUpdate("Delete from productos_generales where id = '"+codigoProducto+"'");
          entryPs.executeUpdate("Delete from entrada_de_productos where id_de_factura = '"+codigoFactura+"'");//revisa los nombres Santiago
          conecta.commit();
          JOptionPane.showMessageDialog(null, "El registro se ha eliminado exitosamente");
          productosPs.close();
          cierraConexion(conecta);
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

        Connection conecta = dameConexion();
        ArrayList<EntradaProductos> listaEspecifica = new ArrayList<>();
        Statement ps;
        ResultSet rs = null;


          try{
              ps = conecta.createStatement();

              if(!idF.equals(""))  rs = ps.executeQuery("Select * from entrada_de_productos where id_de_factura like '%"+idF+"%'");
              else  rs = ps.executeQuery("Select * from entrada_de_productos group by id_de_factura");

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
               cierraConexion(conecta);
          }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La operacion mostrar ha fallado por: "+ex.getMessage());
            cierraConexion(conecta);
            return null;
          }
        return listaEspecifica;
     }

    public void cierraConexion(Connection desconecta){
        try{
            desconecta.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }

    }



    
}
