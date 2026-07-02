/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Main {

    public static void main(String[] args) {

        // ---- Datos del Piloto 1 ----
        String codigoP1 = JOptionPane.showInputDialog(null, "Codigo del Piloto 1:", "Registro de Piloto",
                JOptionPane.QUESTION_MESSAGE);
        String nombreP1 = JOptionPane.showInputDialog(null, "Nombre del Piloto 1:", "Registro de Piloto",
                JOptionPane.QUESTION_MESSAGE);
        String licenciaP1 = JOptionPane.showInputDialog(null, "Licencia del Piloto 1:", "Registro de Piloto",
                JOptionPane.QUESTION_MESSAGE);
        Piloto piloto1 = new Piloto(codigoP1, nombreP1, licenciaP1);

        // ---- Datos del Piloto 2 ----
        String codigoP2 = JOptionPane.showInputDialog(null, "Codigo del Piloto 2:", "Registro de Piloto",
                JOptionPane.QUESTION_MESSAGE);
        String nombreP2 = JOptionPane.showInputDialog(null, "Nombre del Piloto 2:", "Registro de Piloto",
                JOptionPane.QUESTION_MESSAGE);
        String licenciaP2 = JOptionPane.showInputDialog(null, "Licencia del Piloto 2:", "Registro de Piloto",
                JOptionPane.QUESTION_MESSAGE);
        Piloto piloto2 = new Piloto(codigoP2, nombreP2, licenciaP2);

        // ---- Datos de la Aeronave 1 ----
        String idA1 = JOptionPane.showInputDialog(null, "Identificador de la Aeronave 1:", "Registro de Aeronave",
                JOptionPane.QUESTION_MESSAGE);
        String modeloA1 = JOptionPane.showInputDialog(null, "Modelo de la Aeronave 1:", "Registro de Aeronave",
                JOptionPane.QUESTION_MESSAGE);
        int capacidadA1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Capacidad de pasajeros de la Aeronave 1:",
                "Registro de Aeronave", JOptionPane.QUESTION_MESSAGE));
        Aeronave aeronave1 = new Aeronave(idA1, modeloA1, capacidadA1);

        // ---- Datos de la Aeronave 2 ----
        String idA2 = JOptionPane.showInputDialog(null, "Identificador de la Aeronave 2:", "Registro de Aeronave",
                JOptionPane.QUESTION_MESSAGE);
        String modeloA2 = JOptionPane.showInputDialog(null, "Modelo de la Aeronave 2:", "Registro de Aeronave",
                JOptionPane.QUESTION_MESSAGE);
        int capacidadA2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Capacidad de pasajeros de la Aeronave 2:",
                "Registro de Aeronave", JOptionPane.QUESTION_MESSAGE));
        Aeronave aeronave2 = new Aeronave(idA2, modeloA2, capacidadA2);

        // ---- Asignacion de pilotos ----
        aeronave1.asignarPiloto(piloto1);
        aeronave2.asignarPiloto(piloto2);

        // ---- Datos del Vuelo 1 ----
        String numeroV1 = JOptionPane.showInputDialog(null, "Numero del Vuelo 1:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        String aerolineaV1 = JOptionPane.showInputDialog(null, "Aerolinea del Vuelo 1:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        String destinoV1 = JOptionPane.showInputDialog(null, "Destino del Vuelo 1:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        String horaV1 = JOptionPane.showInputDialog(null, "Hora programada de salida del Vuelo 1:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        Vuelo vuelo1 = new Vuelo(numeroV1, aerolineaV1, destinoV1, horaV1, aeronave1);

        // ---- Datos del Vuelo 2 ----
        String numeroV2 = JOptionPane.showInputDialog(null, "Numero del Vuelo 2:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        String aerolineaV2 = JOptionPane.showInputDialog(null, "Aerolinea del Vuelo 2:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        String destinoV2 = JOptionPane.showInputDialog(null, "Destino del Vuelo 2:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        String horaV2 = JOptionPane.showInputDialog(null, "Hora programada de salida del Vuelo 2:", "Registro de Vuelo",
                JOptionPane.QUESTION_MESSAGE);
        Vuelo vuelo2 = new Vuelo(numeroV2, aerolineaV2, destinoV2, horaV2, aeronave2);

        // ---- Cambio de estado de los vuelos ----
        String[] estados = { "PROGRAMADO", "ABORDANDO", "EN_VUELO", "ATERRIZADO", "CANCELADO" };

        String estadoV1 = (String) JOptionPane.showInputDialog(null, "Nuevo estado para el Vuelo 1:",
                "Actualizar Estado", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);
        vuelo1.actualizarEstado(EstadoVuelo.valueOf(estadoV1));

        String estadoV2 = (String) JOptionPane.showInputDialog(null, "Nuevo estado para el Vuelo 2:",
                "Actualizar Estado", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);
        vuelo2.actualizarEstado(EstadoVuelo.valueOf(estadoV2));

        // ---- Resumen final ----
        piloto1.mostrarInformacion();
        piloto2.mostrarInformacion();
        aeronave1.mostrarInformacion();
        aeronave2.mostrarInformacion();
        vuelo1.mostrarInformacion();
        vuelo2.mostrarInformacion();

        JOptionPane.showMessageDialog(null,
                "Vuelo 1 -> " + numeroV1 + " | " + aerolineaV1 + " | Destino: " + destinoV1
                        + " | Estado: " + vuelo1.getEstado() + " | Aeronave: " + idA1 + "\n"
                        + "Vuelo 2 -> " + numeroV2 + " | " + aerolineaV2 + " | Destino: " + destinoV2
                        + " | Estado: " + vuelo2.getEstado() + " | Aeronave: " + idA2,
                "Resumen de Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}