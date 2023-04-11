/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Peliculas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import peliculaapp.Utilidades.Comparadores;

/**
 *
 * @author Equipo
 */
public class servicioPelicula {
    private ArrayList<Peliculas>lista;
    private Scanner reader;
    Peliculas peli = new Peliculas();

    public servicioPelicula() {
        this.lista = new ArrayList();
        this.reader = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void cargarPeliculas(){
        System.out.println("Ingrese el titulo de la pelicula: ");
        String titulo = reader.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = reader.next();
        System.out.println("Ingrese la duracion de la pelicula(En hs):");
        double duracion = reader.nextDouble();
        
        
        lista.add(new Peliculas(titulo, director, duracion));
        
    }
    
    
    public void mostrarPeliculas(){
        System.out.println("Las peliculas Ingresadas son:");
        
        for (Peliculas aux : lista) {
            System.out.print("Titulo: " + aux.getTitulo() +", Director: " + aux.getDirector() + ", Duracion: " +  aux.getDuracion()  + " // ");

        }

    
        System.out.println("  ");
    }
    
    
    
    
    
    
    public void mostrarPeliculasMayorA1(){
        System.out.println("Se mostraran las peliculas con duracion mayor a 1 hora: ");
        for (Peliculas peliculas : lista) {
            if(peliculas.getDuracion() > 1){
                System.out.print(peliculas+"//");
            
            }
            
        }
        System.out.println(" ");
   
    
    }
   
    
    public void ordenarMayor(){
  
        Collections.sort(lista, Comparadores.ordenarMay);
        System.out.println("Se mostraran las peliculas ordenadas de mayor a menor de acuerdo a su duracion");
        for (Peliculas peliculas : lista) {
            System.out.print(peliculas+"//");
        }
        
        System.out.println(" ");
    }
    
    
    public void ordenarMenor(){
        System.out.println("Se mostraran las peliculas ordenas de menor a mayor de acuerdo a su duracion");
       Collections.sort(lista, Comparadores.ordenarMen);
       for (Peliculas peliculas : lista) {
            System.out.print(peliculas+"//");
        }
        System.out.println(" ");
    }
    
    public void ordenarTitulo(){
        System.out.println("Se mostratan las peliculas ordenadas de acuerdo a su titulo de manera alfabetica");
    Collections.sort(lista, Comparadores.ordenarTitulo);
    for (Peliculas peliculas : lista) {
            System.out.print(peliculas+"//");
        }
        System.out.println(" ");
    }
    
    
    public void ordenarDirector(){
    Collections.sort(lista, Comparadores.ordenarDirector);
        System.out.println("Se mostraran las peliculas ordenadas alfabeticammente de acuerdo a su director");
    for (Peliculas peliculas : lista) {
            System.out.print(peliculas+"//");
        }
        System.out.println(" ");
    }
 
    
  
    
}
