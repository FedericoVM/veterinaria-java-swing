package com.proyecto.veterinaria.java.swing.logica;

import java.time.LocalDate;
import java.time.LocalTime;


public class Turno {
    private int id_turno;
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;
    private int id_mascota;
    private int id_cliente;

    public Turno() {
    }

    public Turno(int id_turno, LocalDate fecha, LocalTime hora, String motivoConsulta, int id_mascota, int id_cliente) {
        this.id_turno = id_turno;
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
        this.id_mascota = id_mascota;
        this.id_cliente = id_cliente;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_turno() {
        return id_turno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public int getId_cliente() {
        return id_cliente;
    }
    
}
