package org.example.Modelos;

public class Maitre extends Empleado  {
    private Cliente cliente;

    public Maitre(String contrasenia, Rol rol, String usuario, Cliente cliente) {
        super(contrasenia, rol, usuario);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
