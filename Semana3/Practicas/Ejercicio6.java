import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Ejercicio 6: Cálculo Financiero

        String sIngreso;
        int nIngreso;
        double dPrestamo;
        double dTasa;

        sIngreso = JOptionPane.showInputDialog("Digite sus ingresos mensuales");
        nIngreso = Integer.parseInt(sIngreso);

        if (nIngreso > 3000) {
            dTasa = nIngreso * 0.05;
            dPrestamo = nIngreso + dTasa;
            JOptionPane.showMessageDialog(null,
                    "Con un ingreso de " + nIngreso + " mensuales. Te ofrecemos un prestamo de " + dPrestamo);
            JOptionPane.showMessageDialog(null,
                    "La tasa de intereses seria de 5% y con tu salario quedaria en " + dTasa);
        } else if (nIngreso > 1500) {
            dTasa = nIngreso * 0.07;
            dPrestamo = nIngreso + dTasa;
            JOptionPane.showMessageDialog(null,
                    "Con un ingreso de " + nIngreso + " mensuales. Te ofrecemos un prestamo de " + dPrestamo);
            JOptionPane.showMessageDialog(null,
                    "La tasa de intereses seria de 7% y con tu salario quedaria en " + dTasa);
        } else {
            JOptionPane.showMessageDialog(null, "Con tus ingresos actuales no te podemos ofreces prestamo.");
        }

    }
}