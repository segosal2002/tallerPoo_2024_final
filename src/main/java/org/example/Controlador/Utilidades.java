package org.example.Controlador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.Modelos.Empleado;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import org.example.Modelos.Cliente;
import org.example.Modelos.Reserva;

public class Utilidades {


    public String RutaEmpleados() {
        return "Empleados.json";
    }

    public String rutaClientes() {

        return "Clientes.json";
    }

    public String rutarReservas() {

        return "Reservas.json";
    }
    
    public List<Cliente> ListaClientes(){
    
    Utilidades utilidades = new Utilidades();
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();

        String linea="";
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(utilidades.rutaClientes()));

            while ((linea = br.readLine()) != null) {

                json += linea;




            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       Cliente [] ClienteArray = gson.fromJson(json, Cliente[].class);


        List<Cliente>Clientes = Arrays.asList(ClienteArray);

        return Clientes;
    
    }

    public String listaReservas() {
        String linea = "";
        String json = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(rutarReservas()));
            while ((linea = br.readLine()) != null) {
                json += linea;


            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


        return json;

    }

    public List<Empleado> listaEmpleados() {
        Utilidades utilidades = new Utilidades();
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();

        String linea="";
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(utilidades.RutaEmpleados()));

            while ((linea = br.readLine()) != null) {

                json += linea;




            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Empleado[] empleadosArray = gson.fromJson(json, Empleado[].class);


        List<Empleado> empleados = Arrays.asList(empleadosArray);
        return empleados;
    }


    public List<Reserva>  listaReservasS(){

        Utilidades utilidades = new Utilidades();
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();

        String linea="";
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(utilidades.rutarReservas()));

            while ((linea = br.readLine()) != null) {

                json += linea;




            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Reserva[] ReservasArray = gson.fromJson(json, Reserva[].class);


        List<Reserva> reservas = Arrays.asList(ReservasArray);
        return reservas;


    }


}
