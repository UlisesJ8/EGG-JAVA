/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjava21;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJava21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 100);
                System.out.print(matrizM[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la matriz posicion [" + i + "][" + j + "]");
                matrizP[i][j] = leer.nextInt();
//                matrizP[i][j] = (int) (Math.random()*100);
//                System.out.print(matrizP[i][j] +"  ");
            }
            System.out.println("  ");
        }

        int contI = 0;
        int contJ = 0;
        
        //Bucle for para encontrar la matriz pequena en la matriz grande 
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (matrizM[i][j] == matrizP[0][0]) { // condicional para comprar el numero de la matriz grande en la pequena
                    contI = i;
                    contJ = j;
                    
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            
                            if (matrizP[k][l] == matrizM[contI][contJ] ) {
                                System.out.println("La matriz se encuentra en la posicion [" + contI + "][" + contJ + "]");
                                contJ = contJ + 1;
                            }else{
                            contI = 0;
                            contJ = 0;
                            break;
                            }

                            if (contJ == contJ + 3) {
                                contJ = j;
                            }
                            
                            
                        }
                        contJ = j;
                        contI = contI + 1;
                    }
                    break;
                }else{ // si no se ejecuta ninguna condicion se repite la variable cont fila y columna
                    contI = 0;
                    contJ = 0;

                }

            }
        }
    }
}
