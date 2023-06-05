/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej6;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero para determinar si es par o impar:");
        int nro = leer.nextInt();
        
        if(nro%2 == 0){
            System.out.println("El numero ingresado es par("+nro+")");
        }else{
            System.out.println("El numero ingresado es impar("+nro+")");
        }
    }
    
}
