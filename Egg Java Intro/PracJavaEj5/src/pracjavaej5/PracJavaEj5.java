/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej5;
import java.util.Scanner;
/**
 *
 * @author Equipo
 */
public class PracJavaEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir un numero");
        int num = leer.nextInt();
        
        System.out.println("El doble del numero es: "+num*2+", el triple es: "+num*3+", y la raiz cuadrada es: "+ Math.sqrt(num));
        
        
    }
    
}
