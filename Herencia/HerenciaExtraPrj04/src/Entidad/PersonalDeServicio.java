/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class PersonalDeServicio extends Empleados{
    private String seccionAsignado;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccionAsignado, int anioIncorporacion, int numeroDespachoAsignado, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, numeroDespachoAsignado, nombre, apellido, dni, estadoCivil);
        this.seccionAsignado = seccionAsignado;
    }

    public String getSeccionAsignado() {
        return seccionAsignado;
    }

    public void setSeccionAsignado(String seccionAsignado) {
        this.seccionAsignado = seccionAsignado;
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
        return "PersonalDeServicio: " + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estadoCivil=" + estadoCivil +", anioIncorporacion=" + anioIncorporacion + ", numeroDespachoAsignado=" + numeroDespachoAsignado + ", seccionAsignado=" + seccionAsignado;
    }
    
    
    
    
    
}
