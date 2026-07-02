/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoevaluado1;

/**
 *
 * @author gabri
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;

    public Vehiculo(String marca, String modelo, int anio, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public void avanzar(double kilometros) {
        if (kilometros > 0) {
            kilometraje += kilometros;
            System.out.println("El vehículo avanzó " + kilometros + " km. Kilometraje total: " + kilometraje);
        } else {
            System.out.println("Los kilómetros a avanzar deben ser mayor que cero.");
        }
    }

    public int calcularAntiguedad(int anioActual) {
        return anioActual - anio;
    }

    public void mostrarInformacion() {
        System.out.println("=== Información del Vehículo ===");
        System.out.println("Marca       : " + marca);
        System.out.println("Modelo      : " + modelo);
        System.out.println("Año         : " + anio);
        System.out.println("Kilometraje : " + kilometraje + " km");
    }
}
