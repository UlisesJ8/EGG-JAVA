/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej16;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamano del vector");
        int tamano = leer.nextInt();
        int[] vector = new int[tamano];
        rellenarVector(vector, tamano);
        
        System.out.println("Ingrese el numero que desea buscar en el vector del 1 al 20");
        int buscar = leer.nextInt();
        buscarVector(vector, tamano, buscar);
        
    }
    
   
    public static void rellenarVector(int[]vector, int tamano){
    int aleatorio = 0;
    //bucle for para crear un vector con numeros aleatorios del 0 al 20
    for(int i = 0; i < tamano; i++){
            
        vector[i] = (int)(Math.random()*20);
        
        }
    }
    
     public static void buscarVector(int[]vector, int tamano, int buscar){
     int contador = 0; 
     
     
     for(int i = 0; i < tamano; i++){
            //Condicional para el primer numero del array si es que se encuentra
        if(vector[i] == buscar && contador == 0){    
         System.out.println("El numero que busca se encuentra en el lugar "+ i +" del vector");
         contador = contador + 1;
         continue;
        }
        //Condicional para ver si el numero esta repetido en el array
        if(vector[i] == buscar && contador == 1){
        System.out.println("El numero que busca ademas se encuentra repetido en el lugar "+ i +" del vector");
        }
        
     }
     //condicional si el numero no se encuentra en el array
        if( contador == 0){
         System.out.println("El numero ingresado no se encuentra en el vector");
        }
     }
    
}
     
