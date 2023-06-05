/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej11;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num2, op;
        double num3;
        do{
        System.out.println("Ingrese el primer valor entero positivo");
        num = leer.nextInt();
        }while(num <= 0);
        
        do{
        System.out.println("Ingrese el segundo valor entero positivo");
        num2 = leer.nextInt();
        }while(num2 <= 0);
        boolean compara = false;
        
        
        do {
        num3 = 0;
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4 Divir");
        System.out.println("5. Salir");
        op = leer.nextInt();
        
        switch(op){
            case 1:
                num3 = num+num2;
                System.out.println("La suma es: " + num3);
                break;
            case 2:
                num3 = num-num2;
                System.out.println("La resta es: " + num3);
                break;
            case 3:
                num3 = num*num2;
                System.out.println("La multiplicacion es: " + num3);
                break;
            case 4:
                num3 = num/num2;
                System.out.println("La division es: " + num3);
                break;
            case 5:
                Scanner leer2 = new Scanner(System.in);
                System.out.println("Esta seguro que desea salir del programa(S/N)?");
                String op2;
                op2 = leer2.nextLine();
                op2 = op2.substring(0, 1);
                compara = op2.equalsIgnoreCase("s");
                break;
            default:
                System.out.println("Opcion incorrecta"); 
                break;
            }
        
        }while(compara == false || op != 5);
        
        
        System.out.println("Usted salio del programa.");
        
    }
    
}
