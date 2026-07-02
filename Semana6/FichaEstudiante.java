/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class FichaEstudiante {

    public static void mostrarFichaEstudiante(String nombre, int edad, double promedio, String materiaDestacada) {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad: " + edad + " anos");
        System.out.println("Promedio: " + promedio);
        System.out.println("Materia destacada: " + materiaDestacada);
    }

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(null, "Nombre del estudiante:", "Ficha del Estudiante",
                JOptionPane.QUESTION_MESSAGE);
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad del estudiante:", "Ficha del Estudiante",
                JOptionPane.QUESTION_MESSAGE));
        double promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio del estudiante:",
                "Ficha del Estudiante", JOptionPane.QUESTION_MESSAGE));
        String materiaDestacada = JOptionPane.showInputDialog(null, "Materia destacada:", "Ficha del Estudiante",
                JOptionPane.QUESTION_MESSAGE);

        mostrarFichaEstudiante(nombre, edad, promedio, materiaDestacada);
    }
}