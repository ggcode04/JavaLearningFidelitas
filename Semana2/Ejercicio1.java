import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        String sujeto = "La luna";
        String verbo = "ilumina";
        String complemento = "la noche silenciosa";

        String poema = sujeto + " " + verbo + " " + complemento;

        JOptionPane.showMessageDialog(null,
                "Poema: \"" + poema + "\"");
    }
}