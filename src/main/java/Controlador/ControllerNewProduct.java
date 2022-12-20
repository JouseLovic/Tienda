
package Controlador;

import desplazable.*;
import javax.swing.*;
import javax.swing.table.*;
import Modelo.*;
import Vista_Formulario.*;
import java.sql.*;
import java.util.*;

public class ControllerNewProduct {
     
     private static Producto producto;
     private static DBProd db;
     
     public static void borrarCampos(PanelNuevoProducto producto){
          
          producto.setCampoDesc("");
          producto.setCampoCantidad("");
          producto.setCampoEdadDirigida("");
          producto.setCampoId("");
          producto.setCampoMarca("");
          producto.setCampoPrecio("");
          producto.setCampoTalla("");
          producto.setCampoTipo("");
          producto.setCampoSexo("");
          
     }

     public static void mueveComponentes(JTextField i, JTextField d, JTextField t, JTextField m, JTextField ti, JTextField p, JTextField e, JTextField c, JTextField s){

          Desface desplazamiento = new Desface();
          desplazamiento.desplazarDerecha(i,150, 230,10, 4);//mientras menos pasos (el cuarto argumento) mas rapido irá, y lo mismo con el tiempo
          

     }

     public static void actualizarProducto(JTable tabla, PanelNuevoProducto nProductos){

          db = new DBProd();
          try{
               int id = Integer.parseInt(nProductos.getCampoId());
               String desc = nProductos.getCampoDesc();
               String talla = nProductos.getCampoTalla();
               String marca = nProductos.getCampoMarca();
               String tipo =  nProductos.getCampoTipo();
               double precio = Double.parseDouble(nProductos.getCampoPrecio());
               String edadDirigida = nProductos.getCampoEdadDirigida();
               int cantidad =  Integer.parseInt(nProductos.getCampoCantidad());
               String sexo = nProductos.getCampoSexo();
         
                    if(ValidadNumeros(nProductos.getCampoId()) && validarNumerosDecimales(nProductos.getCampoPrecio()) && ValidadNumeros(nProductos.getCampoCantidad())){
                         producto = new Producto(id, desc, talla, marca, tipo, precio, edadDirigida, cantidad, sexo);
                         db.actualizarProducto(producto, nProductos.getFilaIdObtenido());
                         borrarCampos(nProductos);
                     }
           }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "Precio y cantidad no pueden estar vacios");
           }
     }
     
     
     public static void eliminar(JTable tabla){
          db = new DBProd();
          int fila = tabla.getSelectedRow();
          if(fila >= 0){
               int id = (int) tabla.getValueAt(fila, 0);
               db.eliminar(id);
               enviaDatosTabla(tabla);
          }
          else{
               JOptionPane.showMessageDialog(null, "Seleccione una fila si desea eliminar");
          }
     }
     
     public static void subir(PanelNuevoProducto productoN, JTable tabla) throws SQLIntegrityConstraintViolationException{
     
          db = new DBProd();
          try{
               int id = Integer.parseInt(productoN.getCampoId());
               String desc = productoN.getCampoDesc();
               String talla = productoN.getCampoTalla();
               String marca = productoN.getCampoMarca();
               String tipo =  productoN.getCampoTipo();
               double precio = Double.parseDouble(productoN.getCampoPrecio());
               String edadDirigida = productoN.getCampoEdadDirigida();
               int cantidad =  Integer.parseInt(productoN.getCampoCantidad());
               String sexo = productoN.getCampoSexo();
         
                    if(ValidadNumeros(productoN.getCampoId()) && validarNumerosDecimales(productoN.getCampoPrecio()) && ValidadNumeros(productoN.getCampoCantidad()) && ValidadSexo(sexo)){
                         producto = new Producto(id, desc, talla, marca, tipo, precio, edadDirigida, cantidad, sexo);
                         db.insertarProducto(producto);
                     }
           }catch(NumberFormatException ex){
               if(productoN.getCampoId().equals("") && productoN.getCampoPrecio().equals("") && productoN.getCampoCantidad().equals("") || productoN.getCampoId().isEmpty() && productoN.getCampoPrecio().isEmpty() && productoN.getCampoCantidad().isEmpty()){
                     productoN.setLabelId("El id no puede estar vacio");
                     productoN.setLabelCantidad("La cantidad no puede estar vacia");
                     productoN.setLabelPrecio("El precio no puede estar vacio");
                }
               if(!productoN.getCampoId().equals("") && productoN.getCampoPrecio().equals("") && productoN.getCampoCantidad().equals("") || !productoN.getCampoId().isEmpty() && productoN.getCampoPrecio().isEmpty() && productoN.getCampoCantidad().isEmpty()){
                     productoN.setLabelPrecio("El precio no puede estar vacio");
                     productoN.setLabelCantidad("La cantidad no puede estar vacia");
               }
               if(!productoN.getCampoId().equals("") && !productoN.getCampoPrecio().equals("") && productoN.getCampoCantidad().equals("") || !productoN.getCampoId().isEmpty() && !productoN.getCampoPrecio().isEmpty() && productoN.getCampoCantidad().isEmpty()){
                     productoN.setLabelCantidad("La cantidad no puede estar vacia"); 
               }
               if(!productoN.getCampoId().equals("") && productoN.getCampoPrecio().equals("") && !productoN.getCampoCantidad().equals("") || !productoN.getCampoId().isEmpty() && productoN.getCampoPrecio().isEmpty() && !productoN.getCampoCantidad().isEmpty()){
                     productoN.setLabelPrecio("El precio no puede estar vacio");
               }
               if(productoN.getCampoId().equals("") && !productoN.getCampoPrecio().equals("") && !productoN.getCampoCantidad().equals("") || productoN.getCampoId().isEmpty() && !productoN.getCampoPrecio().isEmpty() && !productoN.getCampoCantidad().isEmpty()){
                     productoN.setLabelId("El id no puede estar vacio");
               }
               if(productoN.getCampoId().equals("") && !productoN.getCampoPrecio().equals("") && productoN.getCampoCantidad().equals("") || productoN.getCampoId().isEmpty() && !productoN.getCampoPrecio().isEmpty() && productoN.getCampoCantidad().isEmpty()){
                    productoN.setLabelId("El id no puede estar vacio");
                    productoN.setLabelCantidad("La cantidad no puede estar vacia");
               }
               if(productoN.getCampoId().equals("") && productoN.getCampoPrecio().equals("") && !productoN.getCampoCantidad().equals("") || productoN.getCampoId().isEmpty() && productoN.getCampoPrecio().isEmpty() && !productoN.getCampoCantidad().isEmpty()){
                    productoN.setLabelId("El id no puede estar vacio");
                    productoN.setLabelPrecio("El precio no puede estar vacio");
               }
           }

         
     }
     
     public static void cancelar(){
        //En vez de hacer que cambie de panel, haz que todo lo subido de la tabla se elimine y no haya logrado mandar nada a 
        //la DB
     }

     public static boolean ValidadNumeros(String texto){//para id y cantidad
          return texto.matches("^-?[0-9]{0,99999}+$");//los corchetes validan entre el 0, hasta el 99999
       }

       public static boolean ValidadSexo(String texto){//Debes hacerlo mas estricto para que permita poner solo F y M
          return texto.matches("^([FM]{0,2})$");//{minimo de 0 caracteres y su limite es 3}
       }

       public static boolean validarNumerosDecimales(String texto){//este es para que permitas a precio ser un double
          return texto.matches("^-?[0-9]+([\\.][0-9]+)$");//los parentesis es como "es opcional que este esto"
       }

       public static void enviaDatosTabla(JTable tabla){
    
          db = new DBProd();
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


      public static void mandaDatosCampos(JTable tabla, PanelNuevoProducto nProducto){
          
          int fila = tabla.getSelectedRow();
          if(fila>=0){
               nProducto.setCampoId(String.valueOf(tabla.getValueAt(fila, 0)));
               nProducto.setFilaIdObtenido((int) tabla.getValueAt(fila, 0));
               nProducto.setCampoDesc((String.valueOf(tabla.getValueAt(fila, 1))));
               nProducto.setCampoTalla((String.valueOf(tabla.getValueAt(fila, 2))));
               nProducto.setCampoMarca(String.valueOf(tabla.getValueAt(fila,3)));
               nProducto.setCampoTipo(String.valueOf(tabla.getValueAt(fila, 4)));
               nProducto.setCampoPrecio(String.valueOf(tabla.getValueAt(fila, 5)));
               nProducto.setCampoEdadDirigida(String.valueOf(tabla.getValueAt(fila, 6)));
               nProducto.setCampoCantidad(String.valueOf(tabla.getValueAt(fila, 7)));
               nProducto.setCampoSexo(String.valueOf(tabla.getValueAt(fila, 8)));
          }
      }

      public void activacionDeLlave(PanelNuevoProducto valida){
          if(!valida.isLlaveActiva() && !valida.isCampoActivo()){
               ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveActivada.png"));
               valida.setBotonLlave(image);
               valida.setLlaveActiva(false);
               valida.setCampoActivo(true);
         }
         else if(!valida.isLlaveActiva() && valida.isCampoActivo()){
                   if(valida.getCampoId().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Seleccione una fila si desea usar esta opción");
                        valida.setEditableId(true);
                   }else if(!valida.getCampoId().isEmpty() || valida.getFilaIdObtenido()>=0){
                        ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
                        valida.setBotonLlave(image);
                        valida.setLlaveActiva(false);
                        valida.setCampoActivo(false);
                        valida.setEditableId(false);
                   }
         }else if(valida.isLlaveActiva() && !valida.isCampoActivo()){
               ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveActivada.png"));
               valida.setBotonLlave(image);
               valida.setLlaveActiva(true);
               valida.setCampoActivo(true);
               valida.setEditableId(true);
         }else if(!valida.isLlaveActiva() && valida.isCampoActivo()){
              ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
              valida.setBotonLlave(image);
              valida.setLlaveActiva(false);
              valida.setCampoActivo(true);
              valida.setEditableId(false);
         }
      }

}
