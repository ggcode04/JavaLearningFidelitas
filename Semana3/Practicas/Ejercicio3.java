import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Ejercicio 3: Formato de Titulo de Libro
        String sLibro;

        sLibro = JOptionPane.showInputDialog("Digite el titulo del libro.");

        if (sLibro == sLibro.toUpperCase() || sLibro == sLibro.toLowerCase()) {
            JOptionPane.showMessageDialog(null, sLibro.toUpperCase().charAt(0) + sLibro.substring(1).toLowerCase());
        }
    }
}