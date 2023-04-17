/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class EdificioDeOficinas extends Edificio{
   private int numerosOficinas;
   private int cantidadDePersonas;
   private int numerosPisos;

    public EdificioDeOficinas(int numerosOficinas, int cantidadDePersonas, int numerosPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numerosOficinas = numerosOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
        this.numerosPisos = numerosPisos;
    }

    public int getNumerosOficinas() {
        return numerosOficinas;
    }

    public void setNumerosOficinas(int numerosOficinas) {
        this.numerosOficinas = numerosOficinas;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public int getNumerosPisos() {
        return numerosPisos;
    }

    public void setNumerosPisos(int numerosPisos) {
        this.numerosPisos = numerosPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numerosOficinas=" + numerosOficinas + ", cantidadDePersonas=" + cantidadDePersonas + ", numerosPisos=" + numerosPisos + '}';
    }
    
    public void cantPersonas(){
        int personasPisos = numerosOficinas*cantidadDePersonas;
        int personasEdificio = numerosOficinas*cantidadDePersonas*numerosPisos;
        System.out.println("Cantidad de personas que entran por un piso: " +  personasPisos);
        System.out.println("Cantidad de personas que entran en el edificio: " + personasEdificio);
    }
    
    
    
    @Override
    public void calcularSuperficie(double ancho, double alto, double largo) {
        double superficie = (largo*ancho)* numerosPisos;
        System.out.println("La superficie del edificio es: "+ superficie);
    }

    @Override
    public void calcularVolumen(double ancho, double alto, double largo) {
        double volumen = ancho*alto*largo;
        System.out.println("El volumen del edificio es: "+ volumen);
    }
    
}
