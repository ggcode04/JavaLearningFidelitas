import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        String sujeto = JOptionPane.showInputDialog("Ingrese el sujeto:");
        String verbo = JOptionPane.showInputDialog("Ingrese el verbo:");
        String complemento = JOptionPane.showInputDialog("Ingrese el complemento:");

        String poema = sujeto + " " + verbo + " " + complemento;

        JOptionPane.showMessageDialog(null,
                "Poema: \"" + poema + "\"");
    }
}