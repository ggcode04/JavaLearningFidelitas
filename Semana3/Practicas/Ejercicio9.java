import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {

        String sCategoria;

        sCategoria = JOptionPane.showInputDialog(
                "Seleccione una categoría:\n"
                        + "Principiante\n"
                        + "Intermedio\n"
                        + "Avanzado");

        switch (sCategoria.toLowerCase()) {

            case "principiante":
                JOptionPane.showMessageDialog(null,
                        "Entrenamientos sugeridos:\n"
                                + "- Calentamiento básico\n"
                                + "- Ejercicios de flotación\n"
                                + "- Estilo libre suave");
                break;

            case "intermedio":
                JOptionPane.showMessageDialog(null,
                        "Entrenamientos sugeridos:\n"
                                + "- Calentamiento avanzado\n"
                                + "- Técnica de espalda\n"
                                + "- Ejercicios de resistencia");
                break;

            case "avanzado":
                JOptionPane.showMessageDialog(null,
                        "Entrenamientos sugeridos:\n"
                                + "- Calentamiento intensivo\n"
                                + "- Técnica de mariposa\n"
                                + "- Nado de velocidad\n"
                                + "- Ejercicios de alta resistencia");
                break;

            default:
                JOptionPane.showMessageDialog(null,
                        "Categoría no válida.");
        }
    }
}