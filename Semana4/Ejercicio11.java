import javax.swing.JOptionPane;

public class Ejercicio11 {

    public static void main(String[] args) {

        // Solicita una frase al usuario
        String texto = JOptionPane.showInputDialog("Ingrese una frase");

        // Variables para contar vocales y consonantes
        int vocales = 0;
        int consonantes = 0;

        // Convierte la cadena a minúsculas para facilitar la comparación
        String auxiliar = texto.toLowerCase();

        // Recorre todos los caracteres de la cadena
        for (int i = 0; i < auxiliar.length(); i++) {

            char letra = auxiliar.charAt(i);

            // Verifica si es una letra
            if (letra >= 'a' && letra <= 'z') {

                // Verifica si es vocal
                if (letra == 'a' || letra == 'e' || letra == 'i'
                        || letra == 'o' || letra == 'u') {

                    vocales++;

                } else {

                    consonantes++;

                }
            }
        }

        // Compara las cantidades
        if (vocales > consonantes) {

            System.out.println("Resultado:");
            System.out.println(texto.toUpperCase());

        } else {

            System.out.println("Resultado:");
            System.out.println(texto.toLowerCase());

        }

    }

}