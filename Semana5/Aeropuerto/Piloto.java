/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class Piloto {

    private String codigo;
    private String nombre;
    private String licencia;

    public Piloto(String codigo, String nombre, String licencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void mostrarInformacion() {
        System.out.println("Piloto{codigo=" + codigo + ", nombre=" + nombre + ", licencia=" + licencia + "}");
    }
}