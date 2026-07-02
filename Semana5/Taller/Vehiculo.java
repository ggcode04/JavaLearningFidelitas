/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class Vehiculo {

    private String placa;
    private String modelo;
    private int anio;
    private String propietario;

    public Vehiculo(String placa, String modelo, int anio, String propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void mostrarInformacion() {
        System.out.println("Vehiculo{placa=" + placa + ", modelo=" + modelo
                + ", anio=" + anio + ", propietario=" + propietario + "}");
    }
}