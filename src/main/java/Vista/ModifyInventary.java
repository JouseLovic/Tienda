
package Vista;

import javax.swing.JTable;
import java.awt.event.*;
import Controlador.ControllerListInventoryProducts;

public class ModifyInventary extends javax.swing.JPanel {

     
     public ModifyInventary() {
          initComponents();
          this.addMouseListener(new refresca());
          ControllerListInventoryProducts.enviaDatosTabla(tablaModificacion);
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          tablaModificacion = new javax.swing.JTable();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jLabel7 = new javax.swing.JLabel();
          jLabel8 = new javax.swing.JLabel();
          jLabel9 = new javax.swing.JLabel();
          jLabel10 = new javax.swing.JLabel();
          botonActualiza = new javax.swing.JButton();
          botonLimpiaCampos = new javax.swing.JButton();
          campoPrecio = new javax.swing.JTextField();
          campoId = new javax.swing.JTextField();
          campoDesc = new javax.swing.JTextField();
          campoTalla = new javax.swing.JTextField();
          campoMarca = new javax.swing.JTextField();
          campoTipo = new javax.swing.JTextField();
          campoEdadDirigida = new javax.swing.JTextField();
          campoCantidad = new javax.swing.JTextField();
          campoSexo = new javax.swing.JTextField();
          campoBusqueda = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();
          campoEliminaRegistro = new javax.swing.JButton();

          setLayout(new java.awt.BorderLayout());

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          tablaModificacion.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "Id", "Descripcion", "Talla", "Marca", "Tipo de producto", "Precio", "Edad dirigida", "Cantidad", "Sexo"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          tablaModificacion.getTableHeader().setReorderingAllowed(false);
          tablaModificacion.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tablaModificacionMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(tablaModificacion);

          jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1220, 470));

          jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel2.setForeground(new java.awt.Color(0, 0, 0));
          jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel2.setText("Id");
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 40, -1));

          jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel3.setForeground(new java.awt.Color(0, 0, 0));
          jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel3.setText("Descripción");
          jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 100, -1));

          jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel4.setForeground(new java.awt.Color(0, 0, 0));
          jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel4.setText("Talla");
          jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 60, -1));

          jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel5.setForeground(new java.awt.Color(0, 0, 0));
          jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel5.setText("Marca");
          jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 90, -1));

          jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel6.setForeground(new java.awt.Color(0, 0, 0));
          jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel6.setText("Tipo de producto");
          jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 150, -1));

          jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel7.setForeground(new java.awt.Color(0, 0, 0));
          jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel7.setText("Precio");
          jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

          jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel8.setForeground(new java.awt.Color(0, 0, 0));
          jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel8.setText("Edad dirigida");
          jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

          jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel9.setForeground(new java.awt.Color(0, 0, 0));
          jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel9.setText("Cantidad");
          jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

          jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel10.setForeground(new java.awt.Color(0, 0, 0));
          jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel10.setText("Sexo");
          jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

          botonActualiza.setText("Actualizar");
          botonActualiza.setFocusable(false);
          botonActualiza.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActualizaActionPerformed(evt);
               }
          });
          jPanel1.add(botonActualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 140, 40));

          botonLimpiaCampos.setText("Limpiar campos");
          botonLimpiaCampos.setFocusable(false);
          botonLimpiaCampos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLimpiaCamposActionPerformed(evt);
               }
          });
          jPanel1.add(botonLimpiaCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 140, 40));
          jPanel1.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 110, 30));
          jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 30));
          jPanel1.add(campoDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 150, 30));
          jPanel1.add(campoTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 100, 30));
          jPanel1.add(campoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 110, 30));
          jPanel1.add(campoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 160, 30));

          campoEdadDirigida.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    campoEdadDirigidaActionPerformed(evt);
               }
          });
          jPanel1.add(campoEdadDirigida, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, 30));
          jPanel1.add(campoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 100, 30));
          jPanel1.add(campoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 100, 30));
          jPanel1.add(campoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 230, 40));

          jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(0, 0, 0));
          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel1.setText("Busqueda por id");
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 170, -1));

          campoEliminaRegistro.setText("Eliminar");
          campoEliminaRegistro.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    campoEliminaRegistroActionPerformed(evt);
               }
          });
          jPanel1.add(campoEliminaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 150, 40));

          add(jPanel1, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void campoEdadDirigidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEdadDirigidaActionPerformed
          
     }//GEN-LAST:event_campoEdadDirigidaActionPerformed

     private void botonActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizaActionPerformed
         
     }//GEN-LAST:event_botonActualizaActionPerformed

     private void tablaModificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaModificacionMouseClicked
         
     }//GEN-LAST:event_tablaModificacionMouseClicked

     private void campoEliminaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEliminaRegistroActionPerformed
         
          
     }//GEN-LAST:event_campoEliminaRegistroActionPerformed

     private void botonLimpiaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaCamposActionPerformed
         
          
     }//GEN-LAST:event_botonLimpiaCamposActionPerformed

     public String getCampoBusqueda() {
          return campoBusqueda.getText();
     }

     public void setCampoBusqueda(String campoBusqueda) {
          this.campoBusqueda.setText(campoBusqueda);
     }

      public String getCampoTipo() {
          return campoTipo.getText();
     }

     public void setCampoTipo(String campoTipo) {
          this.campoBusqueda.setText(campoTipo);
     }
     
     public int getCampoCantidad() {
          int cantidad = Integer.parseInt(campoCantidad.getText());
          return cantidad;
     }

     public void setCampoCantidad(String campoCantidad) {
          this.campoCantidad.setText(campoCantidad);
     }

     public String getCampoDesc() {
          return campoDesc.getText();
     }

     public void setCampoDesc(String campoDesc) {
          this.campoDesc.setText(campoDesc);
     }

     public String getCampoEdadDirigida() {
          return campoEdadDirigida.getText();
     }

     public void setCampoEdadDirigida(String campoEdadDirigida) {
          this.campoEdadDirigida.setText(campoEdadDirigida);
     }

     public String getCampoId() {
          return campoId.getText();
     }

     public void setCampoId(String campoId) {
          this.campoId.setText(campoId);
     }

     public String getCampoMarca() {
          return campoMarca.getText();
     }

     public void setCampoMarca(String campoMarca) {
          this.campoMarca.setText(campoMarca);
     }

     public Double getCampoPrecio() {
          Double precio = Double.parseDouble(campoPrecio.getText());
          return precio;
     }

     public void setCampoPrecio(String campoPrecio) {
          this.campoPrecio.setText(campoPrecio);
     }

     public String getCampoSexo() {
          return campoSexo.getText();
     }

     public void setCampoSexo(String campoSexo) {
          this.campoSexo.setText(campoSexo);
     }

     public String getCampoTalla() {
          return campoTalla.getText();
     }

     public void setCampoTalla(String campoTalla) {
          this.campoTalla.setText(campoTalla);
     }

     public JTable getTablaModificacion() {
          return tablaModificacion;
     }

     public void refrescaTablaM(){
          ControllerListInventoryProducts.enviaDatosTabla(tablaModificacion);
     }

    class refresca extends MouseAdapter{
      
          @Override
          public void mouseEntered(MouseEvent e) {
                ControllerListInventoryProducts.enviaDatosTabla(tablaModificacion);
          }
          @Override
          public void mouseExited(MouseEvent e) {
               ControllerListInventoryProducts.enviaDatosTabla(tablaModificacion);
          }        
     }
     

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton botonActualiza;
     private javax.swing.JButton botonLimpiaCampos;
     private javax.swing.JTextField campoBusqueda;
     private javax.swing.JTextField campoCantidad;
     private javax.swing.JTextField campoDesc;
     private javax.swing.JTextField campoEdadDirigida;
     private javax.swing.JButton campoEliminaRegistro;
     private javax.swing.JTextField campoId;
     private javax.swing.JTextField campoMarca;
     private javax.swing.JTextField campoPrecio;
     private javax.swing.JTextField campoSexo;
     private javax.swing.JTextField campoTalla;
     private javax.swing.JTextField campoTipo;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel10;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JLabel jLabel9;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable tablaModificacion;
     // End of variables declaration//GEN-END:variables
}
