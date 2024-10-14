package org.example.Modelos;

public class Mesa {
    private  boolean dispobinilidad;
    private int capacidad;
    private String ubicacion;

    public Mesa(int capacidad, boolean dispobinilidad, String ubicacion) {
        this.capacidad = capacidad;
        this.dispobinilidad = dispobinilidad;
        this.ubicacion = ubicacion;
    }

    public Mesa(){}

    public boolean isDispobinilidad() {
        return dispobinilidad;
    }

    public void setDispobinilidad(boolean dispobinilidad) {
        this.dispobinilidad = dispobinilidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
