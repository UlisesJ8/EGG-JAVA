/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el tamano del array");
        int tamano = leer.nextInt();
        int[] array = new int[tamano];
        crearVector(array, tamano);
        contabilizarVector(array, tamano);
    }

    public static void crearVector(int[] array, int tamano){
    
    for(int i = 0; i < tamano; i++){
    Random aleatorio = new Random();
    array[i] = aleatorio.nextInt(100000);
    
    
    }
    
    
    
    }
    
    public static void contabilizarVector(int[]array,int tamano){
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        for(int i = 0; i < tamano; i++){
            if (array[i] < 10) {
            contador1 = contador1 + 1;
            }else if(array[i] >= 10 && array[i]< 100){
            contador2 = contador2 + 1;
            }else if(array[i] >= 100 && array[i] < 1000){
            contador3 = contador3 + 1;
            }else if(array[i] >= 1000 && array[i]< 10000){
            contador4 = contador4 + 1;
            }else {
            contador5 = contador5 + 1;
            }
        
        
      }
        
        System.out.println("Hay "+ contador1+ " numeros de un digito");
        System.out.println("Hay "+ contador2+ " numeros de dos digito");
        System.out.println("Hay "+ contador3+ " numeros de tres digito");
        System.out.println("Hay "+ contador4+ " numeros de cuatro digito");
        System.out.println("Hay "+ contador5+ " numeros de cinco digito");
        
    }

    private static int aleatorio(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
