
package Vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import Controlador.ControllerListInventoryProducts;

public class Inventary extends javax.swing.JPanel {

     private GeneralInventary inventarioGeneral = new GeneralInventary();
     private static boolean actived = false;

     public Inventary() {
          initComponents();
          panelContenedor.add(inventarioGeneral, BorderLayout.CENTER);
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          panelCambiador = new javax.swing.JPanel();
          jLabel3 = new javax.swing.JLabel();
          botonModificar = new javax.swing.JButton();
          botonEliminar = new javax.swing.JButton();
          botonLimpiaCampos = new javax.swing.JButton();
          panelContenedor = new javax.swing.JPanel();

          setLayout(new java.awt.BorderLayout());

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));
          jPanel1.setForeground(new java.awt.Color(255, 255, 255));
          jPanel1.setLayout(new java.awt.BorderLayout());

          panelCambiador.setBackground(new java.awt.Color(255, 255, 255));
          panelCambiador.setMinimumSize(new java.awt.Dimension(569, 409));
          panelCambiador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          jLabel3.setForeground(new java.awt.Color(0, 0, 0));
          jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel3.setText("Inventario de productos");
          panelCambiador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 50));

          botonModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          botonModificar.setText("Modificar");
          botonModificar.setFocusable(false);
          botonModificar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonModificarActionPerformed(evt);
               }
          });
          panelCambiador.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 180, 40));

          botonEliminar.setText("Eliminar registro");
          botonEliminar.setFocusable(false);
          botonEliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonEliminarActionPerformed(evt);
               }
          });
          panelCambiador.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 170, 40));

          botonLimpiaCampos.setText("Limpiar campos");
          botonLimpiaCampos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLimpiaCamposActionPerformed(evt);
               }
          });
          panelCambiador.add(botonLimpiaCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 150, 40));

          jPanel1.add(panelCambiador, java.awt.BorderLayout.PAGE_START);

          panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
          panelContenedor.setLayout(new java.awt.BorderLayout());
          jPanel1.add(panelContenedor, java.awt.BorderLayout.CENTER);

          add(jPanel1, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
          
          if(actived == false){
               actived = true;
               panelContenedor.remove(inventarioGeneral);
               botonModificar.setText("General");
               new ModifyInventary().refrescaTablaM();
               ControllerListInventoryProducts.borrarPaneles(panelContenedor);
               ControllerListInventoryProducts.cambiarPanelInventarioModifi(this);
          }
          else{
                actived = false;
                botonModificar.setText("Modificar");
                inventarioGeneral.refrescaTablaG();
                ControllerListInventoryProducts.borrarPaneles(panelContenedor);
                ControllerListInventoryProducts.cambiarPanelInventarioG(this);
          }
     }//GEN-LAST:event_botonModificarActionPerformed

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerListInventoryProducts.eliminarRegistros(inventarioGeneral);
          inventarioGeneral.refrescaTablaG();
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonLimpiaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaCamposActionPerformed
          ControllerListInventoryProducts.borrarCampos(inventarioGeneral);
     }//GEN-LAST:event_botonLimpiaCamposActionPerformed

     public void setPanelContenedor(JPanel panel) {
          panelContenedor.add(panel, BorderLayout.CENTER);
          panelContenedor.revalidate();
          panelContenedor.repaint();
     }

     public boolean isActived() {
          return actived;
     }



     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton botonEliminar;
     private javax.swing.JButton botonLimpiaCampos;
     private javax.swing.JButton botonModificar;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel panelCambiador;
     private javax.swing.JPanel panelContenedor;
     // End of variables declaration//GEN-END:variables
}
