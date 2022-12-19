
package Vista_Formulario;

import Controlador.ControllerNewProduct;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelNuevoProducto extends javax.swing.JPanel {
  
     public PanelNuevoProducto() {
          initComponents();
     }
     
     
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          containerComponents = new javax.swing.JPanel();
          botonLimpiaTabla = new javax.swing.JButton();
          labelId = new javax.swing.JLabel();
          labelDesc = new javax.swing.JLabel();
          labelTalla = new javax.swing.JLabel();
          campoId = new javax.swing.JTextField();
          campoDesc = new javax.swing.JTextField();
          campoTalla = new javax.swing.JTextField();
          campoMarca = new javax.swing.JTextField();
          campoTipo = new javax.swing.JTextField();
          campoPrecio = new javax.swing.JTextField();
          campoEdadDirigida = new javax.swing.JTextField();
          campoCantidad = new javax.swing.JTextField();
          labelPrecio = new javax.swing.JLabel();
          labelTipo = new javax.swing.JLabel();
          labelMarca = new javax.swing.JLabel();
          labelCantidad = new javax.swing.JLabel();
          labelEdadDirigida = new javax.swing.JLabel();
          botonCancelar = new javax.swing.JButton();
          botonBorrarCampos = new javax.swing.JButton();
          botonSubirP = new javax.swing.JButton();
          jScrollPane1 = new javax.swing.JScrollPane();
          tablaNProductos = new javax.swing.JTable();
          campoSexo = new javax.swing.JTextField();
          labelSexo = new javax.swing.JLabel();
          labelAdvertencia = new javax.swing.JLabel();
          labelNombreEmpresa = new javax.swing.JLabel();

          setLayout(new java.awt.BorderLayout());

          containerComponents.setBackground(new java.awt.Color(255, 255, 255));
          containerComponents.setLayout(null);

          botonLimpiaTabla.setText("Limpiar tabla");
          botonLimpiaTabla.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLimpiaTablaActionPerformed(evt);
               }
          });
          containerComponents.add(botonLimpiaTabla);
          botonLimpiaTabla.setBounds(1130, 20, 120, 32);

          labelId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelId.setForeground(new java.awt.Color(0, 0, 0));
          labelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelId.setText("Id");
          containerComponents.add(labelId);
          labelId.setBounds(200, 100, 30, 22);

          labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelDesc.setForeground(new java.awt.Color(0, 0, 0));
          labelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelDesc.setText("Descripcion");
          containerComponents.add(labelDesc);
          labelDesc.setBounds(580, 100, 140, 30);

          labelTalla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelTalla.setForeground(new java.awt.Color(0, 0, 0));
          labelTalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelTalla.setText("Talla");
          containerComponents.add(labelTalla);
          labelTalla.setBounds(1040, 100, 60, 22);
          containerComponents.add(campoId);
          campoId.setBounds(150, 140, 130, 40);
          containerComponents.add(campoDesc);
          campoDesc.setBounds(560, 140, 180, 40);
          containerComponents.add(campoTalla);
          campoTalla.setBounds(1000, 140, 140, 40);
          containerComponents.add(campoMarca);
          campoMarca.setBounds(150, 290, 130, 40);
          containerComponents.add(campoTipo);
          campoTipo.setBounds(560, 290, 180, 40);
          containerComponents.add(campoPrecio);
          campoPrecio.setBounds(150, 430, 130, 40);
          containerComponents.add(campoEdadDirigida);
          campoEdadDirigida.setBounds(1000, 290, 160, 40);
          containerComponents.add(campoCantidad);
          campoCantidad.setBounds(560, 430, 180, 40);

          labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
          labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelPrecio.setText("Precio");
          containerComponents.add(labelPrecio);
          labelPrecio.setBounds(180, 390, 70, 20);

          labelTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelTipo.setForeground(new java.awt.Color(0, 0, 0));
          labelTipo.setText("Tipo de producto");
          containerComponents.add(labelTipo);
          labelTipo.setBounds(580, 240, 140, 30);

          labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelMarca.setForeground(new java.awt.Color(0, 0, 0));
          labelMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelMarca.setText("Marca");
          containerComponents.add(labelMarca);
          labelMarca.setBounds(160, 240, 110, 30);

          labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
          labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelCantidad.setText("Cantidad ");
          containerComponents.add(labelCantidad);
          labelCantidad.setBounds(600, 390, 100, 30);

          labelEdadDirigida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelEdadDirigida.setForeground(new java.awt.Color(0, 0, 0));
          labelEdadDirigida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelEdadDirigida.setText("Edad a la que esta dirigida");
          containerComponents.add(labelEdadDirigida);
          labelEdadDirigida.setBounds(970, 240, 230, 30);

          botonCancelar.setText("Cancelar");
          botonCancelar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonCancelarActionPerformed(evt);
               }
          });
          containerComponents.add(botonCancelar);
          botonCancelar.setBounds(150, 510, 130, 40);

          botonBorrarCampos.setText("Borrar datos");
          botonBorrarCampos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonBorrarCamposActionPerformed(evt);
               }
          });
          containerComponents.add(botonBorrarCampos);
          botonBorrarCampos.setBounds(580, 510, 140, 40);

          botonSubirP.setText("Subir producto");
          botonSubirP.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonSubirPActionPerformed(evt);
               }
          });
          containerComponents.add(botonSubirP);
          botonSubirP.setBounds(1000, 510, 140, 40);

          jScrollPane1.setRequestFocusEnabled(false);

          tablaNProductos.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "id", "Descripcion", "Talla", "Marca", "Tipo de producto", "Precio", "Edad dirigida", "Cantidad"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          tablaNProductos.setColumnSelectionAllowed(true);
          tablaNProductos.getTableHeader().setReorderingAllowed(false);
          tablaNProductos.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tablaNProductosMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(tablaNProductos);
          tablaNProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
          if (tablaNProductos.getColumnModel().getColumnCount() > 0) {
               tablaNProductos.getColumnModel().getColumn(0).setResizable(false);
               tablaNProductos.getColumnModel().getColumn(1).setResizable(false);
               tablaNProductos.getColumnModel().getColumn(2).setResizable(false);
               tablaNProductos.getColumnModel().getColumn(3).setResizable(false);
               tablaNProductos.getColumnModel().getColumn(4).setResizable(false);
               tablaNProductos.getColumnModel().getColumn(5).setResizable(false);
               tablaNProductos.getColumnModel().getColumn(6).setResizable(false);
               tablaNProductos.getColumnModel().getColumn(7).setResizable(false);
          }

          containerComponents.add(jScrollPane1);
          jScrollPane1.setBounds(20, 590, 1220, 330);
          containerComponents.add(campoSexo);
          campoSexo.setBounds(1000, 430, 140, 40);

          labelSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelSexo.setForeground(new java.awt.Color(0, 0, 0));
          labelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelSexo.setText("Sexo");
          containerComponents.add(labelSexo);
          labelSexo.setBounds(1040, 390, 70, 30);

          labelAdvertencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
          labelAdvertencia.setForeground(new java.awt.Color(255, 51, 51));
          containerComponents.add(labelAdvertencia);
          labelAdvertencia.setBounds(480, 40, 370, 40);

          labelNombreEmpresa.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
          labelNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
          labelNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelNombreEmpresa.setText("Koulin");
          containerComponents.add(labelNombreEmpresa);
          labelNombreEmpresa.setBounds(20, 20, 210, 50);

          add(containerComponents, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void botonLimpiaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaTablaActionPerformed
          
     }//GEN-LAST:event_botonLimpiaTablaActionPerformed

     private void botonBorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarCamposActionPerformed
         ControllerNewProduct.borrarCampos(this);
     }//GEN-LAST:event_botonBorrarCamposActionPerformed

     private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
     }//GEN-LAST:event_botonCancelarActionPerformed

     private void botonSubirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirPActionPerformed
              ControllerNewProduct.subir(this);
     }//GEN-LAST:event_botonSubirPActionPerformed

     private void tablaNProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNProductosMouseClicked
         
               

     }//GEN-LAST:event_tablaNProductosMouseClicked


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton botonBorrarCampos;
     private javax.swing.JButton botonCancelar;
     private javax.swing.JButton botonLimpiaTabla;
     private javax.swing.JButton botonSubirP;
     private javax.swing.JTextField campoCantidad;
     private javax.swing.JTextField campoDesc;
     private javax.swing.JTextField campoEdadDirigida;
     private javax.swing.JTextField campoId;
     private javax.swing.JTextField campoMarca;
     private javax.swing.JTextField campoPrecio;
     private javax.swing.JTextField campoSexo;
     private javax.swing.JTextField campoTalla;
     private javax.swing.JTextField campoTipo;
     private javax.swing.JPanel containerComponents;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel labelAdvertencia;
     private javax.swing.JLabel labelCantidad;
     private javax.swing.JLabel labelDesc;
     private javax.swing.JLabel labelEdadDirigida;
     private javax.swing.JLabel labelId;
     private javax.swing.JLabel labelMarca;
     private javax.swing.JLabel labelNombreEmpresa;
     private javax.swing.JLabel labelPrecio;
     private javax.swing.JLabel labelSexo;
     private javax.swing.JLabel labelTalla;
     private javax.swing.JLabel labelTipo;
     private javax.swing.JTable tablaNProductos;
     // End of variables declaration//GEN-END:variables

     public int getCampoCantidad() {
          int cantidad = Integer.parseInt(campoCantidad.getText());
          JOptionPane.showMessageDialog(null, cantidad);
          return cantidad;
     }

     public void setCampoCantidad(String texto) {
          campoCantidad.setText(texto);
     }

     public String getCampoDesc() {
          return campoDesc.getText();
     }

     public void setCampoDesc(String texto) {
          campoDesc.setText(texto);
     }

     public String getCampoEdadDirigida() {
          return campoEdadDirigida.getText();
     }

     public void setCampoEdadDirigida(String texto) {
          campoEdadDirigida.setText(texto);
     }

     public String getCampoId() {
          return campoId.getText();
     }

     public void setCampoId(String texto) {
          campoId.setText(texto);
     }

     public String getCampoMarca() {
          return campoMarca.getText();
     }

     public void setCampoMarca(String texto) {
          campoMarca.setText(texto);
     }

     public double getCampoPrecio() {
          double precio = Double.parseDouble(campoPrecio.getText());
          JOptionPane.showMessageDialog(null, precio);
          return precio;
     }

     public void setCampoPrecio(String texto) {
          campoPrecio.setText(texto);
     }

     public String getCampoTalla() {
          return campoTalla.getText();
     }

     public void setCampoTalla(String texto) {
          campoTalla.setText(texto);
     }

     public String getCampoTipo() {
          return campoTipo.getText();
     }

     public void setCampoTipo(String texto) {
          campoTipo.setText(texto);
     }

     public JTable getTablaNProductos() {
          return tablaNProductos;
     }

     public void setTablaNProductos(JTable tablaNProductos) {
          this.tablaNProductos = tablaNProductos;
     }

     public String getCampoSexo() {
          return campoSexo.getText();
     }

     public void setCampoSexo(String texto) {
          campoSexo.setText(texto);
     }

               

}
