/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracJavaEj1;
import java.util.Scanner;
/**
 *
 * @author Equipo
 */
public class PracJavaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        int nro = leer.nextInt();
        
        System.out.println("Ingrese el primer numero:");
        int nro2 = leer.nextInt();
        
        int nro3 = nro + nro2;
        System.out.println("La suma de ambos numeros es: "+nro3);
    }
    
}
