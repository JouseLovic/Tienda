package Controllers;

import View.*;
import View.Window;
import ViewFormulary.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import javax.swing.*;
import java.awt.*;

public class ControllerMenu {

    //Panel inicial
    private static PanelInicial inicio;
    private static int desplaceCount = 0;

    //For the change to other language
    private boolean languageSelected;
    //Formularios
    private static PanelEntrada entradas;
    private static PanelNuevoProducto nProducto;

    //WLogin
    private static WindowLogin wLogin;
    
    //Registros de nuevos proveedores o facturas
    private static PanelNuevaFactura NewFacturas;
    private static PanelNuevoProveedor NewProveedor;

    //Settings
    private static PanelSettings settings;

    //ss23 string
    private static String home, inventary, entries, bill, vendors, addUser;

    public ControllerMenu(boolean stateLanguage){

        inicio = new PanelInicial();
        entradas = new PanelEntrada();
        nProducto = new PanelNuevoProducto();
        NewFacturas = new PanelNuevaFactura();
        NewProveedor = new PanelNuevoProveedor();
        settings = new PanelSettings();

        if(stateLanguage){
            languageSelected = stateLanguage;
            home = "Home";
            inventary = "Inventary";
            entries = "Entries of products";
            bill = "Bill for entries";
            vendors = "Vendor";
            addUser = "Add new user";
        }
        else{
            languageSelected = stateLanguage;
            home = "Inicio";
            inventary = "Gestion";
            entries = "Entrada de productos";
            bill = "Facturas de entradas";
            vendors = "Vendor";
            addUser = "Añadir usuario";
        }
    }

    public static void ocultarPanelInicial(JPanel panel, PanelInicial panelPrincipal){
        panel.remove(panelPrincipal);
        panelPrincipal.setVisible(false);
    }


    private static void ocultarTodosLosPaneles(PanelSettings se, PanelInicial inicio, PanelNuevoProducto nProducto, PanelEntrada entrada, PanelNuevaFactura NFactura, PanelNuevoProveedor NProveedor, JPanel w){
        entrada.setVisible(false);
        inicio.setVisible(false);
        NFactura.setVisible(false);
        NProveedor.setVisible(false);
        se.setVisible(false);
        nProducto.setVisible(false);
        w.remove(nProducto);
        w.remove(entrada);
        w.remove(se);
        w.remove(inicio);
        w.remove(NProveedor);
        w.remove(NFactura);
    }


    public static void mostrarNuevoProductos(Window w){
        PanelNuevoProducto.setIsVisible(true);
        PanelInicial.setIsVisibleInitial(false);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelNuevoProveedor.setIsVisibleNProv(false);
        PanelSettings.setState(false);
        PanelEntrada.setIsVisibleEntries(false);
        nProducto.setVisible(true);
        w.setPanel(nProducto);
    }

    public static void atras(Window w){
        inicio.setVisible(true);
        PanelSettings.setState(false);
        PanelInicial.setIsVisibleInitial(true);
        PanelNuevoProducto.setIsVisible(false);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelEntrada.setIsVisibleEntries(false);
        PanelNuevoProveedor.setIsVisibleNProv(false);
        w.setPanel(inicio);
    }

    public static void mostrarEntradaP(Window w){
        PanelNuevoProducto.setIsVisible(false);
        PanelSettings.setState(false);
        PanelEntrada.setIsVisibleEntries(true);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelInicial.setIsVisibleInitial(false);
        PanelNuevoProveedor.setIsVisibleNProv(false);
        entradas.setVisible(true);
        w.setPanel(entradas);
    }

    public static void mostrarRegistroFacturas(Window w){
        PanelNuevoProducto.setIsVisible(false);
        PanelInicial.setIsVisibleInitial(false);
        PanelEntrada.setIsVisibleEntries(false);
        PanelNuevaFactura.setIsVisibleNFactura(true);
        PanelNuevoProveedor.setIsVisibleNProv(false);
        PanelSettings.setState(false);
        NewFacturas.setVisible(true);
        w.setPanel(NewFacturas);
    }

    public static void mostrarRegistroProveedores(Window w){
        PanelNuevoProducto.setIsVisible(false);
        PanelInicial.setIsVisibleInitial(false);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelNuevoProveedor.setIsVisibleNProv(true);
        PanelEntrada.setIsVisibleEntries(false);
        PanelSettings.setState(false);
        NewProveedor.setVisible(true);
        w.setPanel(NewProveedor);
    }

    public static void mostrarSettings(Window w){
        PanelNuevoProducto.setIsVisible(false);
        PanelInicial.setIsVisibleInitial(false);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelNuevoProveedor.setIsVisibleNProv(false);
        PanelEntrada.setIsVisibleEntries(false);
        PanelSettings.setState(true);
        settings.setVisible(true);
        w.setPanel(settings);
    }

    public static void BorraPaneles(){
       ocultarTodosLosPaneles(settings, inicio, nProducto, entradas, NewFacturas, NewProveedor, new JPanel());
    }

    public static void cambiaColorPressed(JButton button) {
        if (PanelInicial.isIsVisibleInitial()) {
            button.setBackground(new Color(126, 72, 208));
        }
        else if(PanelNuevoProducto.getIsVisible()){
            button.setBackground(new Color(58, 95, 245));
        }
        else if(PanelEntrada.isIsVisibleEntries()){
            button.setBackground(new Color(163, 83, 44));
        }
        else if(PanelNuevaFactura.isIsVisibleNFactura()){
            button.setBackground(new Color(163, 54, 119));
        }
        else if(PanelNuevoProveedor.isIsVisibleNProv()){
            button.setBackground(new Color(156, 34, 38, 255));
        }
        else if(PanelSettings.isState()){
            button.setBackground(new Color(52, 52, 52));
        }
    }

    public static void cambiaColorEntered(JButton button, Color pInitial, Color pCRUD, Color pEntries, Color pBill, Color pVendors, Color pSettings){
        if (PanelInicial.isIsVisibleInitial()) {
            button.setBackground(pInitial);
        }
        else if(PanelNuevoProducto.getIsVisible()){
            button.setBackground(pCRUD);
        }
        else if(PanelEntrada.isIsVisibleEntries()){
            button.setBackground(pEntries);
        }
        else if(PanelNuevaFactura.isIsVisibleNFactura()){
            button.setBackground(pBill);
        }
        else if(PanelNuevoProveedor.isIsVisibleNProv()){
            button.setBackground(pVendors);
        }
        else if(PanelSettings.isState()){
            button.setBackground(pSettings);
        }
    }

    public static void cambiaColorExited(JButton button, Color pInitial, Color pCRUD, Color pEntries, Color pBill, Color pVendors, Color pSettings){
        if (PanelInicial.isIsVisibleInitial()) {
            button.setBackground(pInitial);
        }
        else if(PanelNuevoProducto.getIsVisible()){
            button.setBackground(pCRUD);
        }
        else if(PanelEntrada.isIsVisibleEntries()){
            button.setBackground(pEntries);
        }
        else if(PanelNuevaFactura.isIsVisibleNFactura()){
            button.setBackground(pBill);
        }
        else if(PanelNuevoProveedor.isIsVisibleNProv()){
            button.setBackground(pVendors);
        }
        else if(PanelSettings.isState()){
            button.setBackground(pSettings);
        }
    }

    public static void logOut(Window w){
        w.dispose();
        wLogin = new WindowLogin();
        wLogin.setVisible(true);
    }

    public static String getVendors() {
        return vendors;
    }

    public static PanelInicial getInicio() {
        return inicio;
    }

    public static PanelEntrada getEntradas() {
        return entradas;
    }

    public static String getHome() {
        return home;
    }

    public static String getInventary() {
        return inventary;
    }

    public static String getEntries() {
        return entries;
    }

    public static String getBill() {
        return bill;
    }

    public static String getAddUser() {
        return addUser;
    }

}
