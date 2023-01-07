
package Vista;

import DAO.ClientesDao;

public class FormularioNCliente extends javax.swing.JDialog {

      private static boolean aprobado = false;

      public FormularioNCliente(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      }

      @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            labelCedula = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            labelFechaNacimiento = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            campoCedula = new javax.swing.JTextField();
            campoNombre = new javax.swing.JTextField();
            campoFechaNacimiento = new javax.swing.JTextField();
            botonCrear = new javax.swing.JButton();
            botonCancelar = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            labelCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCedula.setForeground(new java.awt.Color(0, 0, 0));
            labelCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCedula.setText("Cedula:");
            jPanel1.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

            jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Nombre:");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, 30));

            labelFechaNacimiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
            labelFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelFechaNacimiento.setText("Fecha de nacimiento:");
            jPanel1.add(labelFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, 30));

            jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Registro rápido de clientes");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 280, 40));
            jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 540, 10));
            jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, 30));
            jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 30));
            jPanel1.add(campoFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 190, 30));

            botonCrear.setText("Crear");
            botonCrear.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonCrearActionPerformed(evt);
                  }
            });
            jPanel1.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 40));

            botonCancelar.setText("Cancelar");
            botonCancelar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonCancelarActionPerformed(evt);
                  }
            });
            jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 160, 40));

            jPanel2.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 680, 60));

            getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
                  ClientesDao cDao = new ClientesDao();
                  cDao.insertarCliente(this);
                        if(aprobado != false){
                              dispose();
                        }
      }//GEN-LAST:event_botonCrearActionPerformed

      private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
            this.dispose();
      }//GEN-LAST:event_botonCancelarActionPerformed

      
           public String getCampoCedula() {
            return campoCedula.getText();
      }

      public static void setCampoCedula(String texto) {
            campoCedula.setText(texto);
      }

      public String getCampoFechaNacimiento() {
            return campoFechaNacimiento.getText();
      }

      public void setCampoFechaNacimiento(String texto) {
            campoFechaNacimiento.setText(texto);
      }

      public String getCampoNombre() {
            return campoNombre.getText();
      }

      public void setCampoNombre(String texto) {
            campoNombre.setText(texto);
      }
      
       
      public static void setAprobado(boolean aprobado) {
            FormularioNCliente.aprobado = aprobado;
      }



      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botonCancelar;
      private javax.swing.JButton botonCrear;
      private static javax.swing.JTextField campoCedula;
      private static javax.swing.JTextField campoFechaNacimiento;
      private static javax.swing.JTextField campoNombre;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JLabel labelCedula;
      private javax.swing.JLabel labelFechaNacimiento;
      // End of variables declaration//GEN-END:variables
}
