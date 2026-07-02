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

                // ---- Datos del Operario 1 ----
                String codigoOp1 = JOptionPane.showInputDialog(null, "Codigo del Operario 1:", "Registro de Operario",
                                JOptionPane.QUESTION_MESSAGE);
                String nombreOp1 = JOptionPane.showInputDialog(null, "Nombre del Operario 1:", "Registro de Operario",
                                JOptionPane.QUESTION_MESSAGE);
                String areaOp1 = JOptionPane.showInputDialog(null, "Area de especializacion del Operario 1:",
                                "Registro de Operario", JOptionPane.QUESTION_MESSAGE);
                Operario operario1 = new Operario(codigoOp1, nombreOp1, areaOp1);

                // ---- Datos del Operario 2 ----
                String codigoOp2 = JOptionPane.showInputDialog(null, "Codigo del Operario 2:", "Registro de Operario",
                                JOptionPane.QUESTION_MESSAGE);
                String nombreOp2 = JOptionPane.showInputDialog(null, "Nombre del Operario 2:", "Registro de Operario",
                                JOptionPane.QUESTION_MESSAGE);
                String areaOp2 = JOptionPane.showInputDialog(null, "Area de especializacion del Operario 2:",
                                "Registro de Operario", JOptionPane.QUESTION_MESSAGE);
                Operario operario2 = new Operario(codigoOp2, nombreOp2, areaOp2);

                // ---- Datos del Dispositivo 1 ----
                String serieD1 = JOptionPane.showInputDialog(null, "Numero de serie del Dispositivo 1:",
                                "Registro de Dispositivo", JOptionPane.QUESTION_MESSAGE);
                String modeloD1 = JOptionPane.showInputDialog(null, "Modelo del Dispositivo 1:",
                                "Registro de Dispositivo", JOptionPane.QUESTION_MESSAGE);
                int loteD1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Lote de produccion del Dispositivo 1:",
                                "Registro de Dispositivo", JOptionPane.QUESTION_MESSAGE));
                Dispositivo dispositivo1 = new Dispositivo(serieD1, modeloD1, loteD1);

                // ---- Datos del Dispositivo 2 ----
                String serieD2 = JOptionPane.showInputDialog(null, "Numero de serie del Dispositivo 2:",
                                "Registro de Dispositivo", JOptionPane.QUESTION_MESSAGE);
                String modeloD2 = JOptionPane.showInputDialog(null, "Modelo del Dispositivo 2:",
                                "Registro de Dispositivo", JOptionPane.QUESTION_MESSAGE);
                int loteD2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Lote de produccion del Dispositivo 2:",
                                "Registro de Dispositivo", JOptionPane.QUESTION_MESSAGE));
                Dispositivo dispositivo2 = new Dispositivo(serieD2, modeloD2, loteD2);

                // ---- Asignacion de operarios ----
                dispositivo1.asignarOperario(operario1);
                dispositivo2.asignarOperario(operario2);

                // ---- Seleccion de estado para cada dispositivo ----
                String[] estados = { "DISENO", "ENSAMBLAJE", "PRUEBA_CALIDAD", "EMBALAJE" };

                String estadoSeleccionado1 = (String) JOptionPane.showInputDialog(null,
                                "Nuevo estado para el Dispositivo 1:",
                                "Actualizar Estado", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);
                dispositivo1.actualizarEstado(EstadoDispositivo.valueOf(estadoSeleccionado1));

                String estadoSeleccionado2 = (String) JOptionPane.showInputDialog(null,
                                "Nuevo estado para el Dispositivo 2:",
                                "Actualizar Estado", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);
                dispositivo2.actualizarEstado(EstadoDispositivo.valueOf(estadoSeleccionado2));

                // ---- Ejecucion de tareas ----
                String tarea1 = JOptionPane.showInputDialog(null, "Tarea que ejecutara " + operario1.getNombre() + ":",
                                "Ejecutar Tarea", JOptionPane.QUESTION_MESSAGE);
                operario1.ejecutarTarea(tarea1);

                String tarea2 = JOptionPane.showInputDialog(null,
                                "Tarea que supervisara " + operario2.getNombre() + ":", "Supervisar Tarea",
                                JOptionPane.QUESTION_MESSAGE);
                operario2.supervisarTarea(tarea2);

                // ---- Resumen final ----
                dispositivo1.mostrarInformacion();
                dispositivo2.mostrarInformacion();

                JOptionPane.showMessageDialog(null,
                                "Dispositivo 1 -> " + serieD1 + " | " + modeloD1 + " | Lote: " + loteD1
                                                + " | Estado: " + dispositivo1.getEstado() + " | Operario: "
                                                + operario1.getNombre() + "\n"
                                                + "Dispositivo 2 -> " + serieD2 + " | " + modeloD2 + " | Lote: "
                                                + loteD2
                                                + " | Estado: " + dispositivo2.getEstado() + " | Operario: "
                                                + operario2.getNombre(),
                                "Resumen de Registro", JOptionPane.INFORMATION_MESSAGE);
        }
}