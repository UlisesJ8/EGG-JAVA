/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perros;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perros = perros;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerros() {
        return perros;
    }

    public void setPerros(Perro perros) {
        this.perros = perros;
    }

    
    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
    public String toString2(){
        return "Nombre=" + nombre + "Perro= " + perros.getNombre();
    }
    
    
}
