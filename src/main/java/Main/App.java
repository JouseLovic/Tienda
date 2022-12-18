package Main;

import Modelo.*;
import Vista.*;


public class App {
    public static void main(String[] args) {
         
         DB db = new DB();
         db.dameConexion();

         Window W = new Window();
         W.setVisible(true);

    }
}
