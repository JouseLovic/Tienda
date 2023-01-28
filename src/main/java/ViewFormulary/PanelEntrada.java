
package ViewFormulary;

import Controllers.*;
import Controllers.Settings.ReSettings;

import java.awt.Color;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PanelEntrada extends javax.swing.JPanel {

     private String idPSeleccionado = null;
    // private boolean campoRemovidos = false;
     
     private String confirmaId, nBillOriginal;
     private int row;
     private static int actualizame = 0;
     private static boolean isVisibleEntries;
     
     public PanelEntrada() {
          initComponents();
          isVisibleEntries = false;
          labelTitleEntrie.setText(ReSettings.getTitleEntries());
          ControllerEntriesP.llenaComboBox(listaProveedores);
          ControllerEntriesP.enviaDatosTabla(tablaEntradas, "");
     }

     @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            popupMenu1 = new java.awt.PopupMenu();
            jPanel1 = new javax.swing.JPanel();
            labelTitleEntrie = new javax.swing.JLabel();
            labelFactura = new javax.swing.JLabel();
            labelFecha = new javax.swing.JLabel();
            labelCodigoProducto = new javax.swing.JLabel();
            labelCantidad = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tablaEntradas = new javax.swing.JTable();
            labelDesc = new javax.swing.JLabel();
            labelPrecio = new javax.swing.JLabel();
            botonEliminar = new javax.swing.JButton();
            botonLimpiarCampos = new javax.swing.JButton();
            botonSubirF = new javax.swing.JButton();
            campoNFactura = new javax.swing.JTextField();
            campoFecha = new javax.swing.JTextField();
            campoCodigoProducto = new javax.swing.JTextField();
            campoCantidad = new javax.swing.JTextField();
            campoDescripcion = new javax.swing.JTextField();
            campoPrecio = new javax.swing.JTextField();
            labelSeccion = new javax.swing.JLabel();
            campoSeccionE = new javax.swing.JTextField();
            labelMarca = new javax.swing.JLabel();
            campoMarcaE = new javax.swing.JTextField();
            labelProveedor = new javax.swing.JLabel();
            campoProveedor = new javax.swing.JTextField();
            listaProveedores = new javax.swing.JComboBox<>();
            campoBuscar = new javax.swing.JTextField();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel1 = new javax.swing.JLabel();
            botonEditar = new javax.swing.JButton();
            botonReporteExcel = new javax.swing.JButton();
            botonAgregar = new javax.swing.JButton();

            popupMenu1.setLabel("popupMenu1");

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
            jPanel1.setLayout(null);

            labelTitleEntrie.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelTitleEntrie.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleEntrie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jPanel1.add(labelTitleEntrie);
            labelTitleEntrie.setBounds(10, 10, 360, 60);

            labelFactura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelFactura.setForeground(new java.awt.Color(0, 0, 0));
            labelFactura.setText("N° de factura");
            jPanel1.add(labelFactura);
            labelFactura.setBounds(110, 90, 200, 30);

            labelFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelFecha.setForeground(new java.awt.Color(0, 0, 0));
            labelFecha.setText("Fecha");
            jPanel1.add(labelFecha);
            labelFecha.setBounds(430, 90, 200, 30);

            labelCodigoProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCodigoProducto.setForeground(new java.awt.Color(0, 0, 0));
            labelCodigoProducto.setText("Codigo del producto");
            jPanel1.add(labelCodigoProducto);
            labelCodigoProducto.setBounds(720, 90, 220, 30);

            labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
            labelCantidad.setText("Cantidad");
            jPanel1.add(labelCantidad);
            labelCantidad.setBounds(720, 190, 130, 30);

            tablaEntradas = new javax.swing.JTable(){

                  public boolean isCellEditable(int rowIndex, int columnIndex){
                        return false;
                  }
            };
            tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "N° de factura", "Fecha", "Descripcion", "Precio", "Codigo de producto", "Cantidad"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            tablaEntradas.setDragEnabled(true);
            tablaEntradas.setFillsViewportHeight(true);
            tablaEntradas.setGridColor(new java.awt.Color(255, 255, 255));
            tablaEntradas.getTableHeader().setReorderingAllowed(false);
            tablaEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tablaEntradasMouseClicked(evt);
                  }
            });
            tablaEntradas.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        tablaEntradasKeyPressed(evt);
                  }
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        tablaEntradasKeyReleased(evt);
                  }
            });
            jScrollPane1.setViewportView(tablaEntradas);

            jPanel1.add(jScrollPane1);
            jScrollPane1.setBounds(10, 500, 1030, 450);

            labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelDesc.setForeground(new java.awt.Color(0, 0, 0));
            labelDesc.setText("Descripción");
            jPanel1.add(labelDesc);
            labelDesc.setBounds(430, 190, 200, 30);

            labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
            labelPrecio.setText("Precio");
            jPanel1.add(labelPrecio);
            labelPrecio.setBounds(110, 190, 90, 30);

            botonEliminar.setText("Eliminar");
            botonEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonEliminarActionPerformed(evt);
                  }
            });
            jPanel1.add(botonEliminar);
            botonEliminar.setBounds(150, 440, 150, 40);

            botonLimpiarCampos.setText("Limpiar campos");
            botonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonLimpiarCamposActionPerformed(evt);
                  }
            });
            jPanel1.add(botonLimpiarCampos);
            botonLimpiarCampos.setBounds(430, 440, 150, 40);

            botonSubirF.setText("Subir entrada");
            botonSubirF.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botonSubirFActionPerformed(evt);
                  }
            });
            jPanel1.add(botonSubirF);
            botonSubirF.setBounds(720, 440, 150, 40);

            campoNFactura.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        campoNFacturaMouseReleased(evt);
                  }
            });
            jPanel1.add(campoNFactura);
            campoNFactura.setBounds(110, 130, 200, 40);
            jPanel1.add(campoFecha);
            campoFecha.setBounds(430, 130, 200, 40);
            jPanel1.add(campoCodigoProducto);
            campoCodigoProducto.setBounds(720, 130, 230, 40);

            campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoCantidadKeyTyped(evt);
                  }
            });
            jPanel1.add(campoCantidad);
            campoCantidad.setBounds(720, 230, 160, 40);

            campoDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoDescripcionKeyTyped(evt);
                  }
            });
            jPanel1.add(campoDescripcion);
            campoDescripcion.setBounds(430, 230, 200, 40);

            campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoPrecioKeyTyped(evt);
                  }
            });
            jPanel1.add(campoPrecio);
            campoPrecio.setBounds(110, 230, 200, 40);

            labelSeccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelSeccion.setForeground(new java.awt.Color(0, 0, 0));
            labelSeccion.setText("Seccion");
            jPanel1.add(labelSeccion);
            labelSeccion.setBounds(110, 300, 220, 30);

            campoSeccionE.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoSeccionEKeyTyped(evt);
                  }
            });
            jPanel1.add(campoSeccionE);
            campoSeccionE.setBounds(110, 340, 180, 40);

            labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelMarca.setForeground(new java.awt.Color(0, 0, 0));
            labelMarca.setText("Marca");
            jPanel1.add(labelMarca);
            labelMarca.setBounds(430, 300, 180, 30);

            campoMarcaE.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        campoMarcaEKeyTyped(evt);
                  }
            });
            jPanel1.add(campoMarcaE);
            campoMarcaE.setBounds(430, 340, 190, 40);

            labelProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            labelProveedor.setForeground(new java.awt.Color(0, 0, 0));
            labelProveedor.setText("Id del proveedor");
            jPanel1.add(labelProveedor);
            labelProveedor.setBounds(720, 300, 240, 30);

            campoProveedor.setEditable(false);
            jPanel1.add(campoProveedor);
            campoProveedor.setBounds(720, 340, 160, 40);

            listaProveedores.setForeground(new java.awt.Color(0, 0, 0));
            listaProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
            listaProveedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            listaProveedores.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        listaProveedoresActionPerformed(evt);
                  }
            });
            jPanel1.add(listaProveedores);
            listaProveedores.setBounds(900, 340, 100, 40);

            campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyReleased(java.awt.event.KeyEvent evt) {
                        campoBuscarKeyReleased(evt);
                  }
            });
            jPanel1.add(campoBuscar);
            campoBuscar.setBounds(460, 10, 320, 40);
            jPanel1.add(jSeparator1);
            jSeparator1.setBounds(900, 380, 100, 10);

            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("Vendor");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(900, 320, 70, 16);

            botonEditar.setText("jButton1");
            jPanel1.add(botonEditar);
            botonEditar.setBounds(800, 23, 30, 30);

            botonReporteExcel.setText("jButton1");
            jPanel1.add(botonReporteExcel);
            botonReporteExcel.setBounds(850, 23, 30, 30);

            botonAgregar.setText("jButton1");
            jPanel1.add(botonAgregar);
            botonAgregar.setBounds(900, 20, 30, 30);

            add(jPanel1, java.awt.BorderLayout.CENTER);
      }// </editor-fold>//GEN-END:initComponents

     private void tablaEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntradasMouseClicked
                ControllerEntriesP.mandaCampos(tablaEntradas, this);
                row = tablaEntradas.getSelectedRow();
                nBillOriginal = (String) tablaEntradas.getValueAt(row, 0);
                listaProveedores.setSelectedItem(String.valueOf(tablaEntradas.getValueAt(tablaEntradas.getSelectedRow(), 8)));
     }//GEN-LAST:event_tablaEntradasMouseClicked

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerEntriesP.eliminar(tablaEntradas, nBillOriginal);
          tablaEntradas.setSelectionMode(0);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {                                                       
          tablaEntradas.setSelectionMode(0);
          nBillOriginal = "";
          ControllerEntriesP.limpiaCampos(this);
     }                                                  

     private void botonSubirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFActionPerformed
         try {
             ControllerEntriesP.insertar(tablaEntradas,this, nBillOriginal);
     } catch (SQLIntegrityConstraintViolationException e) {
          JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
     }
     }//GEN-LAST:event_botonSubirFActionPerformed

     private void listaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProveedoresActionPerformed
            ControllerEntriesP.mandaProveedor(tablaEntradas, String.valueOf(listaProveedores.getSelectedItem()), this);
            labelProveedor.setText("Id del proveedor");
            labelProveedor.setForeground(Color.BLACK);
     }//GEN-LAST:event_listaProveedoresActionPerformed

     private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
         tablaEntradas.setSelectionMode(0);
     }//GEN-LAST:event_jPanel1MouseClicked

     private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       
          if(actualizame==0){
                ControllerEntriesP.enviaDatosTabla(tablaEntradas, "");
                listaProveedores.removeAllItems();;
                listaProveedores.addItem("Ninguno");
                listaProveedores.setSelectedItem("Ninguno");
                ControllerEntriesP.llenaComboBox(listaProveedores);
                actualizame++;
              }
          
     }//GEN-LAST:event_jPanel1MouseEntered

     private void campoPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerEntriesP.bloqueaLetrasPrecio(keyNumeros, evt);
     }//GEN-LAST:event_campoPrecioKeyTyped

     private void campoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerEntriesP.bloqueaLetrasCantidad(keyNumeros, evt);
     }//GEN-LAST:event_campoCantidadKeyTyped

     private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
          ControllerEntriesP.enviaDatosTabla(tablaEntradas, campoBuscar.getText());
     }//GEN-LAST:event_campoBuscarKeyReleased

      private void campoSeccionEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeccionEKeyTyped
            labelSeccion.setText("Seccion");
            labelSeccion.setForeground(Color.BLACK);
      }//GEN-LAST:event_campoSeccionEKeyTyped

      private void campoMarcaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMarcaEKeyTyped
             labelMarca.setText("Marca");
             labelMarca.setForeground(Color.BLACK);
      }//GEN-LAST:event_campoMarcaEKeyTyped

      private void campoDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDescripcionKeyTyped
             labelDesc.setText("Descripcion");
             labelDesc.setForeground(Color.BLACK);
      }//GEN-LAST:event_campoDescripcionKeyTyped

      private void campoNFacturaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoNFacturaMouseReleased
           
      }//GEN-LAST:event_campoNFacturaMouseReleased

      private void tablaEntradasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEntradasKeyReleased
          ControllerEntriesP.mandaCampos(tablaEntradas, this);
          row = tablaEntradas.getSelectedRow();
          nBillOriginal = (String) tablaEntradas.getValueAt(row, 0);
          listaProveedores.setSelectedItem(String.valueOf(tablaEntradas.getValueAt(tablaEntradas.getSelectedRow(), 8)));
      }//GEN-LAST:event_tablaEntradasKeyReleased

      private void tablaEntradasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEntradasKeyPressed
          ControllerEntriesP.mandaCampos(tablaEntradas, this);
          row = tablaEntradas.getSelectedRow();
          nBillOriginal = (String) tablaEntradas.getValueAt(row, 0);
          listaProveedores.setSelectedItem(String.valueOf(tablaEntradas.getValueAt(tablaEntradas.getSelectedRow(), 8)));
      }//GEN-LAST:event_tablaEntradasKeyPressed

     public String getCampoCantidad() {
          return campoCantidad.getText();
     }

     public String getCampoCodigoProducto() {
          return campoCodigoProducto.getText();
     }

     public String getCampoDescripcion() {
          return campoDescripcion.getText();
     }

     public String getCampoFecha() {
          return campoFecha.getText();
     }

     public String getCampoNFactura() {
          return campoNFactura.getText();
     }

     public Double getCampoPrecio() {
          double precio = Double.parseDouble(campoPrecio.getText());
          return precio;
     }

     public String evaluaCampoPrecio(){
          return campoPrecio.getText();
     }

     public void setCampoCodigoProducto(String texto){
          this.campoCodigoProducto.setText(texto);
     }

     public void setCampoNFactura(String texto){
          this.campoNFactura.setText(texto);
     }

     public String getIdPSeleccionado() {
          return idPSeleccionado;
     }

     public void setListaProveedores(JComboBox<String> listaProveedores) {
          this.listaProveedores = listaProveedores;
     }

     public String getCampoMarcaE() {
          return campoMarcaE.getText();
     }

     public void setCampoMarcaE(String campoMarcaE) {
          this.campoMarcaE.setText(campoMarcaE);
     }

     public String getCampoProveedor() {
          return campoProveedor.getText();
     }

     public void setCampoProveedor(String campoProveedor) {
          this.campoProveedor.setText(campoProveedor);
     }

     public String getCampoSeccionE() {
          return campoSeccionE.getText();
     }

     public void setCampoSeccionE(String campoSeccionE) {
          this.campoSeccionE.setText(campoSeccionE);
     }

     public String getConfirmaId() {
          return confirmaId;
     }

     public void setCampoCantidad(String campoCantidad) {
          this.campoCantidad.setText(campoCantidad);
     }

     public void setCampoFecha(String campoFecha) {
          this.campoFecha.setText(campoFecha);;
     }

     public void setCampoPrecio(String campoPrecio) {
          this.campoPrecio.setText(campoPrecio);
     }

     public void setCampoDescripcion(String campoDescripcion) {
          this.campoDescripcion.setText(campoDescripcion);
     }

     public void setConfirmaId(String confirmaId) {
          this.confirmaId = confirmaId;
     }

     public static void setActualizame(int numero){
          actualizame = numero;
     }
     
     public static int getActualizame(){
          return actualizame;
     }
     
     public void setSeleccionLista(int index){
          listaProveedores.setSelectedIndex(index);
     }

      public void setLabelMarca(String texto) {
            this.labelMarca.setText(texto);
            this.labelMarca.setForeground(Color.RED);
      }

      public void setLabelSeccion(String texto) {
            this.labelSeccion.setText(texto);
            this.labelSeccion.setForeground(Color.RED);
      }
     
      public void setLabelProveedor(String texto) {
            this.labelProveedor.setText(texto);
            this.labelProveedor.setForeground(Color.RED);
      }
     
      public void setLabelDesc(String texto) {
            this.labelDesc.setText(texto);
            this.labelDesc.setForeground(Color.RED);
      }

     public static boolean isIsVisibleEntries() {
         return isVisibleEntries;
     }

     public static void setIsVisibleEntries(boolean isVisibleEntries) {
         PanelEntrada.isVisibleEntries = isVisibleEntries;
     }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botonAgregar;
      private javax.swing.JButton botonEditar;
      private javax.swing.JButton botonEliminar;
      private javax.swing.JButton botonLimpiarCampos;
      private javax.swing.JButton botonReporteExcel;
      private javax.swing.JButton botonSubirF;
      private javax.swing.JTextField campoBuscar;
      private javax.swing.JTextField campoCantidad;
      private javax.swing.JTextField campoCodigoProducto;
      private javax.swing.JTextField campoDescripcion;
      private javax.swing.JTextField campoFecha;
      private javax.swing.JTextField campoMarcaE;
      private javax.swing.JTextField campoNFactura;
      private javax.swing.JTextField campoPrecio;
      private javax.swing.JTextField campoProveedor;
      private javax.swing.JTextField campoSeccionE;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JLabel labelCantidad;
      private javax.swing.JLabel labelCodigoProducto;
      private javax.swing.JLabel labelDesc;
      private javax.swing.JLabel labelFactura;
      private javax.swing.JLabel labelFecha;
      private javax.swing.JLabel labelMarca;
      private javax.swing.JLabel labelPrecio;
      private javax.swing.JLabel labelProveedor;
      private javax.swing.JLabel labelSeccion;
      private javax.swing.JLabel labelTitleEntrie;
      private javax.swing.JComboBox<String> listaProveedores;
      private java.awt.PopupMenu popupMenu1;
      private javax.swing.JTable tablaEntradas;
      // End of variables declaration//GEN-END:variables
}
