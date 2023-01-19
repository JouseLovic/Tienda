package Controlador;

import Vista.*;
import Vista_Formulario.*;
import Vista_Register.*;

public class ControllerMenu {

    //Panel inicial
    private static PanelInicial inicio = new PanelInicial();
    
    //Formularios
    private static PanelEntrada entradas = new PanelEntrada();
    private static PanelSalida salidas = new PanelSalida();
    private static PanelNewProduct nProducto = new PanelNewProduct();
    
    //Registros de nuevos proveedores o facturas
    private static PanelNuevaFactura NewFacturas = new PanelNuevaFactura();
    private static PanelNuevoProveedor NewProveedor = new PanelNuevoProveedor();

    public static void ocultarPanelInicial(PanelInicial panelPrincipal){
        panelPrincipal.setVisible(false);
    }


    private static void ocultarTodosLosPaneles(PanelNewProduct nProducto, PanelEntrada entrada, PanelSalida salida, PanelNuevaFactura NFactura, PanelNuevoProveedor NProveedor, Window w){
        entrada.setVisible(false);
        salida.setVisible(false);
        NFactura.setVisible(false);
        NProveedor.setVisible(false);
        nProducto.setVisible(false);
        w.remove(nProducto);
        w.remove(entrada);
        w.remove(salida);
        w.remove(NProveedor);
        w.remove(NFactura);
    }


    public static void mostrarNuevoProductos(Window w){
        w.remove(inicio);
        PanelNewProduct.setIsVisible(true);
        nProducto.setVisible(true);
        w.setPanel(nProducto);
    }

    public static void atras(Window w){
            inicio.setVisible(true);
            PanelNewProduct.setIsVisible(false);
            w.setPanel(inicio);
    }

    public static void mostrarEntradaP(Window w){
        w.remove(inicio);
        PanelNewProduct.setIsVisible(false);
        entradas.setVisible(true);
        w.setPanel(entradas);
    }

    public static void mostrarSalidaP(Window w){
        w.remove(inicio);
        PanelNewProduct.setIsVisible(false);
        salidas.setVisible(true);
        w.setPanel(salidas);
    }

    public static void mostrarRegistroFacturas(Window w){
        w.remove(inicio);
        PanelNewProduct.setIsVisible(false);
        NewFacturas.setVisible(true);
        w.setPanel(NewFacturas);
    }

    public static void mostrarRegistroProveedores(Window w){
        w.remove(inicio);
        PanelNewProduct.setIsVisible(false);
        NewProveedor.setVisible(true);
        w.setPanel(NewProveedor);
    }

    public static void BorraPaneles(){
        PanelNewProduct.setIsVisible(false);
       ocultarTodosLosPaneles(nProducto, entradas, salidas, NewFacturas, NewProveedor, new Window());
    }
}
