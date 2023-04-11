/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Cafetera {
    private double capacidadMaxima;
    private double capacidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = 1000;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        
        return capacidadMaxima = 1000;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
}
