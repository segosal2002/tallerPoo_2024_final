package org.example.Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private String concurrio;
    private String alergias;
    private Recepcionista recepcionista;
    private TarjetaCredito tarjetaCredito;
    private  Horario horario;
    private Empleado empleado;
    private Mesa mesa;

    public Reserva(String alergias, String concurrio, Empleado empleado, LocalDate fecha, LocalTime hora, Horario horario, Mesa mesa, Recepcionista recepcionista, TarjetaCredito tarjetaCredito) {
        this.alergias = alergias;
        this.concurrio = concurrio;
        this.empleado = empleado;
        this.fecha = fecha;
        this.hora = hora;
        this.horario = horario;
        this.mesa = mesa;
        this.recepcionista = recepcionista;
        this.tarjetaCredito = tarjetaCredito;
    }
    public Reserva(){
    }
    public Reserva(LocalDate fecha,LocalTime hora,Mesa mesa){
            this.fecha=fecha;
            this.hora=hora;
            this.mesa=mesa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getConcurrio() {
        return concurrio;
    }

    public void setConcurrio(String concurrio) {
        this.concurrio = concurrio;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}
