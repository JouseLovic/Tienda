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
            jScrollPane2 = new javax.swing.JScrollPane();
            tablaNProductos = new javax.swing.JTable();
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
            priceField = new Utilities.TextField();
            idVendorField = new Utilities.TextField();
            sexField = new Utilities.TextField();
            ageObjetiveField = new Utilities.TextField();
            brandField = new Utilities.TextField();
            tallaField = new Utilities.TextField();
            descField = new Utilities.TextField();
            sectionField = new Utilities.TextField();
            idField = new Utilities.TextField();
            labelFoco = new javax.swing.JLabel();
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
            containerComponents.setLayout(null);

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

            containerComponents.add(jScrollPane2);
            jScrollPane2.setBounds(30, 500, 1170, 440);

            labelId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelId.setForeground(new java.awt.Color(0, 0, 0));
            labelId.setText("ID");
            containerComponents.add(labelId);
            labelId.setBounds(80, 80, 200, 30);

            labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDesc.setForeground(new java.awt.Color(0, 0, 0));
            labelDesc.setText("Descripción");
            containerComponents.add(labelDesc);
            labelDesc.setBounds(330, 80, 270, 30);

            labelTalla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelTalla.setForeground(new java.awt.Color(0, 0, 0));
            labelTalla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            labelTalla.setText("Talla");
            containerComponents.add(labelTalla);
            labelTalla.setBounds(580, 210, 60, 22);

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setText("Precio");
            containerComponents.add(labelPrecio);
            labelPrecio.setBounds(80, 310, 180, 30);

            labelSeccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSeccion.setForeground(new java.awt.Color(0, 0, 0));
            labelSeccion.setText("Seccion del product");
            containerComponents.add(labelSeccion);
            labelSeccion.setBounds(680, 80, 180, 30);

            labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelMarca.setForeground(new java.awt.Color(0, 0, 0));
            labelMarca.setText("Marca");
            containerComponents.add(labelMarca);
            labelMarca.setBounds(940, 80, 150, 30);

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setText("Cantidad ");
            containerComponents.add(labelCantidad);
            labelCantidad.setBounds(80, 200, 180, 30);

            labelEdadDirigida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelEdadDirigida.setForeground(new java.awt.Color(0, 0, 0));
            labelEdadDirigida.setText("Edad dirigida");
            containerComponents.add(labelEdadDirigida);
            labelEdadDirigida.setBounds(320, 200, 110, 30);

            labelSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSexo.setForeground(new java.awt.Color(0, 0, 0));
            labelSexo.setText("Sexo");
            containerComponents.add(labelSexo);
            labelSexo.setBounds(760, 200, 120, 30);

            labelTitleInventary.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelTitleInventary.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleInventary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            containerComponents.add(labelTitleInventary);
            labelTitleInventary.setBounds(10, 10, 350, 60);

            botonLlave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            botonLlave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\llaveDesactivada.png")); // NOI18N
            botonLlave.setBorder(null);
            botonLlave.setBorderPainted(false);
            botonLlave.setContentAreaFilled(false);
            botonLlave.setFocusPainted(false);
            botonLlave.setFocusable(false);
            botonLlave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            botonLlave.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\llaveDesactivadaOscura.png")); // NOI18N
            botonLlave.setRequestFocusEnabled(false);
            botonLlave.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\llaveDesactivada.png")); // NOI18N
            botonLlave.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLlaveActionPerformed(evt);
                  }
            });
            containerComponents.add(botonLlave);
            botonLlave.setBounds(250, 100, 60, 60);

            labelIdProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelIdProveedor.setForeground(new java.awt.Color(0, 0, 0));
            labelIdProveedor.setText("Id del proveedor");
            containerComponents.add(labelIdProveedor);
            labelIdProveedor.setBounds(940, 200, 170, 30);

            filtroId.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroId);
            filtroId.setSelected(true);
            filtroId.setText("ID");
            filtroId.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroIdActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroId);
            filtroId.setBounds(810, 60, 50, 20);

            filtroDesc.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroDesc);
            filtroDesc.setText("Descripcion");
            filtroDesc.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroDescActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroDesc);
            filtroDesc.setBounds(880, 60, 90, 21);

            filtroSeccion.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroSeccion);
            filtroSeccion.setText("Seccion");
            filtroSeccion.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroSeccionActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroSeccion);
            filtroSeccion.setBounds(880, 30, 70, 21);

            filtroMarca.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroMarca);
            filtroMarca.setText("Marca");
            filtroMarca.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroMarcaActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroMarca);
            filtroMarca.setBounds(810, 30, 70, 21);

            buttonDelete.setForeground(new java.awt.Color(0, 0, 0));
            buttonDelete.setText("Eliminar");
            buttonDelete.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonDelete.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonDeleteActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonDelete);
            buttonDelete.setBounds(140, 440, 170, 50);

            buttonConfirmProduct.setForeground(new java.awt.Color(0, 0, 0));
            buttonConfirmProduct.setText("Confirmar alta de product");
            buttonConfirmProduct.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonConfirmProduct.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonConfirmProductActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonConfirmProduct);
            buttonConfirmProduct.setBounds(400, 380, 180, 50);

            buttonCreateProduct.setForeground(new java.awt.Color(0, 0, 0));
            buttonCreateProduct.setText("Crear product");
            buttonCreateProduct.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonCreateProduct.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonCreateProductActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonCreateProduct);
            buttonCreateProduct.setBounds(920, 440, 170, 50);

            buttonClearFields.setForeground(new java.awt.Color(0, 0, 0));
            buttonClearFields.setText("Limpia campos");
            buttonClearFields.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonClearFields.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonClearFieldsActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonClearFields);
            buttonClearFields.setBounds(660, 440, 170, 50);

            buttonUpdateProduct.setForeground(new java.awt.Color(0, 0, 0));
            buttonUpdateProduct.setText("Actualizar");
            buttonUpdateProduct.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonUpdateProductActionPerformed(evt);
                  }
            });
            containerComponents.add(buttonUpdateProduct);
            buttonUpdateProduct.setBounds(400, 440, 180, 50);

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
            containerComponents.add(quantityField);
            quantityField.setBounds(70, 230, 190, 50);

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
            containerComponents.add(priceField);
            priceField.setBounds(70, 340, 190, 50);

            idVendorField.setText("Ninguno");
            idVendorField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(idVendorField);
            idVendorField.setBounds(930, 230, 180, 50);

            sexField.setForeground(new java.awt.Color(0, 0, 0));
            sexField.setShadowColor(new java.awt.Color(0, 0, 0));
            sexField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        sexFieldKeyReleased(evt);
                  }
            });
            containerComponents.add(sexField);
            sexField.setBounds(750, 230, 130, 50);

            ageObjetiveField.setForeground(new java.awt.Color(0, 0, 0));
            ageObjetiveField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(ageObjetiveField);
            ageObjetiveField.setBounds(310, 230, 180, 50);

            brandField.setForeground(new java.awt.Color(0, 0, 0));
            brandField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(brandField);
            brandField.setBounds(930, 110, 180, 50);

            tallaField.setForeground(new java.awt.Color(0, 0, 0));
            tallaField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(tallaField);
            tallaField.setBounds(570, 230, 110, 50);

            descField.setForeground(new java.awt.Color(0, 0, 0));
            descField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(descField);
            descField.setBounds(320, 110, 290, 50);

            sectionField.setForeground(new java.awt.Color(0, 0, 0));
            sectionField.setShadowColor(new java.awt.Color(0, 0, 0));
            containerComponents.add(sectionField);
            sectionField.setBounds(670, 110, 200, 50);

            idField.setForeground(new java.awt.Color(0, 0, 0));
            idField.setShadowColor(new java.awt.Color(0, 0, 0));
            idField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        idFieldKeyReleased(evt);
                  }
            });
            containerComponents.add(idField);
            idField.setBounds(70, 110, 180, 50);

            labelFoco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            labelFoco.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\Search.png")); // NOI18N
            containerComponents.add(labelFoco);
            labelFoco.setBounds(730, 20, 50, 40);

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
            containerComponents.add(searchField);
            searchField.setBounds(380, 10, 410, 60);

            panelDecorationSearch.setBackground(new java.awt.Color(45, 141, 252));
            panelDecorationSearch.setRoundBottonLeft(12);
            panelDecorationSearch.setRoundBottonRight(10);
            panelDecorationSearch.setRoundTopRight(10);
            containerComponents.add(panelDecorationSearch);
            panelDecorationSearch.setBounds(390, 20, 405, 50);
            panelDecorationSearch.getAccessibleContext().setAccessibleName("");

            labelDecorationBackground2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelNProduct\\fluido-transformedInvertido.png")); // NOI18N
            containerComponents.add(labelDecorationBackground2);
            labelDecorationBackground2.setBounds(550, 570, 690, 300);

            labelDecorationBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelNProduct\\fluido-transformed.png")); // NOI18N
            containerComponents.add(labelDecorationBackground);
            labelDecorationBackground.setBounds(420, 275, 810, 315);

            jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\PanelNProduct\\fluido-transformedInvertido90Grados.png")); // NOI18N
            containerComponents.add(jLabel3);
            jLabel3.setBounds(600, -50, 630, 210);

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
      private javax.swing.JLabel jLabel3;
      private javax.swing.JScrollPane jScrollPane2;
      private static javax.swing.JLabel labelCantidad;
      private javax.swing.JLabel labelDecorationBackground;
      private javax.swing.JLabel labelDecorationBackground2;
      private static javax.swing.JLabel labelDesc;
      private static javax.swing.JLabel labelEdadDirigida;
      private javax.swing.JLabel labelFoco;
      private static javax.swing.JLabel labelId;
      private static javax.swing.JLabel labelIdProveedor;
      private static javax.swing.JLabel labelMarca;
      private static javax.swing.JLabel labelPrecio;
      private static javax.swing.JLabel labelSeccion;
      private static javax.swing.JLabel labelSexo;
      private static javax.swing.JLabel labelTalla;
      private javax.swing.JLabel labelTitleInventary;
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
