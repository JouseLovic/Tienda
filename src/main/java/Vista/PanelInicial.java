
package Vista;

import Controlador.controllerInicial;
import Vista_Formulario.PanelNuevoProducto;

import java.awt.*;
import javax.swing.ImageIcon;
public class PanelInicial extends javax.swing.JPanel {

     private static boolean state = true;
     private PanelProveedores proveedor = new PanelProveedores();

     public PanelInicial() {
          initComponents();
          PanelNuevoProducto.setIsVisible(false);
          PanelProveedores.setIsVisibleProv(false);
     }

     
     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            contenedorFacturas = new javax.swing.JPanel();
            labelFacturas = new javax.swing.JLabel();
            containerClients = new javax.swing.JPanel();
            labelClientes = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            containerProveedores = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            labelReporte = new javax.swing.JLabel();

            setLayout(new java.awt.BorderLayout());

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(null);

            contenedorFacturas.setBackground(new java.awt.Color(255, 255, 255));
            contenedorFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        contenedorFacturasMouseReleased(evt);
                  }
            });
            contenedorFacturas.setLayout(new java.awt.BorderLayout());

            labelFacturas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelFacturas.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\401182.png")); // NOI18N
            contenedorFacturas.add(labelFacturas, java.awt.BorderLayout.CENTER);

            jPanel1.add(contenedorFacturas);
            contenedorFacturas.setBounds(360, 210, 220, 190);

            containerClients.setBackground(new java.awt.Color(255, 255, 255));
            containerClients.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        containerClientsMouseReleased(evt);
                  }
            });
            containerClients.setLayout(new java.awt.BorderLayout());

            labelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelClientes.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\5906150.png")); // NOI18N
            containerClients.add(labelClientes, java.awt.BorderLayout.CENTER);

            jPanel1.add(containerClients);
            containerClients.setBounds(880, 210, 210, 190);

            jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Lista de facturas");
            jPanel1.add(jLabel3);
            jLabel3.setBounds(360, 150, 250, 40);

            jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Lista de clientes");
            jPanel1.add(jLabel4);
            jLabel4.setBounds(870, 170, 240, 30);

            containerProveedores.setBackground(new java.awt.Color(255, 255, 255));
            containerProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        containerProveedoresMouseReleased(evt);
                  }
            });
            containerProveedores.setLayout(new java.awt.BorderLayout());

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\Proveedor.png")); // NOI18N
            containerProveedores.add(jLabel1, java.awt.BorderLayout.CENTER);

            jPanel1.add(containerProveedores);
            containerProveedores.setBounds(370, 610, 220, 210);

            jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Lista de proveedores");
            jPanel1.add(jLabel5);
            jLabel5.setBounds(330, 550, 310, 50);

            jPanel2.setBackground(new java.awt.Color(51, 51, 51));
            jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            labelReporte.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
            labelReporte.setForeground(new java.awt.Color(255, 255, 255));
            labelReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelReporte.setText("Reportar errores");
            labelReporte.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        labelReporteMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        labelReporteMouseExited(evt);
                  }
            });
            jPanel2.add(labelReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 40));

            jPanel1.add(jPanel2);
            jPanel2.setBounds(-10, 840, 1310, 130);

            add(jPanel1, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

      private void containerClientsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerClientsMouseReleased
            controllerInicial.presionaClientes();
      }//GEN-LAST:event_containerClientsMouseReleased

      private void contenedorFacturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseReleased
            controllerInicial.presionaFacturas();
      }//GEN-LAST:event_contenedorFacturasMouseReleased

      private void containerProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerProveedoresMouseReleased
            controllerInicial.presionaProveedores();
      }//GEN-LAST:event_containerProveedoresMouseReleased

      private void labelReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReporteMouseEntered
            labelReporte.setForeground(Color.MAGENTA);
      }//GEN-LAST:event_labelReporteMouseEntered

      private void labelReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReporteMouseExited
            labelReporte.setForeground(Color.WHITE);
      }//GEN-LAST:event_labelReporteMouseExited


      public boolean getState(){
            return state;
      }

      public static void setState(boolean states){
            state = states;
      }
      
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel containerClients;
      private javax.swing.JPanel containerProveedores;
      private javax.swing.JPanel contenedorFacturas;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JLabel labelClientes;
      private javax.swing.JLabel labelFacturas;
      private javax.swing.JLabel labelReporte;
      // End of variables declaration//GEN-END:variables
}
