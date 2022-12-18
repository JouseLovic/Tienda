package Controlador;

import Vista.*;
import javax.swing.*;

public class ControllerListInventoryProducts {

    private static GeneralInventary inventarioGeneral = new GeneralInventary();
    private static ModifyInventary modificacionInventario = new ModifyInventary();

    public static void cambiarPanelInventarioG(Inventary inventario){
        inventarioGeneral.setVisible(true);
        inventario.setPanelContenedor(inventarioGeneral);
    }
     
     public static void cambiarPanelInventarioModifi(Inventary inventario){
        modificacionInventario.setVisible(true);
        inventario.setPanelContenedor(modificacionInventario);
     }
     
     public static void borrarPaneles(JPanel panel){
        panel.remove(inventarioGeneral);
        panel.remove(modificacionInventario);
        inventarioGeneral.setVisible(false);
        modificacionInventario.setVisible(false);
        panel.revalidate();
        panel.repaint();
     }

     public static void eliminarRegistros(){

        //La idea es que construyas un objeto con la fila que este seleccionada y luego con dao llamas al metodo eliminar y le pasas el objeto
        //Supongo que es facil...

     }

     


}
