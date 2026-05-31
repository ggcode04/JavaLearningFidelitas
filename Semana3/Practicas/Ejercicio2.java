import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Ejercicio 2: Título de Noticia
        String sNoticia;

        sNoticia = JOptionPane.showInputDialog("Digite el titulo de su noticia.");

        if (sNoticia.length() > 15) {
            JOptionPane.showMessageDialog(null, "Titulo de la noticia: " + sNoticia.substring(0, 15) + "...");
        } else {
            JOptionPane.showMessageDialog(null, "Titulo de la noticia: " + sNoticia);
        }
    }
}
