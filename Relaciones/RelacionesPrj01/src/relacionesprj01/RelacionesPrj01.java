/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesprj01;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class RelacionesPrj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Persona per[] = new Persona[2];
        Perro dog[] = new Perro[2];
        
        for (int i = 0; i < 2; i++) {
            
        System.out.println("Ingrese su nombre");
        String nombre = reader.next();
        System.out.println("Ingrese su apellido");
        String apellido = reader.next();
        System.out.println("Ingrese su edad");
        int edad = reader.nextInt();
        System.out.println("Ingrese su documento");
        int dni = reader.nextInt();
        
        per[i] = new Persona(nombre, apellido, edad, dni);
        }
        
        for (int i = 0; i < 2; i++) {
        System.out.println("Ingrese el nombre del perro");
        String name = reader.next();
        System.out.println("Ingrese la raza");
        String raza = reader.next();
        System.out.println("Ingrese la edad");
        int edad = reader.nextInt();
        System.out.println("Ingrese el tamano");
        double tamano = reader.nextDouble();
        dog[i] = new Perro(name, raza, edad, tamano);
        per[i].setPerros(dog[i]);
         }
        
        System.out.println(per[0].toString());
        System.out.println(per[1].toString());
        
    }
    
}
