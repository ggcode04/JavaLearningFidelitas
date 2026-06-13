import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {

        int efectivo = 50000;
        int banco = 150000;
        int alcancia = 25000;

        int total = efectivo + banco + alcancia;

        System.out.println("Ahorros en efectivo: ¢" + efectivo);
        System.out.println("Ahorros en banco: ¢" + banco);
        System.out.println("Ahorros en alcancía: ¢" + alcancia);
        System.out.println("Total de ahorros: ¢" + total);

        JOptionPane.showMessageDialog(null,
                "Tus ahorros son: Efectivo ¢" + efectivo +
                ", Banco ¢" + banco +
                ", Alcancía ¢" + alcancia +
                ". Total: ¢" + total + ".");
    }
}