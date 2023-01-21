
package Controlador;

import Vista.*;
import javax.swing.ImageIcon;

public class controllerInicial {
      
      private static PanelFacturasGenerales frameF;
      private static PanelClientes frameC;
      private static PanelProveedores frameP;
      
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
  
}
