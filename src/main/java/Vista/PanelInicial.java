
package Vista;

import Modelo.DB;

public class PanelInicial extends javax.swing.JPanel {

     
     public PanelInicial() {
          initComponents();
     }

     
     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();

            setLayout(new java.awt.BorderLayout());

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(null);

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_vector.png"))); // NOI18N
            jPanel1.add(jLabel1);
            jLabel1.setBounds(40, 20, 210, 230);

            jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 56)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Koulin");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(290, 30, 160, 50);

            add(jPanel1, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JPanel jPanel1;
      // End of variables declaration//GEN-END:variables
}
