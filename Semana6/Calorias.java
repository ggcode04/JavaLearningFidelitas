/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Calorias {

    public static double calcularCalorias() {
        double gramosArroz = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Gramos de arroz:", "Calorias", JOptionPane.QUESTION_MESSAGE));
        double gramosPollo = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Gramos de pollo:", "Calorias", JOptionPane.QUESTION_MESSAGE));
        double gramosEnsalada = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Gramos de ensalada:", "Calorias", JOptionPane.QUESTION_MESSAGE));

        double caloriasArroz = (gramosArroz / 100) * 130;
        double caloriasPollo = (gramosPollo / 100) * 165;
        double caloriasEnsalada = (gramosEnsalada / 100) * 50;

        return caloriasArroz + caloriasPollo + caloriasEnsalada;
    }

    public static void main(String[] args) {
        double totalCalorias = calcularCalorias();
        JOptionPane.showMessageDialog(null, "El total de calorias es: " + totalCalorias, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}