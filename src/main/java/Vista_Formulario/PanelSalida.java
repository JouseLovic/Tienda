
package Vista_Formulario;

import java.sql.*;
import javax.swing.JOptionPane;

import Controlador.ControllerSalidasP;

public class PanelSalida extends javax.swing.JPanel {

     public PanelSalida() {
          initComponents();
          ControllerSalidasP.enviaDatosTabla(tablaSalidas, "");
     }

     @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            panelContenedor = new javax.swing.JPanel();
            labelTitulo = new javax.swing.JLabel();
            labelFactura = new javax.swing.JLabel();
            labelFecha = new javax.swing.JLabel();
            labelCodigoProducto = new javax.swing.JLabel();
            labelCantidad = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tablaSalidas = new javax.swing.JTable();
            labelDesc = new javax.swing.JLabel();
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
            jLabel1 = new javax.swing.JLabel();

            setLayout(new java.awt.BorderLayout());

            panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
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
            labelFactura.setBounds(220, 100, 130, 30);

            labelFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelFecha.setForeground(new java.awt.Color(0, 0, 0));
            labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelFecha.setText("Fecha");
            panelContenedor.add(labelFecha);
            labelFecha.setBounds(560, 100, 110, 30);

            labelCodigoProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCodigoProducto.setForeground(new java.awt.Color(0, 0, 0));
            labelCodigoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCodigoProducto.setText("Cedula del cliente");
            panelContenedor.add(labelCodigoProducto);
            labelCodigoProducto.setBounds(840, 100, 200, 30);

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidad.setText("Cantidad");
            panelContenedor.add(labelCantidad);
            labelCantidad.setBounds(980, 230, 120, 30);

            tablaSalidas = new javax.swing.JTable(){

                  public boolean isCellEditable(int rowIndex, int columnIndex){
                        return false;
                  }
            };
            tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "N° de factura", "Codigo del producto", "Descripcion", "Fecha", "Precio", "Cantidad", "Id del cliente"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaSalidas.getTableHeader().setReorderingAllowed(false);
            tablaSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tablaSalidasMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(tablaSalidas);

            panelContenedor.add(jScrollPane1);
            jScrollPane1.setBounds(30, 490, 1210, 420);

            labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDesc.setForeground(new java.awt.Color(0, 0, 0));
            labelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelDesc.setText("Codigo del producto");
            panelContenedor.add(labelDesc);
            labelDesc.setBounds(340, 230, 240, 40);

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelPrecio.setText("Precio");
            panelContenedor.add(labelPrecio);
            labelPrecio.setBounds(120, 240, 90, 30);

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
            panelContenedor.add(campoCantidad);
            campoCantidad.setBounds(950, 280, 180, 40);
            panelContenedor.add(campoIdProducto);
            campoIdProducto.setBounds(360, 280, 200, 40);
            panelContenedor.add(campoPrecio);
            campoPrecio.setBounds(100, 280, 150, 40);

            labelBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelBuscar.setForeground(new java.awt.Color(0, 0, 0));
            labelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelBuscar.setText("Buscar factura:");
            panelContenedor.add(labelBuscar);
            labelBuscar.setBounds(900, 30, 140, 30);
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

            jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Descripcion");
            panelContenedor.add(jLabel1);
            jLabel1.setBounds(700, 230, 140, 40);

            add(panelContenedor, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked

     }//GEN-LAST:event_tablaSalidasMouseClicked

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarCamposActionPerformed

     }//GEN-LAST:event_botonLimpiarCamposActionPerformed

     private void botonSubirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFActionPerformed
                  try {
                        ControllerSalidasP.insertar(tablaSalidas, this);
                        ControllerSalidasP.enviaDatosTabla(tablaSalidas, "");
                  } catch (SQLIntegrityConstraintViolationException e) {
                        JOptionPane.showMessageDialog(null, "No puede introducir caracteres especiales o palabras en el precio o la cantidad. Revise si se ha equivocado en alguna parte del formulario. \n"+e.getMessage());
                  }
     }//GEN-LAST:event_botonSubirFActionPerformed

      private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        
      }//GEN-LAST:event_botonActualizarActionPerformed

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

      public void setCampoNFactura(String campoNFactura) {
            this.campoNFactura.setText(campoNFactura);
      }

      public Double getCampoPrecio() {
            return Double.parseDouble(campoPrecio.getText());
      }

      public void setCampoPrecio(String campoPrecio) {
            this.campoPrecio.setText(campoPrecio);
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
      private javax.swing.JLabel jLabel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JLabel labelBuscar;
      private javax.swing.JLabel labelCantidad;
      private javax.swing.JLabel labelCodigoProducto;
      private javax.swing.JLabel labelDesc;
      private javax.swing.JLabel labelFactura;
      private javax.swing.JLabel labelFecha;
      private javax.swing.JLabel labelPrecio;
      private javax.swing.JLabel labelTitulo;
      private javax.swing.JPanel panelContenedor;
      private static javax.swing.JTable tablaSalidas;
      // End of variables declaration//GEN-END:variables
}
