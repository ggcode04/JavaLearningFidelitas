public class Ejercicio5 {

    public static void main(String[] args) {

        // Recorre las filas desde 5 hasta 1
        for (int fila = 5; fila >= 1; fila--) {

            // Imprime los asteriscos de la fila actual
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }

            // Salto de línea
            System.out.println();
        }

    }

}