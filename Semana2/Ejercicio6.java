import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {

        String actividad = "Estudiar Java";
        int tiempo = 3;
        String resultado = "Aprendí a usar JOptionPane";

        JOptionPane.showMessageDialog(null,
                "Actividad: " + actividad +
                ", Tiempo: " + tiempo +
                " horas, Resultado: " + resultado + ".");
    }
}