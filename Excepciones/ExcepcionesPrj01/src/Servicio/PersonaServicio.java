/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PersonaServicio {
      
   Scanner reader = new Scanner(System.in);
   String genero;
  
   public Persona crearPersona(){
       Persona humano = new Persona();
 
       System.out.println("Ingrese el nombre: ");
       humano.setNombre(reader.nextLine());
       System.out.println("Ingrese su edad: ");
       humano.setEdad(reader.nextInt());
       do{
       System.out.println("Ingrese su sexo");
       System.out.println("H. Hombre");
       System.out.println("M. Mujer");
       System.out.println("O. Otro");
       genero = reader.next();

       if(!"h".equalsIgnoreCase(genero) && !"m".equalsIgnoreCase(genero) && !"o".equalsIgnoreCase(genero)){
           System.out.println("Ingreso una opcion incorrecta");
       }
       }while( !"h".equalsIgnoreCase(genero) && !"m".equalsIgnoreCase(genero) && !"o".equalsIgnoreCase(genero));
       humano.setSexo(genero);
       
       System.out.println("Ingrese su peso en KG");
       humano.setPeso(reader.nextDouble());
       System.out.println("Ingrese su altura en M ");
       humano.setAltura(reader.nextDouble());
       reader.nextLine();
       
   
       
       return humano;
       
       
   }
   
    public void CalcularIMC(Persona humano) {
        double imc = humano.getPeso() / (pow(humano.getAltura(), 2));
        if (imc < 20) {
            System.out.println("Esta por debajo de su indice de masa corporal ideal ");
            humano.setnIMC(-1);
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Esta en su indice de masa corporal ideal ");
            humano.setnIMC(0);
        } else {
            System.out.println("Su imc indica que tiene sobrepeso ");
            humano.setnIMC(1);
        }

    }

   public void esMayorDeEdad(Persona humano){
       
       if (humano.getEdad() < 18) {
           System.out.println("Es menor de edad");
           humano.setEdadM(false);
       } else {
           System.out.println("Es mayor de edad");
           humano.setEdadM(true);
       }
       
       
   }
   
   
   
}
