package Repository;

import Model.*;
import View.FormularioNCliente;

import java.sql.*;
import java.util.*;
import javax.swing.*;

public class ClientRepo {
    
    private DB db;
          
    public ArrayList<Clients> searchClients(){
      db = new DB();
      Connection conexion = db.dameConexion();
      ArrayList<Clients> listaComparacion = new ArrayList<>();

      Statement ps = null;
      ResultSet rs = null;

      try {

          ps = conexion.createStatement();
          rs = ps.executeQuery("Select * from cliente order by cedula asc");

          while(rs.next()){
  
            String nombre = rs.getString(1);
            String fechaNacimiento = rs.getString(2);
            String cedula = rs.getString(3);
              
              Clients cliente = new Clients(nombre, fechaNacimiento, cedula);
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

    public void insertarCliente(FormularioNCliente nCliente){
        db = new DB();      
        Connection conecta = db.dameConexion();

        String nombre = nCliente.getCampoNombre();
        String fecha = nCliente.getCampoFechaNacimiento();
        String cedula = nCliente.getCampoCedula();
        
        PreparedStatement registroC = null;
        
        try{
        
                registroC = conecta.prepareStatement("Insert into cliente (nombre, fecha_nacimiento, cedula) values(?,?,?)");
                
                registroC.setString(1, nombre);
                registroC.setString(2, fecha);
                registroC.setString(3, cedula);
                registroC.execute();
             
                JOptionPane.showMessageDialog(null, "Cliente registrado");
                registroC.close();
                FormularioNCliente.setAprobado(true);
                db.cierraConexion(conecta);
            }catch(SQLIntegrityConstraintViolationException ex){
                JOptionPane.showMessageDialog(null, "Ya hay un cliente con esta cedula. Por favor asegurese de verificar los datos. "+ex.getMessage());
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }