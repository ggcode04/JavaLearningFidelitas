/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class ServicioMedico {
    // Definicion de atributos
    public static final double IVA = 0.13;
    private String codigo;
    private String nombreServicio;
    private double precioBase;

    // Definicion de contructores
    public ServicioMedico(String codigo, String nombreServicio, double precioBase) {
        this.codigo = codigo;
        this.nombreServicio = nombreServicio;
        this.precioBase = precioBase;
    }

    // Definicion de metodos
    // Definicion de Getters y Setters
    // codigo
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // nombreServicio
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    // precioBase
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double calcularSubtotal() {
        return precioBase;
    }

    public double calcularIVA() {
        return precioBase * IVA;
    }

    public double calcularPrecioServicio() {
        return calcularSubtotal() * calcularIVA();
    }

    public String mostrarServicio() {
        return "Codigo: " + codigo +
                " | Servicio: " + nombreServicio +
                " | Precio Base: " + precioBase +
                " | IVA: " + calcularIVA() +
                " | Precio del Servicio" + calcularPrecioServicio();
    }

    @Override
    public String toString() {
        return mostrarServicio();
    }
}
