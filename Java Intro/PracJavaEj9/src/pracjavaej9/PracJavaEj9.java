/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej9;
import java.util.Scanner;
/**dsf
 *
 * @author Equipo
 */
public class PracJavaEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir una palabra o frase que comience con la letra a:");
        String palabra = leer.nextLine();
        
        String letra = palabra.substring(0, 1);
        letra = letra.toUpperCase();
        boolean comparacion;
        comparacion = letra.equals("A");
        
        
        if(comparacion == true) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
