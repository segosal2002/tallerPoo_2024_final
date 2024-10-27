package org.example.Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * La clase Reserva representa una reserva en un restaurante,
 * incluyendo detalles sobre el cliente, la fecha, la hora, la mesa,
 * y otros aspectos relevantes para la gestión de la reserva.
 */
public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private String concurrio;
    private String alergias;
    private Recepcionista recepcionista;
    private TarjetaCredito tarjetaCredito;
    private  Horario horario;
    private Cliente cliente;
    private Mesa mesa;


    public Reserva(String alergias, String concurrio, Cliente cliente , LocalDate fecha, LocalTime hora, Horario horario, Mesa mesa, Recepcionista recepcionista, TarjetaCredito tarjetaCredito) {
        this.alergias = alergias;
        this.concurrio = concurrio;
        this.cliente= cliente ;
        this.fecha = fecha;
        this.hora = hora;
        this.horario = horario;
        this.mesa = mesa;
        this.recepcionista = recepcionista;
        this.tarjetaCredito = tarjetaCredito;
    }



    public Reserva(){
    }

    public Reserva(LocalDate fecha,LocalTime hora,Horario horario,Mesa mesa){
        this.fecha = fecha;
        this.hora = hora;
        this.horario = horario;
        this.mesa = mesa;
    }
    public Reserva(LocalDate fecha,LocalTime hora,Mesa mesa,Cliente cliente){
            this.fecha=fecha;
            this.hora=hora;
            this.mesa=mesa;
            this.cliente=cliente;

    }
    
    public Reserva(LocalDate fecha,LocalTime hora,Mesa mesa){
         this.fecha=fecha;
            this.hora=hora;
            this.mesa=mesa;
    }

    public Reserva(LocalDate fecha,LocalTime hora,Mesa mesa,Horario horario){
        this.fecha=fecha;
        this.hora=hora;

        this.mesa=mesa;
        this.horario=horario;


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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return cliente.getCorreo();
    }

}
