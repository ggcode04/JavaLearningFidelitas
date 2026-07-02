/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class Operario {

    private String codigo;
    private String nombre;
    private String areaEspecializacion;

    public Operario(String codigo, String nombre, String areaEspecializacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaEspecializacion = areaEspecializacion;
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

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public void supervisarTarea(String tarea) {
        System.out.println(nombre + " esta supervisando la tarea: " + tarea);
    }

    public void ejecutarTarea(String tarea) {
        System.out.println(nombre + " (" + areaEspecializacion + ") esta ejecutando: " + tarea);
    }

    @Override
    public String toString() {
        return "Operario{codigo=" + codigo + ", nombre=" + nombre
                + ", areaEspecializacion=" + areaEspecializacion + "}";
    }
}