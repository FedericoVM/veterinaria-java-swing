package com.proyecto.veterinaria.java.swing.igu;

import com.proyecto.veterinaria.java.swing.logica.Cliente;
import com.proyecto.veterinaria.java.swing.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class PanelEditarCliente extends javax.swing.JFrame {

    Cliente cliente = null;
    Controladora control = null;

    public PanelEditarCliente(Controladora control, Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelEditarCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnConfirmarEdicion = new javax.swing.JToggleButton();
        btnCancelarEdicion = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("EDITAR CLIENTE");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre y Apellido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Dirección");

        btnConfirmarEdicion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirmarEdicion.setText("Guardar cambios");
        btnConfirmarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEdicionActionPerformed(evt);
            }
        });

        btnCancelarEdicion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarEdicion.setText("Cancelar");
        btnCancelarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEdicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEditarClienteLayout = new javax.swing.GroupLayout(PanelEditarCliente);
        PanelEditarCliente.setLayout(PanelEditarClienteLayout);
        PanelEditarClienteLayout.setHorizontalGroup(
            PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(137, 137, 137))
            .addGroup(PanelEditarClienteLayout.createSequentialGroup()
                .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditarClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelEditarClienteLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirmarEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        PanelEditarClienteLayout.setVerticalGroup(
            PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarClienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEditarClienteLayout.createSequentialGroup()
                        .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelEditarClienteLayout.createSequentialGroup()
                                .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelEditarClienteLayout.createSequentialGroup()
                                        .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(PanelEditarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addComponent(btnCancelarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEditarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEdicionActionPerformed
        String nombre = txtNombre.getText();
        String dni = txtDni.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();

        control.editarCliente(cliente, nombre, dni, correo, telefono, direccion);

        mostrarMensaje("Se editaron los datos correctamente", "Info", "Edicion exitosa");

        this.dispose();

        PanelCliente panelCliente = new PanelCliente(control);
        panelCliente.setVisible(true);
        panelCliente.setLocationRelativeTo(null);
        panelCliente.cargarTabla();
    }//GEN-LAST:event_btnConfirmarEdicionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtNombre.setText(cliente.getNombre());
        txtDni.setText(cliente.getDni());
        txtCorreo.setText(cliente.getCorreo());
        txtTelefono.setText(cliente.getTelefono());
        txtDireccion.setText(cliente.getDireccion());

    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEdicionActionPerformed
        this.dispose();
        PanelCliente panelCliente = new PanelCliente(control);
        panelCliente.setVisible(true);
        panelCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarEdicionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEditarCliente;
    private javax.swing.JToggleButton btnCancelarEdicion;
    private javax.swing.JToggleButton btnConfirmarEdicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);

        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
