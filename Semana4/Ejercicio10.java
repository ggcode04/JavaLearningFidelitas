import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Solicita una frase
        String texto = JOptionPane.showInputDialog("Ingrese una frase");

        // Inicializa el contador
        int palabras = 1;

        // Recorre la cadena
        for (int i = 0; i < texto.length(); i++) {

            // Cada espacio indica una nueva palabra
            if (texto.charAt(i) == ' ') {
                palabras++;
            }

        }

        // Muestra el resultado
        System.out.println("Cantidad de palabras: " + palabras);

    }

}