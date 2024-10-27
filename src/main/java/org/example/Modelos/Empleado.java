package org.example.Modelos;

import java.util.List;
/**
 * La clase  Empleado  representa un empleado
 * de un restaurante
 */

public class Empleado {
    private String usuario;
    private String Contrasenia;
    private Rol rol;

    public Empleado(String contrasenia, Rol rol, String usuario) {
        this.Contrasenia= contrasenia;
        this.rol = rol;
        this.usuario = usuario;
    }

    public Empleado(String usuario,String contrasenia){
        this.Contrasenia = contrasenia;
        this.usuario = usuario;


    }

    public Empleado() {

    }
    /**
     * Verifica si un empleado puede iniciar sesión comprobando su correo electrónico y contraseña.
     *
     * @param empleados   Lista de empleados registrados en el sistema.
     * @param correo      El correo electrónico ingresado por el empleado.
     * @param contrasenia La contraseña ingresada por el empleado.
     * @return true si el correo electrónico y la contraseña coinciden con un empleado en la lista;  false en caso contrario.
     */
    public boolean inciarSesion(List<Empleado> empleados,String correo,String contrasenia){

        for(Empleado empleado : empleados){
            if(empleado.getUsuario().equals(correo)&&empleado.getContrasenia().equals(contrasenia)){

                return  true;
            }


        }
        return false;


    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
