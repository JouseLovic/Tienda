
package Vista_Formulario;

import Controlador.*;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PanelEntrada extends javax.swing.JPanel {

     private String idPSeleccionado = null;
     private boolean campoRemovidos = false;
     
     private String confirmaId;
     private static int actualizame = 0;
     
     public PanelEntrada() {
          initComponents();
          ControllerEntradasP.llenaComboBox(listaProveedores);
          ControllerEntradasP.enviaDatosTabla(tablaEntradas, "");
     }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        campoSeccionE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoMarcaE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoProveedor = new javax.swing.JTextField();
        listaProveedores = new javax.swing.JComboBox<>();
        labelBuscar = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();

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

        labelTitulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Entrada de productos");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(20, 10, 230, 90);

        labelFactura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelFactura.setForeground(new java.awt.Color(0, 0, 0));
        labelFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFactura.setText("N° de factura");
        jPanel1.add(labelFactura);
        labelFactura.setBounds(190, 90, 130, 30);

        labelFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(0, 0, 0));
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("Fecha");
        jPanel1.add(labelFecha);
        labelFecha.setBounds(530, 100, 110, 30);

        labelCodigoProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCodigoProducto.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCodigoProducto.setText("Codigo del producto");
        jPanel1.add(labelCodigoProducto);
        labelCodigoProducto.setBounds(890, 100, 200, 30);

        labelCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCantidad.setText("Cantidad");
        jPanel1.add(labelCantidad);
        labelCantidad.setBounds(880, 200, 120, 20);

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
        tablaEntradas.getTableHeader().setReorderingAllowed(false);
        tablaEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEntradasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEntradas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 490, 1210, 420);

        labelDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelDesc.setForeground(new java.awt.Color(0, 0, 0));
        labelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDesc.setText("Descripción");
        jPanel1.add(labelDesc);
        labelDesc.setBounds(500, 190, 220, 30);

        labelPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrecio.setText("Precio");
        jPanel1.add(labelPrecio);
        labelPrecio.setBounds(180, 200, 90, 40);

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar);
        botonEliminar.setBounds(220, 410, 150, 50);

        botonLimpiarCampos.setText("Limpiar campos");
        botonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(botonLimpiarCampos);
        botonLimpiarCampos.setBounds(580, 410, 150, 50);

        botonSubirF.setText("Subir entrada");
        botonSubirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirFActionPerformed(evt);
            }
        });
        jPanel1.add(botonSubirF);
        botonSubirF.setBounds(910, 410, 150, 50);
        jPanel1.add(campoNFactura);
        campoNFactura.setBounds(200, 130, 200, 40);
        jPanel1.add(campoFecha);
        campoFecha.setBounds(560, 140, 200, 40);
        jPanel1.add(campoCodigoProducto);
        campoCodigoProducto.setBounds(900, 140, 230, 40);

        campoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(campoCantidad);
        campoCantidad.setBounds(900, 240, 230, 40);
        jPanel1.add(campoDescripcion);
        campoDescripcion.setBounds(560, 240, 200, 40);

        campoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(campoPrecio);
        campoPrecio.setBounds(200, 240, 200, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seccion");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 300, 64, 22);
        jPanel1.add(campoSeccionE);
        campoSeccionE.setBounds(200, 340, 180, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Marca");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 310, 100, 22);
        jPanel1.add(campoMarcaE);
        campoMarcaE.setBounds(560, 340, 190, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Id del proveedor");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(880, 310, 170, 22);

        campoProveedor.setEditable(false);
        jPanel1.add(campoProveedor);
        campoProveedor.setBounds(900, 340, 160, 40);

        listaProveedores.setForeground(new java.awt.Color(0, 0, 0));
        listaProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null" }));
        listaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(listaProveedores);
        listaProveedores.setBounds(1070, 340, 70, 40);

        labelBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelBuscar.setForeground(new java.awt.Color(0, 0, 0));
        labelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBuscar.setText("Buscar factura: ");
        jPanel1.add(labelBuscar);
        labelBuscar.setBounds(820, 30, 130, 40);

        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(campoBuscar);
        campoBuscar.setBounds(950, 30, 300, 40);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

     private void tablaEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntradasMouseClicked
               ControllerEntradasP.mandaCampos(tablaEntradas, this);
               listaProveedores.setSelectedItem(String.valueOf(tablaEntradas.getValueAt(tablaEntradas.getSelectedRow(), 8)));                    
     }//GEN-LAST:event_tablaEntradasMouseClicked

     private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
          ControllerEntradasP.eliminar(tablaEntradas);
          tablaEntradas.setSelectionMode(0);
     }//GEN-LAST:event_botonEliminarActionPerformed

     private void botonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {                                                       
          tablaEntradas.setSelectionMode(0);
          ControllerEntradasP.limpiaCampos(this);
     }                                                  

     private void botonSubirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFActionPerformed
         try {
          ControllerEntradasP.insertar(tablaEntradas,this);
     } catch (SQLIntegrityConstraintViolationException e) {
          JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio. Revise si algun campo le falta un dato");
     }
     }//GEN-LAST:event_botonSubirFActionPerformed

     private void listaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProveedoresActionPerformed
       ControllerEntradasP.mandaProveedor(tablaEntradas, String.valueOf(listaProveedores.getSelectedItem()), this);   
     }//GEN-LAST:event_listaProveedoresActionPerformed

     private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
         tablaEntradas.setSelectionMode(0);
     }//GEN-LAST:event_jPanel1MouseClicked

     private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       
          if(actualizame==0){
                ControllerEntradasP.enviaDatosTabla(tablaEntradas, "");
                listaProveedores.removeAllItems();;
                listaProveedores.addItem("Null");
                listaProveedores.setSelectedItem("Null");
                ControllerEntradasP.llenaComboBox(listaProveedores);
                actualizame++;
              }
          
     }//GEN-LAST:event_jPanel1MouseEntered

     private void campoPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerEntradasP.bloqueaLetrasPrecio(keyNumeros, evt);
     }//GEN-LAST:event_campoPrecioKeyTyped

     private void campoCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCantidadKeyTyped
          int keyNumeros = evt.getKeyChar();
          ControllerEntradasP.bloqueaLetrasCantidad(keyNumeros, evt);
     }//GEN-LAST:event_campoCantidadKeyTyped

     private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
          ControllerEntradasP.enviaDatosTabla(tablaEntradas, campoBuscar.getText());
     }//GEN-LAST:event_campoBuscarKeyReleased

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
     
     
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiarCampos;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCodigoProducto;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelFactura;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JComboBox<String> listaProveedores;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tablaEntradas;
    // End of variables declaration//GEN-END:variables
}
