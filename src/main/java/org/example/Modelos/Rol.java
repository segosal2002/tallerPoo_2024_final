package org.example.Modelos;


import java.util.ArrayList;

public class Rol {
    private  String nombreRol;
    private String descripcionRol;
    private Empleado empleado;

    public Rol(String descripcionRol, Empleado empleado, String nombreRol) {
        this.descripcionRol = descripcionRol;
        this.empleado = empleado;
        this.nombreRol = nombreRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
