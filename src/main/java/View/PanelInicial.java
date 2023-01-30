
package View;

import Threads.EntriesThread;
import Threads.LabelDataThread;
import ViewFormulary.PanelNuevoProducto;
import Utilities.PanelData2;

public class PanelInicial extends javax.swing.JPanel {

     private static boolean state = true;
     private PanelProveedores proveedor = new PanelProveedores();
     private LabelDataThread stockP;
     private EntriesThread entThread;
     private static boolean isVisibleInitial;

     public PanelInicial() {
          initComponents();
          stockP = new LabelDataThread(labelCantidadStock, labelCantidadVendors);
          stockP.start();
          isVisibleInitial = true;
          PanelNuevoProducto.setIsVisible(false);
          PanelProveedores.setIsVisibleProv(false);
     }


     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {
            java.awt.GridBagConstraints gridBagConstraints;

            panelContentInicial = new javax.swing.JPanel();
            panelDataVentas = new Utilities.PanelData2();
            jLabel7 = new javax.swing.JLabel();
            labelCantidadVentas1 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            panelDataSalidas = new Utilities.PanelData2();
            jLabel5 = new javax.swing.JLabel();
            labelCantidadVendors = new javax.swing.JLabel();
            panelDataEntries = new Utilities.PanelData2();
            jLabel4 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            panelDataStock = new Utilities.PanelData2();
            jLabel2 = new javax.swing.JLabel();
            labelCantidadStock = new javax.swing.JLabel();
            panelDataFacturas = new Utilities.PanelData2();
            labelPedidos = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            jTable2 = new javax.swing.JTable();
            panelDecorationStok = new Utilities.PanelData2();
            panelDecorationEntries2 = new Utilities.PanelData2();
            panelDecorationEntries = new Utilities.PanelData2();
            panelDecorationS = new Utilities.PanelData2();
            panelDecorationProv2 = new Utilities.PanelData2();
            panelDecorationStok2 = new Utilities.PanelData2();
            panelDecorationV = new Utilities.PanelData2();
            panelDecorationV2 = new Utilities.PanelData2();

            setLayout(new java.awt.BorderLayout());

            panelContentInicial.setBackground(new java.awt.Color(242, 242, 242));
            panelContentInicial.setRequestFocusEnabled(false);
            panelContentInicial.setLayout(null);

            panelDataVentas.setBackground(new java.awt.Color(255, 255, 255));
            panelDataVentas.setRoundBottonLeft(35);
            panelDataVentas.setRoundBottonRight(35);
            panelDataVentas.setRoundTopLeft(35);
            panelDataVentas.setRoundTopRight(35);
            panelDataVentas.setLayout(new java.awt.GridBagLayout());

            jLabel7.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(153, 153, 255));
            jLabel7.setText("Total de ventas:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            panelDataVentas.add(jLabel7, gridBagConstraints);

            labelCantidadVentas1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            labelCantidadVentas1.setForeground(new java.awt.Color(12, 12, 12));
            labelCantidadVentas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidadVentas1.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 110);
            panelDataVentas.add(labelCantidadVentas1, gridBagConstraints);

            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            panelDataVentas.add(jLabel8, gridBagConstraints);

            jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ProyectosIDEA\\MavenProjects\\demo\\src\\main\\java\\images\\Icons\\Ventas.png")); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            panelDataVentas.add(jLabel3, gridBagConstraints);

            panelContentInicial.add(panelDataVentas);
            panelDataVentas.setBounds(60, 30, 210, 130);

            panelDataSalidas.setBackground(new java.awt.Color(255, 255, 255));
            panelDataSalidas.setRoundBottonLeft(35);
            panelDataSalidas.setRoundBottonRight(35);
            panelDataSalidas.setRoundTopLeft(35);
            panelDataSalidas.setRoundTopRight(35);
            panelDataSalidas.setLayout(new java.awt.GridBagLayout());

            jLabel5.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 153, 255));
            jLabel5.setText("Proveedores:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
            panelDataSalidas.add(jLabel5, gridBagConstraints);

            labelCantidadVendors.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            labelCantidadVendors.setForeground(new java.awt.Color(12, 12, 12));
            labelCantidadVendors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidadVendors.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 110);
            panelDataSalidas.add(labelCantidadVendors, gridBagConstraints);

            panelContentInicial.add(panelDataSalidas);
            panelDataSalidas.setBounds(670, 30, 210, 130);

            panelDataEntries.setBackground(new java.awt.Color(255, 255, 255));
            panelDataEntries.setRoundBottonLeft(35);
            panelDataEntries.setRoundBottonRight(35);
            panelDataEntries.setRoundTopLeft(35);
            panelDataEntries.setRoundTopRight(35);
            panelDataEntries.setLayout(new java.awt.GridBagLayout());

            jLabel4.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(202, 202, 255));
            jLabel4.setText("Entradas de productos:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
            panelDataEntries.add(jLabel4, gridBagConstraints);

            jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 110);
            panelDataEntries.add(jLabel1, gridBagConstraints);

            panelContentInicial.add(panelDataEntries);
            panelDataEntries.setBounds(980, 30, 202, 130);

            panelDataStock.setBackground(new java.awt.Color(255, 255, 255));
            panelDataStock.setRoundBottonLeft(35);
            panelDataStock.setRoundBottonRight(35);
            panelDataStock.setRoundTopLeft(35);
            panelDataStock.setRoundTopRight(35);
            panelDataStock.setLayout(new java.awt.GridBagLayout());

            jLabel2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(234, 112, 112));
            jLabel2.setText("Stock disponible:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            panelDataStock.add(jLabel2, gridBagConstraints);

            labelCantidadStock.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            labelCantidadStock.setForeground(new java.awt.Color(12, 12, 12));
            labelCantidadStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelCantidadStock.setText("0");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 110);
            panelDataStock.add(labelCantidadStock, gridBagConstraints);

            panelContentInicial.add(panelDataStock);
            panelDataStock.setBounds(370, 30, 210, 130);

            panelDataFacturas.setBackground(new java.awt.Color(255, 255, 255));
            panelDataFacturas.setRoundBottonLeft(50);
            panelDataFacturas.setRoundBottonRight(50);
            panelDataFacturas.setRoundTopLeft(50);
            panelDataFacturas.setRoundTopRight(50);

            labelPedidos.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
            labelPedidos.setForeground(new java.awt.Color(255, 204, 153));
            labelPedidos.setText("Pedidos");

            jTable2.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                  },
                  new String [] {
                        "Client", "Email", "Product(s)", "State"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jScrollPane2.setViewportView(jTable2);
            if (jTable2.getColumnModel().getColumnCount() > 0) {
                  jTable2.getColumnModel().getColumn(2).setResizable(false);
                  jTable2.getColumnModel().getColumn(3).setResizable(false);
            }

            javax.swing.GroupLayout panelDataFacturasLayout = new javax.swing.GroupLayout(panelDataFacturas);
            panelDataFacturas.setLayout(panelDataFacturasLayout);
            panelDataFacturasLayout.setHorizontalGroup(
                  panelDataFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelDataFacturasLayout.createSequentialGroup()
                        .addGroup(panelDataFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(panelDataFacturasLayout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(labelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(panelDataFacturasLayout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
            );
            panelDataFacturasLayout.setVerticalGroup(
                  panelDataFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelDataFacturasLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(labelPedidos)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
            );

            panelContentInicial.add(panelDataFacturas);
            panelDataFacturas.setBounds(30, 260, 1170, 690);

            panelDecorationStok.setBackground(new java.awt.Color(248, 176, 176));
            panelDecorationStok.setRoundBottonLeft(20);
            panelDecorationStok.setRoundBottonRight(10);
            panelDecorationStok.setRoundTopLeft(20);
            panelDecorationStok.setRoundTopRight(10);
            panelDecorationStok.setLayout(new java.awt.GridBagLayout());
            panelContentInicial.add(panelDecorationStok);
            panelDecorationStok.setBounds(360, 50, 20, 120);

            panelDecorationEntries2.setBackground(new java.awt.Color(204, 204, 255));
            panelDecorationEntries2.setRoundBottonLeft(35);
            panelDecorationEntries2.setRoundBottonRight(35);
            panelDecorationEntries2.setRoundTopLeft(35);
            panelDecorationEntries2.setRoundTopRight(35);
            panelDecorationEntries2.setLayout(new java.awt.GridBagLayout());
            panelContentInicial.add(panelDecorationEntries2);
            panelDecorationEntries2.setBounds(970, 150, 200, 20);

            panelDecorationEntries.setBackground(new java.awt.Color(204, 204, 255));
            panelDecorationEntries.setRoundBottonLeft(20);
            panelDecorationEntries.setRoundBottonRight(10);
            panelDecorationEntries.setRoundTopLeft(20);
            panelDecorationEntries.setRoundTopRight(10);
            panelDecorationEntries.setLayout(null);
            panelContentInicial.add(panelDecorationEntries);
            panelDecorationEntries.setBounds(970, 50, 20, 120);

            panelDecorationS.setBackground(new java.awt.Color(73, 182, 255));
            panelDecorationS.setRoundBottonLeft(20);
            panelDecorationS.setRoundBottonRight(10);
            panelDecorationS.setRoundTopLeft(20);
            panelDecorationS.setRoundTopRight(10);
            panelDecorationS.setLayout(new java.awt.GridBagLayout());
            panelContentInicial.add(panelDecorationS);
            panelDecorationS.setBounds(660, 50, 20, 120);

            panelDecorationProv2.setBackground(new java.awt.Color(73, 182, 255));
            panelDecorationProv2.setRoundBottonLeft(35);
            panelDecorationProv2.setRoundBottonRight(35);
            panelDecorationProv2.setRoundTopLeft(35);
            panelDecorationProv2.setRoundTopRight(35);
            panelDecorationProv2.setLayout(new java.awt.GridBagLayout());
            panelContentInicial.add(panelDecorationProv2);
            panelDecorationProv2.setBounds(660, 150, 210, 20);

            panelDecorationStok2.setBackground(new java.awt.Color(248, 176, 176));
            panelDecorationStok2.setRoundBottonLeft(35);
            panelDecorationStok2.setRoundBottonRight(35);
            panelDecorationStok2.setRoundTopLeft(35);
            panelDecorationStok2.setRoundTopRight(35);
            panelDecorationStok2.setLayout(new java.awt.GridBagLayout());
            panelContentInicial.add(panelDecorationStok2);
            panelDecorationStok2.setBounds(360, 150, 210, 20);

            panelDecorationV.setBackground(new java.awt.Color(153, 153, 255));
            panelDecorationV.setRoundBottonLeft(20);
            panelDecorationV.setRoundBottonRight(10);
            panelDecorationV.setRoundTopLeft(20);
            panelDecorationV.setRoundTopRight(10);
            panelDecorationV.setLayout(new java.awt.GridBagLayout());
            panelContentInicial.add(panelDecorationV);
            panelDecorationV.setBounds(50, 50, 15, 110);

            panelDecorationV2.setBackground(new java.awt.Color(153, 153, 255));
            panelDecorationV2.setRoundBottonLeft(35);
            panelDecorationV2.setRoundBottonRight(35);
            panelDecorationV2.setRoundTopLeft(35);
            panelDecorationV2.setRoundTopRight(35);
            panelDecorationV2.setLayout(new java.awt.GridBagLayout());
            panelContentInicial.add(panelDecorationV2);
            panelDecorationV2.setBounds(50, 140, 210, 30);

            add(panelContentInicial, java.awt.BorderLayout.CENTER);
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

      public PanelData2 getPanelDataEntries() {
            return panelDataEntries;
      }

      public void setPanelDataEntries(PanelData2 panelDataEntries) {
            this.panelDataEntries = panelDataEntries;
      }

      public PanelData2 getPanelDataFacturas() {
            return panelDataFacturas;
      }

      public void setPanelDataFacturas(PanelData2 panelDataFacturas) {
            this.panelDataFacturas = panelDataFacturas;
      }

      public PanelData2 getPanelDataSalidas() {
            return panelDataSalidas;
      }

      public void setPanelDataSalidas(PanelData2 panelDataSalidas) {
            this.panelDataSalidas = panelDataSalidas;
      }

      public PanelData2 getPanelDataStock() {
            return panelDataStock;
      }

      public void setPanelDataStock(PanelData2 panelDataStock) {
            this.panelDataStock = panelDataStock;
      }

      public PanelData2 getPanelDataVentas() {
            return panelDataVentas;
      }

      public void setPanelDataVentas(PanelData2 panelDataVentas) {
            this.panelDataVentas = panelDataVentas;
      }
    
      //panels of decoration
      
      public PanelProveedores getProveedor() {
            return proveedor;
      }

      public void setProveedor(PanelProveedores proveedor) {
            this.proveedor = proveedor;
      }

      public PanelData2 getPanelDecorationEntries() {
            return panelDecorationEntries;
      }

      public void setPanelDecorationEntries(PanelData2 panelDecorationEntries) {
            this.panelDecorationEntries = panelDecorationEntries;
      }

      public PanelData2 getPanelDecorationEntries2() {
            return panelDecorationEntries2;
      }

      public void setPanelDecorationEntries2(PanelData2 panelDecorationEntries2) {
            this.panelDecorationEntries2 = panelDecorationEntries2;
      }

      public PanelData2 getPanelDecorationProv1() {
            return panelDecorationS;
      }

      public void setPanelDecorationProv1(PanelData2 panelDecorationProv1) {
            this.panelDecorationS = panelDecorationProv1;
      }

      public PanelData2 getPanelDecorationProv2() {
            return panelDecorationProv2;
      }

      public void setPanelDecorationProv2(PanelData2 panelDecorationProv2) {
            this.panelDecorationProv2 = panelDecorationProv2;
      }

      public PanelData2 getPanelDecorationStok() {
            return panelDecorationStok;
      }

      public void setPanelDecorationStok(PanelData2 panelDecorationStok) {
            this.panelDecorationStok = panelDecorationStok;
      }

      public PanelData2 getPanelDecorationStok2() {
            return panelDecorationStok2;
      }

      public void setPanelDecorationStok2(PanelData2 panelDecorationStok2) {
            this.panelDecorationStok2 = panelDecorationStok2;
      }

      public PanelData2 getPanelDecorationV() {
            return panelDecorationV;
      }

      public void setPanelDecorationV(PanelData2 panelDecorationV) {
            this.panelDecorationV = panelDecorationV;
      }

      public PanelData2 getPanelDecorationV2() {
            return panelDecorationV2;
      }

      public void setPanelDecorationV2(PanelData2 panelDecorationV2) {
            this.panelDecorationV2 = panelDecorationV2;
      }
    
    
    
    

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JTable jTable2;
      private static javax.swing.JLabel labelCantidadStock;
      private javax.swing.JLabel labelCantidadVendors;
      private javax.swing.JLabel labelCantidadVentas1;
      private javax.swing.JLabel labelPedidos;
      private javax.swing.JPanel panelContentInicial;
      private Utilities.PanelData2 panelDataEntries;
      private Utilities.PanelData2 panelDataFacturas;
      private Utilities.PanelData2 panelDataSalidas;
      private Utilities.PanelData2 panelDataStock;
      private Utilities.PanelData2 panelDataVentas;
      private Utilities.PanelData2 panelDecorationEntries;
      private Utilities.PanelData2 panelDecorationEntries2;
      private Utilities.PanelData2 panelDecorationProv2;
      private Utilities.PanelData2 panelDecorationS;
      private Utilities.PanelData2 panelDecorationStok;
      private Utilities.PanelData2 panelDecorationStok2;
      private Utilities.PanelData2 panelDecorationV;
      private Utilities.PanelData2 panelDecorationV2;
      // End of variables declaration//GEN-END:variables
}
