package com.proyecto.veterinaria.java.swing.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_mascota;
    private String nombre_mascota;
    private String raza;
    private int edad;
    private double peso;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Mascota() {
    }

    public Mascota(int id_mascota, String nombre_mascota, String raza, int edad, double peso, Cliente cliente) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.cliente = cliente;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    

}
