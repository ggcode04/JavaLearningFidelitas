public class Ejercicio13 {

    public static void main(String[] args) {

        // Variable para acumular la distancia recorrida
        int distanciaTotal = 0;

        // La nave tiene combustible para 10 saltos
        for (int salto = 1; salto <= 10; salto++) {

            // Genera una distancia aleatoria entre 100 y 500 km
            int distancia = (int) (Math.random() * 401) + 100;

            // Acumula la distancia recorrida
            distanciaTotal += distancia;

            // Muestra la información del salto
            System.out.println(
                    "Salto " + salto +
                            ": " + distancia +
                            " km (Total: " + distanciaTotal + " km)");

            // Verifica si se superaron los 3000 km
            if (distanciaTotal > 3000) {

                System.out.println("¡Alerta! Distancia máxima superada");

                // Finaliza el recorrido
                break;

            }

        }

    }

}