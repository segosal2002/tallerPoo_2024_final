package org.example.Modelos;

public class Admin  extends  Empleado{
 private Restaurante restaurante;

    public Admin(Restaurante restaurante, String contrasenia, Rol rol, String usuario) {
        super(contrasenia, rol, usuario);
        this.restaurante = restaurante;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
