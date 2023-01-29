package Controllers;

import Repository.VendorRepo;
import Model.*;
import ViewFormulary.PanelNuevoProveedor;
import java.util.*;
import java.awt.*;
import java.io.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ControllerNVendor {

    private static VendorRepo pDao;
    private static Vendor proveedor;

    public static void actualizaProveedor(JTable tabla, PanelNuevoProveedor proveedorP){
            
          pDao = new VendorRepo();
          try{
                String id = proveedorP.getCampoIdProv();
                String nombre = proveedorP.getCampoNombre(); 
                String edad = proveedorP.getCampoEdad();
                String cedula = proveedorP.getCampoCedula();
                String email = proveedorP.getCampoEmail();
                String empresa = proveedorP.getCampoEmpresa();
                String articulos = proveedorP.getCampoArticulos();

                  proveedor = new Vendor(id, nombre, edad, cedula, email, empresa, articulos);
                  pDao.actualizaProveedor(proveedor, proveedorP.getConfirmaId());
                  enviaDatosTabla(tabla);
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

        pDao = new VendorRepo();
        pDao.eliminar(nombre);
        enviaDatosTabla(tabla);
        borrarCampos(nProveedor);

    }

    public static void subir(JTable tabla, PanelNuevoProveedor nProveedor){

        pDao = new VendorRepo();
        boolean validate = false, emailExist = false, cedulaExist = false, idExist = false, voidFields = false;
        ArrayList<Vendor> listaCompara = pDao.mostrar();
        String idProv = nProveedor.getCampoIdProv();
        String nombre = nProveedor.getCampoNombre();
        String fechaN = nProveedor.getCampoEdad();
        String cedula = nProveedor.getCampoCedula();
        String email = nProveedor.getCampoEmail();
        String empresa = nProveedor.getCampoEmpresa();
        String articulos = nProveedor.getCampoArticulos();

        validate = compruebaGmail(email);

            if(idProv.equals("") || nombre.equals("") || fechaN.equals("") || cedula.equals("") || email.equals("") || empresa.equals("") || articulos.equals("")){
                JOptionPane.showMessageDialog(null, "Asegurese que ningún campo este vacío");
                voidFields = true;                
            } 

            for(Vendor proveedorE : listaCompara){
                if(proveedorE.getCedula().equalsIgnoreCase(cedula)){
                    JOptionPane.showMessageDialog(null, "Esta cedula pertenece al proveedor: "+proveedorE.getNombre());
                    cedulaExist = true;
                }
                if(proveedorE.getEmail().equals(email)){
                    emailExist = true;
                }
                if(proveedorE.getIdProveedor().equalsIgnoreCase(idProv)){
                    idExist = true;
                }
            }

            if(validate && !cedulaExist && !emailExist && !idExist && !voidFields){
                Vendor proveedor = new Vendor(idProv, nombre, fechaN, cedula, email, empresa, articulos);
                pDao.insertarProveedor(proveedor);
                enviaDatosTabla(tabla);
                borrarCampos(nProveedor);
            }
            if(!validate  && !email.equalsIgnoreCase("")){
                nProveedor.setLabelEmail("¡Email no valido!");
                nProveedor.setRequestFocusEmail();
            }
            else if(emailExist){
                nProveedor.setLabelEmail("Este email ya existe");
                nProveedor.setRequestFocusEmail();
            }
            if(idExist){
                nProveedor.setLabelIdProv("Id ya existente");
            }
            if(cedulaExist){
                nProveedor.setLabelCedula("Cedula ya existente");
            }
    }

    public static void defaultLabelEmail(JLabel labelEmail){
        labelEmail.setText("Email");
        labelEmail.setForeground(Color.BLACK);
    }

    public static void defaultLabelIdProv(JLabel labelProv){
        labelProv.setText("Id del proveedor");
        labelProv.setForeground(Color.BLACK);
    }

    public static void defaultLabelCedula(JLabel labelCedula){
        labelCedula.setText("Cedula");
        labelCedula.setForeground(Color.BLACK);
    }

    public static void enviaDatosTabla(JTable tabla){
    
       pDao = new VendorRepo();
             ArrayList<Vendor> listProducts = pDao.mostrar();
             DefaultTableModel model = new DefaultTableModel();
             model.addColumn("Id de proveedor"); model.addColumn("Nombre"); model.addColumn("Fecha de nacimiento");
             model.addColumn("Cedula"); model.addColumn("Email"); model.addColumn("Empresa"); model.addColumn("Articulos");
                  for(Vendor proveedor : listProducts){
                       
                        Object[] filas = new Object[7];

                           filas[0] = proveedor.getIdProveedor();
                           filas[1] = proveedor.getNombre();
                           filas[2] = proveedor.getFechaNacimiento();
                           filas[3] = proveedor.getCedula();
                           filas[4] = proveedor.getEmail();
                           filas[5] = proveedor.getEmpresa();
                           filas[6] = proveedor.getArticulos();
                           model.addRow(filas);
                  }
                  tabla.setModel(model);
                  tabla.getColumn("Id de proveedor").setPreferredWidth(10);
                  tabla.getColumn("Fecha de nacimiento").setPreferredWidth(35);
                  tabla.getColumn("Cedula").setPreferredWidth(10);
                  tabla.getColumn("Empresa").setPreferredWidth(10);
    }

    
        public static void cambiaImagen(PanelNuevoProveedor panel){
            
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



    public static boolean compruebaGmail(String email){

        Pattern patron = Pattern.compile("^(([a-zA-z0-9])(?!.*\\s).*@gmail.com)$");
        Matcher match = patron.matcher(email);

            if(match.find()){
                return true;
            }
        return false;
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

    public static void getQuantityVendor(JLabel label){

        pDao = new VendorRepo();
        int quantity = pDao.getQuantityVendors();
        label.setText(String.valueOf(quantity));
    }

    
    public static void borrarCampos(PanelNuevoProveedor proveedor){
        proveedor.setDefaultsLabels("Email", "Cedula", "Id del proveedor");
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

}
