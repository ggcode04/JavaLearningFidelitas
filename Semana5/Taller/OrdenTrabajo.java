/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class OrdenTrabajo {

    private String numeroOrden;
    private String tipoServicio;
    private EstadoOrden estado;
    private Vehiculo vehiculo;
    private Mecanico mecanico;

    public OrdenTrabajo(String numeroOrden, String tipoServicio, Vehiculo vehiculo) {
        this.numeroOrden = numeroOrden;
        this.tipoServicio = tipoServicio;
        this.vehiculo = vehiculo;
        this.estado = EstadoOrden.PENDIENTE;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void asignarMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
        this.estado = EstadoOrden.EN_PROCESO;
        System.out.println("Se asigno el mecanico " + mecanico.getNombre() + " a la orden " + numeroOrden);
    }

    public void cambiarEstado(EstadoOrden nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("La orden " + numeroOrden + " cambio de estado a: " + nuevoEstado);
    }

    public void mostrarInformacion() {
        System.out.println("OrdenTrabajo{numeroOrden=" + numeroOrden + ", tipoServicio=" + tipoServicio
                + ", estado=" + estado + ", vehiculo=" + vehiculo.getPlaca()
                + ", mecanico=" + (mecanico != null ? mecanico.getNombre() : "sin asignar") + "}");
    }
}