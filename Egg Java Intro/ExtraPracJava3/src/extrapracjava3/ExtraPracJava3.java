/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava3;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String letra = "";
       int l = 0;
       do{
       System.out.println("Ingrese una letra");
       letra = leer.nextLine();
       l = letra.length();
       } while (l > 1 || l < 1);
         
     if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
        System.out.println("Es una vocal: "+letra); 
     }else{
          System.out.println("Es una consonante: "+letra);   
     }
        
    }
    
}
