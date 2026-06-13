import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {

        // Solicita un texto al usuario
        String texto = JOptionPane.showInputDialog("Ingrese un texto");

        // Contadores
        int vocales = 0;
        int consonantes = 0;

        // Convierte el texto a minúsculas
        texto = texto.toLowerCase();

        // Recorre todos los caracteres
        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

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

        // Muestra resultados
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);

    }

}