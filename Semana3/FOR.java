import javax.swing.JOptionPane;

public class FOR {

    public static void main(String[] args) {

        String sLectura;
        int nNumero;
        int nSumatoria = 0;

        // Adquisición de datos
        sLectura = JOptionPane.showInputDialog("Digite el número que desea calcular la sumatoria");

        // Asignación de variable
        nNumero = Integer.parseInt(sLectura);

        // Ciclo FOR
        for (int i = 1; i <= nNumero; i++) {
            nSumatoria = nSumatoria + i;
        }

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El valor de la sumatoria de 1 hasta " + nNumero + " es de " + nSumatoria);
    }
}