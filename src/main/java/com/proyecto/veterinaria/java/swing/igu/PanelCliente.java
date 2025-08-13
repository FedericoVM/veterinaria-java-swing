package com.proyecto.veterinaria.java.swing.igu;

import com.proyecto.veterinaria.java.swing.logica.Cliente;
import com.proyecto.veterinaria.java.swing.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelCliente extends javax.swing.JFrame {

    Controladora control = null;

    public PanelCliente(Controladora control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnSalirCliente = new javax.swing.JButton();
        BtnAgregarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnVerCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 29)); // NOI18N
        jLabel2.setText("CLIENTES");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        btnSalirCliente.setText("SALIR");
        btnSalirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirClienteActionPerformed(evt);
            }
        });

        BtnAgregarCliente.setText("AGREGAR");
        BtnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setText("EDITAR");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("ELIMINAR");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnVerCliente.setText("VER");
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BtnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirClienteActionPerformed
        this.dispose();
        PanelPrincipal panel = new PanelPrincipal();
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirClienteActionPerformed

    private void BtnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarClienteActionPerformed
        PanelCrearCliente panelCrearCliente = new PanelCrearCliente(control);
        panelCrearCliente.setVisible(true);
        panelCrearCliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnAgregarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed

        if (tablaClientes.getRowCount() > 0) {
            if (tablaClientes.getSelectedRow() != -1) {
                int idCliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
                control.eliminarCliente(idCliente);
                mostrarMensaje("El cliente fue eliminado", "Info", "Eliminacion");
                cargarTabla();
            } else {
                mostrarMensaje("Error! Debes seleccionar un registro", "error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("Error! La tabal esta vacia", "error", "Error al eliminar");
        }


    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClienteActionPerformed
        if (tablaClientes.getRowCount() > 0) {

            if (tablaClientes.getSelectedRow() != -1) {

                int idCliente = Integer.valueOf(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
                Cliente cliente = control.buscarCliente(idCliente);
                PanelDetalleCliente panelDetalleCliente = new PanelDetalleCliente(cliente);
                panelDetalleCliente.setVisible(true);
                panelDetalleCliente.setLocationRelativeTo(null);

            } else {
                mostrarMensaje("Debe seleccionar un registro", "error", "Error!");
            }

        } else {
            mostrarMensaje("La tabla esta vacia", "error", "Error! Tabla vacia");
        }
    }//GEN-LAST:event_btnVerClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if (tablaClientes.getRowCount() > 0) {

            if (tablaClientes.getSelectedRow() != -1) {

                int idCliente = Integer.valueOf(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
                Cliente clienteEncontrado = control.buscarCliente(idCliente);
                PanelEditarCliente panelEditarCliente = new PanelEditarCliente(control, clienteEncontrado);
                panelEditarCliente.setVisible(true);
                panelEditarCliente.setLocationRelativeTo(null);
                this.dispose();

            } else {
                mostrarMensaje("Error! Debe selecionar un registro", "error", "Error al editar");
            }

        } else {
            mostrarMensaje("Error! La tabla esta vacia", "error", "Error! Tabla vacia");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnSalirCliente;
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        String[] titulos = {"Id", "Nombre", "Dni", "Telefono", "Email", "Dirección"};

        modeloTabla.setColumnIdentifiers(titulos);

        List<Cliente> listaClientes = control.traerClientes();

        if (listaClientes != null) {
            for (Cliente clienteAux : listaClientes) {
                Object[] cliente = {clienteAux.getId_cliente(), clienteAux.getNombre(), clienteAux.getDni(), clienteAux.getTelefono(), clienteAux.getCorreo(), clienteAux.getDireccion()};
                modeloTabla.addRow(cliente);
            }
        }

        tablaClientes.setModel(modeloTabla);

    }

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
