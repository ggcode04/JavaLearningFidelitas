import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Ejercicio 4: Gestión de Menús en Restaurante
        String sPlatillo;

        sPlatillo = JOptionPane.showInputDialog("Digite el nombre del platillo.");
        boolean bVegetariano = sPlatillo.toLowerCase().contains("vegetariano");

        if (bVegetariano == true) {
            JOptionPane.showMessageDialog(null, "El platillo es vegetariano");
        } else {
            JOptionPane.showMessageDialog(null, "El platillo no es vegetariano");
        }
    }
}