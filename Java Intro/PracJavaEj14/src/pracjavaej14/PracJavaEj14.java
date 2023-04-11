/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej14;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que desea convertir:");
        int euro = leer.nextInt();
        System.out.println("A que tipo de moneda lo desea convertir");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        int op = leer.nextInt();
        double divisa = 0;  
        
        funcion(euro, op, divisa);

    }
    
    public static void funcion(int euro, int op, double divisa){

           switch(op){
            case 1: 
                divisa = euro * 0.86; 
                 System.out.println("Convirtio "+euro+" Euros en "+divisa+ " Libras");
                 break;
            case 2:
                divisa = euro * 1.28611;
                System.out.println("Convirtio "+euro+" Euros en "+divisa+ " Dolares");
                break;
            case 3:
                divisa = euro * 129.852;
                System.out.println("Convirtio "+euro+" Euros en "+divisa+ " Yenes");
                break;
            default:
                System.out.println("Opcion ingresada es incorrecta");
                break;
           }
       
  
}
}


