/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class Encargado {
    // Definicion de atributos
    private String nombreCompleto;
    private String identificacion;
    private String telefono;
    private String correo;

    // Definicion de constructores
    public Encargado(String nombreCompleto, String identificacion, String telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Definicion de metodos
    // Definicion de Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String mostrarInformacionEncargado() {
        return "Identificacion: " + identificacion +
                " | Nombre: " + nombreCompleto +
                " | Telefono: " + telefono +
                " | Correo: " + correo;
    }

    @Override
    public String toString() {
        return mostrarInformacionEncargado();
    }

}
