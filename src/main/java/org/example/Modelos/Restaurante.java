package org.example.Modelos;

import java.util.ArrayList;

public class Restaurante {
private ArrayList<Admin>admins;
private Horario horario;

    public Restaurante(ArrayList<Admin> admins, Horario horario) {
        this.admins = admins;
        this.horario = horario;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
