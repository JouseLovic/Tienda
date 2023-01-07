package Vista;

import java.io.File;
import javax.swing.JFileChooser;

public class PanelProveedores extends javax.swing.JFrame {

      public PanelProveedores() {
            initComponents();
            this.setTitle("Proveedores");
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      }

    
      @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tablaProveedores = new javax.swing.JTable();
            jLabel1 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jTextField3 = new javax.swing.JTextField();
            jTextField4 = new javax.swing.JTextField();
            jTextField5 = new javax.swing.JTextField();
            jLabel7 = new javax.swing.JLabel();
            jTextField6 = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jPanel1MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jPanel1MouseEntered(evt);
                  }
            });
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nombre", "Cedula", "Empresa", "Email"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tablaProveedoresMouseClicked(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        tablaProveedoresMouseReleased(evt);
                  }
            });
            jScrollPane1.setViewportView(tablaProveedores);
            if (tablaProveedores.getColumnModel().getColumnCount() > 0) {
                  tablaProveedores.getColumnModel().getColumn(2).setResizable(false);
                  tablaProveedores.getColumnModel().getColumn(3).setResizable(false);
            }

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, 770));

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default-avatar.png"))); // NOI18N
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 230, 230));

            jButton1.setText("Cambiar foto");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });
            jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 140, 30));

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Nombre");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 120, 30));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Cedula");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 130, 30));

            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Empresa");
            jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 130, 30));

            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Articulos");
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, 120, 30));

            jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Email");
            jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 130, 30));
            jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 180, 30));
            jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 180, 30));
            jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 220, 30));
            jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 200, 30));
            jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, 220, 30));

            jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 0, 0));
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("Id ");
            jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 90, 30));
            jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 180, 30));
            jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 40, 20));
            jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 790, 50, 30));

            getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void tablaProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseReleased
           
      }//GEN-LAST:event_tablaProveedoresMouseReleased

      private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked
         
            
      }//GEN-LAST:event_tablaProveedoresMouseClicked

      private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
            
      }//GEN-LAST:event_jPanel1MouseEntered

      private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
            
      }//GEN-LAST:event_jPanel1MouseClicked

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           JFileChooser fileC = new JFileChooser();
           fileC.setCurrentDirectory(new File(""));

            int responce = fileC.showOpenDialog(null);

            if(responce == JFileChooser.APPROVE_OPTION){




            }


      }//GEN-LAST:event_jButton1ActionPerformed

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton1;
      private javax.swing.JLabel jLabel1;
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
      private javax.swing.JTextField jTextField1;
      private javax.swing.JTextField jTextField2;
      private javax.swing.JTextField jTextField3;
      private javax.swing.JTextField jTextField4;
      private javax.swing.JTextField jTextField5;
      private javax.swing.JTextField jTextField6;
      private javax.swing.JTable tablaProveedores;
      // End of variables declaration//GEN-END:variables
}
