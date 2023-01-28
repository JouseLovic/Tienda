package Model;

import javax.swing.*;

import java.sql.*;

public class DB {

    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    private Connection miConexion;

    public Connection dameConexion(){
        try {
           miConexion = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "La aplicación no ha recibido ningun paquete de la base de datos. \nPor favor, asegurese de que encendió el servidor Apache y MySQL");
            System.exit(0);
        }
         return miConexion;
    }

    public void cierraConexion(Connection desconecta){
        try{
            desconecta.close();
            } catch (SQLException e) {
              e.printStackTrace();
            }
    }



}
