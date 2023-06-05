/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava15;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = reader.nextDouble();
        System.out.println("Ingrese otro numero");
        double num2 = reader.nextDouble();
        int op;
       do{
           System.out.println("Que operacion desea realizar?");
           System.out.println("1. SUMAR");
           System.out.println("2. RESTAR");
           System.out.println("3. DIVIDIR");
           System.out.println("4. MULTIPLICAR");
           System.out.println("5. SALIR");
           op = reader.nextInt();
           
           switch (op) {
               case 1:
                   double resultado = Sumar( num, num2);
                   System.out.println("El resultado es: " + resultado);
                   break;
               case 2:
                   resultado = Restar(num, num2);
                   System.out.println("El resultado es: "+ resultado);
                   break;
               case 3:
                   resultado = Dividir( num, num2);
                   System.out.println("El resultado es: "+ resultado);
                   break;
               case 4:
                   resultado = Multiplicar(num, num2);
                   System.out.println("El resultado es: "+ resultado );
                   break;
               case 5:
                   System.out.println("Usted salio del programa");
                   break;
               default:
                   System.out.println("Usted ingreso una opcion incorrecta.Reintente nuevamente");
                   break;
           }
                
                   
       
       }while(op != 5);
        
    }
    
    public static double Sumar(double num, double num2){
        double suma;
        suma = num + num2;
        return suma;
        
    }
    
    public static double Restar(double num, double num2){
        double resta;
        resta = num - num2;
        return resta;
    }
    
    public static double Dividir(double num, double num2){
        double division;
        division = num / num2;
        return division;
        
    }
    
    public static double Multiplicar(double num, double num2){
        double multiplicacion;
        multiplicacion = num * num2;
        return multiplicacion;
    }
    
    
}
