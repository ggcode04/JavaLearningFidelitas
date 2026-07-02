/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoevaluado1;

/**
 *
 * @author gabri
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    public double aplicarDescuento(double porcentaje) {
        double subtotal = calcularSubtotal();
        double descuento = subtotal * (porcentaje / 100.0);
        return subtotal - descuento;
    }

    public void mostrarDetalle() {
        System.out.println("=== Detalle del Producto ===");
        System.out.println("Código   : " + codigo);
        System.out.println("Nombre   : " + nombre);
        System.out.println("Precio   : " + precio);
        System.out.println("Cantidad : " + cantidad);
        System.out.println("Subtotal : " + calcularSubtotal());
    }
}
