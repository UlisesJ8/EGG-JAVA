/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioAhorcado {
    Scanner reader = new Scanner(System.in);
    
    public ahorcado crearJuego(){
        ahorcado juego = new ahorcado();
        System.out.println("Ingrese una palabra");
        String frase = reader.next();
        juego.setCantidadL(frase.length());
        
        String [] guardar = new String[frase.length()];
        
        for (int i = 0; i < frase.length(); i++) {
            guardar[i] = frase.substring(i, i+1);
        }
        juego.setPalabra(guardar);
        System.out.println("Ingrese la cantidad de jugadas maximas:");
        juego.setCantJug(reader.nextInt());
        juego.setEncontradas(0);
        return juego;
    }
    
    
    public void longitud(ahorcado juego){
        System.out.println("Longitud de la palabra:" + juego.getCantidadL());
    }

    

    public String buscar(ahorcado juego) {

        String[] frase = juego.getPalabra();
        String l;
        boolean validar = false;
        
        do {
            System.out.println("Ingrese una letra");
            l = reader.next();
        } while (l.length() != 1);
        
        for (int i = 0; i < juego.getCantidadL(); i++) {
            if (frase[i].equals(l)) {
                validar = true;
                break;
            } else {
                validar = false;
            }
        }
        
        longitud(juego);
        
        if ( validar == true) {
            
            System.out.println("Mensaje: La letra pertenece a la palabra");
            
        } else {
            
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            
        }
        
        return l;
        
    }

    
    
    
    public void encontradas(ahorcado juego) {
 
        boolean buscar = false;
        String l = buscar(juego);  
        int cont = juego.getEncontradas();
        String[] frase = juego.getPalabra();
        
        int CantidadLetrasF = juego.getCantidadL() - juego.getEncontradas();
        
        
        for (int i = 0; i < juego.getCantidadL(); i++) {
            
            if (frase[i].equals(l)) {
               
                cont += 1;
                juego.setEncontradas(cont);
                
            } 

        }
        
        CantidadLetrasF = juego.getCantidadL() - juego.getEncontradas();
        
        for (int i = 0; i < juego.getCantidadL(); i++) {
            if (frase[i].equals(l)) {
                buscar = true;
                break;
            } else {
                buscar = false;
            }
        }
        
        int restar = juego.getCantJug() - 1;
        juego.setCantJug(restar);
        
  
        System.out.println("Numero de letras(encontradas,faltantes):(" + juego.getEncontradas() + "," + CantidadLetrasF + ")");
        
        
    }
    
    public void intentos(ahorcado juego){
        System.out.println("Numero de oportunidades restantes: "+ juego.getCantJug());
        System.out.println("-------------------------------------------------");
    }
    
    public void juego(ahorcado juego){
    
        
       do{
           
           encontradas(juego);
           intentos(juego);
   
        }while( juego.getCantJug() > 0 && juego.getEncontradas() != juego.getCantidadL()); 
        
       
       
       
       if(juego.getEncontradas() == juego.getCantidadL() ){
           System.out.println("Felicitaciones!!! Adivino la palabra completa");
       }else{
           System.out.println("Intentelo nuevamente. Usted no adivino la palabra");

       }
    }
    
    
    
    
    
    
    
    
    
    
    
}
