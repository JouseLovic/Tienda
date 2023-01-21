
package Vista_Register;

import javax.swing.ImageIcon;

import Controlador.ControllerNewProveedor;
import java.awt.Color;

public class PanelNuevoProveedor extends javax.swing.JPanel {

     private String confirmaId;
     private static int actualizame = 0;
     
     public PanelNuevoProveedor() {
          initComponents();
          ControllerNewProveedor.enviaDatosTabla(tablaProveedores);
     }

     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            labelCedula = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            botonEliminar = new javax.swing.JButton();
            botonActualizar = new javax.swing.JButton();
            botonSubir = new javax.swing.JButton();
            botonLimpiaCampos = new javax.swing.JButton();
            botonQuitaCampos = new javax.swing.JButton();
            labelPerson = new javax.swing.JLabel();
            botonColocaImagen = new javax.swing.JButton();
            campoNombre = new javax.swing.JTextField();
            campoEdad = new javax.swing.JTextField();
            campoCedula = new javax.swing.JTextField();
            campoEmpresa = new javax.swing.JTextField();
            campoArticulos = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            campoEmail = new javax.swing.JTextField();
            labelEmail = new javax.swing.JLabel();
            labelIdProv = new javax.swing.JLabel();
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
            jLabel1.setText("Nombre");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 220, 30));

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

            labelCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCedula.setForeground(new java.awt.Color(0, 0, 0));
            labelCedula.setText("Cedula");
            jPanel1.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 170, 30));

            jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setText("Empresa");
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 90, -1));

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

            labelPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelPerson.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\default-avatar.png")); // NOI18N
            jPanel1.add(labelPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 250, 230));

            botonColocaImagen.setText("Poner imagen");
            botonColocaImagen.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonColocaImagenActionPerformed(evt);
                  }
            });
            jPanel1.add(botonColocaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 130, 30));
            jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, 40));
            jPanel1.add(campoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 150, 40));

            campoCedula.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        campoCedulaKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoCedulaKeyReleased(evt);
                  }
            });
            jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 170, 40));
            jPanel1.add(campoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 210, 40));
            jPanel1.add(campoArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 280, 40));

            jLabel8.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(102, 102, 102));
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("-");
            jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 20, 30));

            campoEmail.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        campoEmailKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoEmailKeyReleased(evt);
                  }
            });
            jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 190, 40));

            labelEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelEmail.setForeground(new java.awt.Color(0, 0, 0));
            labelEmail.setText("Email");
            jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, -1));

            labelIdProv.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelIdProv.setForeground(new java.awt.Color(0, 0, 0));
            labelIdProv.setText("Id del proveedor");
            jPanel1.add(labelIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 30));

            campoIdProv.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        campoIdProvKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoIdProvKeyReleased(evt);
                  }
            });
            jPanel1.add(campoIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 140, 40));

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
           ControllerNewProveedor.cambiaImagen(this);
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

      private void campoEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEmailKeyReleased
            ControllerNewProveedor.defaultLabelEmail(labelEmail);
      }//GEN-LAST:event_campoEmailKeyReleased

      private void campoEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEmailKeyPressed
            ControllerNewProveedor.defaultLabelEmail(labelEmail);
      }//GEN-LAST:event_campoEmailKeyPressed

      private void campoIdProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdProvKeyReleased
            ControllerNewProveedor.defaultLabelIdProv(labelIdProv);
      }//GEN-LAST:event_campoIdProvKeyReleased

      private void campoIdProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdProvKeyPressed
            ControllerNewProveedor.defaultLabelIdProv(labelIdProv);
      }//GEN-LAST:event_campoIdProvKeyPressed

      private void campoCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCedulaKeyReleased
            ControllerNewProveedor.defaultLabelCedula(labelCedula);
      }//GEN-LAST:event_campoCedulaKeyReleased

      private void campoCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCedulaKeyPressed
            ControllerNewProveedor.defaultLabelCedula(labelCedula);
      }//GEN-LAST:event_campoCedulaKeyPressed
 
     
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
    
      public void PhotoPerson(ImageIcon image){
            labelPerson.setIcon(image);
      }
      
      public void setLabelEmail(String texto){
            this.labelEmail.setText(texto);
            this.labelEmail.setForeground(Color.RED);
      }
      
      public void setLabelIdProv(String texto){
            this.labelIdProv.setText(texto);
            this.labelIdProv.setForeground(Color.RED);
      }
      
      public void setLabelCedula(String texto){
            this.labelCedula.setText(texto);
            this.labelCedula.setForeground(Color.RED);
      }
      
      public void setDefaultsLabels(String email, String cedula, String proveedor){
            this.labelCedula.setText(cedula);
            this.labelCedula.setForeground(Color.BLACK);
            this.labelIdProv.setText(email);
            this.labelIdProv.setForeground(Color.BLACK);
            this.labelEmail.setText(proveedor);
            this.labelEmail.setForeground(Color.BLACK);
      }
      
      public void setRequestFocusEmail(){
            this.campoEmail.requestFocus();
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
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JLabel labelCedula;
      private javax.swing.JLabel labelEmail;
      private javax.swing.JLabel labelIdProv;
      private javax.swing.JLabel labelPerson;
      private javax.swing.JTable tablaProveedores;
      // End of variables declaration//GEN-END:variables
}
