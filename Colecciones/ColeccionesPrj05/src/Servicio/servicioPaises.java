/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioPaises {
    private Scanner reader;
    private HashSet<String> listaPaises;
    
    Pais agg = new Pais();

 
    
    public servicioPaises() {
        this.reader = new Scanner(System.in).useDelimiter("\n");
        this.listaPaises = new HashSet<>(); 
    }
    
    public Pais cargarPaises(){
        String pais = "";
        System.out.println("Ingrese el pais: ");
        pais = reader.next();
        listaPaises.add(pais);
        return new Pais(agg.getPais());
        
    }
    
    public void mostrarPaises(){
        for (String aux : listaPaises) {
             System.out.print(aux + "//");
        }
        System.out.println(" ");
    }
        
    public void ordenarPaises(){
        ArrayList<String> listaPaisesArray = new ArrayList(listaPaises);
            System.out.println("Ordenar Paises alfabeticamente: ");
            Collections.sort(listaPaisesArray);
            for (String aux : listaPaisesArray) {
                System.out.print(aux + "//");
            }
            System.out.println(" ");
    }

    public void eliminarPais(){
        ArrayList<String> listaPaisesArray = new ArrayList(listaPaises);
        Iterator<String> it = listaPaisesArray.iterator();
        System.out.println("Ingrese el pais que desea eliminar");
        String nacionality = reader.next(); 
        int cont = 0;
        
        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase(nacionality)){
            it.remove();
            cont += 1;
            } 
        }
        
        
        if (cont == 0) {
            System.out.println("El pais no se encuentra en la lista");
            Collections.sort(listaPaisesArray);
            for (String aux : listaPaisesArray) {
                System.out.print(aux + "//");
            }
            System.out.println(" ");
        }else{
            System.out.println("Se elimino el pais "+ nacionality);
            Collections.sort(listaPaisesArray);
            for (String aux : listaPaisesArray) {
                System.out.print(aux + "//");
            }
            System.out.println(" ");
        }
    
    
    
    }
    
    
}
