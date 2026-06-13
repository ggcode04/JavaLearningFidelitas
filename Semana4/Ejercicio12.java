import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {

        // Solicita un número entre 1 y 20
        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un número entre 1 y 20"));

        // Genera los primeros 10 múltiplos
        for (int i = 1; i <= 10; i++) {

            int multiplo = numero * i;

            // Se asume que el número es primo
            boolean primo = true;

            // Los números menores que 2 no son primos
            if (multiplo < 2) {
                primo = false;
            }

            // Busca divisores distintos de 1 y del mismo número
            for (int j = 2; j < multiplo; j++) {

                if (multiplo % j == 0) {

                    primo = false;
                    break;

                }
            }

            // Muestra el múltiplo
            if (primo) {

                System.out.println(multiplo + " <- es primo");

            } else {

                System.out.println(multiplo);

            }
        }

    }

}