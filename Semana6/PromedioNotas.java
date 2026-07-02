/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class PromedioNotas {

    public static double promedioNotas(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la primera nota:",
                "Promedio de Notas", JOptionPane.QUESTION_MESSAGE));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la segunda nota:",
                "Promedio de Notas", JOptionPane.QUESTION_MESSAGE));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la tercera nota:",
                "Promedio de Notas", JOptionPane.QUESTION_MESSAGE));

        double promedio = promedioNotas(nota1, nota2, nota3);

        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}