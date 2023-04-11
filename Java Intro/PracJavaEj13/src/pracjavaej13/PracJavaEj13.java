/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej13;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamano del cuadrado que desea realizar ");  
        int c = leer.nextInt();
        
        for(int i = 0; i < c; i++){
            for(int j = 0; j < c; j++){
            
            if(i == 0){
            System.out.print("*");
            
            }else if( i == (c-1)){
            System.out.print("*");
            
            }else if(j == 0){
            System.out.print("*");        
                    
            }else if(j == c-1){        
            System.out.print("*"); 
            
            }else{
            System.out.print(" ");  
                
            }
                
        }
            System.out.println(" ");
    }

        
 }
    
}
