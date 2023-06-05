/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovideoerrores;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class EjemploVideoErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int resultado = suma(10,10);
        System.out.println(resultado);
        SaludoPersonalizado("Chiquito");
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        SaludoPersonalizado(nombre);
        SaludoPersonalizado(leer.next());
    }
    
    public static int suma(int a, int b){
    int resultado = a + b;
    
    return resultado;
    }
    public static void SaludoPersonalizado(String nombre){
    System.out.println("hola "+ nombre+", Como estas?");
    }
}
