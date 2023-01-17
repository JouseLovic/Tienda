
package Vista_Formulario;

import Controlador.ControllerSalidasP;

public class PanelSalida extends javax.swing.JPanel {

      int fila = 0;

     public PanelSalida() {
          initComponents();
          ControllerSalidasP.enviaDatosTabla(tablaSalidas, campoBuscar.getText());
          botonActualizar.setEnabled(false);
     }

     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            panelContenedor = new javax.swing.JPanel();
            labelTitulo = new javax.swing.JLabel();
            labelFactura = new javax.swing.JLabel();
            labelFecha = new javax.swing.JLabel();
            labelCedula = new javax.swing.JLabel();
            labelCantidad = new javax.swing.JLabel();
            labelCodigoProducto = new javax.swing.JLabel();
            labelPrecio = new javax.swing.JLabel();
            botonEliminar = new javax.swing.JButton();
            botonLimpiarCampos = new javax.swing.JButton();
            botonSubirF = new javax.swing.JButton();
            campoNFactura = new javax.swing.JTextField();
            campoFecha = new javax.swing.JTextField();
            campoCliente = new javax.swing.JTextField();
            campoCantidad = new javax.swing.JTextField();
            campoIdProducto = new javax.swing.JTextField();
            campoPrecio = new javax.swing.JTextField();
            labelBuscar = new javax.swing.JLabel();
            campoBuscar = new javax.swing.JTextField();
            botonActualizar = new javax.swing.JButton();
            campoDescripcion = new javax.swing.JTextField();
            labelDescripcion = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            tablaSalidas = new javax.swing.JTable();

            setLayout(new java.awt.BorderLayout());

            panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
            panelContenedor.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        panelContenedorMouseClicked(evt);
                  }
            });
            panelContenedor.setLayout(null);

            labelTitulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 28)); // NOI18N
            labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
            labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelTitulo.setText("Salida de productos");
            panelContenedor.add(labelTitulo);
            labelTitulo.setBounds(30, 10, 250, 70);

            labelFactura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelFactura.setForeground(new java.awt.Color(0, 0, 0));
            labelFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelFactura.setText("N° de factura");
            panelContenedor.add(labelFactura);
            labelFactura.setBounds(210, 100, 130, 30);

            labelFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelFecha.setForeground(new java.awt.Color(0, 0, 0));
            labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelFecha.setText("Fecha");
            panelContenedor.add(labelFecha);
            labelFecha.setBounds(560, 100, 110, 30);

            labelCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCedula.setForeground(new java.awt.Color(0, 0, 0));
            labelCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCedula.setText("Cedula del cliente");
            panelContenedor.add(labelCedula);
            labelCedula.setBounds(720, 100, 450, 30);

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidad.setText("Cantidad");
            panelContenedor.add(labelCantidad);
            labelCantidad.setBounds(980, 230, 120, 30);

            labelCodigoProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCodigoProducto.setForeground(new java.awt.Color(0, 0, 0));
            labelCodigoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCodigoProducto.setText("Codigo del producto");
            panelContenedor.add(labelCodigoProducto);
            labelCodigoProducto.setBounds(340, 230, 240, 40);

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelPrecio.setText("Precio");
            panelContenedor.add(labelPrecio);
            labelPrecio.setBounds(130, 240, 90, 30);

            botonEliminar.setText("Eliminar");
            botonEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonEliminarActionPerformed(evt);
                  }
            });
            panelContenedor.add(botonEliminar);
            botonEliminar.setBounds(230, 410, 150, 50);

            botonLimpiarCampos.setText("Limpiar campos");
            botonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLimpiarCamposActionPerformed(evt);
                  }
            });
            panelContenedor.add(botonLimpiarCampos);
            botonLimpiarCampos.setBounds(600, 410, 150, 50);

            botonSubirF.setText("Subir factura");
            botonSubirF.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonSubirFActionPerformed(evt);
                  }
            });
            panelContenedor.add(botonSubirF);
            botonSubirF.setBounds(920, 410, 150, 50);
            panelContenedor.add(campoNFactura);
            campoNFactura.setBounds(180, 150, 190, 40);
            panelContenedor.add(campoFecha);
            campoFecha.setBounds(510, 150, 200, 40);
            panelContenedor.add(campoCliente);
            campoCliente.setBounds(830, 150, 220, 40);

            campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyTyped(evt);
                  }
            });
            panelContenedor.add(campoCantidad);
            campoCantidad.setBounds(950, 280, 180, 40);
            panelContenedor.add(campoIdProducto);
            campoIdProducto.setBounds(360, 280, 200, 40);

            campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoPrecioKeyTyped(evt);
                  }
            });
            panelContenedor.add(campoPrecio);
            campoPrecio.setBounds(100, 280, 150, 40);

            labelBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelBuscar.setForeground(new java.awt.Color(0, 0, 0));
            labelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelBuscar.setText("Buscar factura:");
            panelContenedor.add(labelBuscar);
            labelBuscar.setBounds(900, 30, 140, 30);

            campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoBuscarKeyReleased(evt);
                  }
            });
            panelContenedor.add(campoBuscar);
            campoBuscar.setBounds(1040, 30, 220, 30);

            botonActualizar.setText("Actualizar");
            botonActualizar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonActualizarActionPerformed(evt);
                  }
            });
            panelContenedor.add(botonActualizar);
            botonActualizar.setBounds(470, 20, 160, 40);
            panelContenedor.add(campoDescripcion);
            campoDescripcion.setBounds(670, 280, 190, 40);

            labelDescripcion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDescripcion.setForeground(new java.awt.Color(0, 0, 0));
            labelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelDescripcion.setText("Descripcion");
            panelContenedor.add(labelDescripcion);
            labelDescripcion.setBounds(700, 230, 140, 40);

            tablaSalidas = new javax.swing.JTable(){

                  public boolean isCellEditable(int rowIndex, int ColumnIndex){
                        return false;
                  }
            };
            tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                  },
                  new String [] {
                        "Id de factura", "Codigo de producto", "Descripcion", "Fecha", "Precio", "Cantidad", "Cedula de cliente"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tablaSalidasMouseClicked(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        tablaSalidasMouseReleased(evt);
                  }
            });
            jScrollPane2.setViewportView(tablaSalidas);

            panelContenedor.add(jScrollPane2);
            jScrollPane2.setBounds(20, 480, 1230, 430);

            add(panelContenedor, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
            ControllerSalidasP.eliminar(tablaSalidas);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarCamposActionPerformed
            ControllerSalidasP.limpiaCampos(this);
     }//GEN-LAST:event_botonLimpiarCamposActionPerformed

     private void botonSubirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFActionPerformed
                ControllerSalidasP.insert(tablaSalidas, this);
                 
     }//GEN-LAST:event_botonSubirFActionPerformed

      private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
            ControllerSalidasP.actualizarSalida(tablaSalidas, fila, this);
            botonActualizar.setEnabled(false);
            ControllerSalidasP.limpiaCampos(this);
            tablaSalidas.setSelectionMode(0);
      }//GEN-LAST:event_botonActualizarActionPerformed

      private void panelContenedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenedorMouseClicked
            tablaSalidas.setSelectionMode(0);
      }//GEN-LAST:event_panelContenedorMouseClicked

      private void tablaSalidasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseReleased
            int fila = tablaSalidas.getSelectedRow();
            botonActualizar.setEnabled(true);
            ControllerSalidasP.mandaCampos(tablaSalidas, this);
      }//GEN-LAST:event_tablaSalidasMouseReleased

      private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked
           int fila = tablaSalidas.getSelectedRow();
            botonActualizar.setEnabled(true);
            ControllerSalidasP.mandaCampos(tablaSalidas, this);
      }//GEN-LAST:event_tablaSalidasMouseClicked

      private void campoPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyTyped
            int keyNumeros = evt.getKeyChar();
            ControllerSalidasP.bloqueaLetrasPrecio(keyNumeros, evt);
      }//GEN-LAST:event_campoPrecioKeyTyped

      private void campoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyTyped
            int keyNumeros = evt.getKeyChar();
            ControllerSalidasP.bloqueaLetrasPrecio(keyNumeros, evt);
      }//GEN-LAST:event_campoCantidadKeyTyped

      private void campoFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFechaKeyTyped
            
      }//GEN-LAST:event_campoFechaKeyTyped

      private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
           ControllerSalidasP.enviaDatosTabla(tablaSalidas, campoBuscar.getText());
             if(campoBuscar.getText().isEmpty()){
                  ControllerSalidasP.enviaDatosTabla(tablaSalidas, "");
             }
      }//GEN-LAST:event_campoBuscarKeyReleased

      public int getCampoCantidad() {
            return Integer.parseInt(campoCantidad.getText());
      }

      public void setCampoCantidad(String campoCantidad) {
            this.campoCantidad.setText(campoCantidad);
      }

      public String getCampoCliente() {
            return campoCliente.getText();
      }

      public void setCampoCliente(String campoCliente) {
            this.campoCliente.setText(campoCliente);
      }

      public String getCampoDescripcion() {
            return campoDescripcion.getText();
      }

      public void setCampoDescripcion(String campoDescripcion) {
            this.campoDescripcion.setText(campoDescripcion);
      }

      public String getCampoFecha() {
            return campoFecha.getText();
      }

      public void setCampoFecha(String campoFecha) {
            this.campoFecha.setText(campoFecha);
      }

      public String getCampoIdProducto() {
            return campoIdProducto.getText();
      }

      public void setCampoIdProducto(String campoIdProducto) {
            this.campoIdProducto.setText(campoIdProducto);
      }

      public String getCampoNFactura() {
            return campoNFactura.getText();
      }

      public String getCampoBuscar() {
            return campoBuscar.getText();
      }

      public void setCampoNFactura(String campoNFactura) {
            this.campoNFactura.setText(campoNFactura);
      }

      public Double getCampoPrecio() {
            return Double.parseDouble(campoPrecio.getText());
      }

      public void setCampoPrecio(String campoPrecio) {
            this.campoPrecio.setText(campoPrecio);
      }

      public static void setLabelCedula(String labelCedula) {
            PanelSalida.labelCedula.setText(labelCedula);;
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botonActualizar;
      private javax.swing.JButton botonEliminar;
      private javax.swing.JButton botonLimpiarCampos;
      private javax.swing.JButton botonSubirF;
      private javax.swing.JTextField campoBuscar;
      private javax.swing.JTextField campoCantidad;
      private javax.swing.JTextField campoCliente;
      private javax.swing.JTextField campoDescripcion;
      private javax.swing.JTextField campoFecha;
      private javax.swing.JTextField campoIdProducto;
      private javax.swing.JTextField campoNFactura;
      private javax.swing.JTextField campoPrecio;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JLabel labelBuscar;
      private javax.swing.JLabel labelCantidad;
      private static javax.swing.JLabel labelCedula;
      private javax.swing.JLabel labelCodigoProducto;
      private javax.swing.JLabel labelDescripcion;
      private javax.swing.JLabel labelFactura;
      private javax.swing.JLabel labelFecha;
      private javax.swing.JLabel labelPrecio;
      private javax.swing.JLabel labelTitulo;
      private javax.swing.JPanel panelContenedor;
      private static javax.swing.JTable tablaSalidas;
      // End of variables declaration//GEN-END:variables
}
