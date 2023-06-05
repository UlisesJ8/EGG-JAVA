/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava13;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el tamano de la escalera que desee armar:");
        int N = reader.nextInt();
        int cont = 0;
        for(int i = 1; i < N+1; i++){
            
            
            if(i == 1){
            System.out.println(i+"");
            }else {
                for(int j = 1; j < i+1; j++){
                System.out.print(j+"");  
            }     
                System.out.println("");
     
            
            
        }
    }
    
}
}
