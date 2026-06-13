import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Ejercicio 5: Validación de Contraseña
        String sPassword;

        sPassword = JOptionPane.showInputDialog("Ingrese la contraeña");

        if (sPassword.length() >= 8) {
            JOptionPane.showMessageDialog(null, "Su contraseña es valida.");
        } else {
            JOptionPane.showMessageDialog(null, "Por seguridad tiene que cambiar de contraseña");
        }
    }
}
