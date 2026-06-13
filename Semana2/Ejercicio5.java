import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {

        int harina = 500;
        int azucar = 200;
        int mantequilla = 150;

        int total = harina + azucar + mantequilla;

        System.out.println("Harina: " + harina + "g");
        System.out.println("Azúcar: " + azucar + "g");
        System.out.println("Mantequilla: " + mantequilla + "g");
        System.out.println("Total de ingredientes: " + total + "g");

        JOptionPane.showMessageDialog(null,
                "Para la receta necesitas: Harina " + harina +
                "g, Azúcar " + azucar +
                "g, Mantequilla " + mantequilla +
                "g. Total: " + total + "g.");
    }
}