
package Vista;

import Controlador.controllerInicial;
import Vista_Formulario.*;
import Vista.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class PanelInicial extends javax.swing.JPanel {

     private static boolean state = true;
     private WindowVendors proveedor = new WindowVendors();

     public PanelInicial() {
          initComponents();
          PanelNewProduct.setIsVisible(false);
          WindowVendors.setIsVisibleProv(false);
     }

     
     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            contenedorFacturas = new javax.swing.JPanel();
            labelFactura = new javax.swing.JLabel();
            containerClients = new javax.swing.JPanel();
            labelCliente = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            containerProveedores = new javax.swing.JPanel();
            labelProveedor = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            labelReporte = new javax.swing.JLabel();

            setLayout(new java.awt.BorderLayout());

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(null);

            contenedorFacturas.setBackground(new java.awt.Color(255, 255, 255));
            contenedorFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        contenedorFacturasMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        contenedorFacturasMouseExited(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        contenedorFacturasMouseReleased(evt);
                  }
            });
            contenedorFacturas.setLayout(new java.awt.BorderLayout());

            labelFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/401182.png"))); // NOI18N
            labelFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            contenedorFacturas.add(labelFactura, java.awt.BorderLayout.CENTER);

            jPanel1.add(contenedorFacturas);
            contenedorFacturas.setBounds(360, 210, 220, 190);

            containerClients.setBackground(new java.awt.Color(255, 255, 255));
            containerClients.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        containerClientsMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        containerClientsMouseExited(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        containerClientsMouseReleased(evt);
                  }
            });
            containerClients.setLayout(new java.awt.BorderLayout());

            labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5906150.png"))); // NOI18N
            containerClients.add(labelCliente, java.awt.BorderLayout.CENTER);

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
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        containerProveedoresMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        containerProveedoresMouseExited(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        containerProveedoresMouseReleased(evt);
                  }
            });
            containerProveedores.setLayout(new java.awt.BorderLayout());

            labelProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proveedor.png"))); // NOI18N
            labelProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            containerProveedores.add(labelProveedor, java.awt.BorderLayout.CENTER);

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

      private void containerClientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerClientsMouseExited
            new controllerInicial().fueraDeClientes(this);
      }//GEN-LAST:event_containerClientsMouseExited

      private void containerClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerClientsMouseEntered
            new controllerInicial().dentroDeClientes(this);
      }//GEN-LAST:event_containerClientsMouseEntered

      private void contenedorFacturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseReleased
            controllerInicial.presionaFacturas();
      }//GEN-LAST:event_contenedorFacturasMouseReleased

      private void contenedorFacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseExited
            new controllerInicial().fueraDeFacturas(this);
      }//GEN-LAST:event_contenedorFacturasMouseExited

      private void contenedorFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseEntered
            new controllerInicial().dentroDeFacturas(this);
      }//GEN-LAST:event_contenedorFacturasMouseEntered

      private void containerProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerProveedoresMouseExited
           new controllerInicial().fueraDeProveedores(this);
      }//GEN-LAST:event_containerProveedoresMouseExited

      private void containerProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerProveedoresMouseEntered
            new controllerInicial().dentroDeProveedores(this);
      }//GEN-LAST:event_containerProveedoresMouseEntered

      private void containerProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerProveedoresMouseReleased
            controllerInicial.presionaProveedores();
      }//GEN-LAST:event_containerProveedoresMouseReleased

      private void labelReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReporteMouseEntered
            labelReporte.setForeground(Color.MAGENTA);
      }//GEN-LAST:event_labelReporteMouseEntered

      private void labelReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReporteMouseExited
            labelReporte.setForeground(Color.WHITE);
      }//GEN-LAST:event_labelReporteMouseExited

      public void setIconF(ImageIcon icono){
            this.labelFactura.setIcon(icono);
      }
      
      public void setIconC(ImageIcon icono){
            this.labelCliente.setIcon(icono);
      }
      
      public void setIconP(ImageIcon icono){
            this.labelProveedor.setIcon(icono);
      }

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
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JLabel labelCliente;
      private javax.swing.JLabel labelFactura;
      private javax.swing.JLabel labelProveedor;
      private javax.swing.JLabel labelReporte;
      // End of variables declaration//GEN-END:variables
}
