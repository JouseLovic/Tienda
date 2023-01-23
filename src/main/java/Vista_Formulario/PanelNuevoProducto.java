package Vista_Formulario;

import Controlador.ControllerNewProduct;
import ControladorThreads.ControllerProducts;

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
          ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
          campoBuscar.setText(null);
            if(ControllerNewProduct.state()==false){
               configDark();
            }
            isVisible = true;
          setEditableProveedor(false);
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
            labelPrecio = new javax.swing.JLabel();
            labelSeccion = new javax.swing.JLabel();
            labelMarca = new javax.swing.JLabel();
            labelCantidad = new javax.swing.JLabel();
            labelEdadDirigida = new javax.swing.JLabel();
            botonLimpiaCampos = new javax.swing.JButton();
            campoSexo = new javax.swing.JTextField();
            labelSexo = new javax.swing.JLabel();
            labelNombreEmpresa = new javax.swing.JLabel();
            botonEliminar = new javax.swing.JButton();
            botonActualiza = new javax.swing.JButton();
            botonLlave = new javax.swing.JButton();
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
            jScrollPane2 = new javax.swing.JScrollPane();
            tablaNProductos = new javax.swing.JTable();
            jSeparator1 = new javax.swing.JSeparator();
            jSeparator2 = new javax.swing.JSeparator();
            jSeparator3 = new javax.swing.JSeparator();
            jSeparator4 = new javax.swing.JSeparator();
            jSeparator5 = new javax.swing.JSeparator();
            jSeparator6 = new javax.swing.JSeparator();
            jSeparator7 = new javax.swing.JSeparator();
            jSeparator8 = new javax.swing.JSeparator();
            jSeparator9 = new javax.swing.JSeparator();
            jSeparator11 = new javax.swing.JSeparator();
            jLabel3 = new javax.swing.JLabel();
            campoCantidad = new javax.swing.JTextField();
            jSeparator12 = new javax.swing.JSeparator();
            botonEditar = new javax.swing.JButton();

            setLayout(new java.awt.BorderLayout());

            containerComponents.setBackground(new java.awt.Color(252, 252, 252));
            containerComponents.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        containerComponentsMouseClicked(evt);
                  }
            });
            containerComponents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            labelId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelId.setForeground(new java.awt.Color(0, 0, 0));
            labelId.setText("ID");
            containerComponents.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 210, 30));

            labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDesc.setForeground(new java.awt.Color(0, 0, 0));
            labelDesc.setText("Descripción");
            containerComponents.add(labelDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 270, 30));

            labelTalla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelTalla.setForeground(new java.awt.Color(0, 0, 0));
            labelTalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelTalla.setText("Talla");
            containerComponents.add(labelTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 60, -1));

            campoId.setBorder(null);
            campoId.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoIdKeyReleased(evt);
                  }
            });
            containerComponents.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 30));

            campoDesc.setBorder(null);
            containerComponents.add(campoDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 270, 30));

            campoTalla.setBorder(null);
            containerComponents.add(campoTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 140, 30));

            campoMarca.setBorder(null);
            containerComponents.add(campoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 30));

            campoSeccion.setBorder(null);
            containerComponents.add(campoSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 180, 30));

            campoPrecio.setBorder(null);
            campoPrecio.setDoubleBuffered(true);
            campoPrecio.setDragEnabled(true);
            campoPrecio.setOpaque(true);
            campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoPrecioKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoPrecioKeyTyped(evt);
                  }
            });
            containerComponents.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 160, 30));

            campoEdadDirigida.setBorder(null);
            containerComponents.add(campoEdadDirigida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 140, 30));

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setText("Precio");
            containerComponents.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 280, 30));

            labelSeccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSeccion.setForeground(new java.awt.Color(0, 0, 0));
            labelSeccion.setText("Seccion del producto");
            containerComponents.add(labelSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 180, 30));

            labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelMarca.setForeground(new java.awt.Color(0, 0, 0));
            labelMarca.setText("Marca");
            containerComponents.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 30));

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setText("Cantidad ");
            containerComponents.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 250, 30));

            labelEdadDirigida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelEdadDirigida.setForeground(new java.awt.Color(0, 0, 0));
            labelEdadDirigida.setText("Edad dirigida");
            containerComponents.add(labelEdadDirigida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 110, 30));

            botonLimpiaCampos.setText("Limpiar campos");
            botonLimpiaCampos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLimpiaCamposActionPerformed(evt);
                  }
            });
            containerComponents.add(botonLimpiaCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 180, 40));

            campoSexo.setBorder(null);
            campoSexo.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        campoSexoKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoSexoKeyReleased(evt);
                  }
            });
            containerComponents.add(campoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 80, 30));

            labelSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSexo.setForeground(new java.awt.Color(0, 0, 0));
            labelSexo.setText("Sexo");
            containerComponents.add(labelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 120, 30));

            labelNombreEmpresa.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
            labelNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelNombreEmpresa.setText("Gestion de inventario");
            containerComponents.add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

            botonEliminar.setText("Eliminar");
            botonEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonEliminarActionPerformed(evt);
                  }
            });
            containerComponents.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 170, 40));

            botonActualiza.setText("Actualizar");
            botonActualiza.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonActualizaActionPerformed(evt);
                  }
            });
            containerComponents.add(botonActualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 180, 40));

            botonLlave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            botonLlave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\demo\\src\\main\\java\\images\\llaveDesactivada.png")); // NOI18N
            botonLlave.setBorder(null);
            botonLlave.setBorderPainted(false);
            botonLlave.setContentAreaFilled(false);
            botonLlave.setFocusPainted(false);
            botonLlave.setFocusable(false);
            botonLlave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            botonLlave.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\demo\\src\\main\\java\\images\\llaveDesactivadaOscura.png")); // NOI18N
            botonLlave.setRequestFocusEnabled(false);
            botonLlave.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\demo\\src\\main\\java\\images\\llaveDesactivada.png")); // NOI18N
            botonLlave.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLlaveActionPerformed(evt);
                  }
            });
            containerComponents.add(botonLlave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 60, 50));

            botonConfirma.setText("Confirmar alta de pedido");
            botonConfirma.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonConfirmaActionPerformed(evt);
                  }
            });
            containerComponents.add(botonConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 180, 40));

            labelIdProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelIdProveedor.setForeground(new java.awt.Color(0, 0, 0));
            labelIdProveedor.setText("Id del proveedor");
            containerComponents.add(labelIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 170, 30));

            campoIdProveedor.setText("Ninguno");
            campoIdProveedor.setBorder(null);
            containerComponents.add(campoIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 180, 30));

            campoBuscar.setBorder(null);
            campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        campoBuscarKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoBuscarKeyReleased(evt);
                  }
            });
            containerComponents.add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 320, 40));

            jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("Buscar producto:");
            containerComponents.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 40));

            jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Ordernar por: ");
            containerComponents.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 140, 40));

            botonCrear.setText("Subir producto");
            botonCrear.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonCrearActionPerformed(evt);
                  }
            });
            containerComponents.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, 160, 40));

            filtroId.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroId);
            filtroId.setSelected(true);
            filtroId.setText("ID");
            filtroId.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroIdActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroId, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 50, 20));

            filtroDesc.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroDesc);
            filtroDesc.setText("Descripcion");
            filtroDesc.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroDescActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 150, -1));

            filtroSeccion.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroSeccion);
            filtroSeccion.setText("Seccion");
            filtroSeccion.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroSeccionActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 70, -1));

            filtroMarca.setBackground(new java.awt.Color(255, 255, 255));
            grupo.add(filtroMarca);
            filtroMarca.setText("Marca");
            filtroMarca.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        filtroMarcaActionPerformed(evt);
                  }
            });
            containerComponents.add(filtroMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 90, -1));

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

            containerComponents.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 1020, 340));

            jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 160, 20));

            jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 180, 20));

            jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 270, 20));

            jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 320, 20));

            jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 20));

            jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 140, 20));

            jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 80, 20));

            jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 20));

            jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, 20));

            jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 180, 20));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("$");
            containerComponents.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 20, 30));

            campoCantidad.setBorder(null);
            campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyReleased(evt);
                  }
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyTyped(evt);
                  }
            });
            containerComponents.add(campoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 180, 30));

            jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
            jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
            containerComponents.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 140, 20));

            botonEditar.setText("jButton1");
            containerComponents.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 13, 40, 30));

            add(containerComponents, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void botonLimpiaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaCamposActionPerformed
         ControllerNewProduct.borrarCampos(this);
         setEditableProveedor(false);
         new ControllerNewProduct().paraBotonLimpiar(tablaNProductos, this);
     }//GEN-LAST:event_botonLimpiaCamposActionPerformed

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerNewProduct.eliminar(tablaNProductos, this);
          ControllerNewProduct.borrarCampos(this);
          setEditableProveedor(false);
          ControllerNewProduct.paraBotonEliminar(tablaNProductos, this);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizaActionPerformed
          ControllerNewProduct.actualizarProducto(this);
          ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
          new ControllerNewProduct().paraBotonActualizar(tablaNProductos, this);
          setEditableProveedor(false);
     }//GEN-LAST:event_botonActualizaActionPerformed

     private void tablaNProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNProductosMouseReleased
          new ControllerNewProduct().filaSeleccionada(tablaNProductos, this);
          setEditableProveedor(true);
          ControllerNewProduct.mandaDatosCampos(tablaNProductos, this);
     }//GEN-LAST:event_tablaNProductosMouseReleased

     private void campoIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdKeyReleased
          ControllerNewProduct.labelDefault(labelId, "ID");
     }//GEN-LAST:event_campoIdKeyReleased

     private void campoPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyReleased
          ControllerNewProduct.labelDefault(labelPrecio, "Precio");
     }//GEN-LAST:event_campoPrecioKeyReleased

     private void campoCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyReleased
          ControllerNewProduct.labelDefault(labelCantidad, "Cantidad");
     }//GEN-LAST:event_campoCantidadKeyReleased

     private void botonLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLlaveActionPerformed
          new ControllerNewProduct().activacionDeLlave(this);
     }//GEN-LAST:event_botonLlaveActionPerformed

     private void botonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmaActionPerformed
         boolean selection = ControllerNewProduct.confirmar(this);
            if(selection) {
                ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText());
                tablaNProductos.setSelectionMode(0);
                setEditableProveedor(false);
                botonConfirma.setEnabled(false);
            }
     }//GEN-LAST:event_botonConfirmaActionPerformed

     private void tablaNProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaNProductosKeyReleased
          new ControllerNewProduct().filaSeleccionada(tablaNProductos, this);
          setEditableProveedor(true);
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

     private void containerComponentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerComponentsMouseClicked
          tablaNProductos.setSelectionMode(0);
          botonConfirma.setEnabled(false);
     }//GEN-LAST:event_containerComponentsMouseClicked

      private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
            ControllerNewProduct.subir(this, tablaNProductos, labelId);
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

      private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
           ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, campoBuscar.getText()); 
               botonCrear.setEnabled(false);
                    if(campoBuscar.getText().isEmpty()){
                          ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
                         botonCrear.setEnabled(true);
          }
      }//GEN-LAST:event_campoBuscarKeyPressed

      private void campoSexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSexoKeyReleased
            ControllerNewProduct.labelDefault(labelSexo, "Sexo");
      }//GEN-LAST:event_campoSexoKeyReleased

      private void campoPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerNewProduct.bloqueaLetrasPrecio(keyNumeros, evt);
      }//GEN-LAST:event_campoPrecioKeyTyped

      private void campoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerNewProduct.bloqueaLetrasCantidad(keyNumeros, evt);
      }//GEN-LAST:event_campoCantidadKeyTyped

      private void campoSexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSexoKeyPressed
           
      }//GEN-LAST:event_campoSexoKeyPressed

     public String getCampoIdProveedor() {
          return campoIdProveedor.getText();
     }

     public void setCampoIdProveedor(String campoIdProveedor) {
          this.campoIdProveedor.setText(campoIdProveedor);
     }


     public String getCampoCantidad() {
         if(campoCantidad.getText().equalsIgnoreCase("")) {
            return  String.valueOf(cantidadAux);
         }
         else {
             return campoCantidad.getText();
         }
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
         if(campoPrecio.getText().equalsIgnoreCase("")){
             return String.valueOf(precioAux);
         }
         else{
             return campoPrecio.getText();
         }

     }

     public void setCampoPrecio(String texto) {
          campoPrecio.setText(String.valueOf(texto));
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
          campoId.setBackground(Color.WHITE);
          campoId.setForeground(Color.BLACK);
          if(act==false){
             campoId.setForeground(Color.GRAY);
          }
     }

      public void setEditableProveedor(boolean act) {
          campoIdProveedor.setEditable(act);
          campoIdProveedor.setBackground(Color.WHITE);
          campoIdProveedor.setForeground(Color.BLACK);
          campoIdProveedor.setText(null);
          if(!act){
             campoIdProveedor.setForeground(Color.GRAY);
             campoIdProveedor.setText("Ninguno");
          }  
     }

     public String getVendido() {
          return vendido;
     }

     public void setVendido(String texto) {
          this.vendido = String.valueOf(texto);
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
          if(!campoBuscar.getText().equalsIgnoreCase("") || !campoBuscar.getText().equalsIgnoreCase("") || !campoBuscar.getText().equalsIgnoreCase(null)){
             return campoBuscar.getText();  
          }
          else{
               return "";
          }
     }

     public void setColorCampoProveedorFore(Color color){
          this.campoIdProveedor.setForeground(color);
     }

     public void setColorCampoProveedorBack(Color color){
          this.campoIdProveedor.setBackground(color);
     }

     public void setCampoBuscar(String texto) {
          this.campoBuscar.setText(texto);
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

    public void setRequestFocusCampoSexo(){
         this.campoSexo.requestFocus();
    }

    public void setRequestFocusCampoId(){
        this.campoId.requestFocus();
    }

    public static boolean getIsVisible(){
         return isVisible;
    }

    public static void setIsVisible(boolean state){
         isVisible = state;
    }

    public static synchronized void chargeTable(){
        ControllerNewProduct.enviaDatosTablaOrdenar(tablaNProductos, seleccionFiltrada, "");
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        PanelNuevoProducto.contador = contador;
    }

    public void configDark(){
          containerComponents.setBackground(new Color(47,47,47));
          jSeparator1.setForeground(Color.WHITE); jSeparator2.setForeground(Color.WHITE);
          jSeparator3.setForeground(Color.WHITE); jSeparator4.setForeground(Color.WHITE);
          jSeparator5.setForeground(Color.WHITE); jSeparator6.setForeground(Color.WHITE);
          jSeparator7.setForeground(Color.WHITE); jSeparator8.setForeground(Color.WHITE);
          jSeparator9.setForeground(Color.WHITE);
          jSeparator11.setForeground(Color.WHITE);
     }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botonActualiza;
      private javax.swing.JButton botonConfirma;
      private javax.swing.JButton botonCrear;
      private javax.swing.JButton botonEditar;
      private javax.swing.JButton botonEliminar;
      private javax.swing.JButton botonLimpiaCampos;
      private javax.swing.JButton botonLlave;
      private static javax.swing.JTextField campoBuscar;
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
      private javax.swing.JPanel containerComponents;
      private javax.swing.JRadioButton filtroDesc;
      private javax.swing.JRadioButton filtroId;
      private javax.swing.JRadioButton filtroMarca;
      private javax.swing.JRadioButton filtroSeccion;
      private javax.swing.ButtonGroup grupo;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JSeparator jSeparator11;
      private javax.swing.JSeparator jSeparator12;
      private javax.swing.JSeparator jSeparator2;
      private javax.swing.JSeparator jSeparator3;
      private javax.swing.JSeparator jSeparator4;
      private javax.swing.JSeparator jSeparator5;
      private javax.swing.JSeparator jSeparator6;
      private javax.swing.JSeparator jSeparator7;
      private javax.swing.JSeparator jSeparator8;
      private javax.swing.JSeparator jSeparator9;
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
      private static javax.swing.JTable tablaNProductos;
      // End of variables declaration//GEN-END:variables

    
     

      

}
