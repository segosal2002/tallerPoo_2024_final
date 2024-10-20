package org.example.Modelos;
/**
 * Clase que representa un empleado.
 */

public class Empleado {
    /**
     * El nombre del usuario.
     */

    private String usuario;

    /**
     * La contraseña del usuario.
     */
    private String Contrasenia;

    /**
     * El rol que cumple el empleado.
     */
    private Rol rol;

    /**
     * Constructor de la clase Empleado
     * @param contrasenia
     * @param rol
     * @param usuario
     */
    public Empleado(String contrasenia, Rol rol, String usuario) {
        this.Contrasenia= contrasenia;
        this.rol = rol;
        this.usuario = usuario;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getUsuario() {
        return usuario;
    }


    /**
     * Establece el valor del atributo usuario.
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getContrasenia() {
        return Contrasenia;
    }


    /**
     * Establece el valor de la contraseña del usuario.
     * @param contrasenia
     */
    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

    /**
     * Obtiene el rol del usuario.
     * @return rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * Establece el valor del atributo rol.
     * @param rol
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
