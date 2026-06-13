public class Ejercicio4 {

    public static void main(String[] args) {

        // Recorre las filas
        for (int fila = 1; fila <= 5; fila++) {

            // Imprime la cantidad de asteriscos correspondiente
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }

            // Salto de línea
            System.out.println();
        }

    }

}