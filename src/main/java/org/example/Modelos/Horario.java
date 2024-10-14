package org.example.Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Horario {
    private Date dia;
    private String evento;
    private Date horaInicio;
    private Date horaFinal;
    private ArrayList<Reserva>Horarios;
    private  Restaurante restaurante;

    public Horario(Date dia, Restaurante restaurante, ArrayList<Reserva> horarios, Date horaFinal, String evento, Date horaInicio) {
        this.dia = dia;
        this.restaurante = restaurante;
        Horarios = horarios;
        this.horaFinal = horaFinal;
        this.evento = evento;
        this.horaInicio = horaInicio;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public ArrayList<Reserva> getHorarios() {
        return Horarios;
    }

    public void setHorarios(ArrayList<Reserva> horarios) {
        Horarios = horarios;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
