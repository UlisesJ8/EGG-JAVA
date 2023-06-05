/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesprj05;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExcepcionesPrj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int contador = 0, num = 0;
    int aleatorio = (int) (Math.random() * 500 + 1);
    
   
    
    try{
        do{
        System.out.println("Ingrese el numero que cree que se genero: ");
        num = reader.nextInt();
        
        if (aleatorio > num) {
            System.out.println("El numero que desea adivinar es mayor al numero ingresado");
        }
        if (aleatorio < num) {
            System.out.println("El numero que desea adivinar es menor al numero ingresado");
        }
    
        
            contador += 1;
    }while(num != aleatorio);
        System.out.println("Usted realizo " + contador + " intentos. Hasta adivinar el numero aleatorio");
        System.out.println("El numero secreto era " + aleatorio +"!! Termino el juego. Hasta luego!");
    
        
        
        
    }catch(Exception e){
        System.out.println("ERROR : " + e.getMessage());
        contador += 1;
        System.out.println("Usted no ingreso un numero.");
        System.out.println("Usted realizo " + contador + " intentos.");
        System.out.println("El numero que tenia que adivinar era: "+ aleatorio);
    
    }
    
    
       
    
    }
    
}
