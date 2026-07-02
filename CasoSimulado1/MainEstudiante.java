import javax.swing.JOptionPane;

public class MainEstudiante {
    public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos del Estudiante " + i);

            String nombre = JOptionPane.showInputDialog("Estudiante " + i + " - Nombre:");
            String carnet = JOptionPane.showInputDialog("Estudiante " + i + " - Carnet:");
            double nota1  = Double.parseDouble(JOptionPane.showInputDialog("Estudiante " + i + " - Nota 1:"));
            double nota2  = Double.parseDouble(JOptionPane.showInputDialog("Estudiante " + i + " - Nota 2:"));
            double nota3  = Double.parseDouble(JOptionPane.showInputDialog("Estudiante " + i + " - Nota 3:"));

            Estudiante estudiante = new Estudiante(nombre, carnet, nota1, nota2, nota3);

            String resultado =
                "=== Información del Estudiante " + i + " ===\n" +
                "Nombre   : " + nombre + "\n" +
                "Carnet   : " + carnet + "\n" +
                "Nota 1   : " + nota1 + "\n" +
                "Nota 2   : " + nota2 + "\n" +
                "Nota 3   : " + nota3 + "\n" +
                "Promedio : " + estudiante.calcularPromedio() + "\n" +
                "Estado   : " + estudiante.obtenerEstado();

            JOptionPane.showMessageDialog(null, resultado, "Resultado Estudiante " + i, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
