import javax.swing.JOptionPane;

public class STRINGPRACTICA {

    public static void main(String[] args) {

        String sLectura;
        int nContador;
        int nNumero;
        int nSumatoria;

        // Adquisicion de datos de las variables
        sLectura = JOptionPane.showInputDialog("Digite el titulo de la pelicula");

        if (sLectura.length() > 15) {
            JOptionPane.showMessageDialog(null, "La pelicula tiene un titulo largo");
        } else if (sLectura.length() <= 15 && sLectura.length() > 5) {
            JOptionPane.showMessageDialog(null, "La pelicula tiene un titulo mediano");
        } else {
            JOptionPane.showMessageDialog(null, "La pelicula tiene un titulo corto");
        }

        String sCuidadTienda;
        String sCuidad;
        String sTienda;
        int nPosicionEspacio; // posicion inicial
        int nPosicionEspacioFinal; // posicion final

        sCuidadTienda = JOptionPane.showInputDialog("Ingrese la ciudad y tienda");
        sCuidadTienda = sCuidadTienda.trim(); // elimino espacios al inicio y al final
        nPosicionEspacioFinal = sCuidadTienda.lastIndexOf(" "); // encuentra la posicion donde termina el caracter
                                                                // especifico
        nPosicionEspacio = sCuidadTienda.indexOf(" "); // encuentra la posicion donde comienza el caracter especifico
        sTienda = sCuidadTienda.substring(nPosicionEspacioFinal + 1); // devuelve la posicion del segundo string despues
                                                                      // del delimitador
        sCuidad = sCuidadTienda.substring(0, nPosicionEspacio); // devuelve la posicion del primer string antes del
                                                                // delimitador

        System.out.println(nPosicionEspacioFinal); // imprime la posicion final del delimitador
        System.out.println(nPosicionEspacio); // imprime la posicion incial del delimitador
        System.out.println(sTienda); // devuelve el segundo string despues del delimitador
        System.out.println(sCuidad);// devuelve el primer string antes del delimitador

        System.out.println(sCuidad.toUpperCase()); // pone el texto en mayusculas
        System.out.println(sTienda.toLowerCase()); // pone el texto en minisculas
        System.out.println(sCuidad.toUpperCase() + " " + sTienda.toLowerCase()); // concatenado de dos textos
        String sCuidadTiendaNuevo; // creacion del nuevo string

        sCuidadTiendaNuevo = sCuidad.toUpperCase() + " " + sTienda.toLowerCase(); // asignacion del concatenado de los
                                                                                  // dos textos

        System.out.println(sCuidadTienda); // imprime string original
        System.out.println(sCuidadTiendaNuevo); // imprime string del concatenado de los dos textos

        // Validación de que si los dos strings son iguales despues de aplicar
        // mayusculas minisculas y split de caracteres
        if (sCuidadTienda.trim().equals(sCuidadTiendaNuevo.trim())) {
            JOptionPane.showMessageDialog(null, "las cadenas de caracteres son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "las cadenas de caracteres son diferentes");
        }
    }
}
