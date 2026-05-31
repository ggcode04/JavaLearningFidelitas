import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {

        String sArticulos;
        String sMonto;

        int nArticulos;
        double dMonto;

        sArticulos = JOptionPane.showInputDialog("Digite la cantidad de artículos comprados");
        nArticulos = Integer.parseInt(sArticulos);

        sMonto = JOptionPane.showInputDialog("Digite el monto total gastado");
        dMonto = Double.parseDouble(sMonto);

        if (nArticulos > 5 && dMonto > 100) {

            JOptionPane.showMessageDialog(null,
                    "El cliente recibe un descuento del 10%.");

        } else if (nArticulos >= 3 || dMonto > 50) {

            JOptionPane.showMessageDialog(null,
                    "El cliente recibe un descuento del 5%.");

        } else {

            JOptionPane.showMessageDialog(null,
                    "El cliente no recibe descuento.");
        }
    }
}