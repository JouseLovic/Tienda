
package Vista;

import ControladorThreads.ControllerLabelsDataInicial;
import Vista_Formulario.PanelNuevoProducto;
import Controlador.*;

public class PanelInicial extends javax.swing.JPanel {

     private static boolean state = true;
     private PanelProveedores proveedor = new PanelProveedores();
     ControllerLabelsDataInicial stockP;
     private static boolean isVisibleInitial;

     public PanelInicial() {
          initComponents();
          stockP = new ControllerLabelsDataInicial(labelCantidadStock);
          stockP.start();
          isVisibleInitial = true;
          PanelNuevoProducto.setIsVisible(false);
          PanelProveedores.setIsVisibleProv(false);
     }

     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {
            java.awt.GridBagConstraints gridBagConstraints;

            jPanel1 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            labelCantidadVentas = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            labelCantidadStock = new javax.swing.JLabel();
            jPanel4 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jPanel5 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            labelCantidadSalidas = new javax.swing.JLabel();

            setLayout(new java.awt.BorderLayout());

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(null);

            jPanel3.setBackground(new java.awt.Color(140, 178, 255));
            jPanel3.setLayout(new java.awt.GridBagLayout());

            jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("Total de ventas hoy:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
            jPanel3.add(jLabel3, gridBagConstraints);

            labelCantidadVentas.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
            labelCantidadVentas.setForeground(new java.awt.Color(255, 255, 255));
            labelCantidadVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidadVentas.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            jPanel3.add(labelCantidadVentas, gridBagConstraints);

            jPanel1.add(jPanel3);
            jPanel3.setBounds(220, 60, 220, 100);

            jPanel2.setBackground(new java.awt.Color(255, 174, 174));
            jPanel2.setLayout(new java.awt.GridBagLayout());

            jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Stock disponible:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.insets = new java.awt.Insets(0, 18, 0, 0);
            jPanel2.add(jLabel2, gridBagConstraints);

            labelCantidadStock.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
            labelCantidadStock.setForeground(new java.awt.Color(255, 255, 255));
            labelCantidadStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidadStock.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            jPanel2.add(labelCantidadStock, gridBagConstraints);

            jPanel1.add(jPanel2);
            jPanel2.setBounds(550, 60, 220, 100);

            jPanel4.setBackground(new java.awt.Color(204, 204, 255));
            jPanel4.setLayout(new java.awt.GridBagLayout());

            jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Entradas de productos:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.insets = new java.awt.Insets(0, 18, 0, 0);
            jPanel4.add(jLabel4, gridBagConstraints);

            jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            jPanel4.add(jLabel1, gridBagConstraints);

            jPanel1.add(jPanel4);
            jPanel4.setBounds(550, 200, 220, 100);

            jPanel5.setBackground(new java.awt.Color(153, 204, 255));
            jPanel5.setLayout(new java.awt.GridBagLayout());

            jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Salidas de productos");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
            jPanel5.add(jLabel5, gridBagConstraints);

            labelCantidadSalidas.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
            labelCantidadSalidas.setForeground(new java.awt.Color(255, 255, 255));
            labelCantidadSalidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidadSalidas.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.ipadx = 1;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            jPanel5.add(labelCantidadSalidas, gridBagConstraints);

            jPanel1.add(jPanel5);
            jPanel5.setBounds(220, 210, 220, 100);

            add(jPanel1, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents


      public boolean getState(){
            return state;
      }

      public static void setState(boolean states){
            state = states;
      }

    public static boolean isIsVisibleInitial() {
        return isVisibleInitial;
    }

    public static void setIsVisibleInitial(boolean isVisibleInitial) {
        PanelInicial.isVisibleInitial = isVisibleInitial;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JPanel jPanel5;
      private javax.swing.JLabel labelCantidadSalidas;
      private static javax.swing.JLabel labelCantidadStock;
      private javax.swing.JLabel labelCantidadVentas;
      // End of variables declaration//GEN-END:variables
}
