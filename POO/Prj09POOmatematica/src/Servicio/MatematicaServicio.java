/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import static java.lang.Double.max;
import static java.lang.Double.min;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class MatematicaServicio {
    Scanner reader = new Scanner(System.in);
    
    public Matematica crearNumero(){
        Matematica calcular = new Matematica();
        calcular.setNum1(Math.random()*10);
        calcular.setNum2(Math.random()*10);
        return calcular;
    }
    
    public void devolverMayor(Matematica calcular){
       double max;
       max = max(calcular.getNum1(), calcular.getNum2());
       
       System.out.println("El numero mayor es "+ max);
        
        
    }
    
    public void calcularPotencia(Matematica calcular){
       int max, min;
       max = (int) max(calcular.getNum1(), calcular.getNum2());
       min = (int) min(calcular.getNum1(), calcular.getNum2());
        System.out.println("El numero mayor es: "+ max);
        System.out.println("El numero menor es: "+ min);
        System.out.println("La potencia del menor por el mayor da como resultado: "+Math.pow(max, min));
    }
    
    
    public void CalcularRaiz(Matematica calcular){
       int min;
       min = (int) min(calcular.getNum1(), calcular.getNum2());
        System.out.println("La raiz cuadrada del menor numero es " + Math.sqrt(min));
    }
    
    
}
