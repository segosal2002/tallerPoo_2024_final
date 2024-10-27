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
 * @author TheCa
 */
public class Fechas {
     public boolean esHoraValida(String hora) {
       
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        try {
            
            LocalTime.parse(hora, formatoHora);
            return true; 
        } catch (DateTimeParseException e) {
            return false; 
        }


    }


    public LocalDate ParseadorDateAFecha(Date fecha) {

        if (fecha == null) {
            return null;
        }

        // Convertir Date a LocalDate
        Instant instant = fecha.toInstant();
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        return localDate;
    }


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
