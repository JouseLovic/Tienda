package ViewFormulary;

import Controllers.ControllerNProduct;
import Controllers.Settings.ReSettings;

import java.awt.*;
import javax.swing.*;

public class PanelNuevoProducto extends javax.swing.JPanel {
  
     private static int contador = 0, cantidadAux;
     //This boolean is for show a image key or other image key
     private boolean llaveActiva = false;
     //This boolean is for verified if campoId isEditable or not
     private boolean campoActivo = true;

     //this boolean is for validate if panelInicial is visible or not
     private static boolean isVisible;
     private static String seleccionFiltrada = "";
     private String confirmaId;
     private String vendido;
     private double precioAux = 0;

     
     public PanelNuevoProducto() {
          initComponents();
          seleccionFiltrada = filtroId.getText();
          ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
          this.labelTitleInventary.setText(ReSettings.getTitleInventary());
          searchField.setText(null);
          isVisible = true;
          setEditableProveedor(false);
          buttonUpdateProduct.setEnabled(false);
          buttonConfirmProduct.setEnabled(false); 
     }
     
     
     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            grupo = new javax.swing.ButtonGroup();
            containerComponents = new javax.swing.JPanel();
            labelId = new javax.swing.JLabel();
            labelDesc = new javax.swing.JLabel();
            labelTalla = new javax.swing.JLabel();
            labelPrecio = new javax.swing.JLabel();
            labelSeccion = new javax.swing.JLabel();
            labelMarca = new javax.swing.JLabel();
            labelCantidad = new javax.swing.JLabel();
            labelEdadDirigida = new javax.swing.JLabel();
            labelSexo = new javax.swing.JLabel();
            labelTitleInventary = new javax.swing.JLabel();
            botonLlave = new javax.swing.JButton();
            labelIdProveedor = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            filtroId = new javax.swing.JRadioButton();
            filtroDesc = new javax.swing.JRadioButton();
            filtroSeccion = new javax.swing.JRadioButton();
            filtroMarca = new javax.swing.JRadioButton();
            buttonDelete = new Utilities.Button();
            buttonConfirmProduct = new Utilities.Button();
            buttonCreateProduct = new Utilities.Button();
            buttonClearFields = new Utilities.Button();
            buttonUpdateProduct = new Utilities.Button();
            quantityField = new Utilities.TextField();
            panelData21 = new Utilities.PanelData2();
            jScrollPane2 = new javax.swing.JScrollPane();
            tablaNProductos = new javax.swing.JTable();
            priceField = new Utilities.TextField();
            idVendorField = new Utilities.TextField();
            sexField = new Utilities.TextField();
            ageObjetiveField = new Utilities.TextField();
            brandField = new Utilities.TextField();
            tallaField = new Utilities.TextField();
            descField = new Utilities.TextField();
            sectionField = new Utilities.TextField();
            idField = new Utilities.TextField();
            jLabel1 = new javax.swing.JLabel();
            searchField = new Utilities.TextField();
            panelDecorationSearch = new Utilities.PanelData2();
            labelDecorationBackground2 = new javax.swing.JLabel();
            labelDecorationBackground = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();

            setLayout(new java.awt.BorderLayout());

            containerComponents.setBackground(new java.awt.Color(248, 248, 248));
            containerComponents.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        containerComponentsMouseClicked(evt);
                  }
            });
            containerComponents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            labelId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelId.setForeground(new java.awt.Color(0, 0, 0));
            labelId.setText("ID");
            containerComponents.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, 30));

            labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDesc.setForeground(new java.awt.Color(0, 0, 0));
            labelDesc.setText("Descripción");
            containerComponents.add(labelDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 270, 30));

            labelTalla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelTalla.setForeground(new java.awt.Color(0, 0, 0));
            labelTalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelTalla.setText("Talla");
            containerComponents.add(labelTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 60, -1));

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setText("Precio");
            containerComponents.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 180, 30));

            labelSeccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSeccion.setForeground(new java.awt.Color(0, 0, 0));
            labelSeccion.setText("Seccion del producto");
            containerComponents.add(labelSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 180, 30));

            labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelMarca.setForeground(new java.awt.Color(0, 0, 0));
            labelMarca.setText("Marca");
            containerComponents.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 150, 30));

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setText("Cantidad ");
            containerComponents.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, 30));

            labelEdadDirigida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelEdadDirigida.setForeground(new java.awt.Color(0, 0, 0));
            labelEdadDirigida.setText("Edad dirigida");
            containerComponents.add(labelEdadDirigida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 110, 30));

            labelSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSexo.setForeground(new java.awt.Color(0, 0, 0));
            labelSexo.setText("Sexo");
            containerComponents.add(labelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 120, 30));

            labelTitleInventary.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelTitleInventary.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleInventary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            containerComponents.add(labelTitleInventary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 60));

            botonLlave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            botonLlave.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\llaveDesactivada.png")); // NOI18N
            botonLlave.setBorder(null);
            botonLlave.setBorderPainted(false);
            botonLlave.setContentAreaFilled(false);
            botonLlave.setFocusPainted(false);
            botonLlave.setFocusable(false);
            botonLlave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            botonLlave.setPressedIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\llaveDesactivadaOscura.png")); // NOI18N
            botonLlave.setRequestFocusEnabled(false);
            botonLlave.setRolloverIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\llaveDesactivada.png")); // NOI18N
            botonLlave.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLlaveActionPerformed(evt);
                  }
            });
            containerComponents.add(botonLlave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 60, 50));

            labelIdProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelIdProveedor.setForeground(new java.awt.Color(0, 0, 0));
            labelIdProveedor.setText("Id del proveedor");
            containerComponents.add(labelIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 170, 30));

            jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Ordernar por: ");
            containerComponents.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 140, 20));

            filtroId.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroId);
            filtroId.setSelected(true);
            filtroId.setText("ID");
            filtroId.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroIdActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 40, 20));

            filtroDesc.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroDesc);
            filtroDesc.setText("Descripcion");
            filtroDesc.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroDescActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 100, -1));

            filtroSeccion.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroSeccion);
            filtroSeccion.setText("Seccion");
            filtroSeccion.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroSeccionActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 80, -1));

            filtroMarca.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroMarca);
            filtroMarca.setText("Marca");
            filtroMarca.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroMarcaActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 70, -1));

            buttonDelete.setForeground(new java.awt.Color(0, 0, 0));
            buttonDelete.setText("Eliminar");
            buttonDelete.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonDelete.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonDeleteActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 170, 50));

            buttonConfirmProduct.setForeground(new java.awt.Color(0, 0, 0));
            buttonConfirmProduct.setText("Confirmar alta de producto");
            buttonConfirmProduct.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonConfirmProduct.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonConfirmProductActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonConfirmProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 180, 50));

            buttonCreateProduct.setForeground(new java.awt.Color(0, 0, 0));
            buttonCreateProduct.setText("Crear producto");
            buttonCreateProduct.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonCreateProduct.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonCreateProductActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonCreateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 170, 50));

            buttonClearFields.setForeground(new java.awt.Color(0, 0, 0));
            buttonClearFields.setText("Limpia campos");
            buttonClearFields.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonClearFields.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonClearFieldsActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonClearFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 170, 50));

            buttonUpdateProduct.setForeground(new java.awt.Color(0, 0, 0));
            buttonUpdateProduct.setText("Actualizar");
            buttonUpdateProduct.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonUpdateProductActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 180, 50));

            quantityField.setForeground(new java.awt.Color(0, 0, 0));
            quantityField.setShadowColor(new java.awt.Color(0, 0, 0));
            quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        quantityFieldKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        quantityFieldKeyTyped(evt);
                  }
            });
            containerComponents.add(quantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, 50));

            panelData21.setBackground(new java.awt.Color(255, 255, 255));
            panelData21.setRoundBottonLeft(10);
            panelData21.setRoundBottonRight(10);
            panelData21.setRoundTopLeft(10);
            panelData21.setRoundTopRight(10);

            tablaNProductos = new javax.swing.JTable(){

                  public boolean isCellEditable(int rowIndex, int columnIndex){
                        return false;
                  }

            };
            tablaNProductos.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Id", "Descripcion", "Talla", "Marca", "Seccion", "Precio", "Edad Dirigidida", "Cantidad", "Sexo", "Id del proveedor", "Vendido"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaNProductos.setGridColor(new java.awt.Color(255, 255, 255));
            tablaNProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            tablaNProductos.getTableHeader().setResizingAllowed(false);
            tablaNProductos.getTableHeader().setReorderingAllowed(false);
            tablaNProductos.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        tablaNProductosMouseReleased(evt);
                  }
            });
            tablaNProductos.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        tablaNProductosKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        tablaNProductosKeyReleased(evt);
                  }
            });
            jScrollPane2.setViewportView(tablaNProductos);

            javax.swing.GroupLayout panelData21Layout = new javax.swing.GroupLayout(panelData21);
            panelData21.setLayout(panelData21Layout);
            panelData21Layout.setHorizontalGroup(
                  panelData21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelData21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
            );
            panelData21Layout.setVerticalGroup(
                  panelData21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelData21Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
            );

            containerComponents.add(panelData21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1020, 440));

            priceField.setForeground(new java.awt.Color(0, 0, 0));
            priceField.setShadowColor(new java.awt.Color(0, 0, 0));
            priceField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        priceFieldKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        priceFieldKeyTyped(evt);
                  }
            });
            containerComponents.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 50));

            idVendorField.setText("Ninguno");
            idVendorField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(idVendorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 180, 50));

            sexField.setForeground(new java.awt.Color(0, 0, 0));
            sexField.setShadowColor(new java.awt.Color(0, 0, 0));
            sexField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        sexFieldKeyReleased(evt);
                  }
            });
            containerComponents.add(sexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 130, 50));

            ageObjetiveField.setForeground(new java.awt.Color(0, 0, 0));
            ageObjetiveField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(ageObjetiveField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 180, 50));

            brandField.setForeground(new java.awt.Color(0, 0, 0));
            brandField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(brandField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 180, 50));

            tallaField.setForeground(new java.awt.Color(0, 0, 0));
            tallaField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(tallaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 100, 50));

            descField.setForeground(new java.awt.Color(0, 0, 0));
            descField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(descField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 111, 290, 50));

            sectionField.setForeground(new java.awt.Color(0, 0, 0));
            sectionField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(sectionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 200, 50));

            idField.setForeground(new java.awt.Color(0, 0, 0));
            idField.setShadowColor(new java.awt.Color(0, 0, 0));
            idField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        idFieldKeyReleased(evt);
                  }
            });
            containerComponents.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 50));

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\Search.png")); // NOI18N
            containerComponents.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 50, 40));

            searchField.setForeground(new java.awt.Color(0, 0, 0));
            searchField.setShadowColor(new java.awt.Color(0, 0, 0));
            searchField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        searchFieldKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        searchFieldKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        searchFieldKeyTyped(evt);
                  }
            });
            containerComponents.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 410, 60));

            panelDecorationSearch.setBackground(new java.awt.Color(45, 141, 252));
            panelDecorationSearch.setRoundBottonLeft(12);
            panelDecorationSearch.setRoundBottonRight(10);
            panelDecorationSearch.setRoundTopRight(10);
            containerComponents.add(panelDecorationSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 22, 400, 48));

            labelDecorationBackground2.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\PanelNProduct\\fluido-transformedInvertido.png")); // NOI18N
            containerComponents.add(labelDecorationBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 690, 300));

            labelDecorationBackground.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\PanelNProduct\\fluido-transformed.png")); // NOI18N
            containerComponents.add(labelDecorationBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 810, 320));

            jLabel3.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\PanelNProduct\\fluido-transformedInvertido90Grados.png")); // NOI18N
            containerComponents.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -60, 630, 210));

            add(containerComponents, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void tablaNProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNProductosMouseReleased
          new ControllerNProduct().filaSeleccionada(tablaNProductos, this);
          setEditableProveedor(true);
          ControllerNProduct.mandaDatosCampos(tablaNProductos, this);
     }//GEN-LAST:event_tablaNProductosMouseReleased

     private void botonLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLlaveActionPerformed
          new ControllerNProduct().activacionDeLlave(this);
     }//GEN-LAST:event_botonLlaveActionPerformed

     private void tablaNProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaNProductosKeyReleased
          new ControllerNProduct().filaSeleccionada(tablaNProductos, this);
          setEditableProveedor(true);
          ControllerNProduct.mandaDatosCampos(tablaNProductos, this);
     }//GEN-LAST:event_tablaNProductosKeyReleased

     private void containerComponentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerComponentsMouseClicked
          tablaNProductos.setSelectionMode(0);
          buttonConfirmProduct.setEnabled(false);
     }//GEN-LAST:event_containerComponentsMouseClicked

      private void tablaNProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaNProductosKeyPressed
        ControllerNProduct.mandaDatosCampos(tablaNProductos, this);
      }//GEN-LAST:event_tablaNProductosKeyPressed

      private void filtroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroIdActionPerformed
            seleccionFiltrada = filtroId.getText();
            ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
      }//GEN-LAST:event_filtroIdActionPerformed

      private void filtroSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroSeccionActionPerformed
           seleccionFiltrada = filtroSeccion.getText();
            ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
      }//GEN-LAST:event_filtroSeccionActionPerformed

      private void filtroDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroDescActionPerformed
            seleccionFiltrada = filtroDesc.getText();
            ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
      }//GEN-LAST:event_filtroDescActionPerformed

      private void filtroMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroMarcaActionPerformed
            seleccionFiltrada = filtroMarca.getText();
            ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
      }//GEN-LAST:event_filtroMarcaActionPerformed

      private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
           ControllerNProduct.eliminar(tablaNProductos, this);
          ControllerNProduct.borrarCampos(this);
          setEditableProveedor(false);
          ControllerNProduct.paraBotonEliminar(tablaNProductos, this);
      }//GEN-LAST:event_buttonDeleteActionPerformed

      private void buttonConfirmProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmProductActionPerformed
            boolean selection = ControllerNProduct.confirmar(this);
            if(selection) {
                ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
                tablaNProductos.setSelectionMode(0);
                setEditableProveedor(false);
                buttonConfirmProduct.setEnabled(false);
            }
      }//GEN-LAST:event_buttonConfirmProductActionPerformed

      private void buttonUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateProductActionPerformed
            ControllerNProduct.actualizarProducto(this);
            ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
            new ControllerNProduct().paraBotonActualizar(tablaNProductos, this);
            setEditableProveedor(false);
      }//GEN-LAST:event_buttonUpdateProductActionPerformed

      private void buttonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearFieldsActionPerformed
            ControllerNProduct.borrarCampos(this);
            setEditableProveedor(false);
            new ControllerNProduct().paraBotonLimpiar(tablaNProductos, this);
      }//GEN-LAST:event_buttonClearFieldsActionPerformed

      private void buttonCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateProductActionPerformed
            ControllerNProduct.subir(this, tablaNProductos, labelId);
      }//GEN-LAST:event_buttonCreateProductActionPerformed

      private void priceFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyReleased
           ControllerNProduct.labelDefault(labelPrecio, "Precio");
      }//GEN-LAST:event_priceFieldKeyReleased

      private void priceFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerNProduct.bloqueaLetrasPrecio(keyNumeros, evt);
      }//GEN-LAST:event_priceFieldKeyTyped

      private void quantityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldKeyTyped
            int keyNumeros = evt.getKeyChar();
            ControllerNProduct.bloqueaLetrasPrecio(keyNumeros, evt);
      }//GEN-LAST:event_quantityFieldKeyTyped

      private void quantityFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldKeyReleased
            ControllerNProduct.labelDefault(labelCantidad, "Cantidad");
      }//GEN-LAST:event_quantityFieldKeyReleased

      private void sexFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexFieldKeyReleased
           ControllerNProduct.labelDefault(labelSexo, "Sexo");
      }//GEN-LAST:event_sexFieldKeyReleased

      private void idFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyReleased
            ControllerNProduct.labelDefault(labelId, "ID");
      }//GEN-LAST:event_idFieldKeyReleased

      private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
            ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
                    if(searchField.getText().isEmpty()){
                          ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
                    }
      }//GEN-LAST:event_searchFieldKeyReleased

      private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
           ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, searchField.getText());
                    if(searchField.getText().isEmpty()){
                          ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
                    }
      }//GEN-LAST:event_searchFieldKeyPressed

      private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
                    if(searchField.getText().length()>=57){
                            evt.consume();
                    }
      }//GEN-LAST:event_searchFieldKeyTyped

     public String getIdVendorField() {
          return idVendorField.getText();
     }

     public void setIdVendorField(String campoIdProveedor) {
          this.idVendorField.setText(campoIdProveedor);
     }


     public String getQuantityField() {
         if(quantityField.getText().equalsIgnoreCase("")) {
            return  String.valueOf(cantidadAux);
         }
         else {
             return quantityField.getText();
         }
     }

     public void setQuantityField(String texto) {
          quantityField.setText(texto);
     }

     public String getDescField() {
          return descField.getText();
     }

     public void setDescField(String texto) {
          descField.setText(texto);
     }

     public String getAgeObjetiveField() {
          return ageObjetiveField.getText();
     }

     public void setAgeObjetiveField(String texto) {
          ageObjetiveField.setText(texto);
     }

     public String getIdField() {
          return idField.getText();
     }

     public void setCampoId(String texto) {
          idField.setText(texto);
     }

     public String getBrandField() {
          return brandField.getText();
     }

     public void setBrandField(String texto) {
          brandField.setText(texto);
     }

     public String getPriceField() {
         if(priceField.getText().equalsIgnoreCase("")){
             return String.valueOf(precioAux);
         }
         else{
             return priceField.getText();
         }

     }

     public void setPriceField(String texto) {
          priceField.setText(String.valueOf(texto));
     }

     public String getTallaField() {
          return tallaField.getText();
     }

     public void setTallaField(String texto) {
          tallaField.setText(texto);
     }

     public String getSectionField() {
          return sectionField.getText();
     }

     public void setSectionField(String texto) {
          sectionField.setText(texto);
     }

     public String getSexField() {
          return sexField.getText();
     }

     public void setSexField(String texto) {
          this.sexField.setText(texto);
     }

     public String getConfirmaId() {
          return confirmaId;
     }

     public void setConfirmaId(String id){
          this.confirmaId = id;
     }

     public boolean isLlaveActiva() {
          return llaveActiva;
     }

     public void setLlaveActiva(boolean llaveActiva) {
          this.llaveActiva = llaveActiva;
     }

     public void setBotonLlave(ImageIcon imagen) {
          botonLlave.setIcon(imagen);
     }

     public boolean isCampoActivo() {
          return campoActivo;
     }

     public void setCampoActivo(boolean campoActivo) {
          this.campoActivo = campoActivo;
     }

     public void setEditableId(boolean act) {
          idField.setEditable(act);
          idField.setBackground(Color.WHITE);
          idField.setForeground(Color.BLACK);
          if(act==false){
             idField.setForeground(Color.GRAY);
          }
     }

      public void setEditableProveedor(boolean act) {
          idVendorField.setEditable(act);
          idVendorField.setBackground(Color.WHITE);
          idVendorField.setForeground(Color.BLACK);
          idVendorField.setText(null);
          if(!act){
             idVendorField.setForeground(Color.GRAY);
             idVendorField.setText("Ninguno");
          }  
     }

     public String getVendido() {
          return vendido;
     }

     public void setVendido(String texto) {
          this.vendido = String.valueOf(texto);
     }


     public void setActualiza(boolean act) {
          buttonUpdateProduct.setEnabled(act);
     }

     public void setConfirmaVendido(boolean act) {
          buttonConfirmProduct.setEnabled(act);
     }

     public void dameIcono(ImageIcon icon){
          botonLlave.setIcon(icon);
     }

     public String getSearchField() {
          if(!searchField.getText().equalsIgnoreCase("") || !searchField.getText().equalsIgnoreCase(null)){
             return searchField.getText();  
          }
          else{
               return "";
          }
     }

     public void setColorIdVendorField(Color color){
          this.idVendorField.setForeground(color);
     }

     public void setColorCampoProveedorBack(Color color){
          this.idVendorField.setBackground(color);
     }

     public void setSearchField(String texto) {
          this.searchField.setText(texto);
     }
     
     public String getOrdenadoSeleccionado(){
          return seleccionFiltrada;
     }

    public void setLabelId(String texto) {
        labelId.setForeground(Color.RED);
        labelId.setText(texto);
    }

    public void setLabelPrecio(String texto) {
        labelPrecio.setForeground(Color.RED);
        labelPrecio.setText(texto);
    }

    public void setLabelCantidad(String texto) {
        labelCantidad.setForeground(Color.RED);
        labelCantidad.setText(texto);
    }

    public void setLabelSexoAdvertencia(String texto) {
        this.labelSexo.setText(texto);
        this.labelSexo. setForeground(Color.RED);
    }

    public void setLabelIdDefault(String texto) {
        labelId.setForeground(Color.BLACK);
        labelId.setText(texto);
    }

    public void setLabelPrecioDefault(String texto) {
        labelPrecio.setForeground(Color.BLACK);
        labelPrecio.setText(texto);
    }

    public void setLabelCantidadDefault(String texto) {
        labelCantidad.setForeground(Color.BLACK);
        labelCantidad.setText(texto);
    }

    public void setLabelSexoDefault(String texto) {
        this.labelSexo.setText(texto);
        this.labelSexo. setForeground(Color.BLACK);
    }

    //Is probaly to do a methon general to receive a parameter. How this: labelDefault(String text, Color color)
    //Since are much methods for only one thing

    public void setRequestFocusSexField(){
         this.sexField.requestFocus();
    }

    public void setRequestFocusIdField(){
        this.idField.requestFocus();
    }

    public static boolean getIsVisible(){
         return isVisible;
    }

    public static void setIsVisible(boolean state){
         isVisible = state;
    }

    public static synchronized void chargeTable(){
        ControllerNProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        PanelNuevoProducto.contador = contador;
    }



      // Variables declaration - do not modify//GEN-BEGIN:variables
      private Utilities.TextField ageObjetiveField;
      private javax.swing.JButton botonLlave;
      private Utilities.TextField brandField;
      private Utilities.Button buttonClearFields;
      private Utilities.Button buttonConfirmProduct;
      private Utilities.Button buttonCreateProduct;
      private Utilities.Button buttonDelete;
      private Utilities.Button buttonUpdateProduct;
      private javax.swing.JPanel containerComponents;
      private Utilities.TextField descField;
      private javax.swing.JRadioButton filtroDesc;
      private javax.swing.JRadioButton filtroId;
      private javax.swing.JRadioButton filtroMarca;
      private javax.swing.JRadioButton filtroSeccion;
      private javax.swing.ButtonGroup grupo;
      private Utilities.TextField idField;
      private Utilities.TextField idVendorField;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JLabel labelCantidad;
      private javax.swing.JLabel labelDecorationBackground;
      private javax.swing.JLabel labelDecorationBackground2;
      private javax.swing.JLabel labelDesc;
      private javax.swing.JLabel labelEdadDirigida;
      private javax.swing.JLabel labelId;
      private javax.swing.JLabel labelIdProveedor;
      private javax.swing.JLabel labelMarca;
      private javax.swing.JLabel labelPrecio;
      private javax.swing.JLabel labelSeccion;
      private javax.swing.JLabel labelSexo;
      private javax.swing.JLabel labelTalla;
      private javax.swing.JLabel labelTitleInventary;
      private Utilities.PanelData2 panelData21;
      private Utilities.PanelData2 panelDecorationSearch;
      private Utilities.TextField priceField;
      private Utilities.TextField quantityField;
      private Utilities.TextField searchField;
      private Utilities.TextField sectionField;
      private Utilities.TextField sexField;
      private static javax.swing.JTable tablaNProductos;
      private Utilities.TextField tallaField;
      // End of variables declaration//GEN-END:variables

    
     

      

}
