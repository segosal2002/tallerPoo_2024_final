/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controlador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.example.Modelos.Cliente;

/**
 *
 * @author Cava:
 * Clase que lleva el rol de metodos que llevan a la modificacion de archivos jsons
 *
 * */
public class ModificadorDeArchivos {

    /**
     *
     * @param cliente 
     * @param correo
     * @param contrasenia
     * @param numTelf
     *
     *
     * */
    public void ModificarArchivoCliente(Cliente cliente, String correo, String contrasenia, String numTelf) {


        //recursos
        Utilidades util = new Utilidades();


        Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();


        List<Cliente> Clientes = util.ListaClientes();
        boolean clienteEncontrado = false;

        for (int i = 0; i < Clientes.size(); i++) {
            if (cliente.getCorreo().equals(Clientes.get(i).getCorreo())) {

                Clientes.get(i).setCorreo(correo);
                Clientes.get(i).setContrasenia(contrasenia);
                Clientes.get(i).setNumTel(numTelf);
                clienteEncontrado = true;
                break;
            }
        }
        if (clienteEncontrado) {
            try {
                FileWriter writer = new FileWriter(util.rutaClientes());
                gson.toJson(Clientes, writer);
                writer.flush();
                writer.close();
                System.out.println("Cliente modificado con exito");


            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
        } else {

            System.out.println("CLIENTE NO encontrado");
        }

    }

}
    
    
    

    

