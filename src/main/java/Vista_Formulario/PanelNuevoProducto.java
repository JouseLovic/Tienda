
package Vista_Formulario;

import Controlador.ControllerNewProduct;
import java.awt.Color;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.*;

public class PanelNuevoProducto extends javax.swing.JPanel {
  
     private static int actualizame = 0;
     private static boolean camposMovidos = false;
     private boolean llaveActiva = false;
     private boolean campoActivo = true;
     private String confirmaId;
     
     public PanelNuevoProducto() {
          initComponents();
          ControllerNewProduct.enviaDatosTabla(tablaNProductos, "");
          botonActualiza.setEnabled(false);
          botonConfirma.setEnabled(false);;
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
          campoSeccion = new javax.swing.JTextField();
          campoPrecio = new javax.swing.JTextField();
          campoEdadDirigida = new javax.swing.JTextField();
          campoCantidad = new javax.swing.JTextField();
          labelPrecio = new javax.swing.JLabel();
          labelSeccion = new javax.swing.JLabel();
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
          campoVendido = new javax.swing.JTextField();
          labelVendido = new javax.swing.JLabel();
          botonConfirma = new javax.swing.JButton();
          labelIdProveedor = new javax.swing.JLabel();
          campoIdProveedor = new javax.swing.JTextField();
          campoBuscar = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();

          setLayout(new java.awt.BorderLayout());

          containerComponents.setBackground(new java.awt.Color(255, 255, 255));
          containerComponents.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    containerComponentsMouseClicked(evt);
               }
               public void mouseEntered(java.awt.event.MouseEvent evt) {
                    containerComponentsMouseEntered(evt);
               }
          });
          containerComponents.setLayout(null);

          labelId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelId.setForeground(new java.awt.Color(0, 0, 0));
          labelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelId.setText("Id");
          containerComponents.add(labelId);
          labelId.setBounds(30, 80, 360, 30);

          labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelDesc.setForeground(new java.awt.Color(0, 0, 0));
          labelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelDesc.setText("Descripcion");
          containerComponents.add(labelDesc);
          labelDesc.setBounds(420, 80, 140, 30);

          labelTalla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelTalla.setForeground(new java.awt.Color(0, 0, 0));
          labelTalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelTalla.setText("Talla");
          containerComponents.add(labelTalla);
          labelTalla.setBounds(720, 80, 60, 22);

          campoId.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    campoIdKeyReleased(evt);
               }
          });
          containerComponents.add(campoId);
          campoId.setBounds(140, 120, 140, 40);
          containerComponents.add(campoDesc);
          campoDesc.setBounds(390, 120, 180, 40);
          containerComponents.add(campoTalla);
          campoTalla.setBounds(670, 120, 160, 40);
          containerComponents.add(campoMarca);
          campoMarca.setBounds(140, 240, 150, 40);
          containerComponents.add(campoSeccion);
          campoSeccion.setBounds(390, 240, 200, 40);

          campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    campoPrecioKeyReleased(evt);
               }
          });
          containerComponents.add(campoPrecio);
          campoPrecio.setBounds(170, 360, 130, 40);
          containerComponents.add(campoEdadDirigida);
          campoEdadDirigida.setBounds(900, 120, 230, 40);

          campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    campoCantidadKeyReleased(evt);
               }
          });
          containerComponents.add(campoCantidad);
          campoCantidad.setBounds(530, 360, 180, 40);

          labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
          labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelPrecio.setText("Precio");
          containerComponents.add(labelPrecio);
          labelPrecio.setBounds(90, 320, 280, 30);

          labelSeccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelSeccion.setForeground(new java.awt.Color(0, 0, 0));
          labelSeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelSeccion.setText("Seccion del producto");
          containerComponents.add(labelSeccion);
          labelSeccion.setBounds(390, 200, 200, 30);

          labelMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelMarca.setForeground(new java.awt.Color(0, 0, 0));
          labelMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelMarca.setText("Marca");
          containerComponents.add(labelMarca);
          labelMarca.setBounds(150, 200, 110, 30);

          labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
          labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelCantidad.setText("Cantidad ");
          containerComponents.add(labelCantidad);
          labelCantidad.setBounds(460, 320, 320, 30);

          labelEdadDirigida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelEdadDirigida.setForeground(new java.awt.Color(0, 0, 0));
          labelEdadDirigida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelEdadDirigida.setText("Edad a la que esta dirigida");
          containerComponents.add(labelEdadDirigida);
          labelEdadDirigida.setBounds(900, 80, 230, 30);

          botonLimpiaCampos.setText("Limpiar campos");
          botonLimpiaCampos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonLimpiaCamposActionPerformed(evt);
               }
          });
          containerComponents.add(botonLimpiaCampos);
          botonLimpiaCampos.setBounds(710, 450, 180, 40);

          botonSubirP.setText("Subir nuevo producto");
          botonSubirP.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonSubirPActionPerformed(evt);
               }
          });
          containerComponents.add(botonSubirP);
          botonSubirP.setBounds(1040, 450, 160, 40);

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
                    "id", "Descripcion", "Talla", "Marca", "Tipo de producto", "Precio", "Edad dirigida", "Cantidad", "Sexo", "Id del proveedor", "Producto vendido"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false, false, false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          tablaNProductos.setColumnSelectionAllowed(true);
          tablaNProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          tablaNProductos.getTableHeader().setReorderingAllowed(false);
          tablaNProductos.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseReleased(java.awt.event.MouseEvent evt) {
                    tablaNProductosMouseReleased(evt);
               }
          });
          tablaNProductos.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    tablaNProductosKeyReleased(evt);
               }
          });
          jScrollPane1.setViewportView(tablaNProductos);
          tablaNProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

          containerComponents.add(jScrollPane1);
          jScrollPane1.setBounds(20, 510, 1220, 410);
          containerComponents.add(campoSexo);
          campoSexo.setBounds(680, 240, 160, 40);

          labelSexo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelSexo.setForeground(new java.awt.Color(0, 0, 0));
          labelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelSexo.setText("Sexo");
          containerComponents.add(labelSexo);
          labelSexo.setBounds(700, 200, 120, 30);

          labelNombreEmpresa.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
          labelNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
          labelNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelNombreEmpresa.setText("C.R.U.D");
          containerComponents.add(labelNombreEmpresa);
          labelNombreEmpresa.setBounds(10, 10, 210, 50);

          botonEliminar.setText("Eliminar");
          botonEliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonEliminarActionPerformed(evt);
               }
          });
          containerComponents.add(botonEliminar);
          botonEliminar.setBounds(70, 450, 140, 40);

          botonActualiza.setText("Actualizar");
          botonActualiza.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActualizaActionPerformed(evt);
               }
          });
          containerComponents.add(botonActualiza);
          botonActualiza.setBounds(360, 20, 140, 40);

          botonCambiaVista.setText("Quitar campos");
          botonCambiaVista.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonCambiaVistaActionPerformed(evt);
               }
          });
          containerComponents.add(botonCambiaVista);
          botonCambiaVista.setBounds(620, 20, 140, 40);

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
          botonLlave.setBounds(290, 110, 50, 50);
          containerComponents.add(campoVendido);
          campoVendido.setBounds(900, 360, 180, 40);

          labelVendido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelVendido.setForeground(new java.awt.Color(0, 0, 0));
          labelVendido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelVendido.setText("Producto vendido");
          containerComponents.add(labelVendido);
          labelVendido.setBounds(880, 320, 220, 30);

          botonConfirma.setText("Confirmar productos vendido");
          botonConfirma.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonConfirmaActionPerformed(evt);
               }
          });
          containerComponents.add(botonConfirma);
          botonConfirma.setBounds(340, 450, 200, 40);

          labelIdProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          labelIdProveedor.setForeground(new java.awt.Color(0, 0, 0));
          labelIdProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          labelIdProveedor.setText("Id del proveedor");
          containerComponents.add(labelIdProveedor);
          labelIdProveedor.setBounds(940, 200, 170, 30);
          containerComponents.add(campoIdProveedor);
          campoIdProveedor.setBounds(910, 240, 230, 40);

          campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyReleased(java.awt.event.KeyEvent evt) {
                    campoBuscarKeyReleased(evt);
               }
          });
          containerComponents.add(campoBuscar);
          campoBuscar.setBounds(970, 20, 210, 30);

          jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(0, 0, 0));
          jLabel1.setText("Buscar id:");
          containerComponents.add(jLabel1);
          jLabel1.setBounds(880, 20, 90, 30);

          add(containerComponents, java.awt.BorderLayout.CENTER);
     }// </editor-fold>//GEN-END:initComponents

     private void botonLimpiaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiaCamposActionPerformed
         ControllerNewProduct.borrarCampos(this);
         new ControllerNewProduct().paraBotonLimpiar(tablaNProductos, this);
     }//GEN-LAST:event_botonLimpiaCamposActionPerformed

     private void botonSubirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirPActionPerformed
               try {
				ControllerNewProduct.subir(this, tablaNProductos);
                    ControllerNewProduct.enviaDatosTabla(tablaNProductos, "");
			} catch (SQLIntegrityConstraintViolationException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    ControllerNewProduct.borrarCampos(this); 
			}
     }//GEN-LAST:event_botonSubirPActionPerformed

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerNewProduct.eliminar(tablaNProductos);
          ControllerNewProduct.borrarCampos(this);
          ControllerNewProduct.paraBotonEliminar(tablaNProductos, this);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizaActionPerformed
          ControllerNewProduct.actualizarProducto(this);
          ControllerNewProduct.enviaDatosTabla(tablaNProductos, "");
          new ControllerNewProduct().paraBotonActualizar(tablaNProductos, this);
     }//GEN-LAST:event_botonActualizaActionPerformed

     private void botonCambiaVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiaVistaActionPerformed
       ControllerNewProduct.desplazaTodosLosComponentesCampos();
     }//GEN-LAST:event_botonCambiaVistaActionPerformed

     private void tablaNProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNProductosMouseReleased
          new ControllerNewProduct().filaSeleccionada(tablaNProductos, this);
          ControllerNewProduct.mandaDatosCampos(tablaNProductos, this);
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

     private void botonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmaActionPerformed
         ControllerNewProduct.confirmar(this);
         ControllerNewProduct.enviaDatosTabla(tablaNProductos, "");
         tablaNProductos.setSelectionMode(0);
         botonConfirma.setEnabled(false);
     }//GEN-LAST:event_botonConfirmaActionPerformed

     private void tablaNProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaNProductosKeyReleased
          new ControllerNewProduct().filaSeleccionada(tablaNProductos, this);
          ControllerNewProduct.mandaDatosCampos(tablaNProductos, this);
     }//GEN-LAST:event_tablaNProductosKeyReleased

     private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
      ControllerNewProduct.enviaDatosTabla(tablaNProductos, campoBuscar.getText());       
     }//GEN-LAST:event_campoBuscarKeyReleased

     private void containerComponentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerComponentsMouseEntered
            
          if(actualizame==0){
                ControllerNewProduct.enviaDatosTabla(tablaNProductos, "");
                actualizame++;
              }
     }//GEN-LAST:event_containerComponentsMouseEntered

     private void containerComponentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerComponentsMouseClicked
          tablaNProductos.setSelectionMode(0);
     }//GEN-LAST:event_containerComponentsMouseClicked

     public String getCampoIdProveedor() {
          return campoIdProveedor.getText();
     }

     public void setCampoIdProveedor(String campoIdProveedor) {
          this.campoIdProveedor.setText(campoIdProveedor);
     }
     
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

     public String getCampoSeccion() {
          return campoSeccion.getText();
     }

     public void setCampoSeccion(String texto) {
          campoSeccion.setText(texto);
     }

     public String getCampoSexo() {
          return campoSexo.getText();
     }

     public void setCampoSexo(String texto) {
          campoSexo.setText(texto);
     }

     public String getConfirmaId() {
          return confirmaId;
     }

     public void setConfirmaId(String id){
          this.confirmaId = id;
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

     public String getCampoVendido() {
          return campoVendido.getText();
     }

     public void setCampoVendido(String texto) {
          this.campoVendido.setText(texto);
     }

     public static int getActu(){
          return actualizame;
     }

     public static void setActualizame(int numero){
          actualizame = numero;
     }

     public void setActualiza(boolean act) {
          botonActualiza.setEnabled(act);
     }

     public void setConfirmaVendido(boolean act) {
          botonConfirma.setEnabled(act);
     }

     public void dameIcono(ImageIcon icon){
          botonLlave.setIcon(icon);
     }

     public String getCampoBuscar() {
          return campoBuscar.getText();
     }

     public void setCampoBuscar(String texto) {
          this.campoBuscar.setText(texto);
     }
     


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton botonActualiza;
     private javax.swing.JButton botonCambiaVista;
     private javax.swing.JButton botonConfirma;
     private javax.swing.JButton botonEliminar;
     private javax.swing.JButton botonLimpiaCampos;
     private javax.swing.JButton botonLlave;
     private javax.swing.JButton botonSubirP;
     private javax.swing.JTextField campoBuscar;
     private javax.swing.JTextField campoCantidad;
     private javax.swing.JTextField campoDesc;
     private javax.swing.JTextField campoEdadDirigida;
     private javax.swing.JTextField campoId;
     private javax.swing.JTextField campoIdProveedor;
     private javax.swing.JTextField campoMarca;
     private javax.swing.JTextField campoPrecio;
     private javax.swing.JTextField campoSeccion;
     private javax.swing.JTextField campoSexo;
     private javax.swing.JTextField campoTalla;
     private javax.swing.JTextField campoVendido;
     private javax.swing.JPanel containerComponents;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel labelCantidad;
     private javax.swing.JLabel labelDesc;
     private javax.swing.JLabel labelEdadDirigida;
     private javax.swing.JLabel labelId;
     private javax.swing.JLabel labelIdProveedor;
     private javax.swing.JLabel labelMarca;
     private javax.swing.JLabel labelNombreEmpresa;
     private javax.swing.JLabel labelPrecio;
     private javax.swing.JLabel labelSeccion;
     private javax.swing.JLabel labelSexo;
     private javax.swing.JLabel labelTalla;
     private javax.swing.JLabel labelVendido;
     private static javax.swing.JTable tablaNProductos;
     // End of variables declaration//GEN-END:variables

    
     

      

}
