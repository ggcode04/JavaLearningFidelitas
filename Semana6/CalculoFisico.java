/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class CalculoFisico {

    public static double calcularFisica(double velocidad, double tiempo, double distancia, int opcion) {
        double resultado = 0;
        switch (opcion) {
            case 1:
                resultado = velocidad * tiempo;
                break;
            case 2:
                resultado = distancia / tiempo;
                break;
            case 3:
                resultado = distancia / velocidad;
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {

        String[] opciones = { "1 - Calcular distancia", "2 - Calcular velocidad", "3 - Calcular tiempo" };

        String seleccion = (String) JOptionPane.showInputDialog(null, "Que deseas calcular?",
                "Calculo Fisico", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        int opcion = Integer.parseInt(seleccion.substring(0, 1));

        double velocidad = 0;
        double tiempo = 0;
        double distancia = 0;

        if (opcion == 1) {
            velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la velocidad:", "Calculo Fisico",
                    JOptionPane.QUESTION_MESSAGE));
            tiempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el tiempo:", "Calculo Fisico",
                    JOptionPane.QUESTION_MESSAGE));
        } else if (opcion == 2) {
            distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la distancia:", "Calculo Fisico",
                    JOptionPane.QUESTION_MESSAGE));
            tiempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el tiempo:", "Calculo Fisico",
                    JOptionPane.QUESTION_MESSAGE));
        } else if (opcion == 3) {
            distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la distancia:", "Calculo Fisico",
                    JOptionPane.QUESTION_MESSAGE));
            velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la velocidad:", "Calculo Fisico",
                    JOptionPane.QUESTION_MESSAGE));
        }

        double resultado = calcularFisica(velocidad, tiempo, distancia, opcion);

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}