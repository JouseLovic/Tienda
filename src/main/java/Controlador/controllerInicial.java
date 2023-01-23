
package Controlador;

import DAO.*;
import Modelo.Producto;
import Vista.*;
import javax.swing.*;
import java.util.ArrayList;

public class controllerInicial {
      
      private static PanelFacturasGenerales frameF;
      private static PanelClientes frameC;
      private static PanelProveedores frameP;
      private static nProductoDao productoDao;
      private static int cantidad;
      
      //Clicks events 
      public static void presionaFacturas(){
            frameF = new PanelFacturasGenerales();
            frameF.setVisible(true);
            frameF.setLocationRelativeTo(null);
      }
      
      public static void presionaClientes(){
            frameC = new PanelClientes();
            frameC.setVisible(true);
            frameC.setLocationRelativeTo(null);
      }

      public static void presionaProveedores(){
            frameP = new PanelProveedores();
            frameP.setVisible(true);
            frameP.setLocationRelativeTo(null);
      }

      public static void getCantidadStock(JLabel label){
            productoDao = new nProductoDao();
            ArrayList<Producto> listProducts = productoDao.mostrarTodos("");
            cantidad = productoDao.mostrarCantidad();
            label.setText(String.valueOf(cantidad));
      }

      public static void getCantidadEntradas(JLabel label){


      }


  
}
