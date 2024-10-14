package org.example.Modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class TarjetaCredito {
private String NombreTitular;
private String Emisor;
private int NumeroTarjeta;
private int cvv;
private Date FechaVencimiento;
private double saldo;
private ArrayList<TarjetaCredito>Reservas;

    public TarjetaCredito(int cvv, String emisor,Date fechaVencimiento, ArrayList<TarjetaCredito> reservas, String nombreTitular, int numeroTarjeta, double saldo) {
        this.cvv = cvv;
        this.Emisor= emisor;
        this.FechaVencimiento = fechaVencimiento;
        this.Reservas = reservas;
        this.NombreTitular = nombreTitular;
        this.NumeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return NombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        NombreTitular = nombreTitular;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String emisor) {
        Emisor = emisor;
    }

    public int getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        NumeroTarjeta = numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        FechaVencimiento = fechaVencimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<TarjetaCredito> getReservas() {
        return Reservas;
    }

    public void setReservas(ArrayList<TarjetaCredito> reservas) {
        Reservas = reservas;
    }
}
