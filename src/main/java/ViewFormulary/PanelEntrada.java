
package ViewFormulary;

import Controllers.*;
import Controllers.Settings.ReSettings;

import java.awt.Color;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PanelEntrada extends javax.swing.JPanel {

     private String idPSeleccionado = null;
    // private boolean campoRemovidos = false;
     
     private String confirmaId, nBillOriginal;
     private int row;
     private static boolean isVisibleEntries, intoTable;
     private ControllerEntriesP controllerE;
     
     public PanelEntrada() {
          initComponents();
          isVisibleEntries = false;
          labelTitleEntrie.setText(ReSettings.getTitleEntries());
          dateField.setText(ControllerEntriesP.toStringDate());
          controllerE = new ControllerEntriesP(new ReSettings().getLanguageSelected());
          ControllerEntriesP.llenaComboBox(listaProveedores);
          ControllerEntriesP.enviaDatosTabla(tableBillEntries, "");
     }

     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            popupMenu1 = new java.awt.PopupMenu();
            labelBackground3 = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            labelTitleEntrie = new javax.swing.JLabel();
            labelBill = new javax.swing.JLabel();
            labelFecha = new javax.swing.JLabel();
            labelCodigoProducto = new javax.swing.JLabel();
            labelCantidad = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tableBillEntries = new javax.swing.JTable();
            labelDesc = new javax.swing.JLabel();
            labelPrecio = new javax.swing.JLabel();
            labelSeccion = new javax.swing.JLabel();
            labelMarca = new javax.swing.JLabel();
            labelProveedor = new javax.swing.JLabel();
            listaProveedores = new javax.swing.JComboBox<>();
            jSeparator1 = new javax.swing.JSeparator();
            labelTitleVendors = new javax.swing.JLabel();
            labelDecorationSearch = new javax.swing.JLabel();
            searchField = new Utilities.TextField();
            panelDecorationSearch = new Utilities.PanelData2();
            billField = new Utilities.TextField();
            dateField = new Utilities.TextField();
            codeProduct = new Utilities.TextField();
            priceField = new Utilities.TextField();
            descField = new Utilities.TextField();
            quantityField = new Utilities.TextField();
            sectionField = new Utilities.TextField();
            brandField = new Utilities.TextField();
            vendorField = new Utilities.TextField();
            buttonCreateEntrie = new Utilities.Button();
            buttonCleanFields = new Utilities.Button();
            buttonDeleteEntrie = new Utilities.Button();
            labelBackground4 = new javax.swing.JLabel();
            labelBackground2 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jLabel16 = new javax.swing.JLabel();
            jLabel17 = new javax.swing.JLabel();
            jLabel18 = new javax.swing.JLabel();
            jLabel19 = new javax.swing.JLabel();
            jLabel20 = new javax.swing.JLabel();
            jLabel22 = new javax.swing.JLabel();
            jLabel23 = new javax.swing.JLabel();
            jLabel24 = new javax.swing.JLabel();
            jLabel25 = new javax.swing.JLabel();
            jLabel26 = new javax.swing.JLabel();
            jLabel27 = new javax.swing.JLabel();
            jLabel29 = new javax.swing.JLabel();
            jLabel30 = new javax.swing.JLabel();
            jLabel32 = new javax.swing.JLabel();
            jLabel33 = new javax.swing.JLabel();
            jLabel34 = new javax.swing.JLabel();
            jLabel35 = new javax.swing.JLabel();
            jLabel36 = new javax.swing.JLabel();
            jLabel38 = new javax.swing.JLabel();
            jLabel39 = new javax.swing.JLabel();
            jLabel40 = new javax.swing.JLabel();
            jLabel41 = new javax.swing.JLabel();
            jLabel42 = new javax.swing.JLabel();
            jLabel43 = new javax.swing.JLabel();
            jLabel44 = new javax.swing.JLabel();
            jLabel45 = new javax.swing.JLabel();
            jLabel46 = new javax.swing.JLabel();
            jLabel47 = new javax.swing.JLabel();
            jLabel48 = new javax.swing.JLabel();

            popupMenu1.setLabel("popupMenu1");

            labelBackground3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\FluidoEntries-transformedInvertido.png")); // NOI18N

            setLayout(new java.awt.BorderLayout());

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jPanel1MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jPanel1MouseEntered(evt);
                  }
            });
            jPanel1.setLayout(null);

            labelTitleEntrie.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelTitleEntrie.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleEntrie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jPanel1.add(labelTitleEntrie);
            labelTitleEntrie.setBounds(10, 10, 360, 60);

            labelBill.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelBill.setForeground(new java.awt.Color(0, 0, 0));
            labelBill.setText("N° de factura");
            jPanel1.add(labelBill);
            labelBill.setBounds(140, 100, 200, 30);

            labelFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelFecha.setForeground(new java.awt.Color(0, 0, 0));
            labelFecha.setText("Fecha");
            jPanel1.add(labelFecha);
            labelFecha.setBounds(520, 100, 70, 30);

            labelCodigoProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCodigoProducto.setForeground(new java.awt.Color(0, 0, 0));
            labelCodigoProducto.setText("Codigo del product");
            jPanel1.add(labelCodigoProducto);
            labelCodigoProducto.setBounds(830, 100, 220, 30);

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setText("Cantidad");
            jPanel1.add(labelCantidad);
            labelCantidad.setBounds(860, 210, 130, 30);

            tableBillEntries = new javax.swing.JTable(){

                  public boolean isCellEditable(int rowIndex, int columnIndex){
                        return false;
                  }
            };
            tableBillEntries.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "N° de factura", "Fecha", "Descripcion", "Precio", "Codigo de product", "Cantidad"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tableBillEntries.setDragEnabled(true);
            tableBillEntries.setFillsViewportHeight(true);
            tableBillEntries.setGridColor(new java.awt.Color(255, 255, 255));
            tableBillEntries.getTableHeader().setReorderingAllowed(false);
            tableBillEntries.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        tableBillEntriesMouseDragged(evt);
                  }
            });
            tableBillEntries.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tableBillEntriesMouseClicked(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        tableBillEntriesMouseReleased(evt);
                  }
            });
            tableBillEntries.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        tableBillEntriesKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        tableBillEntriesKeyReleased(evt);
                  }
            });
            jScrollPane1.setViewportView(tableBillEntries);

            jPanel1.add(jScrollPane1);
            jScrollPane1.setBounds(40, 510, 1150, 430);

            labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDesc.setForeground(new java.awt.Color(0, 0, 0));
            labelDesc.setText("Descripción");
            jPanel1.add(labelDesc);
            labelDesc.setBounds(480, 210, 200, 30);

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setText("Precio");
            jPanel1.add(labelPrecio);
            labelPrecio.setBounds(140, 210, 190, 30);

            labelSeccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSeccion.setForeground(new java.awt.Color(0, 0, 0));
            labelSeccion.setText("Seccion");
            jPanel1.add(labelSeccion);
            labelSeccion.setBounds(160, 330, 220, 30);

            labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelMarca.setForeground(new java.awt.Color(0, 0, 0));
            labelMarca.setText("Marca");
            jPanel1.add(labelMarca);
            labelMarca.setBounds(500, 330, 180, 30);

            labelProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelProveedor.setForeground(new java.awt.Color(0, 0, 0));
            labelProveedor.setText("Id del proveedor");
            jPanel1.add(labelProveedor);
            labelProveedor.setBounds(860, 320, 170, 30);

            listaProveedores.setForeground(new java.awt.Color(0, 0, 0));
            listaProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
            listaProveedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            listaProveedores.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        listaProveedoresActionPerformed(evt);
                  }
            });
            jPanel1.add(listaProveedores);
            listaProveedores.setBounds(1030, 350, 100, 40);
            jPanel1.add(jSeparator1);
            jSeparator1.setBounds(1030, 390, 100, 10);

            labelTitleVendors.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleVendors.setText("Proveedores");
            jPanel1.add(labelTitleVendors);
            labelTitleVendors.setBounds(1030, 330, 70, 16);

            labelDecorationSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\Search.png")); // NOI18N
            jPanel1.add(labelDecorationSearch);
            labelDecorationSearch.setBounds(780, 10, 40, 50);

            searchField.setForeground(new java.awt.Color(0, 0, 0));
            searchField.setShadowColor(new java.awt.Color(0, 0, 0));
            searchField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        searchFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(searchField);
            searchField.setBounds(430, 10, 410, 60);

            panelDecorationSearch.setBackground(new java.awt.Color(254, 169, 53));
            panelDecorationSearch.setForeground(new java.awt.Color(255, 255, 255));
            panelDecorationSearch.setRoundBottonLeft(20);
            panelDecorationSearch.setRoundBottonRight(10);
            panelDecorationSearch.setRoundTopLeft(20);
            panelDecorationSearch.setRoundTopRight(10);
            panelDecorationSearch.setLayout(null);
            jPanel1.add(panelDecorationSearch);
            panelDecorationSearch.setBounds(440, 20, 403, 50);

            billField.setForeground(new java.awt.Color(0, 0, 0));
            billField.setShadowColor(new java.awt.Color(0, 0, 0));
            billField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        billFieldKeyReleased(evt);
                  }
            });
            jPanel1.add(billField);
            billField.setBounds(130, 130, 210, 50);

            dateField.setForeground(new java.awt.Color(0, 0, 0));
            dateField.setShadowColor(new java.awt.Color(0, 0, 0));
            jPanel1.add(dateField);
            dateField.setBounds(510, 130, 140, 50);

            codeProduct.setForeground(new java.awt.Color(0, 0, 0));
            codeProduct.setShadowColor(new java.awt.Color(0, 0, 0));
            jPanel1.add(codeProduct);
            codeProduct.setBounds(830, 130, 230, 50);

            priceField.setForeground(new java.awt.Color(0, 0, 0));
            priceField.setShadowColor(new java.awt.Color(0, 0, 0));
            priceField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        priceFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(priceField);
            priceField.setBounds(130, 240, 210, 50);

            descField.setForeground(new java.awt.Color(0, 0, 0));
            descField.setShadowColor(new java.awt.Color(0, 0, 0));
            descField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        descFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(descField);
            descField.setBounds(470, 240, 220, 50);

            quantityField.setForeground(new java.awt.Color(0, 0, 0));
            quantityField.setShadowColor(new java.awt.Color(0, 0, 0));
            quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        quantityFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(quantityField);
            quantityField.setBounds(850, 240, 180, 50);

            sectionField.setForeground(new java.awt.Color(0, 0, 0));
            sectionField.setShadowColor(new java.awt.Color(0, 0, 0));
            sectionField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        sectionFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(sectionField);
            sectionField.setBounds(150, 360, 160, 50);

            brandField.setForeground(new java.awt.Color(0, 0, 0));
            brandField.setShadowColor(new java.awt.Color(0, 0, 0));
            brandField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        brandFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(brandField);
            brandField.setBounds(490, 360, 170, 50);

            vendorField.setEditable(false);
            vendorField.setForeground(new java.awt.Color(0, 0, 0));
            vendorField.setShadowColor(new java.awt.Color(0, 0, 0));
            jPanel1.add(vendorField);
            vendorField.setBounds(850, 351, 170, 50);

            buttonCreateEntrie.setForeground(new java.awt.Color(0, 0, 0));
            buttonCreateEntrie.setText("Subir registro");
            buttonCreateEntrie.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonCreateEntrie.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonCreateEntrieActionPerformed(evt);
                  }
            });
            jPanel1.add(buttonCreateEntrie);
            buttonCreateEntrie.setBounds(900, 430, 170, 60);

            buttonCleanFields.setForeground(new java.awt.Color(0, 0, 0));
            buttonCleanFields.setText("Limpia campos");
            buttonCleanFields.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonCleanFields.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonCleanFieldsActionPerformed(evt);
                  }
            });
            jPanel1.add(buttonCleanFields);
            buttonCleanFields.setBounds(540, 430, 180, 60);

            buttonDeleteEntrie.setForeground(new java.awt.Color(0, 0, 0));
            buttonDeleteEntrie.setText("Eliminar registro");
            buttonDeleteEntrie.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonDeleteEntrie.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonDeleteEntrieActionPerformed(evt);
                  }
            });
            jPanel1.add(buttonDeleteEntrie);
            buttonDeleteEntrie.setBounds(180, 430, 170, 60);

            labelBackground4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\FluidoEntries-transformed90G.png")); // NOI18N
            jPanel1.add(labelBackground4);
            labelBackground4.setBounds(850, -30, 450, 500);

            labelBackground2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\FluidoEntries-transformed.png")); // NOI18N
            jPanel1.add(labelBackground2);
            labelBackground2.setBounds(-80, 720, 460, 250);

            jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel2);
            jLabel2.setBounds(1150, 220, 30, 40);

            jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel1);
            jLabel1.setBounds(1120, 230, 60, 40);

            jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel3);
            jLabel3.setBounds(350, 60, 30, 27);

            jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja100PX.png")); // NOI18N
            jPanel1.add(jLabel4);
            jLabel4.setBounds(850, 90, 110, 70);

            jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel5);
            jLabel5.setBounds(0, 800, 60, 40);

            jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel6);
            jLabel6.setBounds(1100, 240, 30, 40);

            jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel7);
            jLabel7.setBounds(0, 760, 30, 40);

            jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel8);
            jLabel8.setBounds(840, 40, 60, 40);

            jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel9);
            jLabel9.setBounds(10, 890, 30, 40);

            jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel10);
            jLabel10.setBounds(890, 0, 30, 40);

            jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel13);
            jLabel13.setBounds(390, 200, 60, 40);

            jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel14);
            jLabel14.setBounds(870, 50, 30, 40);

            jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel16);
            jLabel16.setBounds(230, 310, 30, 40);

            jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel17);
            jLabel17.setBounds(960, 20, 30, 40);

            jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel18);
            jLabel18.setBounds(1210, 690, 30, 40);

            jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja100PX.png")); // NOI18N
            jPanel1.add(jLabel19);
            jLabel19.setBounds(60, 140, 90, 70);

            jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel20);
            jLabel20.setBounds(360, 10, 30, 40);

            jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel22);
            jLabel22.setBounds(780, 290, 30, 40);

            jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel23);
            jLabel23.setBounds(450, 450, 30, 40);

            jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel24);
            jLabel24.setBounds(560, 70, 60, 40);

            jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel25);
            jLabel25.setBounds(1190, 710, 30, 40);

            jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel26);
            jLabel26.setBounds(140, 470, 30, 40);

            jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja100PX.png")); // NOI18N
            jPanel1.add(jLabel27);
            jLabel27.setBounds(1140, 600, 90, 70);

            jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel29);
            jLabel29.setBounds(1190, 580, 60, 40);

            jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja100PX.png")); // NOI18N
            jPanel1.add(jLabel30);
            jLabel30.setBounds(380, -10, 90, 70);

            jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel32);
            jLabel32.setBounds(660, 190, 30, 40);

            jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel33);
            jLabel33.setBounds(1120, 60, 30, 40);

            jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel34);
            jLabel34.setBounds(640, 310, 30, 40);

            jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel35);
            jLabel35.setBounds(720, 340, 30, 40);

            jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja100PX.png")); // NOI18N
            jPanel1.add(jLabel36);
            jLabel36.setBounds(1060, 70, 90, 70);

            jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel38);
            jLabel38.setBounds(390, 370, 30, 40);

            jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja100PX.png")); // NOI18N
            jPanel1.add(jLabel39);
            jLabel39.setBounds(640, 150, 90, 70);

            jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel40);
            jLabel40.setBounds(1060, 60, 30, 40);

            jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel41);
            jLabel41.setBounds(1120, 120, 30, 40);

            jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel42);
            jLabel42.setBounds(700, 200, 30, 40);

            jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel43);
            jLabel43.setBounds(610, 90, 30, 40);

            jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel44);
            jLabel44.setBounds(800, 220, 60, 40);

            jLabel45.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel45);
            jLabel45.setBounds(110, 220, 30, 40);

            jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja30PX.png")); // NOI18N
            jPanel1.add(jLabel46);
            jLabel46.setBounds(320, 180, 30, 40);

            jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel47);
            jLabel47.setBounds(370, 40, 60, 40);

            jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelEntries\\BolitaNaranja60PX.png")); // NOI18N
            jPanel1.add(jLabel48);
            jLabel48.setBounds(120, 180, 60, 40);

            add(jPanel1, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void tableBillEntriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBillEntriesMouseClicked
                ControllerEntriesP.mandaCampos(tableBillEntries, this);
                row = tableBillEntries.getSelectedRow();
                nBillOriginal = (String) tableBillEntries.getValueAt(row, 0);
                listaProveedores.setSelectedItem(String.valueOf(tableBillEntries.getValueAt(tableBillEntries.getSelectedRow(), 8)));
     }//GEN-LAST:event_tableBillEntriesMouseClicked

     private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {                                                       
          tableBillEntries.setSelectionMode(0);
          nBillOriginal = "";
          ControllerEntriesP.limpiaCampos(this);
     }                                                  

     private void listaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProveedoresActionPerformed
            ControllerEntriesP.mandaProveedor(tableBillEntries, String.valueOf(listaProveedores.getSelectedItem()), this);
            labelProveedor.setText("Id del proveedor");
            labelProveedor.setForeground(Color.BLACK);
     }//GEN-LAST:event_listaProveedoresActionPerformed

     private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
         tableBillEntries.setSelectionMode(0);
     }//GEN-LAST:event_jPanel1MouseClicked

     private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
     }//GEN-LAST:event_jPanel1MouseEntered

      private void tableBillEntriesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableBillEntriesKeyReleased
          ControllerEntriesP.mandaCampos(tableBillEntries, this);
          row = tableBillEntries.getSelectedRow();
          nBillOriginal = (String) tableBillEntries.getValueAt(row, 0);
          listaProveedores.setSelectedItem(String.valueOf(tableBillEntries.getValueAt(tableBillEntries.getSelectedRow(), 8)));
      }//GEN-LAST:event_tableBillEntriesKeyReleased

      private void tableBillEntriesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableBillEntriesKeyPressed
          ControllerEntriesP.mandaCampos(tableBillEntries, this);
          row = tableBillEntries.getSelectedRow();
          nBillOriginal = (String) tableBillEntries.getValueAt(row, 0);
          listaProveedores.setSelectedItem(String.valueOf(tableBillEntries.getValueAt(tableBillEntries.getSelectedRow(), 8)));
      }//GEN-LAST:event_tableBillEntriesKeyPressed

      private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
            ControllerEntriesP.enviaDatosTabla(tableBillEntries, searchField.getText());
            ControllerEntriesP.blockSearchLenght(searchField, evt);
      }//GEN-LAST:event_searchFieldKeyTyped

      private void tableBillEntriesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBillEntriesMouseReleased
           ControllerEntriesP.mandaCampos(tableBillEntries, this);
          row = tableBillEntries.getSelectedRow();
          nBillOriginal = (String) tableBillEntries.getValueAt(row, 0);
          listaProveedores.setSelectedItem(String.valueOf(tableBillEntries.getValueAt(tableBillEntries.getSelectedRow(), 8)));
      }//GEN-LAST:event_tableBillEntriesMouseReleased

      private void priceFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerEntriesP.bloqueaLetrasPrecio(keyNumeros, evt);
      }//GEN-LAST:event_priceFieldKeyTyped

      private void descFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descFieldKeyTyped
             labelDesc.setText("Descripcion");
             labelDesc.setForeground(Color.BLACK);
      }//GEN-LAST:event_descFieldKeyTyped

      private void quantityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerEntriesP.bloqueaLetrasCantidad(keyNumeros, evt);
      }//GEN-LAST:event_quantityFieldKeyTyped

      private void brandFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandFieldKeyTyped
            labelMarca.setText("Marca");
             labelMarca.setForeground(Color.BLACK);
      }//GEN-LAST:event_brandFieldKeyTyped

      private void sectionFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sectionFieldKeyTyped
           labelSeccion.setText("Seccion");
           labelSeccion.setForeground(Color.BLACK);
      }//GEN-LAST:event_sectionFieldKeyTyped

      private void billFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_billFieldKeyReleased
            setLabelBill("N° de factura", Color.BLACK);
      }//GEN-LAST:event_billFieldKeyReleased

      private void tableBillEntriesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBillEntriesMouseDragged
            evt.consume();
      }//GEN-LAST:event_tableBillEntriesMouseDragged

      private void buttonCleanFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanFieldsActionPerformed
          tableBillEntries.setSelectionMode(0);
          nBillOriginal = "";
          ControllerEntriesP.limpiaCampos(this);
      }//GEN-LAST:event_buttonCleanFieldsActionPerformed

      private void buttonCreateEntrieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateEntrieActionPerformed
             try {
                  ControllerEntriesP.insertar(tableBillEntries,this, nBillOriginal);
            } catch (SQLIntegrityConstraintViolationException e) {
                  JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
            }
      }//GEN-LAST:event_buttonCreateEntrieActionPerformed

      private void buttonDeleteEntrieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteEntrieActionPerformed
          ControllerEntriesP.eliminar(tableBillEntries, nBillOriginal);
          tableBillEntries.setSelectionMode(0);
      }//GEN-LAST:event_buttonDeleteEntrieActionPerformed

     public String getQuantityField() {
          return quantityField.getText();
     }

     public String getCodePField() {
          return codeProduct.getText();
     }

     public String getDescField() {
          return descField.getText();
     }

     public String getDateField() {
          return dateField.getText();
     }

     public String getBillField() {
          return billField.getText();
     }

     public Double TakePriceField() {
          double precio = Double.parseDouble(priceField.getText());
          return precio;
     }

     public String getPriceField(){
          return priceField.getText();
     }

     public void setCodePField(String texto){
          this.codeProduct.setText(texto);
     }

     public void setBillField(String texto){
          this.billField.setText(texto);
     }

     public String getIdPSeleccionado() {
          return idPSeleccionado;
     }

     public void setListaProveedores(JComboBox<String> listaProveedores) {
          this.listaProveedores = listaProveedores;
     }

     public String getBrandField() {
          return brandField.getText();
     }

     public void setBrandField(String campoMarcaE) {
          this.brandField.setText(campoMarcaE);
     }

     public String getVendorField() {
          return vendorField.getText();
     }

     public void setVendorField(String campoProveedor) {
          this.vendorField.setText(campoProveedor);
     }

     public String getSectionField() {
          return sectionField.getText();
     }

     public void setSectionField(String campoSeccionE) {
          this.sectionField.setText(campoSeccionE);
     }

     public String getConfirmaId() {
          return confirmaId;
     }

     public void setQuantityField(String campoCantidad) {
          this.quantityField.setText(campoCantidad);
     }

     public void setDateField(String campoFecha) {
          this.dateField.setText(campoFecha);;
     }

     public void setPriceField(String campoPrecio) {
          this.priceField.setText(campoPrecio);
     }

     public void setDescField(String campoDescripcion) {
          this.descField.setText(campoDescripcion);
     }

     public void setConfirmaId(String confirmaId) {
          this.confirmaId = confirmaId;
     }
     
     public void setSelectedItemList(int index){
          listaProveedores.setSelectedIndex(index);
     }

      public void setLabelBrand(String texto) {
            this.labelMarca.setText(texto);
            this.labelMarca.setForeground(Color.RED);
      }

      public void setLabelSection(String texto) {
            this.labelSeccion.setText(texto);
            this.labelSeccion.setForeground(Color.RED);
      }
     
      public void setLabelVendor(String texto) {
            this.labelProveedor.setText(texto);
            this.labelProveedor.setForeground(Color.RED);
      }
     
      public void setLabelDesc(String texto) {
            this.labelDesc.setText(texto);
            this.labelDesc.setForeground(Color.RED);
      }

      public void setLabelBill(String texto, Color color) {
        this.labelBill.setText(texto);
        this.labelBill.setForeground(color);
      }

     public static boolean isIsVisibleEntries() {
         return isVisibleEntries;
     }

     public static void setIsVisibleEntries(boolean isVisibleEntries) {
         PanelEntrada.isVisibleEntries = isVisibleEntries;
     }

    public static void chargeEntries() {
              ControllerEntriesP.enviaDatosTabla(tableBillEntries, searchField.getText());
             listaProveedores.removeAllItems();;
             listaProveedores.addItem("Ninguno");
             listaProveedores.setSelectedItem("Ninguno");
             ControllerEntriesP.llenaComboBox(listaProveedores);
     }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private Utilities.TextField billField;
      private Utilities.TextField brandField;
      private Utilities.Button buttonCleanFields;
      private Utilities.Button buttonCreateEntrie;
      private Utilities.Button buttonDeleteEntrie;
      private Utilities.TextField codeProduct;
      private Utilities.TextField dateField;
      private Utilities.TextField descField;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel14;
      private javax.swing.JLabel jLabel16;
      private javax.swing.JLabel jLabel17;
      private javax.swing.JLabel jLabel18;
      private javax.swing.JLabel jLabel19;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel20;
      private javax.swing.JLabel jLabel22;
      private javax.swing.JLabel jLabel23;
      private javax.swing.JLabel jLabel24;
      private javax.swing.JLabel jLabel25;
      private javax.swing.JLabel jLabel26;
      private javax.swing.JLabel jLabel27;
      private javax.swing.JLabel jLabel29;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel30;
      private javax.swing.JLabel jLabel32;
      private javax.swing.JLabel jLabel33;
      private javax.swing.JLabel jLabel34;
      private javax.swing.JLabel jLabel35;
      private javax.swing.JLabel jLabel36;
      private javax.swing.JLabel jLabel38;
      private javax.swing.JLabel jLabel39;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel40;
      private javax.swing.JLabel jLabel41;
      private javax.swing.JLabel jLabel42;
      private javax.swing.JLabel jLabel43;
      private javax.swing.JLabel jLabel44;
      private javax.swing.JLabel jLabel45;
      private javax.swing.JLabel jLabel46;
      private javax.swing.JLabel jLabel47;
      private javax.swing.JLabel jLabel48;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JLabel labelBackground2;
      private javax.swing.JLabel labelBackground3;
      private javax.swing.JLabel labelBackground4;
      private javax.swing.JLabel labelBill;
      private javax.swing.JLabel labelCantidad;
      private javax.swing.JLabel labelCodigoProducto;
      private javax.swing.JLabel labelDecorationSearch;
      private javax.swing.JLabel labelDesc;
      private javax.swing.JLabel labelFecha;
      private javax.swing.JLabel labelMarca;
      private javax.swing.JLabel labelPrecio;
      private javax.swing.JLabel labelProveedor;
      private javax.swing.JLabel labelSeccion;
      private javax.swing.JLabel labelTitleEntrie;
      private javax.swing.JLabel labelTitleVendors;
      private static javax.swing.JComboBox<String> listaProveedores;
      private Utilities.PanelData2 panelDecorationSearch;
      private java.awt.PopupMenu popupMenu1;
      private Utilities.TextField priceField;
      private Utilities.TextField quantityField;
      private static Utilities.TextField searchField;
      private Utilities.TextField sectionField;
      private static javax.swing.JTable tableBillEntries;
      private Utilities.TextField vendorField;
      // End of variables declaration//GEN-END:variables
}
