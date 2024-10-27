package org.example.Modelos;


import org.example.Controlador.Utilidades;


import java.util.ArrayList;
import java.util.List;
/**
 * La clase Restaurante representa un restaurante que gestiona una lista de administradores
 * y su horario de operación. Proporciona métodos para consultar la disponibilidad de mesas
 * en base a las reservas existentes.
 */
public class Restaurante {
private ArrayList<Admin>admins;
private Horario horario;

    public Restaurante(ArrayList<Admin> admins, Horario horario) {
        this.admins = admins;
        this.horario = horario;
    }
    
    public Restaurante(){
    }
    public Restaurante(Horario horario) {
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

    public boolean ConsultarDisponibilidad(Horario horario,Mesa mesa){
        Utilidades utilidades=new Utilidades();
        List<Reserva> reservas=utilidades.listaReservasS();


        for (int i = 0; i <reservas.size() ; i++) {
                if(reservas.get(i).getFecha().equals(horario.getDia())){

                   if(reservas.get(i).getMesa().getUbicacion().equals(mesa.getUbicacion())){
                       if (!(reservas.get(i).getHora().isBefore(horario.getHoraInicio()) || reservas.get(i).getHora().isAfter(horario.getHoraFinal()))){

                           return false;
                       }


                   }


                }

        }

        return true;




    }
}
