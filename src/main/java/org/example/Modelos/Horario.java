package org.example.Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Horario {
    private LocalDate dia;
    private String evento;
    private LocalTime horaInicio;
    private LocalTime horaFinal;
    private ArrayList<Reserva>Reservas;
    private  Restaurante restaurante;

    public Horario(LocalDate dia, Restaurante restaurante, ArrayList<Reserva> Reservas, LocalTime horaFinal, String evento,LocalTime horaInicio) {
        this.dia = dia;
        this.restaurante = restaurante;
        this.Reservas=Reservas;
        this.horaFinal = horaFinal;
        this.evento = evento;
        this.horaInicio = horaInicio;
    }


    public Horario(LocalTime horaInicio,LocalTime horaFinal,LocalDate dia){
        this.horaInicio=horaInicio;
        this.horaFinal=horaFinal;
        this.dia=dia;
    }


    public Horario(){}
    public Horario(LocalDate dia, String evento, LocalTime horaInicio,LocalTime horaFinal) {
        this.dia = dia;
        this.evento = evento;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;



    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public ArrayList<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        Reservas = reservas;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "dia=" + dia +
                ", evento='" + evento + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                ", Reservas=" + Reservas +
                ", restaurante=" + restaurante +
                '}';
    }
}
