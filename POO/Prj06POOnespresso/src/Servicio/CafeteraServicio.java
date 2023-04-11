/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Cafetera;
import java.util.Scanner;
/**
 *
 * @author Equipo
 */
public class CafeteraServicio {
    Scanner reader = new Scanner(System.in);
    Cafetera cafe = new Cafetera();
    
    public void  llenarCafetera(){
    cafe.setCapacidadActual(cafe.getCapacidadMaxima());
    System.out.println("Perfecto. Su cafetera se lleno y se encuentra con la capacidad en:  "+ cafe.getCapacidadActual());
    }
    
    public void servirTaza() {
        System.out.println("Ingrese el tamano de la taza");
        double taza = reader.nextDouble();
        if (taza <= cafe.getCapacidadActual()) {
            cafe.setCapacidadActual(cafe.getCapacidadActual() - taza);
            System.out.println("Perfecto su taza de " + taza + " se lleno ");
            System.out.println("La capacidad actual de la cafetera es de: " + cafe.getCapacidadActual());
        } else if (taza > cafe.getCapacidadActual() || cafe.getCapacidadActual() > 0) {
            System.out.println("Su taza solamente se lleno con " + cafe.getCapacidadActual() + " porque era lo ultimo que quedaba en la cafetera");
            double resultado = cafe.getCapacidadActual() - taza;
            if (resultado <= 0) {
                cafe.setCapacidadActual(0);
                System.out.println("La capacidad de la cafetera es de " + cafe.getCapacidadActual());
            }
        } else {
            System.out.println("Su taza no pudo llenarse. Sepa disculpar");
            System.out.println("La capacidad de la cafetera es de " + cafe.getCapacidadActual());
            
        }

    }

    public void vaciarCafetera(){
        
    cafe.setCapacidadActual(0);
    System.out.println("La cafetera se encuentra vacia");
    
    }
    
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe que desea introducir en la cafetera: ");  
        double introducir = reader.nextDouble();
        introducir += cafe.getCapacidadActual();
        while(introducir > 1000){
            introducir = 0;
            System.out.println("Usted ingreso mas de lo que puede almacenar la cafetera.");
            System.out.println("Recuerde que la capacidad maxima de la cafetera es de 1000 y la misma se encuentra en este momento en " + cafe.getCapacidadActual());
            System.out.println("Ingrese la cantidad de cafe que desea introducir en la cafetera: "); 
            introducir = reader.nextDouble();
            introducir += cafe.getCapacidadActual();
            
        }
     
        cafe.setCapacidadActual(introducir);
        System.out.println("La capacidad actual de la cafetera es de: " + cafe.getCapacidadActual());
    
    }
    
    
    
    
}
