
package Vista_Formulario;

import Controlador.ControllerNewProduct;

import java.awt.Color;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.*;

public class PanelNuevoProducto extends javax.swing.JPanel {
  
     private static boolean camposMovidos = false;
     private static boolean campoRegresados = true;
     private boolean llaveActiva = false;//esto es para el boton
     private boolean campoActivo = true;
     private int filaIdObtenido = 0;
     
     public PanelNuevoProducto() {
          initComponents();
          ControllerNewProduct.enviaDatosTabla(tablaNProductos);
          botonActualiza.setEnabled(false);
     }
     
     
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          containerComponents = new javax.swing.JPanel();
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
          botonLimpiaCampos = new javax.swing.JButton();
          botonSubirP = new javax.swing.JButton();
          jScrollPane1 = new javax.swing.JScrollPane();
          tablaNProductos = new javax.swing.JTable();
          campoSexo = new javax.swing.JTextField();
          labelSexo = new javax.swing.JLabel();
          labelNombreEmpresa = new javax.swing.JLabel();
          botonEliminar = new javax.swing.JButton();
          botonActualiza = new javax.swing.JButton();
          botonCambiaVista = new javax.swing.JButton();
          botonLlave = new javax.swing.JButton();

          setLayout(new java.awt.BorderLayout());

          containerComponents.setBackground(new java.awt.Color(255, 255, 255));
          containerComponents.setLayout(null);

          labelId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelId.setForeground(new java.awt.Color(0, 0, 0));
          labelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelId.setText("Id");
          containerComponents.add(labelId);
          labelId.setBounds(40, 100, 360, 30);

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

          campoId.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    campoIdKeyReleased(evt);
               }
          });
          containerComponents.add(campoId);
          campoId.setBounds(150, 140, 130, 40);
          containerComponents.add(campoDesc);
          campoDesc.setBounds(560, 140, 180, 40);
          containerComponents.add(campoTalla);
          campoTalla.setBounds(1000, 140, 150, 40);
          containerComponents.add(campoMarca);
          campoMarca.setBounds(150, 290, 130, 40);
          containerComponents.add(campoTipo);
          campoTipo.setBounds(560, 290, 180, 40);

          campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    campoPrecioKeyReleased(evt);
               }
          });
          containerComponents.add(campoPrecio);
          campoPrecio.setBounds(150, 430, 130, 40);
          containerComponents.add(campoEdadDirigida);
          campoEdadDirigida.setBounds(970, 290, 230, 40);

          campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    campoCantidadKeyReleased(evt);
               }
          });
          containerComponents.add(campoCantidad);
          campoCantidad.setBounds(560, 430, 180, 40);

          labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
          labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelPrecio.setText("Precio");
          containerComponents.add(labelPrecio);
          labelPrecio.setBounds(80, 390, 270, 30);

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
          labelCantidad.setBounds(500, 390, 320, 30);

          labelEdadDirigida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelEdadDirigida.setForeground(new java.awt.Color(0, 0, 0));
          labelEdadDirigida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelEdadDirigida.setText("Edad a la que esta dirigida");
          containerComponents.add(labelEdadDirigida);
          labelEdadDirigida.setBounds(970, 240, 230, 30);

          botonLimpiaCampos.setText("Limpiar campos");
          botonLimpiaCampos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLimpiaCamposActionPerformed(evt);
               }
          });
          containerComponents.add(botonLimpiaCampos);
          botonLimpiaCampos.setBounds(560, 510, 180, 40);

          botonSubirP.setText("Subir nuevo producto");
          botonSubirP.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonSubirPActionPerformed(evt);
               }
          });
          containerComponents.add(botonSubirP);
          botonSubirP.setBounds(990, 510, 160, 40);

          jScrollPane1.setRequestFocusEnabled(false);

          tablaNProductos = new javax.swing.JTable(){

               public boolean isCellEditable(int rowIndex, int columnIndex){
                    return false;
               }
          };
          tablaNProductos.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "id", "Descripcion", "Talla", "Marca", "Tipo de producto", "Precio", "Edad dirigida", "Cantidad", "Sexo"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          tablaNProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          tablaNProductos.getTableHeader().setReorderingAllowed(false);
          tablaNProductos.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseReleased(java.awt.event.MouseEvent evt) {
                    tablaNProductosMouseReleased(evt);
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
          campoSexo.setBounds(1000, 430, 160, 40);

          labelSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelSexo.setForeground(new java.awt.Color(0, 0, 0));
          labelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelSexo.setText("Sexo");
          containerComponents.add(labelSexo);
          labelSexo.setBounds(1020, 390, 120, 30);

          labelNombreEmpresa.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
          labelNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
          labelNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelNombreEmpresa.setText("Koulin");
          containerComponents.add(labelNombreEmpresa);
          labelNombreEmpresa.setBounds(20, 20, 210, 50);

          botonEliminar.setText("Eliminar");
          botonEliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonEliminarActionPerformed(evt);
               }
          });
          containerComponents.add(botonEliminar);
          botonEliminar.setBounds(150, 520, 140, 40);

          botonActualiza.setText("Actualizar");
          botonActualiza.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActualizaActionPerformed(evt);
               }
          });
          containerComponents.add(botonActualiza);
          botonActualiza.setBounds(350, 20, 140, 40);

          botonCambiaVista.setText("Quitar campos");
          botonCambiaVista.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonCambiaVistaActionPerformed(evt);
               }
          });
          containerComponents.add(botonCambiaVista);
          botonCambiaVista.setBounds(820, 20, 140, 40);

          botonLlave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          botonLlave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/llaveDesactivada.png"))); // NOI18N
          botonLlave.setBorder(null);
          botonLlave.setBorderPainted(false);
          botonLlave.setContentAreaFilled(false);
          botonLlave.setFocusPainted(false);
          botonLlave.setFocusable(false);
          botonLlave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          botonLlave.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/llaveDesactivadaOscura.png"))); // NOI18N
          botonLlave.setRolloverEnabled(true);
          botonLlave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/llaveDesactivada.png"))); // NOI18N
          botonLlave.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLlaveActionPerformed(evt);
               }
          });
          containerComponents.add(botonLlave);
          botonLlave.setBounds(290, 130, 60, 60);

          add(containerComponents, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void botonLimpiaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaCamposActionPerformed
         ControllerNewProduct.borrarCampos(this);
         botonActualiza.setEnabled(false);
         llaveActiva = false;
         campoActivo = true;
         ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
         botonLlave.setIcon(image);
         campoId.setEditable(true);
     }//GEN-LAST:event_botonLimpiaCamposActionPerformed

     private void botonSubirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirPActionPerformed
               try {
				ControllerNewProduct.subir(this, tablaNProductos);
                    ControllerNewProduct.enviaDatosTabla(tablaNProductos);
			} catch (SQLIntegrityConstraintViolationException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    ControllerNewProduct.borrarCampos(this); 
			}
     }//GEN-LAST:event_botonSubirPActionPerformed

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerNewProduct.eliminar(tablaNProductos);
          ControllerNewProduct.borrarCampos(this);
          botonActualiza.setEnabled(false);
          campoActivo = true;
          llaveActiva = true;
          campoId.setEditable(true);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizaActionPerformed
          ControllerNewProduct.actualizarProducto(tablaNProductos, this);
          llaveActiva = false;
          campoActivo = true;
          ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
          botonLlave.setIcon(image);
          ControllerNewProduct.enviaDatosTabla(tablaNProductos);
     }//GEN-LAST:event_botonActualizaActionPerformed

     private void botonCambiaVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiaVistaActionPerformed
          ControllerNewProduct.mueveComponentes(campoId, campoDesc, campoTalla, campoMarca, campoTipo, campoPrecio, campoEdadDirigida, campoCantidad, campoSexo);
     }//GEN-LAST:event_botonCambiaVistaActionPerformed

     private void tablaNProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNProductosMouseReleased
          botonActualiza.setEnabled(true);
          ControllerNewProduct.mandaDatosCampos(tablaNProductos, this);
          llaveActiva = false;
          campoActivo = false;
          ImageIcon image = new ImageIcon(getClass().getResource("/images/llaveDesactivada.png"));
          botonLlave.setIcon(image);
          campoId.setEditable(false);
     }//GEN-LAST:event_tablaNProductosMouseReleased

     private void campoIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdKeyReleased
          labelId.setText("Id");
          labelId.setForeground(Color.BLACK);
     }//GEN-LAST:event_campoIdKeyReleased

     private void campoPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyReleased
          labelPrecio.setText("Precio");
          labelPrecio.setForeground(Color.BLACK);
     }//GEN-LAST:event_campoPrecioKeyReleased

     private void campoCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyReleased
          labelCantidad.setText("Cantidad");
          labelCantidad.setForeground(Color.BLACK);
     }//GEN-LAST:event_campoCantidadKeyReleased

     private void botonLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLlaveActionPerformed
       new ControllerNewProduct().activacionDeLlave(this);
     }//GEN-LAST:event_botonLlaveActionPerformed


     public void setLabelId(String texto) {
          labelId.setForeground(Color.RED);
          labelId.setText(texto);
     }

     public void setLabelPrecio(String texto) {
          labelPrecio.setForeground(Color.RED);
          labelPrecio.setText(texto);
     }

     public void setLabelCantidad(String texto) {
          labelCantidad.setForeground(Color.RED);
          labelCantidad.setText(texto);
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton botonActualiza;
     private javax.swing.JButton botonCambiaVista;
     private javax.swing.JButton botonEliminar;
     private javax.swing.JButton botonLimpiaCampos;
     private javax.swing.JButton botonLlave;
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

     public String getCampoCantidad() {
          return campoCantidad.getText();
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

     public String getCampoPrecio() {
          return campoPrecio.getText();
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

     public void setTablaNProductos(JTable tablaNProductos) {
          this.tablaNProductos = tablaNProductos;
     }

     public String getCampoSexo() {
          return campoSexo.getText();
     }

     public void setCampoSexo(String texto) {
          campoSexo.setText(texto);
     }

     public int getFilaIdObtenido() {
          return filaIdObtenido;
     }

     public void setFilaIdObtenido(int filaIdObtenido) {
          this.filaIdObtenido = filaIdObtenido;
     }


     public boolean isLlaveActiva() {
          return llaveActiva;
     }

     public void setLlaveActiva(boolean llaveActiva) {
          this.llaveActiva = llaveActiva;
     }

     public void setBotonLlave(ImageIcon imagen) {
          botonLlave.setIcon(imagen);
     }

     public boolean isCampoActivo() {
          return campoActivo;
     }

     public void setCampoActivo(boolean campoActivo) {
          this.campoActivo = campoActivo;
     }

     public void setEditableId(boolean act) {
          campoId.setEditable(act);
     }

               

}
