import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {

        int nProfesor;
        int nSancionado;
        int nCorreo;

        nProfesor = JOptionPane.showConfirmDialog(null,
                "¿El usuario es profesor?");

        nSancionado = JOptionPane.showConfirmDialog(null,
                "¿El usuario ha sido sancionado?");

        nCorreo = JOptionPane.showConfirmDialog(null,
                "¿El usuario ha confirmado su correo electrónico?");

        if (nSancionado == 0) {

            JOptionPane.showMessageDialog(null,
                    "El usuario ha sido sancionado.");

        } else if (nCorreo == 1) {

            JOptionPane.showMessageDialog(null,
                    "El correo electrónico no ha sido confirmado.");

        } else if (nProfesor == 0) {

            JOptionPane.showMessageDialog(null,
                    "Acceso permitido. El usuario es profesor.");

        } else {

            JOptionPane.showMessageDialog(null,
                    "Acceso permitido. El usuario es estudiante.");
        }
    }
}