import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Ejercicio 1: Formato de Nombre Completo
        String sNombre;
        String sApellido;

        sNombre = JOptionPane.showInputDialog("Ingrese su nombre");
        sApellido = JOptionPane.showInputDialog("Ingrese su apellido");

        if (sNombre.equals(sNombre.toUpperCase()) && sApellido.equals(sApellido.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Formato Correcto");
        }
    }
}