/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioPerro {
   
    private Scanner reader;
    private ArrayList<String> lista ; 
    Perro dog = new Perro();
    
    public servicioPerro(){
     this.reader = new Scanner(System.in).useDelimiter("\n");
     this.lista = new ArrayList();
    }
    
    public Perro crearLista(){
    System.out.println("Ingrese la raza del perro");
    dog.setRaza(reader.next());
    lista.add(dog.getRaza());
    return new Perro(dog.getRaza());
    
    }
    
    public void mostrarPerros(){
    
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); 
        }
        
        System.out.println("La cantidad de perros son: " + lista.size());
        
    }
    
    
    public void BuscarPerro(){
    System.out.println("Ingrese el perro que desee buscar en la lista");
    String perro = reader.next();
    Iterator<String> it = lista.iterator();
    int cont = 0;
        while (it.hasNext()) {
            
            if (it.next().equals(perro)) {
                it.remove();
                cont +=1;
            
            }
        }
        
        
        if (cont == 0) {
            System.out.println("El perro no esta en la lista ");
              Collections.sort(lista);
            for (int i = 0; i < lista.size() ; i++) {
                System.out.print(lista.get(i)+",");
            }
            System.out.println(" ");
        } else {
              Collections.sort(lista);
            for (int i = 0; i < lista.size() ; i++) {
                System.out.print(lista.get(i)+",");
            }
            System.out.println(" ");
        }
    
    
    }
    
    
            
}
