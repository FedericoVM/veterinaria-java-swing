package com.proyecto.veterinaria.java.swing.persistencia;

import com.proyecto.veterinaria.java.swing.logica.Cliente;
import java.util.List;


public class ControladoraPersistencia {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }

    public void crearCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    
}
