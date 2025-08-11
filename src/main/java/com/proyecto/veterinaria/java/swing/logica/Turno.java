package com.proyecto.veterinaria.java.swing.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_turno;
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;
    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Turno() {
    }

    public Turno(int id_turno, LocalDate fecha, LocalTime hora, String motivoConsulta, Mascota mascota, Cliente cliente) {
        this.id_turno = id_turno;
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
        this.mascota = mascota;
        this.cliente = cliente;
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

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Mascota getMascota() {
        return mascota;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
