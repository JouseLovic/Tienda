package Controlador;

import Vista.*;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import Modelo.*;

public class ControllerListInventoryProducts {  
   
    private static DB db;
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

        //ve los videos donde hacen crud y ponte a ver para resolver como eliminas correctamente un registro
     }

   
   public static void enviaDatosTabla(JTable tabla){
    
         db = new DB();
         ArrayList<Producto> listaProductos = db.dameLista();
         DefaultTableModel modelo = new DefaultTableModel();
         modelo.addColumn("Id"); modelo.addColumn("Descripcion"); modelo.addColumn("Talla"); modelo.addColumn("Marca");
         modelo.addColumn("Tipo"); modelo.addColumn("Precio"); modelo.addColumn("Edad dirigida"); modelo.addColumn("Cantidad");
         modelo.addColumn("Sexo");
      
         for(Producto productos : listaProductos){

            Object[] filas = new Object[9];

               filas[0] = productos.getId();
               filas[1] = productos.getDesc();
               filas[2] = productos.getTamaño();
               filas[3] = productos.getMarca();
               filas[4] = productos.getTipo();
               filas[5] = productos.getPrecio();
               filas[6] = productos.getEdadDirigida();
               filas[7] = productos.getCantidad();
               filas[8] = productos.getSexo();
   
               modelo.addRow(filas);
         }
         tabla.setModel(modelo);
     }    


}
