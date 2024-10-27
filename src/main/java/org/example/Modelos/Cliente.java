package org.example.Modelos;

import com.google.gson.*;
import org.example.Controlador.Adaptadores;
import org.example.Controlador.Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.example.Controlador.Verificaciones;

/**
 * Esta clase representa al cliente del restaurante.
 */
public class Cliente {

    /**
     * El nombre del cliente.
     */
    private String nombre;

    /**
     * El correo electrónico del cliente.
     *
     */
    private String correo;

    /**
     * El número de teléfono del cliente.
     */
    private String numTel;

    /**
     * La contraseña de la cuenta del cliente.
     */
    private String contrasenia;
    /**
     * Sexo del cliente.
     */
    private TipoSexo sexo;

    /**
     * Queja que emite el cliente.
     */
    private String queja;

    /**
     * El recepcionista por el que es atendido el cliente.
     */
    private Recepcionista recepcionista;

    /**
     * El maitre por el que es atendido el cliente.
     */
    private Maitre maitre;


    /**
     * Primer constructor de la clase Cliente. Este sirve para la creación de su usuario.
     * @param contrasenia
     * @param correo
     * @param maitre
     * @param nombre
     * @param numTel
     * @param queja
     * @param recepcionista
     * @param sexo
     */
    public Cliente(String contrasenia, String correo, Maitre maitre, String nombre, String numTel, String queja, Recepcionista recepcionista, TipoSexo sexo) {
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.maitre = maitre;
        this.nombre = nombre;
        this.numTel = numTel;
        this.queja = queja;
        this.recepcionista = recepcionista;
        this.sexo = sexo;
    }

    /**
     * Segundo constructor de la clase Cliente. Este funciona para el inicio de sesión.
     * @param Correo
     * @param Contrasenia
     */
    public Cliente(String Correo,String Contrasenia){
       this.contrasenia=Contrasenia;
       this.correo=Correo;
    
    
    }

    public Cliente (String correo){
        this.correo=correo;
    }

   

    public Cliente(String nombre,String correo,String numTel,String contrasenia,TipoSexo sexo){
        this.nombre = nombre;
        this.correo = correo;
        this.numTel = numTel;
        this.contrasenia = contrasenia;
        this.sexo = sexo;
    }

    public Cliente() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public String getQueja() {
        return queja;
    }

    public void setQueja(String queja) {
        this.queja = queja;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public Maitre getMaitre() {
        return maitre;
    }

    public void setMaitre(Maitre maitre) {
        this.maitre = maitre;
    }

    public void Registrarse(String Nombre, String Correo, String NumTel, String Contrasenia, TipoSexo Sexo){

    //recursos
    
     Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();
    
        Utilidades util = new Utilidades();
    String json = "";
    Cliente[] clientes = new Cliente[0];
    Verificaciones verificacion=new Verificaciones();
    
    //metodo
    try {
        BufferedReader br = new BufferedReader(new FileReader(util.rutaClientes()));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            json += linea;
        }
        br.close();

        if (!json.isEmpty()) {
            clientes = gson.fromJson(json, Cliente[].class);
        }
    } catch (Exception e) {
        System.out.println("Error al cargar los clientes existentes: " + e.getMessage());
    }


    Cliente nuevoCliente = new Cliente(Nombre,Correo,NumTel,Contrasenia,Sexo);

    List<Cliente> listaClientes = new ArrayList<>(List.of(clientes));
 
    if(!verificacion.verificacionRepetidosRegistrar(listaClientes,nuevoCliente)){
        listaClientes.add(nuevoCliente);
        try {
            FileWriter writer = new FileWriter(util.rutaClientes());
            gson.toJson(listaClientes, writer);
            writer.flush();
            writer.close();
            System.out.println("Registro exitoso del usuario: " + Correo );



    } catch (Exception e) {
        System.out.println("Error al registrar el usuario en cliente: " + e.getMessage());
    }
        
        
}
    else{
              System.out.print("Error usuario repetido, intente con otro usuario");}





}
    public void reservar(Reserva reserva){
    
        //recursos
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();

    Utilidades util = new Utilidades();
    String json = "";
   Reserva [] reservas = new Reserva[0];
    Verificaciones verificacion=new Verificaciones();
    
    //metodo
    try {
        BufferedReader br = new BufferedReader(new FileReader(util.rutarReservas()));
        String linea = "";
        while ((linea = br.readLine()) != null) {
            json += linea;
        }
        br.close();

        if (!json.isEmpty()) {
            reservas = gson.fromJson(json, Reserva[].class);
        }
    } catch (Exception e) {
        System.out.println("Error al cargar un cliente " + e.getMessage());
    }


   Reserva Reservanueva = new Reserva(reserva.getFecha(),reserva.getHora(),reserva.getMesa(),reserva.getCliente());
        List<Reserva> listaReserva = new ArrayList<>(Arrays.asList(reservas));
        listaReserva.add(Reservanueva);

        try {
            FileWriter writer = new FileWriter(util.rutarReservas());
            gson.toJson(listaReserva, writer);
            writer.flush();
            writer.close();
            System.out.println("Registro existoso de de la reserva " );



    } catch (Exception e) {
        System.out.println("Error al registrar la reserva " + e.getMessage());
    }
        
        
}





    @Override
    public String toString() {
        return "Cliente{" +
                "contrasenia='" + contrasenia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", numTel='" + numTel + '\'' +
                ", sexo=" + sexo +
                ", queja='" + queja + '\'' +
                ", recepcionista=" + recepcionista +
                ", maitre=" + maitre +
                '}';
    }



}



    

