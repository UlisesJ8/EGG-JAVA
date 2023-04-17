/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }
    
    
    @Override
    public void calcularSuperficie(double ancho, double alto, double largo) {
        double superficie = largo*ancho ;
       System.out.println("La superficie del edificio es: "+ superficie );
    }

    @Override
    public void calcularVolumen(double ancho, double alto, double largo) {
        double volumen = ancho*alto*largo;
        System.out.println("El volumen del edificio es: "+ volumen);
    }
    
    
    
}
