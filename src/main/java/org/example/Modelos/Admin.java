package org.example.Modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.Controlador.Adaptadores;
import org.example.Controlador.Utilidades;
import org.example.Controlador.Verificaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * La clase  Admin extiende la clase Empleado y representa un administrador
 * de un restaurante, que tiene la capacidad de gestionar empleados, reservas y horarios.
 */
public class Admin  extends  Empleado{
 private Restaurante restaurante;

    public Admin(Restaurante restaurante, String contrasenia, Rol rol, String usuario) {
        super(contrasenia, rol, usuario);
        this.restaurante = restaurante;
    }

    public Admin(){
        super();

    }
    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    /**
     * Crea una nueva cuenta de empleado en el sistema y la registra en el archivo JSON correspondiente.
     *
     * @param empleado El empleado a ser registrado.
     */
    public void CrearCuenta(Empleado empleado){
        //recursos
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
                .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
                .create();


        Utilidades util = new Utilidades();
        String json = "";
        Empleado [] Empleados = new Empleado[0];
        Verificaciones verificacion=new Verificaciones();

        //metodo
        try {
            BufferedReader br = new BufferedReader(new FileReader(util.RutaEmpleados()));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();

            if (!json.isEmpty()) {
                Empleados = gson.fromJson(json,Empleado[].class);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar admin.crearCuenta " + e.getMessage());
        }


       Empleado Empleadoanueva = new Empleado(empleado.getContrasenia(),empleado.getRol(),empleado.getUsuario());
        List<Empleado> ListaEmpleado = new ArrayList<>(Arrays.asList(Empleados));
        ListaEmpleado.add(Empleadoanueva);

        try {
            Verificaciones ver = new Verificaciones();

            if(ver.verificacionRepetidosEmpleados(ListaEmpleado,Empleadoanueva)) {
                FileWriter writer = new FileWriter(util.RutaEmpleados());
                gson.toJson(ListaEmpleado, writer);
                writer.flush();
                writer.close();
                System.out.println("Registro existoso de de admin.crearCuenta ");

            }
            else{
                System.out.println("Usuario ya existe");
            }

        } catch (Exception e) {
            System.out.println("Error al registrar admin.crearCuenta" + e.getMessage());
        }




    }
    /**
     * Inicia sesión como administrador mediante verificación de correo y contraseña.
     *
     * @param empleados  Lista de empleados en el sistema.
     * @param correo     El correo electrónico del administrador.
     * @param contrasenia La contraseña del administrador.
     * @return  true si las credenciales son correctas,  false en caso contrario.
     */

    @Override
    public boolean inciarSesion(List<Empleado> empleados, String correo, String contrasenia) {
        return super.inciarSesion(empleados, correo, contrasenia);
    }
    /**
     * Crea y registra un evento privado en el sistema.
     *
     * @param reserva Los detalles de la reserva a crear.
     */
    public void setEventoPrivado(Reserva reserva){

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
                reservas = gson.fromJson(json,Reserva[].class);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar admin.EventoPrivado " + e.getMessage());
        }

       Reserva RerservaNueva = new Reserva(reserva.getFecha(),reserva.getHora(),reserva.getMesa(),reserva.getHorario());

        List<Reserva> ListaReserva = new ArrayList<>(Arrays.asList(reservas));
        ListaReserva.add(RerservaNueva);

        try {
                FileWriter writer = new FileWriter(util.rutarReservas());
                gson.toJson(ListaReserva, writer);
                writer.flush();
                writer.close();
                System.out.println("Registro existoso de de admin.SetEventoPrivado ");

        } catch (Exception e) {
            System.out.println("Error al registrar admin.SetEventoPrivado" + e.getMessage());
        }


    }
    
   public void cancelarEvento(Reserva reserva){



        
   
   }
    /**
     * Establece el horario de apertura y cierre del restaurante.
     *
     * @param horario El horario a establecer.
     */
   public void SetApertura(Horario horario){


       Gson gson = new GsonBuilder().setPrettyPrinting()
               .registerTypeAdapter(LocalDate.class, new Adaptadores.LocalDateAdapter())
               .registerTypeAdapter(LocalTime.class, new Adaptadores.LocalTimeAdapter())
               .create();


       Utilidades util = new Utilidades();
       String json = "";
       Horario [] Horarios = new Horario[0];


       //metodo
       try {
           BufferedReader br = new BufferedReader(new FileReader("AperturaCierre.json"));
           String linea = "";
           while ((linea = br.readLine()) != null) {
               json += linea;
           }
           br.close();

           if (!json.isEmpty()) {
              Horarios = gson.fromJson(json,Horario[].class);
           }
       } catch (Exception e) {
           System.out.println("Error al cargar admin.EventoPrivado " + e.getMessage());
       }

      Horario nuevoHorario=new Horario(horario.getHoraInicio(),horario.getHoraFinal(),horario.getDia());

       List<Horario> ListaHorario= new ArrayList<>(Arrays.asList(Horarios));
       ListaHorario.add(nuevoHorario);

       try {
           FileWriter writer = new FileWriter("AperturaCierre.json");
           gson.toJson(ListaHorario, writer);
           writer.flush();
           writer.close();
           System.out.println("Registro existoso de admin.EstablecerHorario");

       } catch (Exception e) {
           System.out.println("Error al registrar admin.EstablecerHorario" + e.getMessage());
       }





   }
}
