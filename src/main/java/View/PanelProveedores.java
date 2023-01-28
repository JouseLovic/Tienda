package View;

import Controllers.ControllerListVendors;

public class PanelProveedores extends javax.swing.JFrame {

      private static boolean isVisible;

      public PanelProveedores() {
            initComponents();
            this.setTitle("Vendor");
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ControllerListVendors.desactiva(this);
            ControllerListVendors.enviaDatosTabla(tablaProveedores);
            isVisible = true;
      }

    
      @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tablaProveedores = new javax.swing.JTable();
            jButton1 = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            campoNombre = new javax.swing.JTextField();
            campoCedula = new javax.swing.JTextField();
            campoEmail = new javax.swing.JTextField();
            campoEmpresa = new javax.swing.JTextField();
            campoArticulos = new javax.swing.JTextField();
            jLabel7 = new javax.swing.JLabel();
            campoId = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            campoFechaN = new javax.swing.JTextField();
            jLabel10 = new javax.swing.JLabel();
            labelPersona = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            addWindowFocusListener(new java.awt.event.WindowFocusListener() {
                  public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                        formWindowGainedFocus(evt);
                  }
                  public void windowLostFocus(java.awt.event.WindowEvent evt) {
                        formWindowLostFocus(evt);
                  }
            });
            addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowActivated(java.awt.event.WindowEvent evt) {
                        formWindowActivated(evt);
                  }
                  public void windowClosed(java.awt.event.WindowEvent evt) {
                        formWindowClosed(evt);
                  }
            });

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

            tablaProveedores = new javax.swing.JTable(){

                  public boolean isCellEditable(int rowIndex, int columnIndex){
                        return false;
                  }
            };
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
            tablaProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        tablaProveedoresKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        tablaProveedoresKeyReleased(evt);
                  }
            });
            jScrollPane1.setViewportView(tablaProveedores);
            if (tablaProveedores.getColumnModel().getColumnCount() > 0) {
                  tablaProveedores.getColumnModel().getColumn(2).setResizable(false);
                  tablaProveedores.getColumnModel().getColumn(3).setResizable(false);
            }

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, 770));

            jButton1.setText("Cambiar foto");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });
            jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 140, 30));

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Nombre");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 100, 30));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Cedula");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 110, 30));

            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Empresa");
            jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 110, 30));

            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Articulos");
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, 110, 30));

            jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Email");
            jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 110, 30));
            jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 180, 30));
            jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 180, 30));
            jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 220, 30));
            jPanel1.add(campoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 200, 30));
            jPanel1.add(campoArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, 220, 30));

            jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 0, 0));
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("Id ");
            jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 90, 30));
            jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 180, 30));
            jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 40, 20));
            jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 790, 50, 30));
            jPanel1.add(campoFechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 220, 30));

            jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 0, 0));
            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel10.setText("Fecha de nacimiento");
            jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 140, 30));

            labelPersona.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\default-avatar.png")); // NOI18N
            jPanel1.add(labelPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 240, 240));

            getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void tablaProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseReleased
            ControllerListVendors.mandaDatos(tablaProveedores, this);
      }//GEN-LAST:event_tablaProveedoresMouseReleased

      private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked
         ControllerListVendors.mandaDatos(tablaProveedores, this);
      }//GEN-LAST:event_tablaProveedoresMouseClicked

      private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

      }//GEN-LAST:event_jPanel1MouseEntered

      private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
            tablaProveedores.setSelectionMode(0);
      }//GEN-LAST:event_jPanel1MouseClicked

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           ControllerListVendors.cambiaImagen(this);
      }//GEN-LAST:event_jButton1ActionPerformed

      private void tablaProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProveedoresKeyReleased
            ControllerListVendors.mandaDatos(tablaProveedores, this);
      }//GEN-LAST:event_tablaProveedoresKeyReleased

      private void tablaProveedoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProveedoresKeyPressed
           ControllerListVendors.mandaDatos(tablaProveedores, this);
      }//GEN-LAST:event_tablaProveedoresKeyPressed

      private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
            setIsVisibleProv(true);
      }//GEN-LAST:event_formWindowGainedFocus

      private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
          setIsVisibleProv(false);
      }//GEN-LAST:event_formWindowLostFocus

      private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
          setIsVisibleProv(false);
      }//GEN-LAST:event_formWindowClosed

      private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
           setIsVisibleProv(true);
      }//GEN-LAST:event_formWindowActivated

      public String getCampoArticulos() {
            return campoArticulos.getText();
      }

      public void setCampoArticulos(String campoArticulos) {
            this.campoArticulos.setText(campoArticulos);
      }

      public String getCampoCedula() {
            return campoCedula.getText();
      }

      public void setCampoCedula(String campoCedula) {
            this.campoCedula.setText(campoCedula);
      }

      public String getCampoEmail() {
            return campoEmail.getText();
      }

      public void setCampoEmail(String campoEmail) {
            this.campoEmail.setText(campoEmail);
      }

      public String getCampoEmpresa() {
            return campoEmpresa.getText();
      }

      public void setCampoEmpresa(String campoEmpresa) {
            this.campoEmpresa.setText(campoEmpresa);
      }

      public String getCampoFechaN() {
            return campoFechaN.getText();
      }

      public void setCampoFechaN(String campoFechaN) {
            this.campoFechaN.setText(campoFechaN);
      }

      public String getCampoId() {
            return campoId.getText();
      }

      public void setCampoId(String campoId) {
            this.campoId.setText(campoId);;
      }

      public String getCampoNombre() {
            return campoNombre.getText();
      }

      public void setCampoNombre(String campoNombre) {
            this.campoNombre.setText(campoNombre);
      }

      //For validate if is visible or no this Window
      public static boolean getIsVisibleProv(){
            return isVisible;
      }

      public static void setIsVisibleProv(boolean state){
            isVisible = state;
      }

      //For update the table
      public static synchronized void chargeTable(){
            ControllerListVendors.enviaDatosTabla(tablaProveedores);
      }

      //those are for desactivated the JTextFields
      public void setEditableArt() {
            this.campoArticulos.setEditable(false);
      }
      public void setEditableCed() {
            this.campoCedula.setEditable(false);
      }
      public void setEditableEma() {
            this.campoEmail.setEditable(false);
      }
      public void setEditableEmp() {
            this.campoEmpresa.setEditable(false);
      }
      public void setEditableFec() {
            this.campoFechaN.setEditable(false);
      }
      public void setEditableId() {
            this.campoId.setEditable(false);
      }
      public void setEditableNomb() {
            this.campoNombre.setEditable(false);
      }


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JTextField campoArticulos;
      private javax.swing.JTextField campoCedula;
      private javax.swing.JTextField campoEmail;
      private javax.swing.JTextField campoEmpresa;
      private javax.swing.JTextField campoFechaN;
      private javax.swing.JTextField campoId;
      private javax.swing.JTextField campoNombre;
      private javax.swing.JButton jButton1;
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
      private javax.swing.JLabel labelPersona;
      private static javax.swing.JTable tablaProveedores;
      // End of variables declaration//GEN-END:variables
}
