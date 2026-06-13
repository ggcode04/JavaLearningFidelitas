public class Ejercicio7 {

    public static void main(String[] args) {

        // Parte superior del rombo
        for (int fila = 1; fila <= 5; fila++) {

            for (int espacio = 1; espacio <= 5 - fila; espacio++) {
                System.out.print(" ");
            }

            for (int asterisco = 1; asterisco <= (fila * 2) - 1; asterisco++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Parte inferior del rombo
        for (int fila = 4; fila >= 1; fila--) {

            for (int espacio = 1; espacio <= 5 - fila; espacio++) {
                System.out.print(" ");
            }

            for (int asterisco = 1; asterisco <= (fila * 2) - 1; asterisco++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}