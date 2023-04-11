/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaintrojavaej9;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class GuiaIntroJavaEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int cont = 1;
        int num;
        do{
        System.out.println("Ingrese 20 numeros o termine el ingreso de numeros con el (0)");
        num = leer.nextInt();
        cont++;
    }while(num != 0 && cont <= 20);
    }
    
}
