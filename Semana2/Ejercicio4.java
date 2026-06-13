import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {

        int edadTierra = 20;

        double edadMarte = edadTierra * 0.53;
        double edadJupiter = edadTierra * 0.084;
        double edadSaturno = edadTierra * 0.034;

        System.out.println("Edad en la Tierra: " + edadTierra + " años");
        System.out.println("Edad en Marte: " + edadMarte + " años");
        System.out.println("Edad en Júpiter: " + edadJupiter + " años");
        System.out.println("Edad en Saturno: " + edadSaturno + " años");

        JOptionPane.showMessageDialog(null,
                "En la Tierra tienes " + edadTierra +
                " años, en Marte " + edadMarte +
                ", en Júpiter " + edadJupiter +
                ", y en Saturno " + edadSaturno + " años.");
    }
}