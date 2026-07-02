/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class CitaMedica {
    // Definicion de atributos
    private String nombrePaciente;
    private String tipoServicio;
    private String motivoCita;
    private String fecha;
    private double montoTotal;

    // Definicion de contructores
    public CitaMedica(String nombrePaciente, String tipoServicio, String motivoCita, String fecha, double montoTotal) {
        this.nombrePaciente = nombrePaciente;
        this.tipoServicio = tipoServicio;
        this.motivoCita = motivoCita;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
    }

    // Definicion de metodos
    // Definicion de Getters y Setters
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String gettipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String mostrarCita() {
        return "Paciente: " + nombrePaciente +
                " | Servicio: " + tipoServicio +
                " | Motivo: " + motivoCita +
                " | Fecha: " + fecha +
                " | Monto Total" + montoTotal;
    }

    @Override
    public String toString() {
        return mostrarCita();
    }
}
