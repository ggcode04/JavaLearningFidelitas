/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class Aeronave {

    private String identificador;
    private String modelo;
    private int capacidad;
    private Piloto pilotoPrincipal;

    public Aeronave(String identificador, String modelo, int capacidad) {
        this.identificador = identificador;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Piloto getPilotoPrincipal() {
        return pilotoPrincipal;
    }

    public void asignarPiloto(Piloto piloto) {
        this.pilotoPrincipal = piloto;
        System.out.println("Se asigno el piloto " + piloto.getNombre() + " a la aeronave " + identificador);
    }

    public void mostrarInformacion() {
        System.out.println("Aeronave{identificador=" + identificador + ", modelo=" + modelo
                + ", capacidad=" + capacidad
                + ", pilotoPrincipal=" + (pilotoPrincipal != null ? pilotoPrincipal.getNombre() : "sin asignar") + "}");
    }
}