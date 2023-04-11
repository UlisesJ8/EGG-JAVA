/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj11poofecha;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prj11POOfecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresar un año");
        int anio = reader.nextInt()- 1900;
        System.out.println("Ingresar un mes");
        int mes = reader.nextInt() - 1;
        System.out.println("Ingresar un dia");
        int dia = reader.nextInt();
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        System.out.println(fecha);
        System.out.println(fechaActual);
        
       
        
        double diferencia = (double) ((fechaActual.getTime() - fecha.getTime())* 03.1709791983765E-11);
        
        System.out.println("La diferencia de años es: "+diferencia);
        
        int a=fechaActual.getYear()-fecha.getYear();
        
        System.out.println("La diferencia de anio es: "+a);

        
        
    }
    
}
