import javax.swing.JOptionPane;

public class DiaLibre {

    public static void main(String[] args) {

        // Día libre o laboral dependiendo del número del día de la semana
        String sLectura1;
        int nDia;
        String sMensaje;

        sLectura1 = JOptionPane.showInputDialog("Ingresar un número del 1 al 7");

        nDia = Integer.parseInt(sLectura1);

        switch (nDia) {
            case 1:
                sMensaje = "Domingo es día libre";
                break;
            case 2:
                sMensaje = "Lunes es día laboral";
                break;
            case 3:
                sMensaje = "Martes es día laboral";
                break;
            case 4:
                sMensaje = "Miércoles es día laboral";
                break;
            case 5:
                sMensaje = "Jueves es día laboral";
                break;
            case 6:
                sMensaje = "Viernes es día laboral";
                break;
            case 7:
                sMensaje = "Sábado es día libre";
                break;
            default:
                sMensaje = "Día inválido";
                break;
        }
        JOptionPane.showMessageDialog(null, sMensaje);
    }
}