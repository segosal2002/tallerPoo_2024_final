/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controlador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.example.Modelos.Cliente;

/**
 *
 * @author vic
 */
public class Verificaciones {
 
    
    //Con este metodo verificamos si esta repetido el usuario a la hora de registrarse.
    public Boolean verificacionRepetidosRegistrar(List<Cliente> listaClientes, Cliente clienteNuevo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCorreo().equals(clienteNuevo.getCorreo())) {
                return true;
            }
        }
        return false;
    }

    
    //Con este metodo nos fijamos en el json si esta registrado el usuario
    public boolean VerificacionInciarSesion(Cliente cliente) {
        //recursos
        Utilidades util = new Utilidades();
        
        
       
         Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();
         String json = "";      
        //metodo
        try {
            String linea = "";
            
            BufferedReader br = new BufferedReader(new FileReader(util.rutaClientes()));
            while ((linea = br.readLine()) != null) {
                json += linea;

            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo para inciar Sesion" + e.getMessage());

        }
        Cliente []cliente1=gson.fromJson(json,Cliente[].class);
        
        for (int i = 0; i < cliente1.length; i++) {
        
        if (cliente1[i].getCorreo().equals(cliente.getCorreo())) {
            if(cliente1[i].getContrasenia().equals(cliente.getContrasenia()))
            return true;  
        }
    }
    return false;  
            
            

    }

   
}




