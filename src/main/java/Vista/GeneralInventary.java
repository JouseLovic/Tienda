
package Vista;

import javax.swing.*;
import Controlador.*;

public class GeneralInventary extends javax.swing.JPanel {

     public GeneralInventary() {
          initComponents();
          ControllerListInventoryProducts.enviaDatosTabla(tablaGeneral);
     }

    
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          labelId = new javax.swing.JLabel();
          jScrollPane1 = new javax.swing.JScrollPane();
          tablaGeneral = new javax.swing.JTable();
          campoIdNE = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();
          campoDescYTipoNE = new javax.swing.JTextField();
          jLabel2 = new javax.swing.JLabel();
          campoPrecioNE = new javax.swing.JTextField();
          labelBusqueda = new javax.swing.JLabel();
          campoBusqueda = new javax.swing.JTextField();

          setLayout(new java.awt.BorderLayout());

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));
          jPanel1.setLayout(null);

          labelId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          labelId.setForeground(new java.awt.Color(0, 0, 0));
          labelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelId.setText("Id");
          jPanel1.add(labelId);
          labelId.setBounds(120, 10, 90, 30);

          tablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "id", "Desc", "Talla", "Marca", "Tipo de producto", "Precio", "Edad dirigida", "Cantidad", "Sexo"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          tablaGeneral.getTableHeader().setReorderingAllowed(false);
          tablaGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tablaGeneralMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(tablaGeneral);

          jPanel1.add(jScrollPane1);
          jScrollPane1.setBounds(20, 90, 1220, 750);

          campoIdNE.setEditable(false);
          campoIdNE.setBackground(new java.awt.Color(255, 255, 255));
          campoIdNE.setForeground(new java.awt.Color(0, 0, 0));
          campoIdNE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          jPanel1.add(campoIdNE);
          campoIdNE.setBounds(90, 40, 160, 40);

          jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(0, 0, 0));
          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel1.setText("Descripción");
          jPanel1.add(jLabel1);
          jLabel1.setBounds(410, 10, 150, 30);

          campoDescYTipoNE.setEditable(false);
          campoDescYTipoNE.setBackground(new java.awt.Color(255, 255, 255));
          campoDescYTipoNE.setForeground(new java.awt.Color(0, 0, 0));
          campoDescYTipoNE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          jPanel1.add(campoDescYTipoNE);
          campoDescYTipoNE.setBounds(360, 40, 250, 40);

          jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          jLabel2.setForeground(new java.awt.Color(0, 0, 0));
          jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel2.setText("Precio");
          jPanel1.add(jLabel2);
          jLabel2.setBounds(740, 10, 100, 30);

          campoPrecioNE.setEditable(false);
          campoPrecioNE.setBackground(new java.awt.Color(255, 255, 255));
          campoPrecioNE.setForeground(new java.awt.Color(0, 0, 0));
          campoPrecioNE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          jPanel1.add(campoPrecioNE);
          campoPrecioNE.setBounds(710, 40, 160, 40);

          labelBusqueda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          labelBusqueda.setForeground(new java.awt.Color(0, 0, 0));
          labelBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelBusqueda.setText("Buscar por id");
          jPanel1.add(labelBusqueda);
          labelBusqueda.setBounds(1000, 10, 180, 30);

          campoBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          campoBusqueda.setForeground(new java.awt.Color(0, 0, 0));
          campoBusqueda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
          jPanel1.add(campoBusqueda);
          campoBusqueda.setBounds(980, 40, 220, 40);

          add(jPanel1, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void tablaGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGeneralMouseClicked
          
     }//GEN-LAST:event_tablaGeneralMouseClicked

     public void setCampoDescYTipoNE(String texto) {
          campoDescYTipoNE.setText(texto);
     }

     public void setCampoIdNE(String texto) {
          campoIdNE.setText(texto);
     }

     public void setCampoPrecioNE(String texto) {
          campoPrecioNE.setText(texto);
     }

     public String getCampoIdNE(){
          return campoDescYTipoNE.getText();
     }

     public JTable getTablaGeneral() {
          return tablaGeneral;
     }





     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTextField campoBusqueda;
     private javax.swing.JTextField campoDescYTipoNE;
     private javax.swing.JTextField campoIdNE;
     private javax.swing.JTextField campoPrecioNE;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel labelBusqueda;
     private javax.swing.JLabel labelId;
     private javax.swing.JTable tablaGeneral;
     // End of variables declaration//GEN-END:variables
}
