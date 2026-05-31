import javax.swing.JOptionPane;

public class WHILE {

    public static void main(String[] args) {

        // Declaración de variables

        String sLectura;
        int nNumero;
        int nSumatoria = 0;
        int nContador = 1;

        // Adquisición de datos
        sLectura = JOptionPane.showInputDialog("Digite el número que desea calcular la sumatoria");

        // Asignación de variable
        nNumero = Integer.parseInt(sLectura);

        // Ciclo WHILE
        while (nContador <= nNumero) {
            nSumatoria = nSumatoria + nContador;
            nContador++;
        }

        // Mostrar resultado final
        JOptionPane.showMessageDialog(null, "El valor de la sumatoria de 1 hasta " + nNumero + " es de " + nSumatoria);
    }
}