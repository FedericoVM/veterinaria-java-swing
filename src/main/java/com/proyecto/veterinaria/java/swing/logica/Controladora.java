package com.proyecto.veterinaria.java.swing.logica;

import com.proyecto.veterinaria.java.swing.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controladoraPersistencia = null;

    public Controladora() {
        this.controladoraPersistencia = new ControladoraPersistencia();
    }
    
    

    public List<Cliente> traerClientes() {
        return  controladoraPersistencia.traerClientes();
    }

    public void crearCliente(String nombreCliente, String dni, String correo, String telefono, String direccion) {
        
        Cliente cliente = new Cliente();
        cliente.setNombre(nombreCliente);
        cliente.setDni(dni);
         cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        
        controladoraPersistencia.crearCliente(cliente);
    }

    public void eliminarCliente(int idCliente) {
       controladoraPersistencia.eliminarCliente(idCliente);
    }

    public Cliente buscarCliente(int idCliente) {
        return controladoraPersistencia.buscarCliente(idCliente);
    }
    
}
