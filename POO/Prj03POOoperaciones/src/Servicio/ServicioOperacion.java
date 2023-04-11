/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ServicioOperacion {
    Scanner reader = new Scanner(System.in);
    
    public Operacion CrearOperacion(){
        Operacion numeros = new Operacion();
        System.out.println("Ingrese el numero 1:");
        numeros.setNumero1(reader.nextDouble());
        System.out.println("Ingrese el numero 2:");
        numeros.setNumero2(reader.nextDouble());
    
        return numeros;
    }
    
    public void sumar(Operacion numeros){
    double suma = numeros.getNumero1()+numeros.getNumero2();
    
        System.out.println(suma);
    }
    
     public void restar(Operacion numeros){
    double resta = numeros.getNumero1()-numeros.getNumero2();
    
         System.out.println(resta);
    }
     
    public void multiplicar(Operacion numeros){
    double multiplicacion = numeros.getNumero1()*numeros.getNumero2();
    if (numeros.getNumero1() == 0 || numeros.getNumero2() == 0){
        System.out.println("0. Error ");
    }else{
        System.out.println(multiplicacion);
    }
    
    }
    
    public void dividir(Operacion numeros){
    double division = numeros.getNumero1()/numeros.getNumero2();
    if (numeros.getNumero1() == 0 || numeros.getNumero2() == 0){
        System.out.println("0. Error ");
    }else{
        System.out.println(division);
    }
    
    }
    
    
    
    
}
