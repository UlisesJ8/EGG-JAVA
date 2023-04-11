/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioRaices {
    Scanner reader = new Scanner(System.in);
    
    
    public Raices getDiscriminante(){
    Raices valores = new Raices();
    System.out.println("Ingrese los valores de una ecuacion de segundo grado");
    System.out.println("Ingrese el valor de A");
    valores.setA(reader.nextDouble());
    System.out.println("Ingrese el valor de B");
    valores.setB(reader.nextDouble());
    System.out.println("Ingrese el valor de C");
    valores.setC(reader.nextDouble());
    
    double discri = Math.pow(valores.getB(), 2) - (4*valores.getA()*valores.getC());
    valores.setDiscriminante1(discri);
    return valores;
    }
    
    public boolean tieneRaices(Raices valores){
        
        
        boolean solucion;
        if (valores.getDiscriminante1() > 0) {
            solucion = true;
        } else {
            solucion = false;
        }
        
        return solucion;
    }
    
    public boolean tieneRaiz(Raices valores){
        boolean solu;
        
        if (valores.getDiscriminante1() == 0) {
            solu = true;
        } else {
            solu = false;
        }
       return solu;
    }
    
    public void obtenerRaices(Raices valores){
        
        boolean solucion = tieneRaices(valores);
        if( solucion == true){
            System.out.println("Las dos posibles soluciones son");
            System.out.println(valores.getDiscriminante1());
            System.out.println(valores.getDiscriminante1()*-1);
        }
        
        
    }

    public void obtenerRaiz(Raices valores){
        boolean solu = tieneRaiz(valores);
        
        if(solu == true){
            System.out.println("La solucion es: ");
            System.out.println(valores.getDiscriminante1()); 
        }
        
    }

    public void calcular(Raices valores){
        
        boolean solucion = tieneRaices(valores);
        boolean solu = tieneRaiz(valores);
        
        
        if ( solucion == true) {
            obtenerRaices(valores);
        }else if(solu == true){
            obtenerRaiz(valores);
        }else{
            System.out.println("No existe solucion ");
        }
    
            
            
}
    
}
