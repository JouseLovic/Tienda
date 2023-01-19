package Modelo;

import javax.swing.*;
import Vista.Window;
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
            JOptionPane.showMessageDialog(null, "La aplicación no ha recibido ningun paquete de la base de datos. Por favor, asegurese de que encendió el servidor Apache y MySQL");
            new Window().cierraPorErrorSQL();
        }
         return miConexion;
    }

    public void cierraConexion(Connection desconecta){
        try{
            desconecta.close();
          }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "¡Error! \n"+"El estado de la conexion con la base de datos es: "+ex.getMessage()+"\n"+"Encienda el servidor junto con MySQL y reabra la aplicación");
            try {
                desconecta.close();
            } catch (SQLException e) {
              e.printStackTrace();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Hubo un error inesperado debido a: "+ex.getMessage());
        }
    }



}
