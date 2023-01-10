package Vista;

import Controlador.*;
import Vista_Formulario.*;
import Vista_Register.PanelNuevaFactura;
import Vista_Register.PanelNuevoProveedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

    //Productos

    private PanelInicial inicio = new PanelInicial();

    //El menu
    private JMenuBar menu;
    private JMenu paginaInicial, Producto, entrada, salida, Registro;
    private JMenuItem CRUD;
    private JMenuItem entradaProducto;
    private JMenuItem salidaProductos;
    private JMenuItem RegistroProveedor, RegistroFacturaE;
    private JMenuItem atras;


    public Window() {
      
        Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(Screen);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        Init();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    private void Init() {
        this.getContentPane().add(inicio); //por default debe ser "inicio" el que este añadido a la ventana
        Menu();

    }


    public void cierraPorErrorSQL(){
        System.exit(0);
    }


    private void Menu(){

        menu = new JMenuBar(); paginaInicial = new JMenu("Inicio");
        Producto = new JMenu("Inventario"); entrada = new JMenu("Entradas"); salida = new JMenu("Salidas"); Registro = new JMenu("Registrar");
        CRUD = new JMenuItem("Gestion del inventario");
        entradaProducto = new JMenuItem("Entrada de productos"); salidaProductos = new JMenuItem("Salida de productos");
        RegistroFacturaE = new JMenuItem("Factura de entrada"); RegistroProveedor = new JMenuItem("Proveedor"); 
        atras = new JMenuItem("Volver al inicio");

        menu.add(paginaInicial); menu.add(Producto); menu.add(entrada); menu.add(salida); menu.add(Registro);
        paginaInicial.add(atras);
        Producto.add(CRUD);
        entrada.add(entradaProducto); salida.add(salidaProductos);
        Registro.add(RegistroFacturaE); Registro.add(RegistroProveedor); 
        this.setJMenuBar(menu);

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelNuevoProducto.setActualizame(0);
                PanelEntrada.setActualizame(0);
                PanelNuevaFactura.setActualizame(0);
                PanelNuevaFactura.setEstado(false);
                PanelProveedores.setActualizameProv(0);
                PanelNuevoProveedor.setActualizame(0);
                ControllerMenu.BorraPaneles();
                ControllerMenu.atras(Window.this);
            }
        });

        CRUD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio.isVisible()) {
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevoProveedor.setActualizame(0);
                    PanelProveedores.setActualizameProv(0);
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarNuevoProductos(Window.this);
                } else {
                    ControllerMenu.BorraPaneles();
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevaFactura.setActualizame(0);
                    PanelProveedores.setActualizameProv(0);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.mostrarNuevoProductos(Window.this);
                }
            }
        });

        entradaProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    PanelNuevoProducto.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.ocultarPanelInicial(inicio);
                    PanelProveedores.setActualizameProv(0);
                    ControllerMenu.mostrarEntradaP(Window.this);
                }
                else{
                    PanelNuevoProducto.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevoProveedor.setActualizame(0);
                    PanelProveedores.setActualizameProv(0);
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarEntradaP(Window.this);
                }
            }
        });

        salidaProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    PanelEntrada.setActualizame(0);
                    PanelNuevoProducto.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevoProveedor.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelProveedores.setActualizameProv(0);
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarSalidaP(Window.this);
                }
                else{
                    PanelNuevoProducto.setActualizame(0);
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevoProveedor.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelProveedores.setActualizameProv(0);
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarSalidaP(Window.this);
                }
            }
        });

        RegistroFacturaE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    PanelNuevoProducto.setActualizame(0);
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setEstado(true);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.ocultarPanelInicial(inicio);
                    PanelProveedores.setActualizameProv(0);
                    ControllerMenu.mostrarRegistroFacturas(Window.this);
                }
                else{
                    PanelNuevoProducto.setActualizame(0);
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setEstado(true);
                    PanelNuevoProveedor.setActualizame(0);
                    PanelProveedores.setActualizameProv(0);
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarRegistroFacturas(Window.this);
                }
            }
        });

        RegistroProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    PanelNuevoProducto.setActualizame(0);
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelProveedores.setActualizameProv(0);
                    PanelNuevaFactura.setEstado(false);
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarRegistroProveedores(Window.this);
                }
                else{
                    PanelNuevoProducto.setActualizame(0);
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelProveedores.setActualizameProv(0);
                    PanelNuevaFactura.setEstado(false);
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarRegistroProveedores(Window.this);
                }
            }
        });

    }

    public void setPanel(JPanel panel){
        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

}
