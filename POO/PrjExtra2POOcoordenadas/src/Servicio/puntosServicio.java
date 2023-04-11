/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class puntosServicio {
    Scanner reader = new Scanner(System.in);
    Puntos coordenadas = new Puntos();
    public Puntos crearPuntos(){
        
        System.out.println("Ingrese la ubicacion del primer punto en X ");
        coordenadas.setX1(reader.nextInt());
        System.out.println("Ingrese la ubicacion del primer punto en Y ");
         coordenadas.setY1(reader.nextInt());
        System.out.println("Ingrese la ubicacion del segundo punto en X ");
         coordenadas.setX2(reader.nextInt());
        System.out.println("Ingrese la ubicacion del segundo punto en Y ");
        coordenadas.setY2(reader.nextInt());
    
        return coordenadas;
        
    }
    
    
    public void calcularDistancia(){
    double restaDeX = coordenadas.getX2()-(coordenadas.getX1());
    double restaDeY = coordenadas.getY2()-(coordenadas.getY1()); 
    double R = (Math.pow(restaDeX, 2) + Math.pow(restaDeY, 2));
    double  H = Math.sqrt(R);
    System.out.println("La distancia que hay entre esos dos puntos es: " + H);

        System.out.println("Si el resultado de la raiz no es un numero real. ");
        System.out.println("El resultado es raiz cuadrada de: " + R);
    }
    
    
}
