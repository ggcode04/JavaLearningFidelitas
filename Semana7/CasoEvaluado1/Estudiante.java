/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoevaluado1;

/**
 *
 * @author gabri
 */
public class Estudiante {
    private String nombre;
    private String carnet;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(String nombre, String carnet, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public String obtenerEstado() {
        if (calcularPromedio() >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrarInformacion() {
        System.out.println("=== Información del Estudiante ===");
        System.out.println("Nombre : " + nombre);
        System.out.println("Carnet : " + carnet);
        System.out.println("Nota 1 : " + nota1);
        System.out.println("Nota 2 : " + nota2);
        System.out.println("Nota 3 : " + nota3);
    }
}
