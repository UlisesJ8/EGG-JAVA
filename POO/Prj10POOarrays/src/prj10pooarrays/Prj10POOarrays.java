/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj10pooarrays;

import java.util.Arrays;

/**
 *
 * @author Equipo
 */
public class Prj10POOarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random()*10;
            System.out.println(arregloA[i]);
        }
        System.out.println("Nuevo arreglo");
        for (int i = 0; i < 50; i++) {
            Arrays.sort(arregloA);
            System.out.println(arregloA[i]);
        }
        System.out.println("Arreglo B");
        for (int i = 0; i < 20; i++) {
            
           if(i < 10){
            arregloB[i] = arregloA[i];
           }else{
           arregloB[i] = 0.5;
           } 
            System.out.println(arregloB[i]);
        }
    
        
    
    
    
    
    }
    
}
