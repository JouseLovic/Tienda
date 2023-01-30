package Controllers;

import Model.*;
import Repository.*;
import ViewFormulary.*;

import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.table.*;

public class ControllerEntriesP {

    private static EntriesRepo eDao;
    private static boolean Exist;
    private static boolean sumaCantidad;
    private static boolean nBillExist;
    private static ProductRepo nDao;
    private static SimpleDateFormat dateFormat;

    private static String tableColumnIdF, tableColumnCodeP, tableColumnDescP, tableColumnDate, tableColumnPrice, tableColumnQuantity;
    private static String tableColumnSection, tableColumnBrand, tableColumnVendorId;

    public ControllerEntriesP(boolean selectedLanguage) {

        if(selectedLanguage){
            tableColumnIdF = "Id bill";
            tableColumnCodeP = "Id product";
            tableColumnDescP = "Description";
            tableColumnDate = "Date entrie";
            tableColumnPrice = "Price";
            tableColumnQuantity = "Quantity";
            tableColumnSection = "Section product";
            tableColumnBrand = "Brand product";
            tableColumnVendorId = "Id of vendor";
        }
        else{
            tableColumnIdF = "Numero de factura";
            tableColumnCodeP = "Id del producto";
            tableColumnDescP = "Descripción";
            tableColumnDate = "Fecha";
            tableColumnPrice = "Precio";
            tableColumnQuantity = "Cantidad";
            tableColumnSection = "Seccion";
            tableColumnBrand = "Marca";
            tableColumnVendorId = "Id del proveedor";
        }



    }

    public static void eliminar(JTable tabla, String nBillOriginal){

        eDao = new EntriesRepo();
        eDao.eliminar(nBillOriginal);
        enviaDatosTabla(tabla, "");

    }
    
    public static void compruebaCampos(Product productos, PanelEntrada entrada, String descripcion, String seccion, String marca, String idProveedor) {

        if (!productos.getSeccion().equalsIgnoreCase(seccion)) {
            entrada.setLabelSection("La seccion no corresponde al producto");
        }

        if (!productos.getDesc().equalsIgnoreCase(descripcion)) {
            entrada.setLabelDesc("La descripción no corresponde al producto");
        }

        if (!productos.getMarca().equalsIgnoreCase(marca)) {
            entrada.setLabelBrand("La marca no corresponde al producto");
        }
        if (!productos.getIdProveedor().equalsIgnoreCase(idProveedor)) {
            entrada.setLabelVendor("Id invalido");
        }
    }

    public static void insertar(JTable tabla, PanelEntrada entrada, String nBillOriginal) throws SQLIntegrityConstraintViolationException{

        eDao = new EntriesRepo();
        Exist = false;
        sumaCantidad = false;
        nBillExist = false;
        ArrayList<Product> comparativa = null;
        nDao = new ProductRepo();
        comparativa = nDao.mostrarTodos("");


         try{
            String nFactura = entrada.getBillField();
            String codigoP = entrada.getCodePField();
            String desc = entrada.getDescField();
            String fecha = entrada.getDateField();
            double precio = entrada.TakePriceField();//this take is for give to the variable the price
            int cantidad = Integer.parseInt(entrada.getQuantityField());
            String seccion = entrada.getSectionField();
            String marca = entrada.getBrandField();
            String idProveedor = entrada.getVendorField();

             if(nFactura.equalsIgnoreCase(nBillOriginal)) {
                 nBillExist = true;
             }

                for (Product productos : comparativa){
                        if(!nBillExist && productos.getId().equalsIgnoreCase(codigoP) && productos.getDesc().equalsIgnoreCase(desc) && productos.getSeccion().equalsIgnoreCase(seccion) && productos.getMarca().equalsIgnoreCase(marca) && productos.getIdProveedor().equals(idProveedor)){
                            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea sumar la cantidad de entrada al producto ya existente que tiene el id de: "+codigoP+"?");
                                if(opcion == 0){
                                    Exist = true;
                                    sumaCantidad = true;
                                    break;
                                }
                        }
                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getDesc().equalsIgnoreCase(desc)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }

                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getSeccion().equalsIgnoreCase(seccion)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }

                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getIdProveedor().equalsIgnoreCase(idProveedor)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }

                        else if(productos.getId().equalsIgnoreCase(codigoP) && !productos.getMarca().equalsIgnoreCase(marca)){
                            compruebaCampos(productos, entrada, desc, seccion, marca, idProveedor);
                            Exist = true;
                        }
                    }

            if(!Exist && !nBillExist){
                EntriesProducts EntryProducts = new EntriesProducts(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarEntradaP(EntryProducts);
                enviaDatosTabla(tabla, "");
            }
            else if(sumaCantidad && !nBillExist){
                EntriesProducts EntryProducts = new EntriesProducts(nFactura, codigoP, desc, fecha, precio, cantidad, seccion, marca, idProveedor);
                eDao.insertarProductoExistente(EntryProducts);
                enviaDatosTabla(tabla, "");
            }
            else if(nBillExist){
                entrada.setLabelBill("Bill is exist", Color.RED);
            }

            }catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null, "El precio o la cantidad estan vacios. Por favor, llenelos");
        }
    }

    public static void enviaDatosTabla(JTable tabla, String nombre){

        eDao = new EntriesRepo();
        ArrayList<EntriesProducts> listEntries = eDao.mostrar(nombre);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(tableColumnIdF); model.addColumn(tableColumnCodeP);
        model.addColumn(tableColumnDescP); model.addColumn(tableColumnDate);
        model.addColumn(tableColumnPrice); model.addColumn(tableColumnQuantity);
        model.addColumn(tableColumnSection); model.addColumn(tableColumnBrand);
        model.addColumn(tableColumnVendorId);

             for(EntriesProducts productos : listEntries){
                  
                   Object[] filas = new Object[9];
                       filas[0] = productos.getNumFactura();
                       filas[1] = productos.getCodigoProducto();
                       filas[2] = productos.getDescripcionProducto();
                       filas[3] = productos.getFecha();
                       filas[4] = productos.getPrecio();
                       filas[5] = productos.getCantidad();
                       filas[6] = productos.getSeccion();
                       filas[7] = productos.getMarca();
                       filas[8] = productos.getIdProveedor();
                       model.addRow(filas);
             }
   tabla.setModel(model);
}

    public static void bloqueaLetrasPrecio(int keyNumeros, KeyEvent a){

        boolean numeros = keyNumeros>=48 && keyNumeros>=69;

            if(numeros){
                a.consume();
            }
  
    }

    public static void blockSearchLenght(JTextField searchField, KeyEvent a){

        if(searchField.getText().length()==57){
            a.consume();
        }

    }

    public static void bloqueaLetrasCantidad(int keyNumeros, KeyEvent a){

        boolean numeros = keyNumeros>=48 && keyNumeros>69;

            if(numeros){
                a.consume();
            }
     
    }

    public static void mandaProveedor(JTable tabla, String proveedor, PanelEntrada entradas){

            if(!proveedor.equals("Ninguno"))  entradas.setVendorField(proveedor);
        
            else if(proveedor.equals("Ninguno"))  entradas.setVendorField(null);

    }

    public static void llenaComboBox(JComboBox<String> laLista){

        eDao = new EntriesRepo();
        ArrayList<Vendor> lista = eDao.buscaProveedores();

        for(Vendor idP : lista){
            laLista.addItem(idP.getIdProveedor());
        }
    }

    public static void mandaCampos(JTable tabla, PanelEntrada entradas){

        int fila = tabla.getSelectedRow();
      
            if(fila>=0){
                entradas.setBillField((String) tabla.getValueAt(fila, 0));
                entradas.setCodePField((String) tabla.getValueAt(fila, 1));
                entradas.setDescField((String) tabla.getValueAt(fila, 2));
                entradas.setDateField((String) tabla.getValueAt(fila, 3));
                entradas.setPriceField(String.valueOf(tabla.getValueAt(fila, 4)));
                entradas.setQuantityField(String.valueOf(tabla.getValueAt(fila, 5)));
                entradas.setSectionField((String) tabla.getValueAt(fila, 6));
                entradas.setBrandField((String) tabla.getValueAt(fila, 7));
                entradas.setVendorField((String) tabla.getValueAt(fila, 8));
            }

    }


    public static void limpiaCampos(PanelEntrada entrada){
                Exist = false;
                entrada.setBillField("");
                entrada.setCodePField("");
                entrada.setDescField("");
                entrada.setDateField(toStringDate());
                entrada.setSelectedItemList(0);
                entrada.setPriceField("");
                entrada.setQuantityField("");
                entrada.setSectionField("");
                entrada.setBrandField("");
                entrada.setVendorField("");
    }


    public static boolean validarNumerosEnteros(String texto){//para id y cantidad
        return texto.matches("^-?[0-9]{0,99999}+$");//los corchetes validan entre el 0, hasta el 99999
     }

     public static boolean validarNumerosDecimales(String texto){//este es para que permitas a precio ser un double
        return texto.matches("^-?[0-9]+([\\.][0-9]+)$");//los parentesis es como "es opcional que este esto"
     }

     public static void setExist(boolean reemplaza){
         Exist = reemplaza;
     }


     public static String toStringDate(){
        Date date = new Date();
        dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        return dateFormat.format(date);
    }





}
