/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Instrumento {

    public enum Instrumentos {
        GUITARRA,
        PIANO,
        VIOLIN,
        FLAUTA,
        BATERIA
    }

    public static void mostrarDescripcion(Instrumentos instrumentos) {
        switch (instrumentos) {
            case GUITARRA:
                System.out.println("Instrumento de cuerdas pulsadas, muy usado en musica popular.");
                break;
            case PIANO:
                System.out.println("Instrumento de cuerdas percutidas con teclas.");
                break;
            case VIOLIN:
                System.out.println("Instrumento pequeno de cuerdas frotadas.");
                break;
            case FLAUTA:
                System.out.println("Instrumento de viento soplado.");
                break;
            case BATERIA:
                System.out.println("Conjunto de instrumentos de percusion.");
                break;
        }
    }

    public static void main(String[] args) {

        String[] opciones = { "GUITARRA", "PIANO", "VIOLIN", "FLAUTA", "BATERIA" };

        String seleccion = (String) JOptionPane.showInputDialog(null, "Elige un instrumento:",
                "Menu de Instrumentos", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        Instrumentos instrumentoSeleccionado = Instrumentos.valueOf(seleccion);
        mostrarDescripcion(instrumentoSeleccionado);
    }
}