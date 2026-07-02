/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class MainProducto {
    public static void main(String[] args) {

        // Producto 1 - con descuento
        JOptionPane.showMessageDialog(null, "Ingrese los datos del Producto 1");

        String codigo1 = JOptionPane.showInputDialog("Producto 1 - Código:");
        String nombre1 = JOptionPane.showInputDialog("Producto 1 - Nombre:");
        double precio1 = Double.parseDouble(JOptionPane.showInputDialog("Producto 1 - Precio:"));
        int cantidad1 = Integer.parseInt(JOptionPane.showInputDialog("Producto 1 - Cantidad:"));
        double descuento = Double.parseDouble(JOptionPane.showInputDialog("Producto 1 - Porcentaje de descuento:"));

        Producto producto1 = new Producto(codigo1, nombre1, precio1, cantidad1);

        String resultado1 = "=== Detalle Producto 1 ===\n" +
                "Código      : " + codigo1 + "\n" +
                "Nombre      : " + nombre1 + "\n" +
                "Precio      : " + precio1 + "\n" +
                "Cantidad    : " + cantidad1 + "\n" +
                "Subtotal    : " + producto1.calcularSubtotal() + "\n" +
                "Con " + descuento + "% desc.: " + producto1.aplicarDescuento(descuento);

        JOptionPane.showMessageDialog(null, resultado1, "Resultado Producto 1", JOptionPane.INFORMATION_MESSAGE);

        // Producto 2 - sin descuento
        JOptionPane.showMessageDialog(null, "Ingrese los datos del Producto 2");

        String codigo2 = JOptionPane.showInputDialog("Producto 2 - Código:");
        String nombre2 = JOptionPane.showInputDialog("Producto 2 - Nombre:");
        double precio2 = Double.parseDouble(JOptionPane.showInputDialog("Producto 2 - Precio:"));
        int cantidad2 = Integer.parseInt(JOptionPane.showInputDialog("Producto 2 - Cantidad:"));

        Producto producto2 = new Producto(codigo2, nombre2, precio2, cantidad2);

        String resultado2 = "=== Detalle Producto 2 ===\n" +
                "Código   : " + codigo2 + "\n" +
                "Nombre   : " + nombre2 + "\n" +
                "Precio   : " + precio2 + "\n" +
                "Cantidad : " + cantidad2 + "\n" +
                "Subtotal : " + producto2.calcularSubtotal();

        JOptionPane.showMessageDialog(null, resultado2, "Resultado Producto 2", JOptionPane.INFORMATION_MESSAGE);
    }
}
