/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej4;
import java.util.Scanner;
/**
 *
 * @author Equipo
 */
public class PracJavaEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Escribe una temperatura en grados celsius:");
    float temperatura = leer.nextInt();
    
    float temperatura2 = 32 + (9 * temperatura/5);
    
        System.out.println("La temperatura en Fahrenheit es:"+temperatura2);
    }
    
}
