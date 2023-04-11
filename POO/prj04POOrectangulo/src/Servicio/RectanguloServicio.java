/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class RectanguloServicio {

    Scanner reader = new Scanner(System.in);
    
public Rectangulo cargarDatos(){
    Rectangulo rectan = new Rectangulo();
    System.out.println("Ingrese la base del rectangulo");
    rectan.setBase(reader.nextDouble());
    System.out.println("Ingrese la altura del rectangulo");
    rectan.setAltura(reader.nextDouble());

    return rectan;
}
    
public void calcularSuperficie(Rectangulo rectan){
double superficie = rectan.getBase()*rectan.getAltura();
    System.out.println(superficie+ " es la superficie del rectangulo");

}    
public void calcularPerimetro(Rectangulo rectan){
double perimetro = (rectan.getBase()+rectan.getAltura())*2;
    System.out.println(perimetro+ " es el perimetro del rectangulo");
}

public void dibujarRectangulo(Rectangulo rectan){
    for (int i = 0; i < rectan.getAltura(); i++) {
        for (int j = 0; j < rectan.getBase(); j++) {
            
            if(i == 0 || i == rectan.getAltura()-1){
                System.out.print("*");
            }else if( j == 0 || j == rectan.getBase()-1 ){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
      
        }
        System.out.println(" ");
    }

}




}
