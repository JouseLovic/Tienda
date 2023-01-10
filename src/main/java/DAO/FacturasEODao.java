package DAO;

import Modelo.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class FacturasEODao {

    private static DB db;

    public ArrayList<Factura_entrada> mostrarFacturas(String nombre){
        db = new DB();
        Connection conecta = db.dameConexion();
        ArrayList<Factura_entrada> listaEspecifica = new ArrayList<>();
        Statement ps = null;
        ResultSet rs = null;


          try{
            ps = conecta.createStatement();

              if(!nombre.equals("")){  rs = ps.executeQuery("Select * from factura_entrada where id_de_factura like'%"+nombre+"%'");}
              else { rs = ps.executeQuery("Select * from factura_entrada order by id_de_factura asc");}
        
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
