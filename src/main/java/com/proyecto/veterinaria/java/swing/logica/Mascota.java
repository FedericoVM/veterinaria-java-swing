package com.proyecto.veterinaria.java.swing.logica;

public class Mascota {

    private int id_mascota;
    private String nombre_mascota;
    private String raza;
    private int edad;
    private double peso;
    private int id_cliente;

    public Mascota() {
    }

    public Mascota(int id_mascota, String nombre_mascota, String raza, int edad, double peso, int id_cliente) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.id_cliente = id_cliente;
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

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public int getId_cliente() {
        return id_cliente;
    }
    
    
    
}
