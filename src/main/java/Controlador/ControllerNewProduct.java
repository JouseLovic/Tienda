package Controlador;

import javax.swing.*;
import javax.swing.table.*;
import Modelo.*;
import Vista.PanelInicial;
import Vista_Formulario.*;
import DAO.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ControllerNewProduct {
     
     private static Producto producto;
     private static nProductoDao productDao;
     private static int intentos = 0;
     private static boolean voidFields;
     private static boolean sexValidate;
     
     public static void borrarCampos(PanelNuevoProducto producto){

          producto.setLabelIdDefault("ID");
          producto.setLabelSexoDefault("Sexo");
          producto.setLabelCantidadDefault("Cantidad");
          producto.setLabelPrecioDefault("Precio");
          producto.setCampoDesc("");
          producto.setCampoCantidad("");
          producto.setCampoEdadDirigida("");
          producto.setCampoId("");
          producto.setCampoMarca("");
          producto.setCampoPrecio("");
          producto.setCampoTalla("");
          producto.setCampoSeccion("");
          producto.setCampoSexo("");
          producto.setCampoIdProveedor("");
          producto.setCampoTalla("");
          
     }

     public static void actualizarProducto(PanelNuevoProducto nProductos){

          productDao = new nProductoDao();
          ArrayList<Producto> listaCompara = null;
          boolean exist = false;
          listaCompara = productDao.mostrar("");
          try{
               String id = nProductos.getCampoId();
               String desc = nProductos.getCampoDesc();
               String talla = nProductos.getCampoTalla();
               String marca = nProductos.getCampoMarca();
               String seccion =  nProductos.getCampoSeccion();
               double precio = Double.parseDouble(nProductos.getCampoPrecio());
               String edadDirigida = nProductos.getCampoEdadDirigida();
               int cantidad =  Integer.parseInt(nProductos.getCampoCantidad());
               String sexo = nProductos.getCampoSexo();
               String idProveedor = nProductos.getCampoIdProveedor();
               String vendido = nProductos.getVendido();

                         producto = new Producto(id, desc, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                         productDao.actualizarProducto(producto, nProductos.getConfirmaId());
                         borrarCampos(nProductos);
                     
           }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "Precio y cantidad no pueden estar vacios");
           }
     }

     public static void confirmar(PanelNuevoProducto nProductos){
               productDao = new nProductoDao();
               String vendido = "Si";
               productDao.confirmarVendida(vendido, nProductos.getConfirmaId());
     }


     public static void eliminar(JTable tabla, PanelNuevoProducto nProducto){
          productDao = new nProductoDao();
          int fila = tabla.getSelectedRow();
          if(fila >= 0){
               String id = (String) tabla.getValueAt(fila, 0);
               productDao.eliminar(id);
               enviaDatosTablaOrdenar(tabla, nProducto.getOrdenadoSeleccionado(), "");
          }
          else{
               JOptionPane.showMessageDialog(null, "Seleccione una fila si desea eliminar");
          }
     }
     
     public static void subir(PanelNuevoProducto productoN, JTable tabla, JLabel label){

          productDao = new nProductoDao();
          boolean copia = false;
          voidFields = false;
          sexValidate = false;
          ArrayList<Producto> listaComparativa = productDao.mostrar("");

          try{
               String id = productoN.getCampoId();
               String desc = productoN.getCampoDesc();
               String talla = productoN.getCampoTalla();
               String marca = productoN.getCampoMarca();
               String seccion =  productoN.getCampoSeccion();
               double precio = Double.parseDouble(productoN.getCampoPrecio());
               String edadDirigida = productoN.getCampoEdadDirigida();
               int cantidad =  Integer.parseInt(productoN.getCampoCantidad());
               String sexo = productoN.getCampoSexo();
               String idProveedor = "";
               String vendido = "No ";

                voidFields = validateIfFieldsIsEmpty(id, desc, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                sexValidate = validarSexo(sexo);

                if(precio == 0){
                    productoN.setLabelPrecio("El precio no puede estar vacio");
                    voidFields = true;
                }
                if(cantidad == 0){
                    productoN.setLabelCantidad("La cantidad no puede estar vacia");
                    voidFields = true;
                }

                    for(Producto productoCopia : listaComparativa){
                         if(productoCopia.getId().equals(id)){
                              copia = true;
                         }
                    }

                    if(!copia && !voidFields && sexValidate){
                          producto = new Producto(id, desc, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, idProveedor, vendido);
                          productDao.insertarProducto(producto);
                          enviaDatosTablaOrdenar(tabla, productoN.getOrdenadoSeleccionado(), productoN.getCampoBuscar());
                          borrarCampos(productoN);
                    }
                    else if(copia){
                        label.setText("ID ya existente");
                        label.setForeground(Color.RED);
                        productoN.setRequestFocusCampoId();
                    }
                    if(!sexValidate) {
                        productoN.setLabelSexoAdvertencia("Dato invalido");
                        intentos++;
                        productoN.setRequestFocusCampoSexo();
                        if (intentos == 3) {
                            JOptionPane.showMessageDialog(null, "Esta intentando crear un sexo con mas de 3 caracteres\nU esta ingresando caracteres diferentes de: M, F, MF o FM");
                        } else if (intentos == 6) {
                            JOptionPane.showMessageDialog(null, "Por favor, revise el manual de usuario. Tiene " + intentos + " intentos. No logrará nada ingresando datos no validos");
                            intentos = 0;
                        }
                    }
                    if(id.equals("")) {
                        label.setText("ID vacio");
                        label.setForeground(Color.RED);
                        productoN.setRequestFocusCampoId();
                    }
           }catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(null, "Yout cannot leave any fields empty");
               System.err.println(ex.getMessage());
          }
     }

        public static boolean validateIfFieldsIsEmpty(String id, String desc, String talla, String marca, String seccion, Double precio, String edadDirigida, int cantidad, String sexo, String idProveedor, String vendido){
           if(id.equals("") || desc.equals("") || talla.equals("") || marca.equals("") || seccion.equals("") || precio < 0 || edadDirigida.equals("") || cantidad < 0 || sexo.equals("") || vendido.equals("")){
               JOptionPane.showMessageDialog(null, "You cannot leave any fields empty");
               return true;
           }
           else{
               return false;
           }
       }

       public static void labelDefault(JLabel label, String texto){
         label.setText(texto);
         label.setForeground(Color.BLACK);
       }
        public static boolean validarSexo(String sexo){

          if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
               return true;
          } else if(sexo.equalsIgnoreCase("mf") || sexo.equalsIgnoreCase("fm")){
                    return true;
          }
          else {
              return false;
          }
     }
        public static void enviaDatosTabla(JTable tabla, String nombre){
    
          productDao = new nProductoDao();
               ArrayList<Producto> listaProductos = productDao.mostrar(nombre);
               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("Id"); modelo.addColumn("Descripcion"); modelo.addColumn("Talla"); modelo.addColumn("Marca");
               modelo.addColumn("Seccion"); modelo.addColumn("Precio"); modelo.addColumn("Edad dirigida"); modelo.addColumn("Cantidad");
               modelo.addColumn("Sexo"); modelo.addColumn("Id del proveedor"); modelo.addColumn("Producto vendido");
      
                    for(Producto productos : listaProductos){
                         
                          Object[] filas = new Object[11];

                              filas[0] = productos.getId();
                              filas[1] = productos.getDesc();
                              filas[2] = productos.getTamaño();
                              filas[3] = productos.getMarca();
                              filas[4] = productos.getSeccion();
                              filas[5] = productos.getPrecio();
                              filas[6] = productos.getEdadDirigida();
                              filas[7] = productos.getCantidad();
                              filas[8] = productos.getSexo();
                              filas[9] = productos.getIdProveedor();
                              filas[10] = productos.getVendido();
                              modelo.addRow(filas);
                    }
          tabla.setModel(modelo);
      }

      public static void enviaDatosTablaOrdenar(JTable tabla, String nombre, String texto){
    
          if(nombre == "Descripcion"){

               productDao = new nProductoDao();
               ArrayList<Producto> listaProductos = productDao.mostrarSeleccionDesc(texto);
               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("Id"); modelo.addColumn("Descripcion"); modelo.addColumn("Talla"); modelo.addColumn("Marca");
               modelo.addColumn("Seccion"); modelo.addColumn("Precio"); modelo.addColumn("Edad dirigida"); modelo.addColumn("Cantidad");
               modelo.addColumn("Sexo"); modelo.addColumn("Id del proveedor"); modelo.addColumn("Producto vendido");
      
                    for(Producto productos : listaProductos){
                         
                          Object[] filas = new Object[11];

                              filas[0] = productos.getId();
                              filas[1] = productos.getDesc();
                              filas[2] = productos.getTamaño();
                              filas[3] = productos.getMarca();
                              filas[4] = productos.getSeccion();
                              filas[5] = productos.getPrecio();
                              filas[6] = productos.getEdadDirigida();
                              filas[7] = productos.getCantidad();
                              filas[8] = productos.getSexo();
                              filas[9] = productos.getIdProveedor();
                              filas[10] = productos.getVendido();
                              modelo.addRow(filas);
                    }
          tabla.setModel(modelo);
          }

          if(nombre == "ID"){

               productDao = new nProductoDao();
               ArrayList<Producto> listaProductos = productDao.mostrarSeleccionId(texto);
               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("Id"); modelo.addColumn("Descripcion"); modelo.addColumn("Talla"); modelo.addColumn("Marca");
               modelo.addColumn("Seccion"); modelo.addColumn("Precio"); modelo.addColumn("Edad dirigida"); modelo.addColumn("Cantidad");
               modelo.addColumn("Sexo"); modelo.addColumn("Id del proveedor"); modelo.addColumn("Producto vendido");
      
                    for(Producto productos : listaProductos){
                         
                          Object[] filas = new Object[11];

                              filas[0] = productos.getId();
                              filas[1] = productos.getDesc();
                              filas[2] = productos.getTamaño();
                              filas[3] = productos.getMarca();
                              filas[4] = productos.getSeccion();
                              filas[5] = productos.getPrecio();
                              filas[6] = productos.getEdadDirigida();
                              filas[7] = productos.getCantidad();
                              filas[8] = productos.getSexo();
                              filas[9] = productos.getIdProveedor();
                              filas[10] = productos.getVendido();
                              modelo.addRow(filas);
                    }
          tabla.setModel(modelo);
          }

          if(nombre == "Seccion"){

               productDao = new nProductoDao();
               ArrayList<Producto> listaProductos = productDao.mostrarSeleccionSeccion(texto);
               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("Id"); modelo.addColumn("Descripcion"); modelo.addColumn("Talla"); modelo.addColumn("Marca");
               modelo.addColumn("Seccion"); modelo.addColumn("Precio"); modelo.addColumn("Edad dirigida"); modelo.addColumn("Cantidad");
               modelo.addColumn("Sexo"); modelo.addColumn("Id del proveedor"); modelo.addColumn("Producto vendido");
      
                    for(Producto productos : listaProductos){
                         
                          Object[] filas = new Object[11];

                              filas[0] = productos.getId();
                              filas[1] = productos.getDesc();
                              filas[2] = productos.getTamaño();
                              filas[3] = productos.getMarca();
                              filas[4] = productos.getSeccion();
                              filas[5] = productos.getPrecio();
                              filas[6] = productos.getEdadDirigida();
                              filas[7] = productos.getCantidad();
                              filas[8] = productos.getSexo();
                              filas[9] = productos.getIdProveedor();
                              filas[10] = productos.getVendido();
                              modelo.addRow(filas);
                    }
          tabla.setModel(modelo);
          }

          if(nombre == "Marca"){

               productDao = new nProductoDao();
               ArrayList<Producto> listaProductos = productDao.mostrarSeleccionMarca(texto);
               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("Id"); modelo.addColumn("Descripcion"); modelo.addColumn("Talla"); modelo.addColumn("Marca");
               modelo.addColumn("Seccion"); modelo.addColumn("Precio"); modelo.addColumn("Edad dirigida"); modelo.addColumn("Cantidad");
               modelo.addColumn("Sexo"); modelo.addColumn("Id del proveedor"); modelo.addColumn("Producto vendido");
      
                    for(Producto productos : listaProductos){
                         
                          Object[] filas = new Object[11];

                              filas[0] = productos.getId();
                              filas[1] = productos.getDesc();
                              filas[2] = productos.getTamaño();
                              filas[3] = productos.getMarca();
                              filas[4] = productos.getSeccion();
                              filas[5] = productos.getPrecio();
                              filas[6] = productos.getEdadDirigida();
                              filas[7] = productos.getCantidad();
                              filas[8] = productos.getSexo();
                              filas[9] = productos.getIdProveedor();
                              filas[10] = productos.getVendido();
                              modelo.addRow(filas);
                    }
                tabla.setModel(modelo);
          }
     }


      public static void mandaDatosCampos(JTable tabla, PanelNuevoProducto nProducto){
          
          int fila = tabla.getSelectedRow();
          if(fila>=0){
               nProducto.setCampoId(String.valueOf(tabla.getValueAt(fila, 0)));
               nProducto.setConfirmaId((String) tabla.getValueAt(fila, 0));
               nProducto.setCampoDesc((String.valueOf(tabla.getValueAt(fila, 1))));
               nProducto.setCampoTalla((String.valueOf(tabla.getValueAt(fila, 2))));
               nProducto.setCampoMarca(String.valueOf(tabla.getValueAt(fila,3)));
               nProducto.setCampoSeccion(String.valueOf(tabla.getValueAt(fila, 4)));
               nProducto.setCampoPrecio(String.valueOf(tabla.getValueAt(fila, 5)));
               nProducto.setCampoEdadDirigida(String.valueOf(tabla.getValueAt(fila, 6)));
               nProducto.setCampoCantidad(String.valueOf(tabla.getValueAt(fila, 7)));
               nProducto.setCampoSexo(String.valueOf(tabla.getValueAt(fila, 8)));
               nProducto.setCampoIdProveedor((String) tabla.getValueAt(fila, 9));
               nProducto.setVendido((String) tabla.getValueAt(fila, 10));
          }
      }

      public void activacionDeLlave(PanelNuevoProducto valida){
          if(!valida.isLlaveActiva() && !valida.isCampoActivo()){
               ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveActivada.png"));
               valida.setBotonLlave(image);
               valida.setLlaveActiva(false);
               valida.setCampoActivo(true);
               valida.setEditableId(true);
         }
         else if(!valida.isLlaveActiva() && valida.isCampoActivo()){
                   if(valida.getCampoId().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Seleccione una fila si desea usar esta opción");
                        valida.setEditableId(true);
                   }else if(!valida.getCampoId().isEmpty()){
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

     public static void paraBotonEliminar(JTable tabla, PanelNuevoProducto productoN){
          tabla.setSelectionMode(0);
          productoN.setActualiza(false);
          productoN.setCampoActivo(true);
          productoN.setLlaveActiva(true);
          productoN.setEditableId(true);
     }

     public void paraBotonActualizar(JTable tabla, PanelNuevoProducto productoN){
          tabla.setSelectionMode(0);
          productoN.setCampoActivo(true);
          productoN.setLlaveActiva(false);
          productoN.setActualiza(false);
          productoN.setEditableId(true);
          ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
          productoN.dameIcono(image);
     }

     public void paraBotonLimpiar(JTable tabla, PanelNuevoProducto productoN){
          tabla.setSelectionMode(0);
          productoN.setActualiza(false);
          productoN.setConfirmaVendido(false);
          productoN.setCampoActivo(true);
          productoN.setLlaveActiva(false);
          productoN.setEditableId(true);
          ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
          productoN.dameIcono(image);
     }

     public void filaSeleccionada(JTable tabla, PanelNuevoProducto productoN){
          productoN.setActualiza(true);
          productoN.setConfirmaVendido(true);
          productoN.setEditableId(false);
          productoN.setLlaveActiva(false);
          productoN.setCampoActivo(false);
          ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
          productoN.dameIcono(image);
     }

     public static void bloqueaLetrasPrecio(int keyNumeros, KeyEvent a){

          boolean numeros = keyNumeros>=48 && keyNumeros>=69;
  
          if(numeros){
              a.consume();
          }  
      }
  
      public static void bloqueaLetrasCantidad(int keyNumeros, KeyEvent a){
  
          boolean numeros = keyNumeros>=48 && keyNumeros>69;
  
          if(numeros){
              a.consume();
          }  
      }

      public static boolean state(){
          boolean state;
          PanelInicial inicio = new PanelInicial();
          state = inicio.getState();
          return state;
      }

}