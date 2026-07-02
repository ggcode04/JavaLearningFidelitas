/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class Vuelo {

    private String numero;
    private String aerolinea;
    private String destino;
    private String horaSalida;
    private EstadoVuelo estado;
    private Aeronave aeronave;

    public Vuelo(String numero, String aerolinea, String destino, String horaSalida, Aeronave aeronave) {
        this.numero = numero;
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.aeronave = aeronave;
        this.estado = EstadoVuelo.PROGRAMADO;
    }

    public String getNumero() {
        return numero;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getDestino() {
        return destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public EstadoVuelo getEstado() {
        return estado;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void actualizarEstado(EstadoVuelo nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El vuelo " + numero + " cambio de estado a: " + nuevoEstado);
    }

    public void mostrarInformacion() {
        System.out.println("Vuelo{numero=" + numero + ", aerolinea=" + aerolinea + ", destino=" + destino
                + ", horaSalida=" + horaSalida + ", estado=" + estado
                + ", aeronave=" + aeronave.getIdentificador() + "}");
    }
}