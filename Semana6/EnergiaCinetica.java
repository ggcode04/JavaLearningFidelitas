/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EnergiaCinetica {

    public static double energiaCineticas(double masa, double velocidad) {
        return 0.5 * masa * Math.pow(velocidad, 2);
    }

    public static void main(String[] args) {

        double masa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la masa (kg):", "Energia Cinetica",
                JOptionPane.QUESTION_MESSAGE));
        double velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la velocidad (m/s):",
                "Energia Cinetica", JOptionPane.QUESTION_MESSAGE));

        double resultado = energiaCineticas(masa, velocidad);

        JOptionPane.showMessageDialog(null, "La energia cinetica es: " + resultado + " J", "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}