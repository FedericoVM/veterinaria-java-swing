package com.proyecto.veterinaria.java.swing.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_cliente;
    private String nombre;
    private String dni;
    private String telefono;
    private String correo;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String dni, String telefono, String correo, String direccion) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

}
