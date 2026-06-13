import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {

        String actividad = JOptionPane.showInputDialog("Ingrese la actividad:");
        String tiempo = JOptionPane.showInputDialog("Ingrese el tiempo en horas:");
        String resultado = JOptionPane.showInputDialog("Ingrese el resultado:");

        JOptionPane.showMessageDialog(null,
                "Actividad: " + actividad +
                ", Tiempo: " + tiempo +
                " horas, Resultado: " + resultado + ".");
    }
}