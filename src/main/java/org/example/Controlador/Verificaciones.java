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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.example.Modelos.Cliente;
import org.example.Modelos.Empleado;

/**
 *
 * @author Cava:
 *
 * Con esta clase Verificamos los archivos json o validamos correos
 */
public class Verificaciones {


    /**
     *
     *
     *
     * Con este metodo verificamos si esta repetido el usuario a la hora de registrarse
     * @param clienteNuevo El cliente nuevo a verificar si esta repetido
     *                     @return un booleano True si esta en el json y False si no esta
     *
     */
    public Boolean verificacionRepetidosRegistrar(List<Cliente> listaClientes, Cliente clienteNuevo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCorreo().equals(clienteNuevo.getCorreo())) {
                return true;
            }
        }
        return false;
    }
    /**
     * Verifica si un empleado nuevo ya está registrado en la lista de empleados.
     *
     * @param listaEmpleados La lista de empleados existentes.
     * @param EmpleadoNuevo  El nuevo empleado que se desea verificar.
     * @return true si el empleado ya existe en la lista, false en caso contrario.
     */
    public boolean verificacionRepetidosEmpleados(List<Empleado> listaEmpleados, Empleado EmpleadoNuevo) {

        for (Empleado empleado : listaEmpleados) {
            if (empleado.getUsuario().equals(EmpleadoNuevo.getUsuario())) {
                return true;
            }
        }
        return false;
    }



    /**
     * Verifica si un cliente tiene una cuenta registrada en el archivo JSON para iniciar sesión.
     *
     * @param cliente El cliente que desea iniciar sesión, con los datos de correo y contraseña.
     * @return true si el cliente existe en el archivo y la contraseña coincide, false en caso contrario.
     */
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
    /**
     * Valida si el correo electrónico ingresado cumple con el formato correcto.
     *
     * @param correo El correo electrónico a validar.
     * @return true si el correo cumple con el formato correcto, false en caso contrario.
     */
    
    public boolean ValidarCorreo(String correo){
    String email="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    Pattern pattern = Pattern.compile(email);
        
    
    Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    
    
    }

   
}




