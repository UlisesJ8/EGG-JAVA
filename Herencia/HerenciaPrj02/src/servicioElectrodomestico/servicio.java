/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioElectrodomestico;

import Entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicio {
    Electrodomestico elec = new Electrodomestico();
    Scanner reader = new Scanner(System.in);
    
    
  private void comprobarConsumoEnergetico(char letra){
    if(letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E' || letra != 'F'){
        letra = 'F';    
    }
  }    
            
  private void comprobarColor(String color){   
  if(color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO") || color.equalsIgnoreCase("ROJO") || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS") ){
  color = color;
  }else{
  color = "blanco";
  }
  }          
            
  
  public void crearElectrodomestico(){
      String letter;
      char letra;
      System.out.println("Ingrese el color del electrodomestico: ");
      String color = reader.next();
      
      do{
      System.out.println("Ingrese el consumo energetico(A, B, C, D, E , F. EN CASO DE INGRESAR UNA LETRA INCORRECTA SE DESIGNA F): ");
      letter = reader.next();
      letra = letter.charAt(0);
      }while(letter.length() >= 1);
      
      comprobarColor(color);
      comprobarConsumoEnergetico(letra);
      
      double precio = 1000;
 
      
  }
            
  
  public void precioFinal(){
  
  
  
  
  }
  

  
  
  
    public void crearLavadora(){
    
    
    
    
    }        
            
            
            
            
            
    public void crearTelevisor(){
    
    
    
    }
    
    
}
