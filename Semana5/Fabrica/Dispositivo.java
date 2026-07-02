/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class Dispositivo {

    private String numeroSerie;
    private String modelo;
    private int loteProduccion;
    private EstadoDispositivo estado;
    private Operario operarioResponsable;

    public Dispositivo(String numeroSerie, String modelo, int loteProduccion) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.loteProduccion = loteProduccion;
        this.estado = EstadoDispositivo.DISENO;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getLoteProduccion() {
        return loteProduccion;
    }

    public void setLoteProduccion(int loteProduccion) {
        this.loteProduccion = loteProduccion;
    }

    public EstadoDispositivo getEstado() {
        return estado;
    }

    public Operario getOperarioResponsable() {
        return operarioResponsable;
    }

    public void asignarOperario(Operario operario) {
        this.operarioResponsable = operario;
        System.out.println("Se asigno el operario " + operario.getNombre() + " al dispositivo " + numeroSerie);
    }

    public void actualizarEstado(EstadoDispositivo nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El dispositivo " + numeroSerie + " cambio de estado a: " + nuevoEstado);
    }

    public void mostrarInformacion() {
        System.out.println("Dispositivo{numeroSerie=" + numeroSerie + ", modelo=" + modelo
                + ", loteProduccion=" + loteProduccion + ", estado=" + estado
                + ", operarioResponsable="
                + (operarioResponsable != null ? operarioResponsable.getNombre() : "sin asignar") + "}");
    }
}