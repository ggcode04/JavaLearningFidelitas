/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class PacientePediatrico {
    // Definicion de atributos
    private String nombreCompleto;
    private int edad;
    private double peso;
    private double estatura;
    private String padecimientoRelevante;
    private String identificacionEncargado;

    // Definicion de constructor
    public PacientePediatrico(String nombreCompleto, int edad, double peso, double estatura,
            String padecimientoRelevante, String identificacionEncargado) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.padecimientoRelevante = padecimientoRelevante;
        this.identificacionEncargado = identificacionEncargado;
    }

    // Definicion de metodos
    // Definicion de Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getPadecimientoRelevante() {
        return padecimientoRelevante;
    }

    public void setPadecimientoRelevante(String padecimientoRelevante) {
        this.padecimientoRelevante = padecimientoRelevante;
    }

    public String getIdentificacionEncargado() {
        return identificacionEncargado;
    }

    public void setIdentificacionEncargado(String identificacionEncargado) {
        this.identificacionEncargado = identificacionEncargado;
    }

    public String mostrarInformacionPaciente() {
        return "Nombre: " + nombreCompleto +
                " | Edad: " + edad +
                " | Peso: " + peso +
                " | Estatura: " + estatura +
                " | Padecimiento" + padecimientoRelevante +
                " | Encargado (ID): " + identificacionEncargado;
    }

    @Override
    public String toString() {
        return mostrarInformacionPaciente();
    }
}
