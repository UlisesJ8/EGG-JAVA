/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesprj03y04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExcepcionesPrj03y04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try{
        System.out.println("Ingrese un numero");
        String num = reader.next() ;
        System.out.println("Ingrese otro numero");
        String num2 = reader.next();
        
        int n1 = Integer.parseInt(num);
        int n2 = Integer.parseInt(num2);
        double div = n1/n2;
        System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
            System.out.println(e.getLocalizedMessage());
        
        
        }catch(InputMismatchException e){
            System.out.println("Error: "+ e.getMessage());
            System.out.println(e.getLocalizedMessage());
            
        }catch(NumberFormatException e){
            System.out.println("Error: "+ e.getMessage());
            System.out.println(e.getLocalizedMessage());
            
            
            
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
            System.out.println(e.getLocalizedMessage());
        
        }
    }
    
}
