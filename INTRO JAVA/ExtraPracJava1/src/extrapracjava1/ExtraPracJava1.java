/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava1;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos para determinar su equivalencia en dias y hs");
        double min = leer.nextInt();
        double hs = min/60;
        double dia = 0;
        if(hs > 23.59){
        dia = Math.floor(hs/24);
        hs = Math.floor(hs-(dia*24)) ;
        
        }
        
        System.out.println("La cantidad de dia/s es: "+ dia +" y "+ hs+" horas");
        
        
    }
    
}
