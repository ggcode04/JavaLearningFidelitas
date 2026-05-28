import javax.swing.JOptionPane;

public class ComparacionNumeros {

    public static void main(String[] args) {

        // Comparación de 3 números para determinar cuál es el mayor o si son iguales

        String sLectura;
        int nNumero1;
        int nNumero2;
        int nNumero3;

        sLectura = JOptionPane.showInputDialog("Ingresar primer número");
        nNumero1 = Integer.parseInt(sLectura);

        sLectura = JOptionPane.showInputDialog("Ingresar segundo número");
        nNumero2 = Integer.parseInt(sLectura);

        sLectura = JOptionPane.showInputDialog("Ingresar tercer número");
        nNumero3 = Integer.parseInt(sLectura);

        if (nNumero1 == nNumero2 && nNumero1 == nNumero3) {
            JOptionPane.showMessageDialog(null, "Los tres números son iguales");
        } else if (nNumero1 >= nNumero2 && nNumero1 >= nNumero3) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + nNumero1);
        } else if (nNumero2 >= nNumero1 && nNumero2 >= nNumero3) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + nNumero2);
        } else {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + nNumero3);
        }
    }
}