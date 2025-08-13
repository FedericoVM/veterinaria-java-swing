package com.proyecto.veterinaria.java.swing.persistencia;

import com.proyecto.veterinaria.java.swing.logica.Cliente;
import com.proyecto.veterinaria.java.swing.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    ClienteJpaController clienteJpa = new ClienteJpaController();

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }

    public void crearCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public void eliminarCliente(int idCliente) {
        try {
            clienteJpa.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarCliente(int idCliente) {
        return clienteJpa.findCliente(idCliente);
    }

    public void editarCliente(Cliente cliente) {
        try {
            clienteJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
