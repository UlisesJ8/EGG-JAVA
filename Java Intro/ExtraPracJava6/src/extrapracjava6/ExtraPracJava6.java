/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava6;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de persona de las cuales va a ingresar su altura");
        int N = reader.nextInt();
        float [] vector = new float[N];
        for(int i = 0; i < N; i++){
            System.out.println("Ingrese la altura de la persona. "+i);
            vector[i] = reader.nextFloat();
        }
        
        double menor = 0;
        double mayor = 0;
        
        for(int j = 0; j < N; j++){
            
            if(vector[j] < 1.60){
                menor += 1;   

            }else{
                 mayor += 1;

            }
   
    }
        mayor = (mayor * 100) / N;
        menor = (menor * 100) / N;
        System.out.println("El porcentaje de personas menores a un 1.60 es: "+ menor+"% y el porcentaje de personas  iguales o mayores a 1.60 es:"+mayor);    
  }
}
