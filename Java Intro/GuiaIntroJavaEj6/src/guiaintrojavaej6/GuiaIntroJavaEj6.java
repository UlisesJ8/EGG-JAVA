/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaintrojavaej6;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class GuiaIntroJavaEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        if(num1 > 25 && num2 > 25){
        System.out.println("Ambos numeros son mayores a 25");
        }else if(num1 > 25 && num2 <= 25){
            System.out.println("El numero 1 es mayor a 25");
        }else if(num1 <= 25 && num2 > 25){
        System.out.println("El numero 2 es mayor a 25");
        }else{
        System.out.println("Ningun numero es mayor a 25");
        }
    }
    
}
