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

    @Override
    public boolean inciarSesion(List<Empleado> empleados, String correo, String contrasenia) {
        return super.inciarSesion(empleados, correo, contrasenia);
    }
}
