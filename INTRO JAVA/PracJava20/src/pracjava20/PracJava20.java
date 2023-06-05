/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjava20;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJava20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
       int[][] matriz = new int[3][3];
       int fila = 0; 
       int columna = 0;
       int diagonal = 0; 
       int diagonalI = 0; 
       int contD = 0;
       int contDI = 2;
       boolean flag = true;
       
       //Entrada. Bucle para ingresar los numeros en la matriz de 3x3 entre 1 y 9
       for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){    
                do{
                    System.out.println("Ingrese el numero de la matriz ["+i+"] ["+j+"]");
                    num = leer.nextInt();
                    matriz[i][j] = num;
                }while(num > 9 || num < 1 );
       }   
    }
       
       
       //Bucle for para determinar en la matriz 3x3 si la suma de columnas, filas y diagonales da el mismo resultado
       for(int i = 0; i < 3; i++){
           fila = 0;
           columna = 0;
           for(int j = 0; j < 3; j++){ 
            fila += matriz[i][j];
            columna += matriz[j][i];
            
            //condicional para sumar la diagonal
            if(matriz[i][contD] == matriz[i][j]){   
                diagonal += matriz[i][j];
            }
            //condicional para sumar la diagonal invertida
            if(matriz[i][contDI] == matriz[i][j]){
            diagonalI += matriz[i][j];
            }
        }
           
     // Condicional bandera para comprobar si la suma de  filas y columnas son verdaderas, sino salir del bucle for para indicar que no es un cuadrado magico  
           if(fila == columna){ 
           flag = true;
           }else{  
           flag = false;
           break;
           }
           
           contD +=1; // sumo 1 al contador de diagonal principal
           contDI -=1; //resto 1 al contador de diagonal invertida 
        }
           
        if(fila == columna && fila == diagonal && fila == diagonalI){ 
        flag = true;
        }else{  
        flag = false; 
        }
        
       // Resultado de salida. Condicionales para indicar si es o no un cuadrado magico
       if(flag == true){
           System.out.println("Es un cuadrado magico por que la suma de sus filas, columnas y diagonales dan el mismo resultado:"+fila);
       }else{
           System.out.println("No es un cuadrado magico por que la suma de sus filas, columnas y diagonales no dan el mismo resultado");
           System.out.println("Fila:"+fila);
           System.out.println("Columna:"+columna);
           System.out.println("Diagonal:"+diagonal);
       
       }
       
       
       
    }
    
}
