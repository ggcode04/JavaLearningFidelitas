import javax.swing.JOptionPane;

public class CasoEvaluado1 {

     public static void main(String[] args) {
        String[] opciones = {"Estudiante", "Producto", "Cuenta Bancaria", "Vehículo", "Salir"};

        while (true) {
            int opcion = JOptionPane.showOptionDialog(null,
                "Seleccione el módulo a ejecutar:",
                "Menú Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null, opciones, opciones[0]);

            if (opcion == 0) MainEstudiante.main(null);
            else if (opcion == 1) MainProducto.main(null);
            else if (opcion == 2) MainCuentaBancaria.main(null);
            else if (opcion == 3) MainVehiculo.main(null);
            else break;
        }
    }
}
