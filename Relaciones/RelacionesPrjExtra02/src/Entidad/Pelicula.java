/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalTime;

/**
 *
 * @author Equipo
 */
public class Pelicula {
    private String nombrePelicula;
    private String director;
    private int edad;
    private LocalTime duracion;

    public Pelicula() {
    }

    public Pelicula(String nombrePelicula, String director, int edad, LocalTime duracion) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.edad = edad;
        this.duracion = duracion;
    }

 

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombrePelicula=" + nombrePelicula + ", director=" + director + ", edad=" + edad + ", duracion=" + duracion + '}';
    }
    
    
    
}
