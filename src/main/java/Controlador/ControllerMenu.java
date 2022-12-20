package Controlador;

import Vista.*;
import Vista_Formulario.*;
import Vista_Register.*;

public class ControllerMenu {


    //Panel inicial
    private static PanelInicial inicio = new PanelInicial();
    

    //Listas
    private static EntryandOut entradaYSalida = new EntryandOut();
    private static PanelFactura facturas = new PanelFactura();
    private static PanelProveedor proveedor = new PanelProveedor();

    //Formularios
    private static PanelEntrada entradas = new PanelEntrada();
    private static PanelSalida salidas = new PanelSalida();
    private static PanelNuevoProducto nProducto = new PanelNuevoProducto();

    //Registros de nuevos proveedores o facturas
    private static PanelNuevaFactura NewFacturas = new PanelNuevaFactura();
    private static PanelNuevoProveedor NewProveedor = new PanelNuevoProveedor();

    public static void ocultarPanelInicial(PanelInicial panelPrincipal){
        panelPrincipal.setVisible(false);
    }

  
    private static void ocultarTodosLosPaneles2(PanelFactura factura, PanelProveedor proveedores, EntryandOut entradaYSalida, Window w){
        factura.setVisible(false);
        proveedores.setVisible(false);
        entradaYSalida.setVisible(false);
        w.remove(factura);
        w.remove(proveedores);
        w.remove(entradaYSalida);
    }

    private static void ocultarTodosLosPaneles3(PanelNuevoProducto nProducto, PanelEntrada entrada, PanelSalida salida, PanelNuevaFactura NFactura, PanelNuevoProveedor NProveedor, Window w){
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
        nProducto.setVisible(true);
        w.setPanel(nProducto);
    }

    public static void atras(Window w){
            inicio.setVisible(true);
            w.setPanel(inicio);
    }

    public static void mostrarProveedores(Window w){
        w.remove(inicio);
        proveedor.setVisible(true);
        w.setPanel(proveedor);
    }

    public static void mostrarEntradaYSalida(Window w){
        w.remove(inicio);
        entradaYSalida.setVisible(true);
        w.setPanel(entradaYSalida);
    }

    public static void mostrarEntradaP(Window w){
        w.remove(inicio);
        entradas.setVisible(true);
        w.setPanel(entradas);
    }

    public static void mostrarSalidaP(Window w){
        w.remove(inicio);
        salidas.setVisible(true);
        w.setPanel(salidas);
    }

    public static void mostrarFacturas(Window w){
        w.remove(inicio);
        facturas.setVisible(true);
        w.setPanel(facturas);
    }

    public static void mostrarRegistroFacturas(Window w){
        w.remove(inicio);
        NewFacturas.setVisible(true);
        w.setPanel(NewFacturas);
    }

    public static void mostrarRegistroProveedores(Window w){
        w.remove(inicio);
        NewProveedor.setVisible(true);
        w.setPanel(NewProveedor);
    }


    public static void BorraPaneles(){
       ocultarTodosLosPaneles2(facturas, proveedor,entradaYSalida, new Window());
       ocultarTodosLosPaneles3(nProducto, entradas, salidas, NewFacturas, NewProveedor, new Window());
    }




}
