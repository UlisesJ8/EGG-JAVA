/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioEdificio {
    Scanner reader = new Scanner(System.in);
    
    
  
    
    public Polideportivo crearPolideportivo(){
        String tipoInstalacion = "";
        System.out.println("Creando polideportivo!!");
        System.out.println("Ingrese el ancho del edificio:");
        double ancho = reader.nextDouble();
        System.out.println("Ingrese alto del edificio: ");
        double alto = reader.nextDouble();
        System.out.println("Ingrese el largo del edificio: ");
        double largo = reader.nextDouble();
        reader.nextLine();
        System.out.println("Ingrese el nombre del Polideportivo: ");
        String nombre = reader.nextLine();
        do{
        System.out.println("Ingrese si el polideportivo es techado o abierto: ");
        tipoInstalacion = reader.nextLine();
        }while(!tipoInstalacion.equalsIgnoreCase("techado") && !tipoInstalacion.equalsIgnoreCase("abierto"));
        
        Polideportivo poli = new Polideportivo(nombre, tipoInstalacion, ancho, alto, largo);
        return poli;
    
    }
    
    public EdificioDeOficinas crearEdificioDeOficinas() {

        System.out.println("Creando Edificio de Oficinas!!");
        System.out.println("Ingrese el ancho del edificio:");
        double ancho = reader.nextDouble();
        System.out.println("Ingrese alto del edificio: ");
        double alto = reader.nextDouble();
        System.out.println("Ingrese el largo del edificio: ");
        double largo = reader.nextDouble();
        System.out.println("Ingrese el numero de oficinas por piso:  ");
        int ofi = reader.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina: ");
        int personas = reader.nextInt();
        System.out.println("Ingrese el numero de pisos: ");
        int pisos = reader.nextInt();
        EdificioDeOficinas edificioDeOfi = new EdificioDeOficinas(ofi, personas, pisos, ancho, alto, largo);
        return edificioDeOfi;
    }


            
            
            
            
            
            
            
}
