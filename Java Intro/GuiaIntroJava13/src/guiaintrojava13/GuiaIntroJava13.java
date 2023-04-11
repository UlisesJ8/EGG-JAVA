/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaintrojava13;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class GuiaIntroJava13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] vector = new String[6];
        
        for(int i = 0; i < 6; i++){
            System.out.println("Escribir el nombre del companero: ");
            vector[i] = leer.nextLine();
        }
        
        for(int i = 0; i < 6; i++){
            System.out.println("Nombre del companero "+ (i) +": "+ vector[i]);
        }
    }
    
}
