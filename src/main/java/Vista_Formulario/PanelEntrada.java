
package Vista_Formulario;

import javax.swing.JTable;
import javax.swing.JTextField;

public class PanelEntrada extends javax.swing.JPanel {

  
     public PanelEntrada() {
          initComponents();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          labelTitulo = new javax.swing.JLabel();
          labelFactura = new javax.swing.JLabel();
          labelFecha = new javax.swing.JLabel();
          labelCodigoProducto = new javax.swing.JLabel();
          labelCantidad = new javax.swing.JLabel();
          jScrollPane1 = new javax.swing.JScrollPane();
          tablaEntradas = new javax.swing.JTable();
          labelDesc = new javax.swing.JLabel();
          labelPrecio = new javax.swing.JLabel();
          botonCancelar = new javax.swing.JButton();
          botonLimpiarCampos = new javax.swing.JButton();
          botonSubirF = new javax.swing.JButton();
          campoNFactura = new javax.swing.JTextField();
          campoFecha = new javax.swing.JTextField();
          campoCodigoProducto = new javax.swing.JTextField();
          campoCantidad = new javax.swing.JTextField();
          campoDescripcion = new javax.swing.JTextField();
          campoPrecio = new javax.swing.JTextField();
          botonLimpiaTabla = new javax.swing.JButton();

          setLayout(new java.awt.BorderLayout());

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));
          jPanel1.setLayout(null);

          labelTitulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
          labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
          labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelTitulo.setText("Entrada de productos");
          jPanel1.add(labelTitulo);
          labelTitulo.setBounds(20, 10, 230, 90);

          labelFactura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelFactura.setForeground(new java.awt.Color(0, 0, 0));
          labelFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelFactura.setText("N° de factura");
          jPanel1.add(labelFactura);
          labelFactura.setBounds(240, 140, 130, 30);

          labelFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelFecha.setForeground(new java.awt.Color(0, 0, 0));
          labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelFecha.setText("Fecha");
          jPanel1.add(labelFecha);
          labelFecha.setBounds(600, 140, 110, 30);

          labelCodigoProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelCodigoProducto.setForeground(new java.awt.Color(0, 0, 0));
          labelCodigoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelCodigoProducto.setText("Codigo del producto");
          jPanel1.add(labelCodigoProducto);
          labelCodigoProducto.setBounds(880, 140, 200, 30);

          labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
          labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelCantidad.setText("Cantidad");
          jPanel1.add(labelCantidad);
          labelCantidad.setBounds(930, 280, 120, 30);

          tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "N° de factura", "Fecha", "Descripcion", "Precio", "Codigo de producto", "Cantidad"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          tablaEntradas.getTableHeader().setReorderingAllowed(false);
          tablaEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tablaEntradasMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(tablaEntradas);

          jPanel1.add(jScrollPane1);
          jScrollPane1.setBounds(30, 490, 1210, 420);

          labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelDesc.setForeground(new java.awt.Color(0, 0, 0));
          labelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelDesc.setText("Descripción");
          jPanel1.add(labelDesc);
          labelDesc.setBounds(540, 270, 220, 40);

          labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
          labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelPrecio.setText("Precio");
          jPanel1.add(labelPrecio);
          labelPrecio.setBounds(260, 280, 90, 30);

          botonCancelar.setText("Cancelar");
          botonCancelar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonCancelarActionPerformed(evt);
               }
          });
          jPanel1.add(botonCancelar);
          botonCancelar.setBounds(230, 410, 150, 50);

          botonLimpiarCampos.setText("Limpiar campos");
          botonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLimpiarCamposActionPerformed(evt);
               }
          });
          jPanel1.add(botonLimpiarCampos);
          botonLimpiarCampos.setBounds(580, 410, 150, 50);

          botonSubirF.setText("Subir factura");
          botonSubirF.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonSubirFActionPerformed(evt);
               }
          });
          jPanel1.add(botonSubirF);
          botonSubirF.setBounds(910, 410, 150, 50);
          jPanel1.add(campoNFactura);
          campoNFactura.setBounds(210, 190, 190, 40);
          jPanel1.add(campoFecha);
          campoFecha.setBounds(560, 190, 190, 40);
          jPanel1.add(campoCodigoProducto);
          campoCodigoProducto.setBounds(870, 190, 230, 40);
          jPanel1.add(campoCantidad);
          campoCantidad.setBounds(870, 330, 230, 40);
          jPanel1.add(campoDescripcion);
          campoDescripcion.setBounds(560, 330, 200, 40);
          jPanel1.add(campoPrecio);
          campoPrecio.setBounds(210, 330, 190, 40);

          botonLimpiaTabla.setText("limpiar tabla");
          botonLimpiaTabla.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLimpiaTablaActionPerformed(evt);
               }
          });
          jPanel1.add(botonLimpiaTabla);
          botonLimpiaTabla.setBounds(1110, 40, 130, 40);

          add(jPanel1, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void tablaEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntradasMouseClicked
          
          
          
          
     }//GEN-LAST:event_tablaEntradasMouseClicked

     private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
          
          
          
          
     }//GEN-LAST:event_botonCancelarActionPerformed

     private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarCamposActionPerformed
         
          
          
     }//GEN-LAST:event_botonLimpiarCamposActionPerformed

     private void botonSubirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFActionPerformed
         
          
          
     }//GEN-LAST:event_botonSubirFActionPerformed

     private void botonLimpiaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaTablaActionPerformed
          
          
          
          
     }//GEN-LAST:event_botonLimpiaTablaActionPerformed

     public String getCampoCantidad() {
          return campoCantidad.getText();
     }

     public String getCampoCodigoProducto() {
          return campoCodigoProducto.getText();
     }

     public String getCampoDescripcion() {
          return campoDescripcion.getText();
     }

     public String getCampoFecha() {
          return campoFecha.getText();
     }

     public String getCampoNFactura() {
          return campoNFactura.getText();
     }

     public Double getCampoPrecio() {
          double precio = Double.parseDouble(campoPrecio.getText());
          return precio;
     }

     public int getTablaFacturas() {
          return tablaEntradas.getSelectedRow();
     }


     
     
     
     
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton botonCancelar;
     private javax.swing.JButton botonLimpiaTabla;
     private javax.swing.JButton botonLimpiarCampos;
     private javax.swing.JButton botonSubirF;
     private javax.swing.JTextField campoCantidad;
     private javax.swing.JTextField campoCodigoProducto;
     private javax.swing.JTextField campoDescripcion;
     private javax.swing.JTextField campoFecha;
     private javax.swing.JTextField campoNFactura;
     private javax.swing.JTextField campoPrecio;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel labelCantidad;
     private javax.swing.JLabel labelCodigoProducto;
     private javax.swing.JLabel labelDesc;
     private javax.swing.JLabel labelFactura;
     private javax.swing.JLabel labelFecha;
     private javax.swing.JLabel labelPrecio;
     private javax.swing.JLabel labelTitulo;
     private javax.swing.JTable tablaEntradas;
     // End of variables declaration//GEN-END:variables
}
