/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava7;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Escriba la cantidad de numeros que desee ingresar(debe ser mayor a 0):");
        int N = reader.nextInt();
        while (N <= 0){
            System.out.println("Debe ingresar un numero mayor a 0");
            N = reader.nextInt();
        }
        
        double[] vector = new double[N];
        int cont = 0;
        double max = 0;
        double min = 0;
        double prom = 0;
        
        while(cont < N ){
            System.out.println("Ingrese un numero");
            vector[cont] = reader.nextInt();
           
            if(vector[cont] > max){
            max = vector[cont];
            }
            
            if(cont == 0){
            min = vector[cont];
            }
            if(vector[cont] < min && cont > 0){
            min = vector[cont];
            }
            
            prom += vector[cont];
            
             cont+=1;
        }
        
        
        
        System.out.println("El valor maximo es " + max);
        System.out.println("El valor minimo es " + min);
        System.out.println("El promedio de los numeros es:" + (prom/N));
        
    }
    
}
