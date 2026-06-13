import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {

        // Solicita una cadena
        String texto = JOptionPane.showInputDialog("Ingrese un texto");

        System.out.println("Caracteres en posiciones impares:");

        // Recorre las posiciones impares
        for (int i = 1; i < texto.length(); i += 2) {

            System.out.print(texto.charAt(i));

        }

    }

}