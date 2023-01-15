
package Controlador;

import Vista.*;
import javax.swing.ImageIcon;

public class controllerInicial {
      
      private static PanelFacturasGenerales frameF;
      private static PanelClientes frameC;
      private static PanelProveedores frameP;
      
      //Clicks events 
      public static void presionaFacturas(){
            PanelProveedores.setActualizameProv(0);
            frameF = new PanelFacturasGenerales();
            frameF.setVisible(true);
            frameF.setLocationRelativeTo(null);
      }
      
      public static void presionaClientes(){
            PanelProveedores.setActualizameProv(0);
            frameC = new PanelClientes();
            frameC.setVisible(true);
            frameC.setLocationRelativeTo(null);
      }

      public static void presionaProveedores(){
            frameP = new PanelProveedores();
            frameP.setVisible(true);
            frameP.setLocationRelativeTo(null);
      }

      //Changes the images with events
      public void dentroDeFacturas(PanelInicial panel){
            ImageIcon image = new ImageIcon(getClass().getResource("/images/401182Oscura.png"));
            panel.setIconF(image);
      }
      
      public void fueraDeFacturas(PanelInicial panel){
            ImageIcon image = new ImageIcon(getClass().getResource("/images/401182.png"));
            panel.setIconF(image);
      }
      
      public void dentroDeClientes(PanelInicial panel){
            ImageIcon image = new ImageIcon(getClass().getResource("/images/5906150Oscura.png"));
            panel.setIconC(image);
      }
      
      public void fueraDeClientes(PanelInicial panel){
            ImageIcon image = new ImageIcon(getClass().getResource("/images/5906150.png"));
            panel.setIconC(image);
      }

      public void dentroDeProveedores(PanelInicial panel){
            ImageIcon image = new ImageIcon(getClass().getResource("/images/ProveedorOscura.png"));
            panel.setIconP(image);
      }
      
      public void fueraDeProveedores(PanelInicial panel){
            ImageIcon image = new ImageIcon(getClass().getResource("/images/Proveedor.png"));
            panel.setIconP(image);
      }

  
}
