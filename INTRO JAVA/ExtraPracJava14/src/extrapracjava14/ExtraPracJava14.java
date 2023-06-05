/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava14;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int N = reader.nextInt();
        double contH = 0;
        double sumaH = 0;
        for(int i = 1; i < N+1; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia "+i+":");
            int M = reader.nextInt();
            contH += M;
            
            for(int j = 1; j < M+1; j++){
            System.out.println("Ingrese la edad del hijo n° "+ j);
            int hijos = reader.nextInt();
            sumaH += hijos;    
            }
        }
     double prom = sumaH / contH; 
     System.out.println("Son "+ N+" Familias, el total de hijos son: "+ contH+" y el promedio de edad es: "+ prom);
  }
}
