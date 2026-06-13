public class Ejercicio6 {

    public static void main(String[] args) {

        // Recorre las filas
        for (int fila = 1; fila <= 5; fila++) {

            // Imprime los espacios en blanco
            for (int espacio = 1; espacio <= 5 - fila; espacio++) {
                System.out.print(" ");
            }

            // Imprime los asteriscos
            for (int asterisco = 1; asterisco <= (fila * 2) - 1; asterisco++) {
                System.out.print("*");
            }

            // Salto de línea
            System.out.println();
        }

    }

}