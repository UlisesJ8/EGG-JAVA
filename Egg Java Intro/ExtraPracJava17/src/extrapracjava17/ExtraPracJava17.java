/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava17;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para determinar si es primo:");
        
        int num = reader.nextInt();
        
        boolean comprobar = primo(num);
        System.out.println(comprobar);
    }
    
    public static boolean primo(int num){
    
    boolean ver = true;
    
    if(num == 1 || num == 0 || num == 4){    
    ver = false;
    }
    
    for(int i = 2; i < num / 2 ;i++){
        
        
        if(num % i == 0){
            ver = false;
        }
        
    }

    return ver;
    
    }
    
    
    
}
