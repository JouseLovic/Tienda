
package Vista_Register;

import javax.naming.ldap.Control;

import Controlador.ControllerNewProveedor;

public class PanelNuevoProveedor extends javax.swing.JPanel {

     private String confirmaId;
     private static int actualizame = 0;
     
     public PanelNuevoProveedor() {
          initComponents();
          ControllerNewProveedor.enviaDatosTabla(tablaProveedores);
     }

     @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            botonEliminar = new javax.swing.JButton();
            botonActualizar = new javax.swing.JButton();
            botonSubir = new javax.swing.JButton();
            botonLimpiaCampos = new javax.swing.JButton();
            botonQuitaCampos = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            botonColocaImagen = new javax.swing.JButton();
            campoNombre = new javax.swing.JTextField();
            campoEdad = new javax.swing.JTextField();
            campoCedula = new javax.swing.JTextField();
            campoEmpresa = new javax.swing.JTextField();
            campoArticulos = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            campoEmail = new javax.swing.JTextField();
            labelEmail = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            campoIdProv = new javax.swing.JTextField();
            jScrollPane2 = new javax.swing.JScrollPane();
            tablaProveedores = new javax.swing.JTable();

            setLayout(new java.awt.BorderLayout());

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

            jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Nombre");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 140, 30));

            jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Edad");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 130, 30));

            jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Proveedores");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, 40));

            jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Cedula");
            jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 150, 30));

            jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Empresa");
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 90, -1));

            jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Articulos que provee");
            jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 190, -1));

            botonEliminar.setText("Eliminar registro");
            botonEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonEliminarActionPerformed(evt);
                  }
            });
            jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 40));

            botonActualizar.setText("Actualizar datos");
            botonActualizar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonActualizarActionPerformed(evt);
                  }
            });
            jPanel1.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 140, 40));

            botonSubir.setText("Crear proveedor");
            botonSubir.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonSubirActionPerformed(evt);
                  }
            });
            jPanel1.add(botonSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 140, 40));

            botonLimpiaCampos.setText("Limpiar campos");
            botonLimpiaCampos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLimpiaCamposActionPerformed(evt);
                  }
            });
            jPanel1.add(botonLimpiaCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 40));

            botonQuitaCampos.setText("Quitar campos");
            botonQuitaCampos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonQuitaCamposActionPerformed(evt);
                  }
            });
            jPanel1.add(botonQuitaCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 32, 150, 40));

            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/default-avatar.png"))); // NOI18N
            jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 250, 230));

            botonColocaImagen.setText("Poner imagen");
            botonColocaImagen.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonColocaImagenActionPerformed(evt);
                  }
            });
            jPanel1.add(botonColocaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 130, -1));
            jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, 30));
            jPanel1.add(campoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 150, 30));
            jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 170, 30));
            jPanel1.add(campoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 210, 30));
            jPanel1.add(campoArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 280, 30));

            jLabel8.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(102, 102, 102));
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("-");
            jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 20, 20));
            jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 190, 30));

            labelEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelEmail.setForeground(new java.awt.Color(0, 0, 0));
            labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelEmail.setText("Email");
            jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, -1));

            jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 0, 0));
            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel10.setText("Id de proveedor");
            jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, 30));
            jPanel1.add(campoIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 140, 30));

            tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                  },
                  new String [] {
                        "id del proveedor", "Nombre", "Fecha de nacimiento", "Cedula", "Email", "Empresa", "Articulos"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tablaProveedoresMouseClicked(evt);
                  }
            });
            tablaProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        tablaProveedoresKeyReleased(evt);
                  }
            });
            jScrollPane2.setViewportView(tablaProveedores);

            jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1240, 530));

            add(jPanel1, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerNewProveedor.eliminarProveedor(tablaProveedores, this);
          ControllerNewProveedor.enviaDatosTabla(tablaProveedores);
          ControllerNewProveedor.borrarCampos(this);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        ControllerNewProveedor.actualizaProveedor(tablaProveedores, this);
        ControllerNewProveedor.enviaDatosTabla(tablaProveedores);
     }//GEN-LAST:event_botonActualizarActionPerformed

     private void botonSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirActionPerformed
          ControllerNewProveedor.subir(tablaProveedores, this);
          ControllerNewProveedor.enviaDatosTabla(tablaProveedores);
     }//GEN-LAST:event_botonSubirActionPerformed

     private void botonLimpiaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaCamposActionPerformed
          ControllerNewProveedor.borrarCampos(this);
          tablaProveedores.setSelectionMode(0);
          botonActualizar.setEnabled(false);
     }//GEN-LAST:event_botonLimpiaCamposActionPerformed

     private void botonQuitaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitaCamposActionPerformed
          
     }//GEN-LAST:event_botonQuitaCamposActionPerformed

     private void botonColocaImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColocaImagenActionPerformed
          
     }//GEN-LAST:event_botonColocaImagenActionPerformed

     private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
          tablaProveedores.setSelectionMode(0);               
     }//GEN-LAST:event_jPanel1MouseClicked

      private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
            if(actualizame == 0){
                  ControllerNewProveedor.enviaDatosTabla(tablaProveedores);
                  actualizame = 1;
            }
      }//GEN-LAST:event_jPanel1MouseEntered

      private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked
           ControllerNewProveedor.mandaDatos(tablaProveedores, this);
      }//GEN-LAST:event_tablaProveedoresMouseClicked

      private void tablaProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProveedoresKeyReleased
          ControllerNewProveedor.mandaDatos(tablaProveedores, this);
      }//GEN-LAST:event_tablaProveedoresKeyReleased
 
     
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

     public String getCampoEdad() {
          return campoEdad.getText();
     }

     public void setCampoEdad(String campoEdad) {
          this.campoEdad.setText(campoEdad);
     }

     public String getCampoEmpresa() {
          return campoEmpresa.getText();
     }

     public void setCampoEmpresa(String campoEmpresa) {
          this.campoEmpresa.setText(campoEmpresa);
     }

     public String getCampoNombre() {
          return campoNombre.getText();
     }

     public void setCampoNombre(String campoNombre) {
          this.campoNombre.setText(campoNombre);
     }

     public String getCampoEmail() {
          return campoEmail.getText();
     }

     public void setCampoEmail(String campoEmail) {
          this.campoEmail.setText(campoEmail);
     }

     public String getCampoIdProv() {
          return campoIdProv.getText();
     }

     public void setCampoIdProv(String campoIdProv) {
          this.campoIdProv.setText(campoIdProv);
     }

     public String getConfirmaId(){
          return confirmaId;
     }

     public void setConfirmaId(String texto){
          this.confirmaId = texto;
     }

      public static int getActualizame() {
            return actualizame;
      }

      public static void setActualizame(int actualizame) {
            PanelNuevoProveedor.actualizame = actualizame;
      }
    
     
    

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botonActualizar;
      private javax.swing.JButton botonColocaImagen;
      private javax.swing.JButton botonEliminar;
      private javax.swing.JButton botonLimpiaCampos;
      private javax.swing.JButton botonQuitaCampos;
      private javax.swing.JButton botonSubir;
      private javax.swing.JTextField campoArticulos;
      private javax.swing.JTextField campoCedula;
      private javax.swing.JTextField campoEdad;
      private javax.swing.JTextField campoEmail;
      private javax.swing.JTextField campoEmpresa;
      private javax.swing.JTextField campoIdProv;
      private javax.swing.JTextField campoNombre;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JLabel labelEmail;
      private javax.swing.JTable tablaProveedores;
      // End of variables declaration//GEN-END:variables
}
