package Vista;

import Controlador.*;
import Vista_Formulario.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

    //Productos

    private PanelInicial inicio = new PanelInicial();
    private PanelNuevoProducto nProducto = new PanelNuevoProducto();

    //El menu
    private JMenuBar menu;
    private JMenu paginaInicial, Producto, entrada, salida, Registro, Lista;
    private JMenuItem NuevoProducto;
    private JMenuItem entradaProducto;
    private JMenuItem salidaProductos;
    private JMenuItem RegistroProveedor, RegistroFactura;
    private JMenuItem entradaYSalida, proveedores, inventario, facturas;
    private JMenuItem atras;


    public Window() {
      
        Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(Screen);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        Init();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    private void Init(){
        this.getContentPane().add(inicio); //por default debe ser "inicio" el que este añadido a la ventana
        Menu();
    }

    private void Menu(){

        menu = new JMenuBar(); paginaInicial = new JMenu("Inicio");
        Producto = new JMenu("Producto"); entrada = new JMenu("Entradas"); salida = new JMenu("Salidas"); Registro = new JMenu("Registros");
        Lista = new JMenu("Gestiones");
        NuevoProducto = new JMenuItem("Añadir productos");
        entradaProducto = new JMenuItem("Entrada de productos"); salidaProductos = new JMenuItem("Salida de productos");
        RegistroFactura = new JMenuItem("Registrar factura"); RegistroProveedor = new JMenuItem("Registrar proveedor");
        inventario = new JMenuItem("Inventario"); entradaYSalida = new JMenuItem("Entrada y salida"); proveedores = new JMenuItem("Proveedores");
        facturas = new JMenuItem("Facturas"); atras = new JMenuItem("Volver al inicio");

        menu.add(paginaInicial); menu.add(Producto); menu.add(entrada); menu.add(salida); menu.add(Registro); menu.add(Lista);
        paginaInicial.add(atras);
        Producto.add(NuevoProducto);
        entrada.add(entradaProducto); salida.add(salidaProductos);
        Registro.add(RegistroFactura); Registro.add(RegistroProveedor);
        Lista.add(inventario); Lista.add(entradaYSalida); Lista.add(proveedores); Lista.add(facturas);
        this.setJMenuBar(menu);

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControllerMenu.BorraPaneles();
                ControllerMenu.atras(Window.this);
            }
        });

        NuevoProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inicio.isVisible()) {
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarNuevoProductos(Window.this);
                } else {
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarNuevoProductos(Window.this);
                }
            }
        });

        entradaProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarEntradaP(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarEntradaP(Window.this);
                }
            }
        });

        salidaProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarSalidaP(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarSalidaP(Window.this);
                }
            }
        });

        RegistroFactura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarRegistroFacturas(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarRegistroFacturas(Window.this);
                }
            }
        });

        RegistroProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarRegistroProveedores(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarRegistroProveedores(Window.this);
                }
            }
        });

        inventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarInventario(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarInventario(Window.this);
                }
            }
        });

        facturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarFacturas(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarFacturas(Window.this);
                }
            }
        });

        proveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarProveedores(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarProveedores(Window.this);
                }
            }
        });

        entradaYSalida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio.isVisible()){
                    ControllerMenu.ocultarPanelInicial(inicio);
                    ControllerMenu.mostrarEntradaYSalida(Window.this);
                }
                else{
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarEntradaYSalida(Window.this);
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
