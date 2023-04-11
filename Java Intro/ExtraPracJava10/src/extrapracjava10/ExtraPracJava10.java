/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava10;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = (int) Math.floor(Math.random()*10);
        int num2 = (int) Math.floor(Math.random()*10);
        int mul = num * num2;
        int adv;
        int cont = 0;
        do{
            System.out.println("Adivine el numero de la multiplicacion(tiene 3 intentos) ");
            adv = reader.nextInt();
            if(adv == mul){
                System.out.println("Adivinaste!!!!!!!");
            }
            cont += 1;
        }while(mul != adv && cont < 3);
        
        System.out.println("El primer numero es: "+num);
        System.out.println("El segundo numero es: "+num2);
        System.out.println("La multiplicacion es: "+ mul);
    }
    
}
