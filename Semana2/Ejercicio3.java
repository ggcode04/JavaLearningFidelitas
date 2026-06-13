import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String profesion = JOptionPane.showInputDialog("Ingrese su profesión:");
        String experiencia = JOptionPane.showInputDialog("Ingrese sus años de experiencia:");

        JOptionPane.showMessageDialog(null,
                "Su nombre es " + nombre +
                " y usted cuenta con una experiencia de " +
                experiencia + " años en la profesión de " +
                profesion + ".");
    }
}