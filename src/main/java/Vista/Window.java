package Vista;

import Controlador.*;
import Vista_Formulario.*;
import Vista_Register.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

    private PanelInicial inicio = new PanelInicial();
    private JPanel panelContent, panelMenu;
    private JButton buttonCRUD, buttonHome, buttonEntries, buttonBill, buttonVendors;
    private boolean isAdmin;
    private JLabel username, levelUser;
    private String userLogin, level;

    private JButton buttonSettings, buttonReports, buttonInfo, buttonLogOut, buttonCreateUser;

    public Window() {
        Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
        //isAdmin = position;
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
        panelMenu.setBackground(new Color(154, 82,255));
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

        buttonHome = new JButton(ControllerMenu.getHome());
        buttonHome.setFocusable(false);
        buttonHome.setFocusPainted(false);
        buttonHome.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\Home.png"));
        buttonHome.setBorder(BorderFactory.createEmptyBorder());
        buttonHome.setForeground(Color.WHITE);
        buttonHome.setBackground(new Color(126, 72, 208));
        buttonHome.setBounds(0, 180, 200, 45);
        panelMenu.add(buttonHome);
        buttonHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonCRUD.setBackground(new Color(154, 82,255));
                buttonVendors.setBackground(new Color(154, 82,255));
                buttonBill.setBackground(new Color(154, 82,255));
                buttonEntries.setBackground(new Color(154, 82,255));
                buttonLogOut.setBackground(new Color(154, 82,255));
                panelMenu.setBackground(new Color(154, 82,255));
                buttonInfo.setBackground(panelMenu.getBackground());
                buttonCreateUser.setBackground(panelMenu.getBackground());
                buttonSettings.setBackground(panelMenu.getBackground());
                buttonReports.setBackground(panelMenu.getBackground());
                buttonHome.setBackground(new Color(126, 72, 208));
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
                ControllerMenu.cambiaColorPressed(buttonHome);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonHome,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonHome,
                        new Color(126, 72, 208),
                        new Color(45,141,252),
                        new Color(255, 156, 103),
                        new Color(255, 101, 184),
                        new Color(255, 53, 59),
                        new Color(134, 134, 134));
            }
        });

        buttonCRUD = new JButton(ControllerMenu.getInventary());
        buttonCRUD.setFocusable(false);
        buttonCRUD.setFocusPainted(false);
        buttonCRUD.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\Inventary.png"));
        buttonCRUD.setBorder(BorderFactory.createEmptyBorder());
        buttonCRUD.setForeground(Color.WHITE);
        buttonCRUD.setBackground(new Color(154, 82,255));
        buttonCRUD.setBounds(0, 235, 200, 45);
        panelMenu.add(buttonCRUD);
        buttonCRUD.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                buttonBill.setBackground(new Color(45,141,252));
                buttonEntries.setBackground(new Color(45,141,252));
                buttonHome.setBackground(new Color(45,141,252));
                buttonVendors.setBackground(new Color(45,141,252));
                buttonLogOut.setBackground(new Color(45,141,252));
                buttonCRUD.setBackground(new Color(52, 83, 216));
                panelMenu.setBackground(new Color(45,141,252));
                buttonReports.setBackground(panelMenu.getBackground());
                buttonInfo.setBackground(panelMenu.getBackground());
                buttonCreateUser.setBackground(panelMenu.getBackground());
                buttonSettings.setBackground(panelMenu.getBackground());
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
                ControllerMenu.cambiaColorPressed(buttonCRUD);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonCRUD,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonCRUD,
                        new Color(154, 82,255),
                        new Color(58, 95, 245),
                        new Color(255, 156, 103),
                        new Color(255, 101, 184),
                        new Color(255, 53, 59),
                        new Color(134, 134, 134));
            }
        });

        buttonEntries = new JButton(ControllerMenu.getEntries());
        buttonEntries.setFocusable(false);
        buttonEntries.setFocusPainted(false);
        buttonEntries.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\Entries.png"));
        buttonEntries.setBorder(BorderFactory.createEmptyBorder());
        buttonEntries.setForeground(Color.WHITE);
        buttonEntries.setBackground(new Color(154, 82,255));
        buttonEntries.setBounds(0, 290, 200, 45);
        panelMenu.add(buttonEntries);
        buttonEntries.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonBill.setBackground(new Color(255, 156, 103));
                buttonHome.setBackground(new Color(255, 156, 103));
                buttonVendors.setBackground(new Color(255, 156, 103));
                buttonLogOut.setBackground(new Color(255, 156, 103));
                buttonCRUD.setBackground(new Color(255, 156, 103));
                panelMenu.setBackground(new Color(255, 156, 103));
                buttonReports.setBackground(panelMenu.getBackground());
                buttonCreateUser.setBackground(panelMenu.getBackground());
                buttonInfo.setBackground(panelMenu.getBackground());
                buttonSettings.setBackground(panelMenu.getBackground());
                buttonEntries.setBackground(new Color(163, 83, 44));
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
                ControllerMenu.cambiaColorPressed(buttonEntries);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonEntries,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonEntries,
                        new Color(154, 82, 255),
                        new Color(45, 141, 252),
                        new Color(163, 83, 44),
                        new Color(255, 101, 184),
                        new Color(255, 53, 59),
                        new Color(134, 134, 134));
            }
        });

        buttonBill = new JButton(ControllerMenu.getBill());
        buttonBill.setFocusable(false);
        buttonBill.setFocusPainted(false);
        buttonBill.setBorder(BorderFactory.createEmptyBorder());
        buttonBill.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\Bill.png"));
        buttonBill.setForeground(Color.WHITE);
        buttonBill.setBackground(new Color(154, 82,255));
        buttonBill.setBounds(0, 345, 200, 45);
        panelMenu.add(buttonBill);
        buttonBill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonCRUD.setBackground(new Color(255, 101, 184));
                buttonEntries.setBackground(new Color(255, 101, 184));
                buttonHome.setBackground(new Color(255, 101, 184));
                panelMenu.setBackground(new Color(255, 101, 184));
                buttonLogOut.setBackground(new Color(255, 101, 184));
                buttonSettings.setBackground(panelMenu.getBackground());
                buttonCreateUser.setBackground(panelMenu.getBackground());
                buttonInfo.setBackground(panelMenu.getBackground());
                buttonReports.setBackground(panelMenu.getBackground());
                buttonVendors.setBackground(new Color(255, 101, 184));
                buttonBill.setBackground(new Color(163, 54, 119));
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
                ControllerMenu.cambiaColorPressed(buttonBill);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonBill,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonBill,
                        new Color(154, 82, 255),
                        new Color(45, 141, 252),
                        new Color(255, 156, 103),
                        new Color(163, 54, 119),
                        new Color(255, 53, 59),
                        new Color(134, 134, 134));
            }
        });

        buttonVendors = new JButton(ControllerMenu.getVendors());
        buttonVendors.setFocusable(false);
        buttonVendors.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\proveedores.png"));
        buttonVendors.setFocusPainted(false);
        buttonVendors.setBorder(BorderFactory.createEmptyBorder());
        buttonVendors.setForeground(Color.WHITE);
        buttonVendors.setBackground(new Color(154, 82,255));
        buttonVendors.setBounds(0, 400, 200, 45);
        panelMenu.add(buttonVendors);
        buttonVendors.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonCRUD.setBackground(new Color(255, 53, 59, 255));
                buttonEntries.setBackground(new Color(255, 53, 59, 255));
                buttonHome.setBackground(new Color(255, 53, 59, 255));
                buttonLogOut.setBackground(new Color(255, 53, 59, 255));
                panelMenu.setBackground(new Color(255, 53, 59, 255));
                buttonInfo.setBackground(panelMenu.getBackground());
                buttonCreateUser.setBackground(panelMenu.getBackground());
                buttonReports.setBackground(panelMenu.getBackground());
                buttonBill.setBackground(new Color(255, 53, 59, 255));
                buttonSettings.setBackground(panelMenu.getBackground());
                buttonVendors.setBackground(new Color(156, 34, 38));
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
                ControllerMenu.cambiaColorPressed(buttonVendors);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonVendors,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonVendors,
                        new Color(154, 82, 255),
                        new Color(45, 141, 252),
                        new Color(255, 156, 103),
                        new Color(255, 101, 184),
                        new Color(156, 34, 38),
                        new Color(134, 134, 134));
            }
        });

        buttonSettings = new JButton();
        buttonSettings.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\Settings.png"));
        buttonSettings.setFocusable(false);
        buttonSettings.setFocusPainted(false);
        buttonSettings.setForeground(Color.WHITE);
        buttonSettings.setBorder(BorderFactory.createEmptyBorder());
        buttonSettings.setBackground(panelMenu.getBackground());
        buttonSettings.setBounds(150,10,40,40);
        panelMenu.add(buttonSettings);

        buttonSettings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                panelMenu.setBackground(new Color(134, 134, 134));
                buttonBill.setBackground(new Color(134, 134, 134));
                buttonEntries.setBackground(new Color(134, 134, 134));
                buttonLogOut.setBackground(new Color(134, 134, 134));
                buttonInfo.setBackground(panelMenu.getBackground());
                buttonCreateUser.setBackground(panelMenu.getBackground());
                buttonHome.setBackground(new Color(134, 134, 134));
                buttonVendors.setBackground(new Color(134, 134, 134));
                buttonCRUD.setBackground(new Color(134, 134, 134));
                buttonSettings.setBackground(new Color(77, 77, 77));
                ControllerMenu.ocultarPanelInicial(panelContent, inicio);
                ControllerMenu.BorraPaneles();
                ControllerMenu.mostrarSettings(Window.this);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ControllerMenu.cambiaColorPressed(buttonSettings);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonSettings,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }


            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonSettings,
                        new Color(154, 82,255),
                        new Color(45, 141, 252),
                        new Color(255, 156, 103),
                        new Color(255, 101, 184),
                        new Color(255, 53, 59),
                        new Color(77, 77, 77));
            }
        });


        buttonLogOut = new JButton();
        buttonLogOut.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\LogOut.png"));
        buttonLogOut.setFocusable(false);
        buttonLogOut.setFocusPainted(false);
        buttonLogOut.setForeground(Color.WHITE);
        buttonLogOut.setBorder(BorderFactory.createEmptyBorder());
        buttonLogOut.setBackground(panelMenu.getBackground());
        buttonLogOut.setBounds(10,890,40,40);
        panelMenu.add(buttonLogOut);

        buttonLogOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                ControllerMenu.logOut(Window.this);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ControllerMenu.cambiaColorPressed(buttonLogOut);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonLogOut,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }


            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonLogOut,
                        new Color(154, 82,255),
                        new Color(45, 141, 252),
                        new Color(255, 156, 103),
                        new Color(255, 101, 184),
                        new Color(255, 53, 59),
                        new Color(77, 77, 77));
            }
        });

        buttonInfo = new JButton();
        buttonInfo.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\MoreInfo.png"));
        buttonInfo.setFocusable(false);
        buttonInfo.setFocusPainted(false);
        buttonInfo.setForeground(Color.WHITE);
        buttonInfo.setBorder(BorderFactory.createEmptyBorder());
        buttonInfo.setBackground(panelMenu.getBackground());
        buttonInfo.setBounds(10,840,40,40);
        panelMenu.add(buttonInfo);

        buttonInfo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ControllerMenu.cambiaColorPressed(buttonInfo);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonInfo,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonInfo,
                        new Color(154, 82,255),
                        new Color(45, 141, 252),
                        new Color(255, 156, 103),
                        new Color(255, 101, 184),
                        new Color(255, 53, 59),
                        new Color(77, 77, 77));
            }
        });

        buttonReports = new JButton();
        buttonReports.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\ReportBugs.png"));
        buttonReports.setFocusable(false);
        buttonReports.setFocusPainted(false);
        buttonReports.setForeground(Color.WHITE);
        buttonReports.setBorder(BorderFactory.createEmptyBorder());
        buttonReports.setBackground(panelMenu.getBackground());
        buttonReports.setBounds(150,60,40,40);
        panelMenu.add(buttonReports);

        buttonReports.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ControllerMenu.cambiaColorPressed(buttonReports);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ControllerMenu.cambiaColorEntered(buttonReports,
                        new Color(195, 162, 255),
                        new Color(160, 183, 252),
                        new Color(255, 188, 153),
                        new Color(255, 171, 222),
                        new Color(255, 164, 166),
                        new Color(190, 190, 190));
            }


            @Override
            public void mouseExited(MouseEvent e) {
                ControllerMenu.cambiaColorExited(buttonReports,
                        new Color(154, 82,255),
                        new Color(45, 141, 252),
                        new Color(255, 156, 103),
                        new Color(255, 101, 184),
                        new Color(255, 53, 59),
                        new Color(77, 77, 77));
            }
        });

        //if(isAdmin) {
            buttonCreateUser = new JButton(ControllerMenu.getAddUser());
            buttonCreateUser.setFocusable(false);
            buttonCreateUser.setFocusPainted(false);
            buttonCreateUser.setIcon(new ImageIcon("src\\main\\java\\images\\Icons\\AddUser.png"));
            buttonCreateUser.setBorder(BorderFactory.createEmptyBorder());
            buttonCreateUser.setForeground(Color.WHITE);
            buttonCreateUser.setBackground(new Color(154, 82, 255));
            buttonCreateUser.setBounds(0, 455, 200, 45);
            panelMenu.add(buttonCreateUser);
            buttonCreateUser.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    buttonBill.setBackground(new Color(208, 217, 81));
                    buttonHome.setBackground(new Color(208, 217, 81));
                    buttonVendors.setBackground(new Color(208, 217, 81));
                    buttonLogOut.setBackground(new Color(208, 217, 81));
                    buttonCRUD.setBackground(new Color(208, 217, 81));
                    buttonEntries.setBackground(new Color(208, 217, 81));
                    panelMenu.setBackground(new Color(208, 217, 81));
                    buttonReports.setBackground(panelMenu.getBackground());
                    buttonInfo.setBackground(panelMenu.getBackground());
                    buttonSettings.setBackground(panelMenu.getBackground());
                    buttonCreateUser.setBackground(new Color(145, 153, 54));
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    ControllerMenu.cambiaColorPressed(buttonCreateUser);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    ControllerMenu.cambiaColorEntered(buttonCreateUser,
                            new Color(195, 162, 255),
                            new Color(160, 183, 252),
                            new Color(255, 188, 153),
                            new Color(255, 171, 222),
                            new Color(255, 164, 166),
                            new Color(190, 190, 190));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    ControllerMenu.cambiaColorExited(buttonCreateUser,
                            new Color(154, 82, 255),
                            new Color(45, 141, 252),
                            new Color(163, 83, 44),
                            new Color(255, 101, 184),
                            new Color(255, 53, 59),
                            new Color(134, 134, 134));
                }
            });
        //}
    }

    public void setPanel(JPanel panel){
        this.panelContent.add(panel, BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }

}
