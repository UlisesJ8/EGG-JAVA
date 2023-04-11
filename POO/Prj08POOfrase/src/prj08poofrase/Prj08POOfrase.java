/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj08poofrase;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prj08POOfrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        CadenaServicio phrase = new CadenaServicio();
        Cadena fra = phrase.ingresarCadena();
        int op = 0;

       do{
        System.out.println("---Menu---");
        System.out.println("1. Motrar la cantidad de vocales");
        System.out.println("2. Invertir la frase");
        System.out.println("3. Cuantas veces se repite el caracter ingresado");
        System.out.println("4. Comparar la longitud de las frases");
        System.out.println("5. Unir las frases");
        System.out.println("6. Reemplzar las A por el caracter ingresado");
        System.out.println("7. Comprobar si la frase contiene el caracter ingresado");
        System.out.println("8. Salir");
        op = reader.nextInt();
           switch (op) {
               case 1:
                   phrase.mostrarVocales(fra);
                   break;
               case 2:
                   phrase.invertiFrase(fra);
                   break;
               case 3:
                   phrase.vecesRepetido(fra);
                   break;
               case 4:
                   phrase.compararLongitud(fra);
                   break;
               case 5:
                   phrase.unirFrases(fra);
                   break;
               case 6:
                   phrase.reemplazar(fra);
                   break;
               case 7:
                   phrase.contiene(fra);
                   break;
               case 8:
                   System.out.println("Usted salio del programa. Hasta Luego");
                   break;
               default:
                   System.out.println("Usted ingreso la opcion incorrecta");
                   break;
           }
       
       
       }while(op != 8);
       
   
        
        
        
        
        
    }
    
}
