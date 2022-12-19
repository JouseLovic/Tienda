
package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import Controlador.*;

public class GeneralInventary extends javax.swing.JPanel {

     public GeneralInventary() {
          initComponents();
          this.addMouseListener(new refresca());
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
          labelCantidad = new javax.swing.JLabel();
          campoPrecioNE = new javax.swing.JTextField();
          labelPrecio = new javax.swing.JLabel();
          campoCantidad = new javax.swing.JTextField();

          setLayout(new java.awt.BorderLayout());

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));
          jPanel1.setLayout(null);

          labelId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          labelId.setForeground(new java.awt.Color(0, 0, 0));
          labelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelId.setText("Id");
          jPanel1.add(labelId);
          labelId.setBounds(160, 10, 90, 30);

          tablaGeneral = new javax.swing.JTable(){

               public boolean isCellEditable(int rowIndex, int ColumnIndex){
                    return false;
               }
          };
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
               public void mouseReleased(java.awt.event.MouseEvent evt) {
                    tablaGeneralMouseReleased(evt);
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
          campoIdNE.setBounds(130, 40, 160, 40);

          jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(0, 0, 0));
          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel1.setText("Descripción");
          jPanel1.add(jLabel1);
          jLabel1.setBounds(440, 10, 150, 30);

          campoDescYTipoNE.setEditable(false);
          campoDescYTipoNE.setBackground(new java.awt.Color(255, 255, 255));
          campoDescYTipoNE.setForeground(new java.awt.Color(0, 0, 0));
          campoDescYTipoNE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          jPanel1.add(campoDescYTipoNE);
          campoDescYTipoNE.setBounds(390, 40, 250, 40);

          labelCantidad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
          labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelCantidad.setText("Cantidad");
          jPanel1.add(labelCantidad);
          labelCantidad.setBounds(1020, 10, 120, 30);

          campoPrecioNE.setEditable(false);
          campoPrecioNE.setBackground(new java.awt.Color(255, 255, 255));
          campoPrecioNE.setForeground(new java.awt.Color(0, 0, 0));
          campoPrecioNE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          jPanel1.add(campoPrecioNE);
          campoPrecioNE.setBounds(750, 40, 160, 40);

          labelPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
          labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelPrecio.setText("Precio");
          jPanel1.add(labelPrecio);
          labelPrecio.setBounds(780, 10, 100, 30);

          campoCantidad.setEditable(false);
          campoCantidad.setBackground(new java.awt.Color(255, 255, 255));
          campoCantidad.setForeground(new java.awt.Color(0, 0, 0));
          campoCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          jPanel1.add(campoCantidad);
          campoCantidad.setBounds(1000, 40, 160, 40);

          add(jPanel1, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void tablaGeneralMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGeneralMouseReleased
          int fila = tablaGeneral.getSelectedRow();
          if(fila >= 0){
               campoIdNE.setText(String.valueOf(tablaGeneral.getValueAt(fila, 0)));
               campoDescYTipoNE.setText(String.valueOf(tablaGeneral.getValueAt(fila, 1)+" "+tablaGeneral.getValueAt(fila, 4)));
               campoPrecioNE.setText(String.valueOf(tablaGeneral.getValueAt(fila, 5)));
               campoCantidad.setText(String.valueOf(tablaGeneral.getValueAt(fila, 7)));
          }
     }//GEN-LAST:event_tablaGeneralMouseReleased

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
          return campoIdNE.getText();
     }


     public int getCampoCantidad() {
          int cantidad = Integer.parseInt(campoCantidad.getText());
          return cantidad;
     }


     public void setCampoCantidad(String texto) {
          campoCantidad.setText(texto);;
     }


     public void refrescaTablaG(){
          ControllerListInventoryProducts.enviaDatosTabla(tablaGeneral);
     }


     class refresca extends MouseAdapter{
      
          @Override
          public void mouseEntered(MouseEvent e) {
                ControllerListInventoryProducts.enviaDatosTabla(tablaGeneral);
          }
          @Override
          public void mouseExited(MouseEvent e) {
               ControllerListInventoryProducts.enviaDatosTabla(tablaGeneral);
          }        
     }


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTextField campoCantidad;
     private javax.swing.JTextField campoDescYTipoNE;
     private javax.swing.JTextField campoIdNE;
     private javax.swing.JTextField campoPrecioNE;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel labelCantidad;
     private javax.swing.JLabel labelId;
     private javax.swing.JLabel labelPrecio;
     private javax.swing.JTable tablaGeneral;
     // End of variables declaration//GEN-END:variables
}
