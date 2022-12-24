package Controlador;

import Modelo.*;
import Vista_Register.PanelNuevoProveedor;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ControllerNewProveedor {

    private static DBProv db;
    private static Proveedores proveedor;

    public static void actualizaProveedor(JTable tabla, PanelNuevoProveedor proveedorP){
            
          db = new DBProv();
          try{
                String id = proveedorP.getCampoIdProv();
                String nombre = proveedorP.getCampoNombre(); 
                String edad = proveedorP.getCampoEdad();
                String cedula = proveedorP.getCampoCedula();
                String email = proveedorP.getCampoEmail();
                String empresa = proveedorP.getCampoEmpresa();
                String articulos = proveedorP.getCampoArticulos();

                  proveedor = new Proveedores(id, nombre, edad, cedula, email, empresa, articulos);
                  db.actualizaProveedor(proveedor, proveedorP.getConfirmaId());
                  enviaDatosTabla(tabla, "");
                  borrarCampos(proveedorP);
                
           }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "Precio y cantidad no pueden estar vacios");
           }
    }

    public static void eliminarProveedor(JTable tabla, PanelNuevoProveedor nProveedor){

        int filaNombre = tabla.getSelectedRow();
        String nombre = null;

        if(filaNombre>=0){
            nombre = (String) tabla.getValueAt(filaNombre, 1);
        }

        db = new DBProv();
        db.eliminar(nombre);
        enviaDatosTabla(tabla, "");
        borrarCampos(nProveedor);

    }

    public static void subir(JTable tabla, PanelNuevoProveedor nProveedor){

        db = new DBProv();
        String idProv = nProveedor.getCampoIdProv();
        String nombre = nProveedor.getCampoNombre();
        String fechaN = nProveedor.getCampoEdad();
        String cedula = nProveedor.getCampoCedula();
        String email = nProveedor.getCampoEmail();
        String empresa = nProveedor.getCampoEmpresa();
        String articulos = nProveedor.getCampoArticulos();

        Proveedores proveedor = new Proveedores(idProv, nombre, fechaN, cedula, email, empresa, articulos);
        db.insertarProveedor(proveedor);
        enviaDatosTabla(tabla, "");
        borrarCampos(nProveedor);
    }

    public static void enviaDatosTabla(JTable tabla, String mostrar){
    
        db = new DBProv();
             ArrayList<Proveedores> listaProductos = db.mostrar(mostrar);
             DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id de proveedor"); modelo.addColumn("Nombre"); modelo.addColumn("Fecha de nacimiento");
            modelo.addColumn("Cedula"); modelo.addColumn("Email"); modelo.addColumn("Empresa"); modelo.addColumn("Articulos");

                  for(Proveedores proveedor : listaProductos){
                       
                        Object[] filas = new Object[7];

                           filas[0] = proveedor.getIdProveedor();
                           filas[1] = proveedor.getNombre();
                           filas[2] = proveedor.getFechaNacimiento();
                           filas[3] = proveedor.getCedula();
                           filas[4] = proveedor.getEmail();
                           filas[5] = proveedor.getEmpresa();
                           filas[6] = proveedor.getArticulos();
                           modelo.addRow(filas);
                  }
        tabla.setModel(modelo);
    }

    public static void mueveCampos(JTable tabla, PanelNuevoProveedor nProveedor){


        
    }


    public static void mandaDatos(JTable tabla, PanelNuevoProveedor nProveedor){
       
        int fila = tabla.getSelectedRow();
        if(fila>=0){
            nProveedor.setCampoIdProv((String)tabla.getValueAt(fila, 0));
            nProveedor.setConfirmaId((String) tabla.getValueAt(fila, 0));
            nProveedor.setCampoNombre((String) tabla.getValueAt(fila, 1));
            nProveedor.setCampoEdad((String) tabla.getValueAt(fila, 2));
            nProveedor.setCampoCedula((String) tabla.getValueAt(fila, 3));
            nProveedor.setCampoEmail((String) tabla.getValueAt(fila, 4));
            nProveedor.setCampoEmpresa((String) tabla.getValueAt(fila, 5));
            nProveedor.setCampoArticulos((String) tabla.getValueAt(fila, 6));
        }

    }

    
    public static void borrarCampos(PanelNuevoProveedor proveedor){
        proveedor.setCampoIdProv("");
        proveedor.setCampoNombre("");
        proveedor.setCampoEdad("");
        proveedor.setCampoCedula("");
        proveedor.setCampoEmail("");
        proveedor.setCampoEmpresa("");
        proveedor.setCampoArticulos("");
   }

    public static boolean validaNumeros(String texto){
        return texto.matches("^-?[0-9]{0,100}+$");
     }

     public static boolean validaEmail(String texto){
        return texto.matches("");
     }

}
