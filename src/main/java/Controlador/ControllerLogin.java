package Controlador;

import Controlador.Settings.ReSettings;
import Controlador.Settings.SaveSetting;
import DAO.UserDao;
import Modelo.User;
import Vista.Window;
import Vista.WindowLogin;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

public class ControllerLogin {

    private static UserDao uDao;
    private static User user;
    private static ReSettings re = new ReSettings();
    private static String pass;
    private static int attemps = 0;
    private static String username;
    private static String rol;

    public static void getUser(String password) {

        pass = "";
        username = "";

        pass = ReSettings.getPasswordUser();
        attemps++;

            System.out.println(attemps);
            if (password.equalsIgnoreCase(pass)) {
                System.out.println("Es igual");
                attemps++;
            } else if (!password.equalsIgnoreCase(pass)) {
                JOptionPane.showMessageDialog(null, "¡Contraseña incorrecta!");
                attemps++;
            }

        if (attemps == 3) {
            SaveSetting save = new SaveSetting();
            String[] array = {re.getTheme(),
                    re.getFont(),
                    re.getStyle(),
                    String.valueOf(re.getSize()),
                    String.valueOf(re.getLanguageSelected()),
                    ReSettings.getTitleLogin(),
                    ReSettings.getTitleInventary(),
                    ReSettings.getTitleEntries(),
                    ReSettings.getTitleBill(),
                    ReSettings.getTitleVendors(),
                    "", "", ""};
            attemps = 0;
            JOptionPane.showMessageDialog(null, "Ha intentado el maximo de 3 veces. Se eliminara el registro que hubo de la cuenta anterior");
        }
    }

        public static void login(String username, String pass, String rol, WindowLogin w){

             uDao = new UserDao();
             ArrayList<User> listUser = uDao.showUser();

                for(User usuario : listUser){
                    if(usuario.getName().equalsIgnoreCase(username)){
                        user = new User(usuario.getName(), usuario.getPassword(), usuario.getPosition());
                    }
                }

                if(user.getName().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(pass) && user.getPosition().equalsIgnoreCase(rol)){
                    w.dispose();
                    new Window().setVisible(true);
                }
                else if(!user.getName().equalsIgnoreCase(username)){

                }
                else if(!user.getPassword().equalsIgnoreCase(pass)){

                }
                else if(!user.getPosition().equals(rol)){

                }
            }
        }

