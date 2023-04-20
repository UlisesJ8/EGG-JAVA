/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Empleados extends Persona {
    protected int anioIncorporacion;
    protected int numeroDespachoAsignado;

    public Empleados(int anioIncorporacion, int numeroDespachoAsignado, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespachoAsignado = numeroDespachoAsignado;
    }

    public Empleados() {
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumeroDespachoAsignado() {
        return numeroDespachoAsignado;
    }

    public void setNumeroDespachoAsignado(int numeroDespachoAsignado) {
        this.numeroDespachoAsignado = numeroDespachoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Empleados{" + "anioIncorporacion=" + anioIncorporacion + ", numeroDespachoAsignado=" + numeroDespachoAsignado + '}';
    }
    
    
    
    
    
    
    
}
