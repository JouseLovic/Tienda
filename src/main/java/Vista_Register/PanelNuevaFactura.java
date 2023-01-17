
package Vista_Register;

import Controlador.ControllerFacturasEntry;

public class PanelNuevaFactura extends javax.swing.JPanel {

      private static int actualizame = 0;
      private static boolean estado;
    
      public PanelNuevaFactura() {
            initComponents();
            ControllerFacturasEntry.enviaDatosTabla(tablaFacturasE, "");
            ControllerFacturasEntry.llenaComboBox(listaProveedores);
      }

      @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            contenedorFacturas = new javax.swing.JPanel();
            labelTitle = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tablaFacturasE = new javax.swing.JTable();
            campoNFactura = new javax.swing.JTextField();
            campoPrecio = new javax.swing.JTextField();
            campoCantidad = new javax.swing.JTextField();
            campoDesc = new javax.swing.JTextField();
            campoIdProveedor = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            jTextField1 = new javax.swing.JTextField();
            listaProveedores = new javax.swing.JComboBox<>();
            campoFecha = new javax.swing.JTextField();

            setLayout(new java.awt.BorderLayout());

            contenedorFacturas.setBackground(new java.awt.Color(255, 255, 255));
            contenedorFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        contenedorFacturasMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        contenedorFacturasMouseEntered(evt);
                  }
            });
            contenedorFacturas.setLayout(null);

            labelTitle.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
            labelTitle.setForeground(new java.awt.Color(0, 0, 0));
            labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            labelTitle.setText("Registro de facturas de entrada");
            contenedorFacturas.add(labelTitle);
            labelTitle.setBounds(20, 30, 460, 40);

            tablaFacturasE.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                  },
                  new String [] {
                        "Id de factura", "Fecha", "Precio", "Cantidad", "Producto", "Id del proveedor"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaFacturasE.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tablaFacturasEMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(tablaFacturasE);

            contenedorFacturas.add(jScrollPane1);
            jScrollPane1.setBounds(20, 440, 1220, 460);

            campoNFactura.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoNFacturaKeyTyped(evt);
                  }
            });
            contenedorFacturas.add(campoNFactura);
            campoNFactura.setBounds(160, 150, 250, 40);
            contenedorFacturas.add(campoPrecio);
            campoPrecio.setBounds(940, 150, 180, 40);

            campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyTyped(evt);
                  }
            });
            contenedorFacturas.add(campoCantidad);
            campoCantidad.setBounds(190, 270, 180, 40);
            contenedorFacturas.add(campoDesc);
            campoDesc.setBounds(580, 280, 230, 40);

            campoIdProveedor.setEditable(false);
            contenedorFacturas.add(campoIdProveedor);
            campoIdProveedor.setBounds(960, 280, 150, 40);

            jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Id de la factura");
            contenedorFacturas.add(jLabel2);
            jLabel2.setBounds(200, 100, 170, 40);

            jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Cantidad");
            contenedorFacturas.add(jLabel3);
            jLabel3.setBounds(210, 220, 140, 40);

            jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Fecha");
            contenedorFacturas.add(jLabel4);
            jLabel4.setBounds(640, 100, 80, 40);

            jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Descripcion");
            contenedorFacturas.add(jLabel5);
            jLabel5.setBounds(620, 230, 150, 40);

            jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Precio");
            contenedorFacturas.add(jLabel6);
            jLabel6.setBounds(980, 100, 100, 40);

            jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 0, 0));
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("Id del proveedor");
            contenedorFacturas.add(jLabel7);
            jLabel7.setBounds(960, 230, 150, 40);

            jButton1.setText("Eliminar");
            contenedorFacturas.add(jButton1);
            jButton1.setBounds(130, 380, 110, 40);

            jButton2.setText("Actualizar");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });
            contenedorFacturas.add(jButton2);
            jButton2.setBounds(400, 380, 140, 40);

            jButton3.setText("Limpiar campos");
            contenedorFacturas.add(jButton3);
            jButton3.setBounds(720, 380, 130, 40);

            jButton4.setText("Subir factura");
            contenedorFacturas.add(jButton4);
            jButton4.setBounds(1020, 380, 130, 40);

            jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Buscar factura:");
            contenedorFacturas.add(jLabel1);
            jLabel1.setBounds(790, 30, 160, 50);

            jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        jTextField1KeyTyped(evt);
                  }
            });
            contenedorFacturas.add(jTextField1);
            jTextField1.setBounds(940, 40, 260, 30);

            listaProveedores.setForeground(new java.awt.Color(0, 0, 0));
            listaProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null" }));
            contenedorFacturas.add(listaProveedores);
            listaProveedores.setBounds(1120, 280, 72, 40);
            contenedorFacturas.add(campoFecha);
            campoFecha.setBounds(560, 150, 250, 40);

            add(contenedorFacturas, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

      private void tablaFacturasEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasEMouseClicked
           ControllerFacturasEntry.mandaCampos(tablaFacturasE, this);
            
      }//GEN-LAST:event_tablaFacturasEMouseClicked

      private void contenedorFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseEntered
            
            if(actualizame == 0){
                  ControllerFacturasEntry.enviaDatosTabla(tablaFacturasE, "");
                  listaProveedores.removeAllItems();
                  listaProveedores.addItem("Null");
                  listaProveedores.setSelectedItem("Null");
                  ControllerFacturasEntry.llenaComboBox(listaProveedores);
                  actualizame = 1;
            }
            
      }//GEN-LAST:event_contenedorFacturasMouseEntered

      private void contenedorFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseClicked
            tablaFacturasE.setSelectionMode(0);
            
      }//GEN-LAST:event_contenedorFacturasMouseClicked

      private void campoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyTyped
            ControllerFacturasEntry.blockFieldWords(campoCantidad, evt);
      }//GEN-LAST:event_campoCantidadKeyTyped

      private void campoNFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNFacturaKeyTyped
            
      }//GEN-LAST:event_campoNFacturaKeyTyped

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jButton2ActionPerformed

      private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextField1KeyTyped

      public String getCampoCantidad() {
            return campoCantidad.getText();
      }

      public void setCampoCantidad(String campoCantidad) {
            this.campoCantidad.setText(campoCantidad);
      }

      public String getCampoDesc() {
            return campoDesc.getText();
      }

      public void setCampoDesc(String campoDesc) {
            this.campoDesc.setText(campoDesc);
      }

      public String getCampoFecha() {
            return campoFecha.getText();
      }

      public void setCampoFecha(String campoFecha) {
            this.campoFecha.setText(campoFecha);
      }

      public String getCampoIdProveedor() {
            return campoIdProveedor.getText();
      }

      public void setCampoIdProveedor(String campoIdProveedor) {
            this.campoIdProveedor.setText(campoIdProveedor);
      }

      public String getCampoNFactura() {
            return campoNFactura.getText();
      }

      public void setCampoNFactura(String campoNFactura) {
            this.campoNFactura.setText(campoNFactura);
      }

      public String getCampoPrecio() {
            return campoPrecio.getText();
      }

      public void setCampoPrecio(String campoPrecio) {
            this.campoPrecio.setText(campoPrecio);
      }
      
      public String getListaProveedor(){
            return (String) listaProveedores.getSelectedItem();
      }
      
      public void setListaProveedor(String nombreP){
            listaProveedores.setSelectedItem(nombreP);
      }

      public static int getActualizame(){
            return actualizame;
      }

      public static void setActualizame(int actu){
            actualizame = actu;
      }
      
      public static void setEstado(boolean set){
            estado = set;
      }

      public static boolean getEstado(){
            return estado;
      }
      
      
      
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JTextField campoCantidad;
      private javax.swing.JTextField campoDesc;
      private javax.swing.JTextField campoFecha;
      private javax.swing.JTextField campoIdProveedor;
      private javax.swing.JTextField campoNFactura;
      private javax.swing.JTextField campoPrecio;
      private javax.swing.JPanel contenedorFacturas;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTextField jTextField1;
      private javax.swing.JLabel labelTitle;
      private javax.swing.JComboBox<String> listaProveedores;
      private javax.swing.JTable tablaFacturasE;
      // End of variables declaration//GEN-END:variables
}
