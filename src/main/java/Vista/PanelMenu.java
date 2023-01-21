
package Vista;

public class PanelMenu extends javax.swing.JPanel {

     
      public PanelMenu() {
            initComponents();
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel3 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            PanelInventary = new javax.swing.JPanel();
            panelHome = new javax.swing.JPanel();
            PanelEntrys = new javax.swing.JPanel();
            panelConfig = new javax.swing.JPanel();
            panelOuts = new javax.swing.JPanel();
            PanelFacturasEntry = new javax.swing.JPanel();
            PanelVendors = new javax.swing.JPanel();
            PanelReports = new javax.swing.JPanel();

            setLayout(new java.awt.BorderLayout());

            jPanel3.setBackground(new java.awt.Color(112, 163, 255));
            jPanel3.setLayout(null);

            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("User:");
            jPanel3.add(jLabel1);
            jLabel1.setBounds(10, 90, 90, 20);

            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Level: ");
            jPanel3.add(jLabel2);
            jLabel2.setBounds(10, 120, 110, 16);

            PanelInventary.setBackground(new java.awt.Color(91, 137, 229));
            PanelInventary.setLayout(new java.awt.BorderLayout());
            jPanel3.add(PanelInventary);
            PanelInventary.setBounds(0, 230, 150, 40);

            panelHome.setBackground(new java.awt.Color(90, 136, 226));
            panelHome.setLayout(new java.awt.BorderLayout());
            jPanel3.add(panelHome);
            panelHome.setBounds(0, 160, 150, 40);

            PanelEntrys.setBackground(new java.awt.Color(91, 137, 229));
            PanelEntrys.setLayout(new java.awt.BorderLayout());
            jPanel3.add(PanelEntrys);
            PanelEntrys.setBounds(0, 300, 150, 40);

            panelConfig.setLayout(new java.awt.BorderLayout());
            jPanel3.add(panelConfig);
            panelConfig.setBounds(10, 680, 30, 30);

            panelOuts.setBackground(new java.awt.Color(91, 137, 229));
            panelOuts.setLayout(new java.awt.BorderLayout());
            jPanel3.add(panelOuts);
            panelOuts.setBounds(0, 370, 150, 40);

            PanelFacturasEntry.setBackground(new java.awt.Color(91, 137, 229));
            PanelFacturasEntry.setLayout(new java.awt.BorderLayout());
            jPanel3.add(PanelFacturasEntry);
            PanelFacturasEntry.setBounds(0, 440, 150, 40);

            PanelVendors.setBackground(new java.awt.Color(91, 137, 229));
            PanelVendors.setLayout(new java.awt.BorderLayout());
            jPanel3.add(PanelVendors);
            PanelVendors.setBounds(0, 510, 150, 40);

            PanelReports.setLayout(new java.awt.BorderLayout());
            jPanel3.add(PanelReports);
            PanelReports.setBounds(60, 680, 30, 30);

            add(jPanel3, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel PanelEntrys;
      private javax.swing.JPanel PanelFacturasEntry;
      private javax.swing.JPanel PanelInventary;
      private javax.swing.JPanel PanelReports;
      private javax.swing.JPanel PanelVendors;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel panelConfig;
      private javax.swing.JPanel panelHome;
      private javax.swing.JPanel panelOuts;
      // End of variables declaration//GEN-END:variables
}
