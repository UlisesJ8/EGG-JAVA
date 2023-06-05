/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava2;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d, aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
        a = leer.nextInt();
         
        do{
        System.out.println("Ingrese un valor distinto al primer valor:");
        b = leer.nextInt();
        }while(a == b);
        
        do{
         System.out.println("Ingrese un valor distinto al primer y al segundo valor:");
         c = leer.nextInt();
        
        }while(a == b || a == c || b == c);
        
        do{
        System.out.println("Ingrese un valor distinto al resto de los valores:");
         d = leer.nextInt();
        
        }while(a == b || a == c || b == c || a == d || b == d || c == d);
        System.out.println("el nuevo orden de los valores es:");
        aux = a;
        a = d; // A vale D
        System.out.println("a =  "+ a);
        a = b; // A vale B para despues pasarle a D
        b = c;  // B vale C
        c = aux; // C vale A
        System.out.println("b =  "+ b);
        System.out.println("c =  "+ c);
        d = a; // D vale B por el valor asignado anteriormente a A
        System.out.println("d =  "+d);
           
        
    } 
    
}
