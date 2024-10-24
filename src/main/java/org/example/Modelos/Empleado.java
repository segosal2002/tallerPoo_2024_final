package org.example.Modelos;

import java.util.List;

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
