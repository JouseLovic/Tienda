
package View;

import Controllers.ControllerLogin;
import Controllers.Settings.ReSettings;

import javax.swing.*;

public class WindowLogin extends javax.swing.JFrame {

     
      public WindowLogin() {
            initComponents();
            this.labelTitleLogin.setText(ReSettings.getTitleLogin());
            this.positionCombo.setSelectedIndex(0);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      }

      @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            labelTitleLogin = new javax.swing.JLabel();
            userField = new Utilities.TextField();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            passField = new Utilities.PasswordField();
            buttonCancel = new Utilities.Button();
            buttonSession = new Utilities.Button();
            jLabel4 = new javax.swing.JLabel();
            rolField = new Utilities.TextField();
            positionCombo = new javax.swing.JComboBox<>();
            buttonSessionPrevious = new Utilities.Button();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(238, 238, 238));
            jPanel1.setMinimumSize(new java.awt.Dimension(747, 593));

            jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Inicio de sesión");

            labelTitleLogin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 30)); // NOI18N
            labelTitleLogin.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

            userField.setForeground(new java.awt.Color(0, 0, 0));
            userField.setShadowColor(new java.awt.Color(0, 0, 0));

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Usuario");

            jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Password");

            passField.setForeground(new java.awt.Color(0, 0, 0));
            passField.setShadowColor(new java.awt.Color(0, 0, 0));

            buttonCancel.setText("Cancelar");
            buttonCancel.setShadowColor(new java.awt.Color(0, 0, 0));

            buttonSession.setText("Iniciar sesion");
            buttonSession.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonSession.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonSessionActionPerformed(evt);
                  }
            });

            jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Rol");

            rolField.setEditable(false);
            rolField.setForeground(new java.awt.Color(0, 0, 0));
            rolField.setShadowColor(new java.awt.Color(0, 0, 0));

            positionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employer", "Admin", "Basic Rol" }));
            positionCombo.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        positionComboActionPerformed(evt);
                  }
            });

            buttonSessionPrevious.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\Icons\\PersonLogin.png")); // NOI18N
            buttonSessionPrevious.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonSessionPrevious.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonSessionPreviousActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitleLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addGap(485, 485, 485))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                          .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                          .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(rolField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(positionCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap(284, Short.MAX_VALUE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(buttonSession, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSessionPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel3)
                              .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(positionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(rolField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(buttonSession, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(buttonSessionPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );

            getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void buttonSessionPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSessionPreviousActionPerformed
            String pass = JOptionPane.showInputDialog("Introduce la contraseña de "+ReSettings.getUser());

            if(!pass.equals("")) {
                  ControllerLogin.getUser(pass);
            }
            else{
                  System.out.println("Esta vacio");
            }
      }//GEN-LAST:event_buttonSessionPreviousActionPerformed

      private void buttonSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSessionActionPerformed
           ControllerLogin.login(userField.getText(), String.valueOf(passField.getPassword()), rolField.getText(), this);
      }//GEN-LAST:event_buttonSessionActionPerformed

      private void positionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboActionPerformed
            rolField.setText(String.valueOf(positionCombo.getSelectedItem()));
      }//GEN-LAST:event_positionComboActionPerformed


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private Utilities.Button buttonCancel;
      private Utilities.Button buttonSession;
      private Utilities.Button buttonSessionPrevious;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JLabel labelTitleLogin;
      private Utilities.PasswordField passField;
      private javax.swing.JComboBox<String> positionCombo;
      private Utilities.TextField rolField;
      private Utilities.TextField userField;
      // End of variables declaration//GEN-END:variables
}
