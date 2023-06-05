/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava21;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double pT,sT, pI, sI; 
        int contD = 0, contA = 0;
        
        double[] vector = new double[10];
        for(int i = 0; i < 10; i++){  ///Bucle for para cargar las notas y guardar en el vector
            System.out.println("Ingrese la note del Primer Trabajo Practico Rvaluativo del alumno "+ i);
            pT = reader.nextDouble();
            pT = pT*0.10;
            System.out.println("Ingrese la note del Segundo Trabajo Practico Evaluativo del alumno "+ i);
            sT = reader.nextDouble();
            sT = sT*0.15;
            System.out.println("Ingrese la nota del Primer Integrador del alumno "+ i);
            pI = reader.nextDouble();
            pI = pI * 0.25;
            System.out.println("Ingrese la nota del Segundo Integrador del alumno "+ i);
            sI = reader.nextDouble();
            sI = sI*0.50;
            vector[i] = pT + sT + pI + sI;

        }
        
        for(int j = 0; j < 10; j++){     /// bucle for para contar los aprobados y desaprobados 
        if(vector[j] >= 7){
        contA += 1;
        }else{
        contD += 1;
        }

        }
        
        System.out.println("Hay "+ contA +" alumnos aprobados y "+contD+" alumnos desaprobados");
        
        
        
        
    }
    
}
