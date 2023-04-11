/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava5;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String socio = "";
        boolean comprobar = true;
        do{
            System.out.println("Ingrese a la clase de socio que pertenece: ");
            System.out.println("A . Socio A ");
            System.out.println("B . Socio B ");
            System.out.println("C . Socio C ");
            socio = reader.nextLine();
            socio = socio.toUpperCase();
            comprobar = !(socio.equalsIgnoreCase("A") || socio.equalsIgnoreCase("B") || socio.equalsIgnoreCase("C")); 
        }while(comprobar == true );
        
        System.out.println("Ingrese el costo del tratamiento");
        double costo = reader.nextInt();
        
        switch(socio){
            case "A":
                costo = costo - (costo * 0.50);
                System.out.println("Usted es socio de tipo A y el costo del tratamiento es "+costo+"$");
                break;
            case "B":
                costo = costo - (costo * 0.35);
                System.out.println("Usted es socio de tipo B y el costo del tratamiento es "+costo+"$");
                break;
            case "C":
                System.out.println("Usted es socio de tipo C y el costo del tratamiento es "+costo+"$");
                break;
            default:
                System.out.println("No pertenece a una clase de socio");
        
        
        
        
        }
        
        
        
        
    }
    
}
