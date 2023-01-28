
package ViewFormulary;

import Controllers.ControllerEntBills;
import Controllers.Settings.ReSettings;

public class PanelNuevaFactura extends javax.swing.JPanel {

      private static int actualizame = 0;
      private static boolean estado;
      private static boolean isVisibleNFactura;
    
      public PanelNuevaFactura() {
            initComponents();
            isVisibleNFactura = false;
            labelTitleBill.setText(ReSettings.getTitleBill());
            ControllerEntBills.enviaDatosTabla(tablaFacturasE, "");
            ControllerEntBills.llenaComboBox(listaProveedores);
      }

      @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            contenedorFacturas = new javax.swing.JPanel();
            labelTitleBill = new javax.swing.JLabel();
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
            botonEliminar = new javax.swing.JButton();
            botonActualiza = new javax.swing.JButton();
            botonLimpiar = new javax.swing.JButton();
            botonCreaRegistro = new javax.swing.JButton();
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

            labelTitleBill.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelTitleBill.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleBill.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            contenedorFacturas.add(labelTitleBill);
            labelTitleBill.setBounds(10, 10, 360, 60);

            tablaFacturasE.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                  },
                  new String [] {
                        "Id de factura", "Fecha", "Precio", "Cantidad", "Product", "Id del proveedor"
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
            jScrollPane1.setBounds(30, 440, 1000, 520);

            campoNFactura.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoNFacturaKeyTyped(evt);
                  }
            });
            contenedorFacturas.add(campoNFactura);
            campoNFactura.setBounds(90, 150, 250, 40);
            contenedorFacturas.add(campoPrecio);
            campoPrecio.setBounds(760, 150, 150, 40);

            campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyTyped(evt);
                  }
            });
            contenedorFacturas.add(campoCantidad);
            campoCantidad.setBounds(440, 270, 180, 40);
            contenedorFacturas.add(campoDesc);
            campoDesc.setBounds(90, 270, 230, 40);

            campoIdProveedor.setEditable(false);
            contenedorFacturas.add(campoIdProveedor);
            campoIdProveedor.setBounds(760, 270, 150, 40);

            jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setText("Id de la factura");
            contenedorFacturas.add(jLabel2);
            jLabel2.setBounds(90, 110, 170, 40);

            jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setText("Cantidad");
            contenedorFacturas.add(jLabel3);
            jLabel3.setBounds(440, 230, 140, 40);

            jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setText("Fecha");
            contenedorFacturas.add(jLabel4);
            jLabel4.setBounds(430, 110, 240, 40);

            jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setText("Descripcion");
            contenedorFacturas.add(jLabel5);
            jLabel5.setBounds(90, 230, 150, 40);

            jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setText("Precio");
            contenedorFacturas.add(jLabel6);
            jLabel6.setBounds(760, 110, 100, 40);

            jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 0, 0));
            jLabel7.setText("Id del proveedor");
            contenedorFacturas.add(jLabel7);
            jLabel7.setBounds(760, 230, 150, 40);

            botonEliminar.setText("Eliminar");
            botonEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonEliminarActionPerformed(evt);
                  }
            });
            contenedorFacturas.add(botonEliminar);
            botonEliminar.setBounds(150, 380, 110, 40);

            botonActualiza.setText("Actualizar");
            botonActualiza.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonActualizaActionPerformed(evt);
                  }
            });
            contenedorFacturas.add(botonActualiza);
            botonActualiza.setBounds(340, 380, 140, 40);

            botonLimpiar.setText("Limpiar campos");
            contenedorFacturas.add(botonLimpiar);
            botonLimpiar.setBounds(560, 380, 130, 40);

            botonCreaRegistro.setText("Subir factura");
            contenedorFacturas.add(botonCreaRegistro);
            botonCreaRegistro.setBounds(770, 380, 130, 40);

            jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        jTextField1KeyTyped(evt);
                  }
            });
            contenedorFacturas.add(jTextField1);
            jTextField1.setBounds(390, 10, 370, 50);

            listaProveedores.setForeground(new java.awt.Color(0, 0, 0));
            listaProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null" }));
            contenedorFacturas.add(listaProveedores);
            listaProveedores.setBounds(940, 270, 80, 40);
            contenedorFacturas.add(campoFecha);
            campoFecha.setBounds(430, 150, 190, 40);

            add(contenedorFacturas, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

      private void tablaFacturasEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasEMouseClicked
           ControllerEntBills.mandaCampos(tablaFacturasE, this);
            
      }//GEN-LAST:event_tablaFacturasEMouseClicked

      private void contenedorFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseEntered
            
            if(actualizame == 0){
                  ControllerEntBills.enviaDatosTabla(tablaFacturasE, "");
                  listaProveedores.removeAllItems();
                  listaProveedores.addItem("Null");
                  listaProveedores.setSelectedItem("Null");
                  ControllerEntBills.llenaComboBox(listaProveedores);
                  actualizame = 1;
            }
            
      }//GEN-LAST:event_contenedorFacturasMouseEntered

      private void contenedorFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorFacturasMouseClicked
            tablaFacturasE.setSelectionMode(0);
            
      }//GEN-LAST:event_contenedorFacturasMouseClicked

      private void campoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyTyped
            ControllerEntBills.blockFieldWords(campoCantidad, evt);
      }//GEN-LAST:event_campoCantidadKeyTyped

      private void campoNFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNFacturaKeyTyped
            
      }//GEN-LAST:event_campoNFacturaKeyTyped

      private void botonActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizaActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_botonActualizaActionPerformed

      private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextField1KeyTyped

      private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_botonEliminarActionPerformed

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

      public static boolean isIsVisibleNFactura() {
            return isVisibleNFactura;
      }

      public static void setIsVisibleNFactura(boolean isVisibleNFactura) {
            PanelNuevaFactura.isVisibleNFactura = isVisibleNFactura;
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botonActualiza;
      private javax.swing.JButton botonCreaRegistro;
      private javax.swing.JButton botonEliminar;
      private javax.swing.JButton botonLimpiar;
      private javax.swing.JTextField campoCantidad;
      private javax.swing.JTextField campoDesc;
      private javax.swing.JTextField campoFecha;
      private javax.swing.JTextField campoIdProveedor;
      private javax.swing.JTextField campoNFactura;
      private javax.swing.JTextField campoPrecio;
      private javax.swing.JPanel contenedorFacturas;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTextField jTextField1;
      private javax.swing.JLabel labelTitleBill;
      private javax.swing.JComboBox<String> listaProveedores;
      private javax.swing.JTable tablaFacturasE;
      // End of variables declaration//GEN-END:variables
}
