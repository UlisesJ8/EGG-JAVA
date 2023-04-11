/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava23;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       String palabra;
       String[] vector = new String[5];
       String [][] matriz = new String[20][20];
       for(int i = 0; i < 5 ; i++ ){
           System.out.println("Ingrese una palabra de minimo 3 letras y max 5 letras:");
           palabra = reader.nextLine();
          
           while(palabra.length() < 3 || palabra.length() > 5){
           System.out.println("La palabra ingresada no respeta los parametro pedidos.");
           System.out.println("Por favor. Ingrese una palabra de minimo 3 letras y max 5 letras:");
           palabra = reader.nextLine();
           
           }
           
        vector[i] = palabra;
               
       }
        
       matriz = RellenarMatriz(vector);   
       
       ImprimirMatriz(vector,matriz);
        
    }
    

public static String[][] RellenarMatriz(String[]vector){
String [][] matriz1 = new String[20][20];
int cont = 0;
int cont1 = 0;
int ale = 0;

 for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
        matriz1[i][j] = "";
        }
 }



    for (int i = 0; i < 5; i++) {
        ale = (int) (Math.random() * 20);
        if (i == 0) {
            for (int k = 0; k < vector[i].length(); k++) {
                matriz1[ale][k] = vector[i].substring(k, k + 1);
            }
        } else {
            while (!"".equals(matriz1[ale][0])) {
                ale = (int) (Math.random() * 20);
            }
            for (int k = 0; k < vector[i].length(); k++) {
                    matriz1[ale][k] = vector[i].substring(k, k + 1);
                }
        }
    }

    
   for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
           if("".equals(matriz1[i][j])){
           int num = (int) (Math.random()*10);
           String numLetra = String.valueOf(num);
           matriz1[i][j] = numLetra;
            }
        }    
   }

return matriz1;
}



public static void ImprimirMatriz(String[]vector, String[][]matriz){
String [][] matriz1 = new String[20][20];
for(int i = 0; i < 20; i++){
    for(int j = 0; j < 20; j++){
        System.out.print(matriz[i][j]+ " ");
        }
    System.out.println(" ");
    }

}









}


