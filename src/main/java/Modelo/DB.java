package Modelo;

import javax.swing.*;
import java.sql.*;

public class DB {

    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    private Connection miConexion;

    public DB(){
        miConexion = null;
    }

    public Connection dameConexion(){

        try {

           miConexion = DriverManager.getConnection(url, user, pass);
             System.out.println("Conexion exitosa");
              return miConexion;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Excepción: "+e.getClass());
            System.exit(0);
            return null;
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Excepción: "+ex.getClass());
            System.exit(0);
            return null;
        }
    }


    public void cierraConexion(){
        try{
            miConexion.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getCause());
        }

    }



}
