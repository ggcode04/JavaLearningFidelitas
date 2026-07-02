/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class Mecanico {

    private String codigo;
    private String nombre;
    private String especialidad;

    public Mecanico(String codigo, String nombre, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void revisarVehiculo(Vehiculo vehiculo) {
        System.out.println(nombre + " esta revisando el vehiculo con placa " + vehiculo.getPlaca());
    }

    public void registrarAvance(String avance) {
        System.out.println(nombre + " registro el avance: " + avance);
    }

    @Override
    public String toString() {
        return "Mecanico{codigo=" + codigo + ", nombre=" + nombre + ", especialidad=" + especialidad + "}";
    }
}