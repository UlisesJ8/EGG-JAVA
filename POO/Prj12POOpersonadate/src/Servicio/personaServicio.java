/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class personaServicio {
    Scanner reader = new Scanner(System.in);
   
    public persona crearPersona(){
        persona humano = new persona();
        System.out.println("Ingrese su nombre completo");
        humano.setNombre(reader.nextLine());
        System.out.println("Ingrese su dia de nacimiento");
        humano.setDia(reader.nextInt());
        System.out.println("Ingrese su mes de nacimiento");
        humano.setMes(reader.nextInt());
        System.out.println("Ingrese su año de nacimiento");
        humano.setAnio(reader.nextInt());
        Date fechaNac = new Date(humano.getAnio()-1900, humano.getMes()-1, humano.getDia());
        Date fechaActual = new Date();
        humano.setFechaNac(fechaNac);

        return humano;
        
    }
    
    
    public void calcularEdad(persona humano){
        Date fechaActual = new Date();
        int diaActual = fechaActual.getDate();
        int mesActual = fechaActual.getMonth()+1;
        int anioActual = fechaActual.getYear()+1900;
        
                
        if (mesActual < humano.getMes()) { // si el mes actual es menor al mes del cumple se le resta uno a la fecha actual para que de la edad correcta
            humano.setEdad((anioActual-1) - humano.getAnio());
        } else if (mesActual == humano.getMes()) { // si el mes es el mismo

            if (diaActual < humano.getDia()) { // al ser el mismo mes de nacimiento se evaluan los dias. si el dia actual es mayor se resta uno para que de correcto
                humano.setEdad((anioActual-1) - humano.getAnio());
            } else {
                humano.setEdad(anioActual - humano.getAnio()); // al ser el mismo mes de nacimiento y el dia igual o mayor se mantiene el ano exacto sin restar
            }

        } else {
            humano.setEdad(anioActual - humano.getAnio()); // en este caso si el mes es mayor se resta el ano correspondiente
        }
        

     
    }
    
    public void menorQue(persona humano, int edad){
        boolean menor = false;
        if (humano.getEdad() < edad) {
            menor = true;
            System.out.println(menor);
        } else {
            System.out.println(menor);
        }
    
    }
    
    public void mostrarPersona(persona humano){
        System.out.println("La persona se llama "+ humano.getNombre());
        System.out.println("Nacio el "+ humano.getDia() + " del " + humano.getMes()+" de "+ humano.getAnio());
        System.out.println("Su edad es: "+ humano.getEdad());
        
   }
}
