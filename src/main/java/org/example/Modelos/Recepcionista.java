package org.example.Modelos;

import java.util.ArrayList;
/**
 * La clase Recepcionista representa a un empleado específico encargado de la recepción en un restaurante,
 * gestionando los clientes y las reservas que estos han realizado. Extiende la clase Empleado.
 */
public class Recepcionista  extends  Empleado {
private Cliente cliente;
private ArrayList<Reserva>Reservas;

    public Recepcionista(String contrasenia, Rol rol, String usuario, Cliente cliente, ArrayList<Reserva> reservas) {
        super(contrasenia, rol, usuario);
        this.cliente = cliente;
        Reservas = reservas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        Reservas = reservas;
    }
}
