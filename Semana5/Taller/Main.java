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

        // ---- Datos del Vehiculo 1 ----
        String placaV1 = JOptionPane.showInputDialog(null, "Placa del Vehiculo 1:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE);
        String modeloV1 = JOptionPane.showInputDialog(null, "Modelo del Vehiculo 1:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE);
        int anioV1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Anio del Vehiculo 1:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE));
        String propietarioV1 = JOptionPane.showInputDialog(null, "Propietario del Vehiculo 1:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE);
        Vehiculo vehiculo1 = new Vehiculo(placaV1, modeloV1, anioV1, propietarioV1);

        // ---- Datos del Vehiculo 2 ----
        String placaV2 = JOptionPane.showInputDialog(null, "Placa del Vehiculo 2:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE);
        String modeloV2 = JOptionPane.showInputDialog(null, "Modelo del Vehiculo 2:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE);
        int anioV2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Anio del Vehiculo 2:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE));
        String propietarioV2 = JOptionPane.showInputDialog(null, "Propietario del Vehiculo 2:", "Registro de Vehiculo",
                JOptionPane.QUESTION_MESSAGE);
        Vehiculo vehiculo2 = new Vehiculo(placaV2, modeloV2, anioV2, propietarioV2);

        // ---- Datos del Mecanico 1 ----
        String codigoM1 = JOptionPane.showInputDialog(null, "Codigo del Mecanico 1:", "Registro de Mecanico",
                JOptionPane.QUESTION_MESSAGE);
        String nombreM1 = JOptionPane.showInputDialog(null, "Nombre del Mecanico 1:", "Registro de Mecanico",
                JOptionPane.QUESTION_MESSAGE);
        String especialidadM1 = JOptionPane.showInputDialog(null, "Especialidad del Mecanico 1:",
                "Registro de Mecanico", JOptionPane.QUESTION_MESSAGE);
        Mecanico mecanico1 = new Mecanico(codigoM1, nombreM1, especialidadM1);

        // ---- Datos del Mecanico 2 ----
        String codigoM2 = JOptionPane.showInputDialog(null, "Codigo del Mecanico 2:", "Registro de Mecanico",
                JOptionPane.QUESTION_MESSAGE);
        String nombreM2 = JOptionPane.showInputDialog(null, "Nombre del Mecanico 2:", "Registro de Mecanico",
                JOptionPane.QUESTION_MESSAGE);
        String especialidadM2 = JOptionPane.showInputDialog(null, "Especialidad del Mecanico 2:",
                "Registro de Mecanico", JOptionPane.QUESTION_MESSAGE);
        Mecanico mecanico2 = new Mecanico(codigoM2, nombreM2, especialidadM2);

        // ---- Datos de la Orden 1 ----
        String numeroO1 = JOptionPane.showInputDialog(null, "Numero de la Orden 1:", "Registro de Orden",
                JOptionPane.QUESTION_MESSAGE);
        String servicioO1 = JOptionPane.showInputDialog(null,
                "Tipo de servicio de la Orden 1 (preventivo/correctivo/diagnostico):", "Registro de Orden",
                JOptionPane.QUESTION_MESSAGE);
        OrdenTrabajo orden1 = new OrdenTrabajo(numeroO1, servicioO1, vehiculo1);

        // ---- Datos de la Orden 2 ----
        String numeroO2 = JOptionPane.showInputDialog(null, "Numero de la Orden 2:", "Registro de Orden",
                JOptionPane.QUESTION_MESSAGE);
        String servicioO2 = JOptionPane.showInputDialog(null,
                "Tipo de servicio de la Orden 2 (preventivo/correctivo/diagnostico):", "Registro de Orden",
                JOptionPane.QUESTION_MESSAGE);
        OrdenTrabajo orden2 = new OrdenTrabajo(numeroO2, servicioO2, vehiculo2);

        // ---- Asignacion de mecanicos ----
        orden1.asignarMecanico(mecanico1);
        orden2.asignarMecanico(mecanico2);

        // ---- Revision y avance ----
        mecanico1.revisarVehiculo(vehiculo1);
        String avance = JOptionPane.showInputDialog(null, "Avance que registrara " + mecanico2.getNombre() + ":",
                "Registrar Avance", JOptionPane.QUESTION_MESSAGE);
        mecanico2.registrarAvance(avance);

        // ---- Cambio de estado de las ordenes ----
        String[] estados = { "PENDIENTE", "EN_PROCESO", "COMPLETADA", "CANCELADA" };

        String estadoO1 = (String) JOptionPane.showInputDialog(null, "Nuevo estado para la Orden 1:",
                "Actualizar Estado", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);
        orden1.cambiarEstado(EstadoOrden.valueOf(estadoO1));

        String estadoO2 = (String) JOptionPane.showInputDialog(null, "Nuevo estado para la Orden 2:",
                "Actualizar Estado", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);
        orden2.cambiarEstado(EstadoOrden.valueOf(estadoO2));

        // ---- Resumen final ----
        vehiculo1.mostrarInformacion();
        vehiculo2.mostrarInformacion();
        orden1.mostrarInformacion();
        orden2.mostrarInformacion();

        JOptionPane.showMessageDialog(null,
                "Orden 1 -> " + numeroO1 + " | " + servicioO1 + " | Estado: " + orden1.getEstado()
                        + " | Vehiculo: " + placaV1 + " | Mecanico: " + mecanico1.getNombre() + "\n"
                        + "Orden 2 -> " + numeroO2 + " | " + servicioO2 + " | Estado: " + orden2.getEstado()
                        + " | Vehiculo: " + placaV2 + " | Mecanico: " + mecanico2.getNombre(),
                "Resumen de Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}