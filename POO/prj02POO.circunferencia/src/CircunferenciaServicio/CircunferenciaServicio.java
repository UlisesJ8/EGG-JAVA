/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircunferenciaServicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class CircunferenciaServicio {
    Scanner reader = new Scanner(System.in);
   
    public Circunferencia crearCircunferencia(){
    
    Circunferencia r1 = new Circunferencia();
    System.out.println("Ingrese el radio del objeto");
    r1.setRadio(reader.nextDouble());
    
    return r1; 
    }
    
    public void calcularArea(Circunferencia r1){
       
       double area = r1.getRadio()* Math.PI;
        System.out.println(area+ " es el area");
    }
    
    public void calcularPerimetro(Circunferencia r1 ){
    
        double perimetro = 2*Math.PI*r1.getRadio();
        System.out.println(perimetro + " es el perimetro ");
    }



}
