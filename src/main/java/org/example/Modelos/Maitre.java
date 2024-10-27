package org.example.Modelos;
/**
 * La clase Maitre representa un empleado con el rol de maitre en un restaurante.
 * Esta clase extiende de la clase Empleado e incluye un cliente asociado al maitre.
 */
public class Maitre extends Empleado  {
    private Cliente cliente;

    public Maitre(String contrasenia, Rol rol, String usuario, Cliente cliente) {
        super(contrasenia, rol, usuario);
        this.cliente = cliente;
    }

    public Maitre(String contrasenia, Rol rol, String usuario) {
        super(contrasenia,rol,usuario);

    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
