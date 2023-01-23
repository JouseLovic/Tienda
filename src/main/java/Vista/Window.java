package Vista;

import Controlador.*;
import Vista_Formulario.*;
import Vista_Register.PanelNuevaFactura;
import Vista_Register.PanelNuevoProveedor;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {


    private PanelInicial inicio = new PanelInicial();
    private JPanel panelContent, panelMenu;
    private JButton buttonCRUD, buttonHome, buttonEntries, buttonBill, buttonVendors, buttonSettings, buttonReports;
    private JLabel username, levelUser;
    private String userLogin, level;

    private JMenuBar menu;
    private JMenu Producto, entrada, Registro;
    private JMenuItem CRUD;
    private JMenuItem entradaProducto;
    private JMenuItem RegistroProveedor, RegistroFacturaE;


    public Window() {//Para que username y leveluser tenga el usuario que entró, simplemente le damos parametros al constructor y esos valores se los damos
      
        Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(Screen);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        Init();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    private void Init() {
        panelContent = new JPanel();
        panelContent.setLayout(new BorderLayout());
        this.getContentPane().add(panelContent); //por default debe ser "inicio" el que este añadido a la ventana
        MenuPanel();
        addInicio(inicio);
        Menu();


    }

    private void MenuPanel(){

        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setPreferredSize(new Dimension(200, 1200));
        panelMenu.setBackground(new Color(82,116,255));
        panelMenu.setVisible(true);

        panelContent.add(panelMenu, BorderLayout.WEST);

    }

    private void addInicio(JPanel panel){
        panelContent.add(panel, BorderLayout.CENTER);
    }

    private void Menu() {

        username = new JLabel("User: ");
        username.setForeground(Color.WHITE);
        username.setHorizontalAlignment(0);
        username.setBounds(10, 100, 80, 30);

        levelUser = new JLabel("Level: ");
        levelUser.setForeground(Color.WHITE);
        levelUser.setHorizontalAlignment(0);
        levelUser.setBounds(10, 120, 80, 30);

        panelMenu.add(username);
        panelMenu.add(levelUser);

        buttonHome = new JButton("Home");
        buttonHome.setFocusable(false);
        buttonHome.setFocusPainted(false);
        buttonHome.setBorder(BorderFactory.createEmptyBorder());
        buttonHome.setHorizontalAlignment(0);
        buttonHome.setForeground(Color.WHITE);
        buttonHome.setBackground(new Color(58, 95, 245));
        buttonHome.setBounds(0, 180, 200, 45);
        panelMenu.add(buttonHome);
        buttonHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonHome.setBackground(new Color(132, 156, 255));
                ControllerMenu.ocultarPanelInicial(panelContent, inicio);
                PanelEntrada.setActualizame(0);
                PanelNuevaFactura.setActualizame(0);
                PanelNuevaFactura.setEstado(false);
                PanelNuevoProveedor.setActualizame(0);
                ControllerMenu.BorraPaneles();
                ControllerMenu.atras(Window.this);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                buttonHome.setBackground(new Color(99, 139, 220));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonHome.setBackground(new Color(132, 156, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (PanelInicial.isIsVisibleInitial()) {
                    buttonHome.setBackground(new Color(58, 95, 245));
                } else {
                    buttonHome.setBackground(new Color(82, 116, 255));
                }
            }
        });

        buttonCRUD = new JButton("Gestion de inventario");
        buttonCRUD.setFocusable(false);
        buttonCRUD.setFocusPainted(false);
        buttonCRUD.setBorder(BorderFactory.createEmptyBorder());
        buttonCRUD.setHorizontalAlignment(0);
        buttonCRUD.setForeground(Color.WHITE);
        buttonCRUD.setBackground(new Color(82, 116, 255));
        buttonCRUD.setBounds(0, 235, 200, 45);
        panelMenu.add(buttonCRUD);
        buttonCRUD.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                buttonBill.setBackground(new Color(82, 116, 255));
                buttonEntries.setBackground(new Color(82, 116, 255));
                buttonHome.setBackground(new Color(82, 116, 255));
                buttonVendors.setBackground(new Color(82, 116, 255));
                buttonCRUD.setBackground(new Color(58, 95, 245));
                if (inicio.isVisible()) {
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.ocultarPanelInicial(panelContent, inicio);
                    ControllerMenu.mostrarNuevoProductos(Window.this);
                } else {
                    ControllerMenu.BorraPaneles();
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.mostrarNuevoProductos(Window.this);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                buttonCRUD.setBackground(new Color(99, 139, 220));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonCRUD.setBackground(new Color(132, 156, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (PanelNuevoProducto.getIsVisible()) {
                    buttonCRUD.setBackground(new Color(58, 95, 245));
                } else {
                    buttonCRUD.setBackground(new Color(82, 116, 255));
                }

            }
        });

        buttonEntries = new JButton("Entradas de productos");
        buttonEntries.setFocusable(false);
        buttonEntries.setFocusPainted(false);
        buttonEntries.setBorder(BorderFactory.createEmptyBorder());
        buttonEntries.setHorizontalAlignment(0);
        buttonEntries.setForeground(Color.WHITE);
        buttonEntries.setBackground(new Color(82, 116, 255));
        buttonEntries.setBounds(0, 290, 200, 45);
        panelMenu.add(buttonEntries);
        buttonEntries.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonBill.setBackground(new Color(82, 116, 255));
                buttonHome.setBackground(new Color(82, 116, 255));
                buttonVendors.setBackground(new Color(82, 116, 255));
                buttonCRUD.setBackground(new Color(82, 116, 255));
                buttonEntries.setBackground(new Color(58, 95, 245));
                if (inicio.isVisible()) {
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.ocultarPanelInicial(panelContent, inicio);
                    ControllerMenu.mostrarEntradaP(Window.this);
                } else {
                    PanelNuevaFactura.setActualizame(0);
                    PanelNuevaFactura.setEstado(false);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarEntradaP(Window.this);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                buttonEntries.setBackground(new Color(99, 139, 220));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonEntries.setBackground(new Color(132, 156, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (PanelEntrada.isIsVisibleEntries()) {
                    buttonEntries.setBackground(new Color(58, 95, 245));
                } else {
                    buttonEntries.setBackground(new Color(82, 116, 255));
                }
            }
        });

        buttonBill = new JButton("Facturas por entradas");
        buttonBill.setFocusable(false);
        buttonBill.setFocusPainted(false);
        buttonBill.setBorder(BorderFactory.createEmptyBorder());
        buttonBill.setHorizontalAlignment(0);
        buttonBill.setForeground(Color.WHITE);
        buttonBill.setBackground(new Color(82, 116, 255));
        buttonBill.setBounds(0, 345, 200, 45);
        panelMenu.add(buttonBill);
        buttonBill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonCRUD.setBackground(new Color(82, 116, 255));
                buttonEntries.setBackground(new Color(82, 116, 255));
                buttonHome.setBackground(new Color(82, 116, 255));
                buttonVendors.setBackground(new Color(82, 116, 255));
                buttonBill.setBackground(new Color(58, 95, 245));
                if (inicio.isVisible()) {
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setEstado(true);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.ocultarPanelInicial(panelContent, inicio);
                    ControllerMenu.mostrarRegistroFacturas(Window.this);
                } else {
                    PanelEntrada.setActualizame(0);
                    PanelNuevaFactura.setEstado(true);
                    PanelNuevoProveedor.setActualizame(0);
                    ControllerMenu.BorraPaneles();
                    ControllerMenu.mostrarRegistroFacturas(Window.this);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                buttonBill.setBackground(new Color(99, 139, 220));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonBill.setBackground(new Color(132, 156, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (PanelNuevaFactura.isIsVisibleNFactura()) {
                    buttonBill.setBackground(new Color(58, 95, 245));
                } else {
                    buttonBill.setBackground(new Color(82, 116, 255));
                }
            }
        });

        buttonVendors = new JButton("Proveedores");
        buttonVendors.setFocusable(false);
        buttonVendors.setFocusPainted(false);
        buttonVendors.setBorder(BorderFactory.createEmptyBorder());
        buttonVendors.setHorizontalAlignment(0);
        buttonVendors.setForeground(Color.WHITE);
        buttonVendors.setBackground(new Color(82, 116, 255));
        buttonVendors.setBounds(0, 400, 200, 45);
        panelMenu.add(buttonVendors);
        buttonVendors.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonCRUD.setBackground(new Color(82, 116, 255));
                buttonEntries.setBackground(new Color(82, 116, 255));
                buttonHome.setBackground(new Color(82, 116, 255));
                buttonBill.setBackground(new Color(82, 116, 255));
                buttonVendors.setBackground(new Color(58, 95, 245));
                    if(inicio.isVisible()){
                        PanelEntrada.setActualizame(0);
                        PanelNuevaFactura.setActualizame(0);
                        PanelNuevaFactura.setEstado(false);
                        ControllerMenu.ocultarPanelInicial(panelContent, inicio);
                        ControllerMenu.mostrarRegistroProveedores(Window.this);
                    }
                    else{
                        PanelEntrada.setActualizame(0);
                        PanelNuevaFactura.setActualizame(0);
                        PanelNuevaFactura.setEstado(false);
                        ControllerMenu.BorraPaneles();
                        ControllerMenu.mostrarRegistroProveedores(Window.this);
                    }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                buttonVendors.setBackground(new Color(99, 139, 220));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonVendors.setBackground(new Color(132, 156, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (PanelNuevoProveedor.isIsVisibleNProv()) {
                    buttonVendors.setBackground(new Color(58, 95, 245));
                } else {
                    buttonVendors.setBackground(new Color(82, 116, 255));
                }
            }
        });
    }

    public void setPanel(JPanel panel){
        this.panelContent.add(panel, BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }

}
