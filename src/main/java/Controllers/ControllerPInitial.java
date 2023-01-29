
package Controllers;

import Repository.*;
import Model.Product;
import View.*;
import javax.swing.*;
import java.util.ArrayList;

public class ControllerPInitial {
      
      private static PanelFacturasGenerales frameF;
      private static PanelClientes frameC;
      private static PanelProveedores frameP;
      private static ProductRepo productoDao;
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
            productoDao = new ProductRepo();
            cantidad = productoDao.mostrarCantidad();
            label.setText(String.valueOf(cantidad));
      }

      public static void getCantidadEntradas(JLabel label){


      }


  
}
