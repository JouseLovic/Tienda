package Controlador;

import Vista.*;
import Vista_Formulario.*;
import Vista_Register.*;

import javax.swing.*;

public class ControllerMenu {

    //Panel inicial
    private static PanelInicial inicio = new PanelInicial();
    
    //Formularios
    private static PanelEntrada entradas = new PanelEntrada();
    private static PanelNuevoProducto nProducto = new PanelNuevoProducto();
    
    //Registros de nuevos proveedores o facturas
    private static PanelNuevaFactura NewFacturas = new PanelNuevaFactura();
    private static PanelNuevoProveedor NewProveedor = new PanelNuevoProveedor();

    public static void ocultarPanelInicial(JPanel panel, PanelInicial panelPrincipal){
        panel.remove(panelPrincipal);
        panelPrincipal.setVisible(false);
    }


    private static void ocultarTodosLosPaneles(PanelInicial inicio, PanelNuevoProducto nProducto, PanelEntrada entrada, PanelNuevaFactura NFactura, PanelNuevoProveedor NProveedor, JPanel w){
        entrada.setVisible(false);
        inicio.setVisible(false);
        NFactura.setVisible(false);
        NProveedor.setVisible(false);
        nProducto.setVisible(false);
        w.remove(nProducto);
        w.remove(entrada);
        w.remove(inicio);
        w.remove(NProveedor);
        w.remove(NFactura);
    }


    public static void mostrarNuevoProductos(Window w){
        PanelNuevoProducto.setIsVisible(true);
        PanelInicial.setIsVisibleInitial(false);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelNuevoProveedor.setIsVisibleNProv(false);
        PanelEntrada.setIsVisibleEntries(false);
        nProducto.setVisible(true);
        w.setPanel(nProducto);
    }

    public static void atras(Window w){
        inicio.setVisible(true);
        PanelInicial.setIsVisibleInitial(true);
        PanelNuevoProducto.setIsVisible(false);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelEntrada.setIsVisibleEntries(false);
        PanelNuevoProveedor.setIsVisibleNProv(false);
        w.setPanel(inicio);
    }

    public static void mostrarEntradaP(Window w){
        PanelNuevoProducto.setIsVisible(false);
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
        NewFacturas.setVisible(true);
        w.setPanel(NewFacturas);
    }

    public static void mostrarRegistroProveedores(Window w){
        PanelNuevoProducto.setIsVisible(false);
        PanelInicial.setIsVisibleInitial(false);
        PanelNuevaFactura.setIsVisibleNFactura(false);
        PanelNuevoProveedor.setIsVisibleNProv(true);
        PanelEntrada.setIsVisibleEntries(false);
        NewProveedor.setVisible(true);
        w.setPanel(NewProveedor);
    }

    public static void BorraPaneles(){
        PanelNuevoProducto.setIsVisible(false);
       ocultarTodosLosPaneles(inicio, nProducto, entradas, NewFacturas, NewProveedor, new JPanel());
    }
}
