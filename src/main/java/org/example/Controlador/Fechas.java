/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controlador;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
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
    public Date parsearHoraStringToDate(String hora) {


        SimpleDateFormat sdfFechaHora = new SimpleDateFormat("HH:mm");

        try {
            Date fechaHora = sdfFechaHora.parse(hora);
            return fechaHora;

        } catch (Exception e) {
            System.out.println("Error al parsear la fecha y hora: " + e.getMessage());
        }


         return null;
    }
}
