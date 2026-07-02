import javax.swing.JOptionPane;

public class MainVehiculo {
    public static void main(String[] args) {

        int anioActual = 2026;

        for (int i = 1; i <= 2; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos del Vehículo " + i);

            String marca   = JOptionPane.showInputDialog("Vehículo " + i + " - Marca:");
            String modelo  = JOptionPane.showInputDialog("Vehículo " + i + " - Modelo:");
            int anio       = Integer.parseInt(JOptionPane.showInputDialog("Vehículo " + i + " - Año:"));
            double km      = Double.parseDouble(JOptionPane.showInputDialog("Vehículo " + i + " - Kilometraje actual:"));

            Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, km);

            String info =
                "=== Información Vehículo " + i + " ===\n" +
                "Marca       : " + marca + "\n" +
                "Modelo      : " + modelo + "\n" +
                "Año         : " + anio + "\n" +
                "Kilometraje : " + km + " km\n" +
                "Antigüedad  : " + vehiculo.calcularAntiguedad(anioActual) + " años";

            JOptionPane.showMessageDialog(null, info, "Vehículo " + i, JOptionPane.INFORMATION_MESSAGE);

            // Solo avanzar kilómetros para el primer vehículo
            if (i == 1) {
                double kmExtra = Double.parseDouble(JOptionPane.showInputDialog(
                    "¿Cuántos kilómetros desea agregar al Vehículo 1?"));
                vehiculo.avanzar(kmExtra);
                JOptionPane.showMessageDialog(null,
                    "Kilómetros agregados al " + marca + " " + modelo + ".\nNuevo kilometraje: " + (km + (kmExtra > 0 ? kmExtra : 0)) + " km");
            }
        }
    }
}
