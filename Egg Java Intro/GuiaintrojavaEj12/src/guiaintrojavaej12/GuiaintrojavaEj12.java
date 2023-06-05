/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaintrojavaej12;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class GuiaintrojavaEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un numero que sea multiplo del anterior:");
        int num2 = leer.nextInt();
        calcularMultiplo(num1,num2);
    }
     public static void calcularMultiplo(int num1, int num2) {
       
        if(num1 % num2 == 0){
            System.out.println("El primer numero es multiplo del segundo");
        }else{
            System.out.println("Ambos numeros no son multiplos");
        }
    }
}

