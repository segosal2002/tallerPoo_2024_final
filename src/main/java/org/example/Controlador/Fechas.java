/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controlador;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 *
 * @author Cavaa
 * La clase Fechas manipula los tipos de fechas y lo devuelve en localDate o LocalTime, tambien verifica si tiene es una
 * hora valida a partir de un String.
 */
public class Fechas {



    /**
     @param hora String pasado para verificar que sea una hora valida.
     @return Retorna True si es un formato de hora valido.
     */
     public boolean esHoraValida(String hora) {
       
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        try {
            
            LocalTime.parse(hora, formatoHora);
            return true; 
        } catch (DateTimeParseException e) {
            return false; 
        }


    }


    /**
     @param  fecha parsea una fecha Date a un LocalDate
     @return retorna el date en formato LocalDate
     */



    public LocalDate ParseadorDateAFecha(Date fecha) {

        if (fecha == null) {
            return null;
        }

        // Convertir Date a LocalDate
        Instant instant = fecha.toInstant();
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        return localDate;
    }

    /**
     @param  tiempo parsea un String hora a un LocalTime
     @return retorna el String en LocalTime
     */


    public LocalTime parsearStringALocalTime(String tiempo) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");


        try {
            return LocalTime.parse(tiempo, formato);
        } catch (DateTimeParseException e) {
            System.out.println("Error al parsear el tiempo: " + e.getMessage());
            return null;
        }
    }


}
