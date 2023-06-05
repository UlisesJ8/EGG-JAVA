/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej10;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limP;
        int num;
        do{
        System.out.println("Ingrese un valor limite positivo");
        limP = leer.nextInt();
        }while(limP <= 0);
        
        do{
        System.out.println("Ingrese valores hasta superar el limite");
        num = leer.nextInt();
        num += num;
        }while(num <= limP);
        
        System.out.println("Usted supero el valor limite inicial con una suma total de "+num);
        
        
        
    }
    
}
