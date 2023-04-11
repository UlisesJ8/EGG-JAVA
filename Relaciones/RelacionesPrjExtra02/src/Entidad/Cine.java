/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class Cine {
    private Asiento [][] matriz;
    private Pelicula pelicula;
    private double precioEntrada;
    private ArrayList<Espectador> espectador; 

    public Cine() {
    }

    public Cine(Asiento[][] matriz, Pelicula pelicula, double precioEntrada, ArrayList<Espectador> espectador) {
        this.matriz = matriz;
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.espectador = espectador;
    }

    public Asiento[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Asiento[][] matriz) {
        this.matriz = matriz;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(ArrayList<Espectador> espectador) {
        this.espectador = espectador;
    }
    
    
}
