package DAO;

import Modelo.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class FacturasEODao {

    private static DB db;

    public ArrayList<FacturaSalida> mostrarFacturas(String nombre){
        db = new DB();
        Connection conecta = db.dameConexion();
        ArrayList<FacturaSalida> listaEspecifica = new ArrayList<>();
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
                  String idProducto = rs.getString(5);
                  String cedulas = rs.getString(6);
            
                  FacturaSalida factura_S = new FacturaSalida(idFactura, fecha, precio, cantidad, idProducto, cedulas);
                  listaEspecifica.add(factura_S);
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
