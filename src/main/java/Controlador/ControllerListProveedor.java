package Controlador;

import DAO.nProveedorDao;
import Modelo.Proveedores;
import Vista.PanelProveedores;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter; 
import javax.swing.table.*;
import java.util.*;
import java.io.*;

public class ControllerListProveedor {

    private static nProveedorDao pDao;

        public static void enviaDatosTabla(JTable tabla, PanelProveedores panel){

                pDao = new nProveedorDao();
                ArrayList<Proveedores> listaProveedores = pDao.mostrar();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Nombre"); modelo.addColumn("Cedula");
                modelo.addColumn("Empresa"); modelo.addColumn("Email");

                    for(Proveedores proveedor : listaProveedores){
                        
                            Object fila[] = new Object[4];

                                fila[0] = proveedor.getNombre();
                                fila[1] = proveedor.getCedula();
                                fila[2] = proveedor.getEmpresa();
                                fila[3] = proveedor.getEmail();
                            modelo.addRow(fila);
                    }
            tabla.setModel(modelo);
        }

    
        public static void mandaDatos(JTable tabla, PanelProveedores panel){

            pDao = new nProveedorDao();
            ArrayList<Proveedores> listaProveedores = null;
            int fila = tabla.getSelectedRow();
            String cedula = null;//for search the id original of vendor
            String id = "", nombre = "", cedulaP = "", fecha = "", email = "", empresa = "", articulos= "";
            listaProveedores = pDao.mostrar();

                    if(fila>=0){
                        cedula =  (String) tabla.getValueAt(fila, 1);
                    }
                
                for(Proveedores proveedor : listaProveedores){
                       if(proveedor.getCedula().equals(cedula)){
                            id = proveedor.getIdProveedor();
                            nombre = proveedor.getNombre();
                            cedulaP = proveedor.getCedula();
                            fecha = proveedor.getFechaNacimiento();
                            empresa = proveedor.getEmpresa();
                            email = proveedor.getEmail();
                            articulos = proveedor.getArticulos();
                       }
                }
                panel.setCampoId(id);
                panel.setCampoNombre(nombre);
                panel.setCampoCedula(cedulaP);
                panel.setCampoFechaN(fecha);
                panel.setCampoEmail(email);
                panel.setCampoEmpresa(empresa);
                panel.setCampoArticulos(articulos);
        }

        public static void desactiva(PanelProveedores panel){
            panel.setEditableArt();
            panel.setEditableCed();
            panel.setEditableEma();
            panel.setEditableEmp();
            panel.setEditableFec();
            panel.setEditableId();
            panel.setEditableNomb();
        }

        
        public static void cambiaImagen(PanelProveedores panel){
            
            JFileChooser fileC = new JFileChooser();
            fileC.setCurrentDirectory(new File(""));

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Image", "png", "jpg");
            fileC.setFileFilter(filter);

                int action = fileC.showOpenDialog(null);
                    if(action == JFileChooser.APPROVE_OPTION){
                            File path = new File((String.valueOf(fileC.getCurrentDirectory().getAbsoluteFile())));
                            try {
                                FileInputStream fileIn = new FileInputStream(path);


                            } catch (FileNotFoundException e) {
                                System.out.println(e.getMessage());
                            }


                    }
        }
}
