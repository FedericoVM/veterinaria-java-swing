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
    
}
