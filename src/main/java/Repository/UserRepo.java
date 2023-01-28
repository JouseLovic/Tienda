package Repository;

import Model.DB;
import Model.User;

import java.sql.*;
import java.util.*;

public class UserRepo {

    private DB db;
    private String username, pass, rol;
    private final String sqlCreate = "Insert into usuarios (Name, Password, Position) values (?,?,?)";
    private final String sqlUpdate = "Update usuarios set Name = ?, Password = ?, Position = ? where Name = ?";
    private final String sqlTakeMyUsers = "Select * from usuarios";

    public boolean createUser(String name, String pass, String rol) throws SQLException {

        db = new DB();
        Connection connection = db.dameConexion();
        PreparedStatement ps = null;

            try {
                ps = connection.prepareCall(sqlCreate);

                connection.setAutoCommit(false);

                ps.setString(1, name);
                ps.setString(2, pass);
                ps.setString(3, rol);
                System.out.println("Objeto creado");
                connection.commit();
                ps.close();
                connection.close();
                return true;
            }catch (Exception ex){
                ex.printStackTrace();
                connection.rollback();
                return false;
            }
    }

    public boolean updateUser(String nameOrigin, String name, String pass, String rol) throws SQLException {

        db = new DB();
        Connection connection = db.dameConexion();
        PreparedStatement ps = null;

        try {
            ps = connection.prepareCall(sqlUpdate);
            connection.setAutoCommit(false);

            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, rol);
            ps.setString(4, nameOrigin);
            System.out.println("Registro actualizado");
            connection.commit();
            ps.close();
            connection.close();
            return true;
        }catch (Exception ex){
            connection.rollback();
            return false;
        }

    }

    public boolean deleteUser(String name) throws SQLException {

        db = new DB();
        Connection connection = db.dameConexion();
        PreparedStatement ps = null;

        try {
            ps = connection.prepareCall(sqlTakeMyUsers);
            connection.setAutoCommit(false);

            ps.setString(1, name);

            System.out.println("Registro Eliminadp");
            connection.commit();
            ps.close();
            connection.close();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            connection.rollback();
            return false;
        }
    }

    public ArrayList<User> showUser(){

        db = new DB();
        Connection connection = db.dameConexion();
        ArrayList<User> listUsers = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareCall(sqlTakeMyUsers);
            rs = ps.executeQuery();

                while(rs.next()){

                    username = rs.getString(1);
                    pass = rs.getString(2);
                    rol = rs.getString(3);
                    User user = new User(username, pass, rol);
                    listUsers.add(user);
                }
                ps.close();
                connection.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listUsers;
    }



}
