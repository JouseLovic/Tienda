package Vista_Formulario;

import Controlador.ControllerNewProduct;
import java.awt.*;

import javax.swing.*;


public class PanelNuevoProducto extends javax.swing.JPanel {
  
     private static int actualizame = 0;
     private boolean llaveActiva = false;
     private boolean campoActivo = true;
     private String confirmaId;
     private String seleccionFiltrada = "";
     
     public PanelNuevoProducto() {
          initComponents();
          seleccionFiltrada = filtroId.getText();
          ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
          campoBuscar.setText(null);
          botonActualiza.setEnabled(false);
          botonConfirma.setEnabled(false); 
     }
     
     
     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            grupo = new javax.swing.ButtonGroup();
            containerComponents = new javax.swing.JPanel();
            labelId = new javax.swing.JLabel();
            labelDesc = new javax.swing.JLabel();
            labelTalla = new javax.swing.JLabel();
            campoId = new javax.swing.JTextField();
            campoDesc = new javax.swing.JTextField();
            campoTalla = new javax.swing.JTextField();
            campoMarca = new javax.swing.JTextField();
            campoSeccion = new javax.swing.JTextField();
            campoPrecio = new javax.swing.JTextField();
            campoEdadDirigida = new javax.swing.JTextField();
            campoCantidad = new javax.swing.JTextField();
            labelPrecio = new javax.swing.JLabel();
            labelSeccion = new javax.swing.JLabel();
            labelMarca = new javax.swing.JLabel();
            labelCantidad = new javax.swing.JLabel();
            labelEdadDirigida = new javax.swing.JLabel();
            botonLimpiaCampos = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            tablaNProductos = new javax.swing.JTable();
            campoSexo = new javax.swing.JTextField();
            labelSexo = new javax.swing.JLabel();
            labelNombreEmpresa = new javax.swing.JLabel();
            botonEliminar = new javax.swing.JButton();
            botonActualiza = new javax.swing.JButton();
            botonLlave = new javax.swing.JButton();
            campoVendido = new javax.swing.JTextField();
            labelVendido = new javax.swing.JLabel();
            botonConfirma = new javax.swing.JButton();
            labelIdProveedor = new javax.swing.JLabel();
            campoIdProveedor = new javax.swing.JTextField();
            campoBuscar = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            botonCrear = new javax.swing.JButton();
            filtroId = new javax.swing.JRadioButton();
            filtroDesc = new javax.swing.JRadioButton();
            filtroSeccion = new javax.swing.JRadioButton();
            filtroMarca = new javax.swing.JRadioButton();

            setLayout(new java.awt.BorderLayout());

            containerComponents.setBackground(new java.awt.Color(255, 255, 255));
            containerComponents.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        containerComponentsMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        containerComponentsMouseEntered(evt);
                  }
            });
            containerComponents.setLayout(null);

            labelId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelId.setForeground(new java.awt.Color(0, 0, 0));
            labelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelId.setText("Id");
            containerComponents.add(labelId);
            labelId.setBounds(30, 80, 210, 30);

            labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDesc.setForeground(new java.awt.Color(0, 0, 0));
            labelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelDesc.setText("Descripción");
            containerComponents.add(labelDesc);
            labelDesc.setBounds(380, 80, 140, 30);

            labelTalla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelTalla.setForeground(new java.awt.Color(0, 0, 0));
            labelTalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelTalla.setText("Talla");
            containerComponents.add(labelTalla);
            labelTalla.setBounds(690, 80, 60, 22);

            campoId.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoIdKeyReleased(evt);
                  }
            });
            containerComponents.add(campoId);
            campoId.setBounds(70, 120, 140, 40);
            containerComponents.add(campoDesc);
            campoDesc.setBounds(310, 120, 270, 40);
            containerComponents.add(campoTalla);
            campoTalla.setBounds(640, 120, 160, 40);
            containerComponents.add(campoMarca);
            campoMarca.setBounds(70, 230, 150, 40);
            containerComponents.add(campoSeccion);
            campoSeccion.setBounds(300, 230, 200, 40);

            campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoPrecioKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoPrecioKeyTyped(evt);
                  }
            });
            containerComponents.add(campoPrecio);
            campoPrecio.setBounds(860, 120, 160, 40);
            containerComponents.add(campoEdadDirigida);
            campoEdadDirigida.setBounds(340, 340, 140, 40);

            campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyTyped(evt);
                  }
            });
            containerComponents.add(campoCantidad);
            campoCantidad.setBounds(70, 340, 180, 40);

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelPrecio.setText("Precio");
            containerComponents.add(labelPrecio);
            labelPrecio.setBounds(790, 80, 280, 30);

            labelSeccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSeccion.setForeground(new java.awt.Color(0, 0, 0));
            labelSeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelSeccion.setText("Seccion del producto");
            containerComponents.add(labelSeccion);
            labelSeccion.setBounds(290, 190, 200, 30);

            labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelMarca.setForeground(new java.awt.Color(0, 0, 0));
            labelMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelMarca.setText("Marca");
            containerComponents.add(labelMarca);
            labelMarca.setBounds(80, 190, 110, 30);

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidad.setText("Cantidad ");
            containerComponents.add(labelCantidad);
            labelCantidad.setBounds(0, 300, 320, 30);

            labelEdadDirigida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelEdadDirigida.setForeground(new java.awt.Color(0, 0, 0));
            labelEdadDirigida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelEdadDirigida.setText("Edad a la que esta dirigida");
            containerComponents.add(labelEdadDirigida);
            labelEdadDirigida.setBounds(300, 300, 230, 30);

            botonLimpiaCampos.setText("Limpiar campos");
            botonLimpiaCampos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLimpiaCamposActionPerformed(evt);
                  }
            });
            containerComponents.add(botonLimpiaCampos);
            botonLimpiaCampos.setBounds(720, 430, 180, 40);

            jScrollPane1.setRequestFocusEnabled(false);

            tablaNProductos = new javax.swing.JTable(){

                  public boolean isCellEditable(int rowIndex, int columnIndex){
                        return false;
                  }
            };
            tablaNProductos.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "id", "Descripcion", "Talla", "Marca", "Seccion", "Precio", "Edad dirigida", "Cantidad", "Sexo", "Id del proveedor", "Producto vendido"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaNProductos.setColumnSelectionAllowed(true);
            tablaNProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            tablaNProductos.setShowGrid(true);
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
            jScrollPane1.setViewportView(tablaNProductos);
            tablaNProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            if (tablaNProductos.getColumnModel().getColumnCount() > 0) {
                  tablaNProductos.getColumnModel().getColumn(0).setMinWidth(30);
                  tablaNProductos.getColumnModel().getColumn(0).setPreferredWidth(40);
                  tablaNProductos.getColumnModel().getColumn(0).setMaxWidth(50);
            }

            containerComponents.add(jScrollPane1);
            jScrollPane1.setBounds(20, 490, 1230, 420);
            containerComponents.add(campoSexo);
            campoSexo.setBounds(570, 230, 80, 40);

            labelSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSexo.setForeground(new java.awt.Color(0, 0, 0));
            labelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelSexo.setText("Sexo");
            containerComponents.add(labelSexo);
            labelSexo.setBounds(550, 190, 120, 30);

            labelNombreEmpresa.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
            labelNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelNombreEmpresa.setText("Gestion de inventario");
            containerComponents.add(labelNombreEmpresa);
            labelNombreEmpresa.setBounds(10, 10, 290, 70);

            botonEliminar.setText("Eliminar");
            botonEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonEliminarActionPerformed(evt);
                  }
            });
            containerComponents.add(botonEliminar);
            botonEliminar.setBounds(90, 430, 170, 40);

            botonActualiza.setText("Actualizar");
            botonActualiza.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonActualizaActionPerformed(evt);
                  }
            });
            containerComponents.add(botonActualiza);
            botonActualiza.setBounds(400, 430, 180, 40);

            botonLlave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            botonLlave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/llaveDesactivada.png"))); // NOI18N
            botonLlave.setBorder(null);
            botonLlave.setBorderPainted(false);
            botonLlave.setContentAreaFilled(false);
            botonLlave.setFocusPainted(false);
            botonLlave.setFocusable(false);
            botonLlave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            botonLlave.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/llaveDesactivada.png"))); // NOI18N
            botonLlave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/llaveDesactivada.png"))); // NOI18N
            botonLlave.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLlaveActionPerformed(evt);
                  }
            });
            containerComponents.add(botonLlave);
            botonLlave.setBounds(210, 110, 60, 60);
            containerComponents.add(campoVendido);
            campoVendido.setBounds(560, 340, 180, 40);

            labelVendido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelVendido.setForeground(new java.awt.Color(0, 0, 0));
            labelVendido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelVendido.setText("Producto vendido");
            containerComponents.add(labelVendido);
            labelVendido.setBounds(540, 300, 220, 30);

            botonConfirma.setText("Confirmar productos vendido");
            botonConfirma.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonConfirmaActionPerformed(evt);
                  }
            });
            containerComponents.add(botonConfirma);
            botonConfirma.setBounds(820, 20, 200, 40);

            labelIdProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelIdProveedor.setForeground(new java.awt.Color(0, 0, 0));
            labelIdProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelIdProveedor.setText("Id del proveedor");
            containerComponents.add(labelIdProveedor);
            labelIdProveedor.setBounds(740, 190, 170, 30);

            campoIdProveedor.setEditable(false);
            containerComponents.add(campoIdProveedor);
            campoIdProveedor.setBounds(720, 230, 230, 40);

            campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoBuscarKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoBuscarKeyTyped(evt);
                  }
            });
            containerComponents.add(campoBuscar);
            campoBuscar.setBounds(470, 20, 310, 40);

            jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("Buscar producto:");
            containerComponents.add(jLabel1);
            jLabel1.setBounds(320, 20, 150, 40);

            jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Ordernar por: ");
            containerComponents.add(jLabel2);
            jLabel2.setBounds(770, 340, 140, 40);

            botonCrear.setText("Subir producto");
            botonCrear.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonCrearActionPerformed(evt);
                  }
            });
            containerComponents.add(botonCrear);
            botonCrear.setBounds(1060, 430, 160, 40);

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
            filtroId.setBounds(920, 340, 50, 20);

            filtroDesc.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroDesc);
            filtroDesc.setText("Descripcion");
            filtroDesc.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroDescActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroDesc);
            filtroDesc.setBounds(1010, 340, 150, 21);

            filtroSeccion.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroSeccion);
            filtroSeccion.setText("Seccion");
            filtroSeccion.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroSeccionActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroSeccion);
            filtroSeccion.setBounds(920, 370, 90, 21);

            filtroMarca.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroMarca);
            filtroMarca.setText("Marca");
            filtroMarca.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroMarcaActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroMarca);
            filtroMarca.setBounds(1010, 370, 90, 21);

            add(containerComponents, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void botonLimpiaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaCamposActionPerformed
         ControllerNewProduct.borrarCampos(this);
         campoIdProveedor.setEditable(false);
         botonCrear.setEnabled(true);
         new ControllerNewProduct().paraBotonLimpiar(tablaNProductos, this);
     }//GEN-LAST:event_botonLimpiaCamposActionPerformed

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerNewProduct.eliminar(tablaNProductos, this);
          ControllerNewProduct.borrarCampos(this);
          campoIdProveedor.setEditable(false);
          botonCrear.setEnabled(true);
          ControllerNewProduct.paraBotonEliminar(tablaNProductos, this);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizaActionPerformed
          ControllerNewProduct.actualizarProducto(this);
          ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
          new ControllerNewProduct().paraBotonActualizar(tablaNProductos, this);
          botonCrear.setEnabled(true);
     }//GEN-LAST:event_botonActualizaActionPerformed

     private void tablaNProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNProductosMouseReleased
          new ControllerNewProduct().filaSeleccionada(tablaNProductos, this);
          campoIdProveedor.setEditable(true);
          botonCrear.setEnabled(false);
          ControllerNewProduct.mandaDatosCampos(tablaNProductos, this);
     }//GEN-LAST:event_tablaNProductosMouseReleased

     private void campoIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdKeyReleased
          labelId.setText("Id");
          labelId.setForeground(Color.BLACK);
     }//GEN-LAST:event_campoIdKeyReleased

     private void campoPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyReleased
          labelPrecio.setText("Precio");
          labelPrecio.setForeground(Color.BLACK);
     }//GEN-LAST:event_campoPrecioKeyReleased

     private void campoCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyReleased
          labelCantidad.setText("Cantidad");
          labelCantidad.setForeground(Color.BLACK);
     }//GEN-LAST:event_campoCantidadKeyReleased

     private void botonLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLlaveActionPerformed
       new ControllerNewProduct().activacionDeLlave(this);
     }//GEN-LAST:event_botonLlaveActionPerformed

     private void botonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmaActionPerformed
         ControllerNewProduct.confirmar(this);
         ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
         tablaNProductos.setSelectionMode(0);
         campoIdProveedor.setEditable(false);
         botonCrear.setEnabled(true);
         botonConfirma.setEnabled(false);
     }//GEN-LAST:event_botonConfirmaActionPerformed

     private void tablaNProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaNProductosKeyReleased
          new ControllerNewProduct().filaSeleccionada(tablaNProductos, this);
          campoIdProveedor.setEditable(true);
          botonCrear.setEnabled(false);
          ControllerNewProduct.mandaDatosCampos(tablaNProductos, this);
     }//GEN-LAST:event_tablaNProductosKeyReleased

     private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
               ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText()); 
               botonCrear.setEnabled(false);
                    if(campoBuscar.getText().isEmpty()){
                          ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
                         botonCrear.setEnabled(true);
          }
     }//GEN-LAST:event_campoBuscarKeyReleased

     private void containerComponentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerComponentsMouseEntered
            
          if(actualizame==0){
               ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
                actualizame++;
              }
     }//GEN-LAST:event_containerComponentsMouseEntered

     private void containerComponentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerComponentsMouseClicked
          tablaNProductos.setSelectionMode(0);
          botonConfirma.setEnabled(false);
     }//GEN-LAST:event_containerComponentsMouseClicked

     private void campoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerNewProduct.bloqueaLetrasCantidad(keyNumeros, evt);
     }//GEN-LAST:event_campoCantidadKeyTyped

     private void campoPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerNewProduct.bloqueaLetrasPrecio(keyNumeros, evt);
     }//GEN-LAST:event_campoPrecioKeyTyped

      private void campoBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyTyped
          
      }//GEN-LAST:event_campoBuscarKeyTyped

      private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
            ControllerNewProduct.subir(this, tablaNProductos);
            ControllerNewProduct.borrarCampos(this);
      }//GEN-LAST:event_botonCrearActionPerformed

      private void tablaNProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaNProductosKeyPressed
            ControllerNewProduct.mandaDatosCampos(tablaNProductos, this);
      }//GEN-LAST:event_tablaNProductosKeyPressed

      private void filtroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroIdActionPerformed
            seleccionFiltrada = filtroId.getText();
            ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
      }//GEN-LAST:event_filtroIdActionPerformed

      private void filtroSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroSeccionActionPerformed
           seleccionFiltrada = filtroSeccion.getText();
            ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
      }//GEN-LAST:event_filtroSeccionActionPerformed

      private void filtroDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroDescActionPerformed
            seleccionFiltrada = filtroDesc.getText();
            ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
      }//GEN-LAST:event_filtroDescActionPerformed

      private void filtroMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroMarcaActionPerformed
            seleccionFiltrada = filtroMarca.getText();
            ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());   
      }//GEN-LAST:event_filtroMarcaActionPerformed

     public String getCampoIdProveedor() {
          return campoIdProveedor.getText();
     }

     public void setCampoIdProveedor(String campoIdProveedor) {
          this.campoIdProveedor.setText(campoIdProveedor);
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

     public String getCampoCantidad() {
          return campoCantidad.getText();
     }

     public void setCampoCantidad(String texto) {
          campoCantidad.setText(texto);
     }

     public String getCampoDesc() {
          return campoDesc.getText();
     }

     public void setCampoDesc(String texto) {
          campoDesc.setText(texto);
     }

     public String getCampoEdadDirigida() {
          return campoEdadDirigida.getText();
     }

     public void setCampoEdadDirigida(String texto) {
          campoEdadDirigida.setText(texto);
     }

     public String getCampoId() {
          return campoId.getText();
     }

     public void setCampoId(String texto) {
          campoId.setText(texto);
     }

     public String getCampoMarca() {
          return campoMarca.getText();
     }

     public void setCampoMarca(String texto) {
          campoMarca.setText(texto);
     }

     public String getCampoPrecio() {
          return campoPrecio.getText();
     }

     public void setCampoPrecio(String texto) {
          campoPrecio.setText(texto);
     }

     public String getCampoTalla() {
          return campoTalla.getText();
     }

     public void setCampoTalla(String texto) {
          campoTalla.setText(texto);
     }

     public String getCampoSeccion() {
          return campoSeccion.getText();
     }

     public void setCampoSeccion(String texto) {
          campoSeccion.setText(texto);
     }

     public String getCampoSexo() {
          return campoSexo.getText();
     }

     public void setCampoSexo(String texto) {
          campoSexo.setText(texto);
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
          campoId.setEditable(act);
     }

     public String getCampoVendido() {
          return campoVendido.getText();
     }

     public void setCampoVendido(String texto) {
          this.campoVendido.setText(texto);
     }

     public static int getActu(){
          return actualizame;
     }

     public static void setActualizame(int numero){
          actualizame = numero;
     }

     public void setActualiza(boolean act) {
          botonActualiza.setEnabled(act);
     }

     public void setConfirmaVendido(boolean act) {
          botonConfirma.setEnabled(act);
     }

     public void dameIcono(ImageIcon icon){
          botonLlave.setIcon(icon);
     }

     public String getCampoBuscar() {
          if(!campoBuscar.getText().equals("") || !campoBuscar.getText().equals("") || !campoBuscar.getText().equals(null)){
             return campoBuscar.getText();  
          }
          else{
               return null;
          }
     }

     public void setCampoBuscar(String texto) {
          this.campoBuscar.setText(texto);
     }
     
     public String getOrdenadoSeleccionado(){
          return seleccionFiltrada;
     }


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botonActualiza;
      private javax.swing.JButton botonConfirma;
      private javax.swing.JButton botonCrear;
      private javax.swing.JButton botonEliminar;
      private javax.swing.JButton botonLimpiaCampos;
      private javax.swing.JButton botonLlave;
      private javax.swing.JTextField campoBuscar;
      private javax.swing.JTextField campoCantidad;
      private javax.swing.JTextField campoDesc;
      private javax.swing.JTextField campoEdadDirigida;
      private javax.swing.JTextField campoId;
      private javax.swing.JTextField campoIdProveedor;
      private javax.swing.JTextField campoMarca;
      private javax.swing.JTextField campoPrecio;
      private javax.swing.JTextField campoSeccion;
      private javax.swing.JTextField campoSexo;
      private javax.swing.JTextField campoTalla;
      private javax.swing.JTextField campoVendido;
      private javax.swing.JPanel containerComponents;
      private javax.swing.JRadioButton filtroDesc;
      private javax.swing.JRadioButton filtroId;
      private javax.swing.JRadioButton filtroMarca;
      private javax.swing.JRadioButton filtroSeccion;
      private javax.swing.ButtonGroup grupo;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JLabel labelCantidad;
      private javax.swing.JLabel labelDesc;
      private javax.swing.JLabel labelEdadDirigida;
      private javax.swing.JLabel labelId;
      private javax.swing.JLabel labelIdProveedor;
      private javax.swing.JLabel labelMarca;
      private javax.swing.JLabel labelNombreEmpresa;
      private javax.swing.JLabel labelPrecio;
      private javax.swing.JLabel labelSeccion;
      private javax.swing.JLabel labelSexo;
      private javax.swing.JLabel labelTalla;
      private javax.swing.JLabel labelVendido;
      private static javax.swing.JTable tablaNProductos;
      // End of variables declaration//GEN-END:variables

    
     

      

}
