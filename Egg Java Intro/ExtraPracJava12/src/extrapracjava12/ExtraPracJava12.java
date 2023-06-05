/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava12;

import com.sun.scenario.effect.impl.prism.PrImage;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String letra = String.valueOf(i);
                    String letra2 =String.valueOf(j);
                    String letra3 = String.valueOf(k);
                    
                    if(letra.equalsIgnoreCase("3") ){
                     letra = "E";
                    }
                    if(letra2.equalsIgnoreCase("3")){
                     letra2 = "E";
                     }
                    if(letra3.equalsIgnoreCase("3")){
                     letra3 = "E";
                    }
                    
                    System.out.println(letra+"-"+letra2+"-"+letra3);
                }

            }

        }
    }
    
}
