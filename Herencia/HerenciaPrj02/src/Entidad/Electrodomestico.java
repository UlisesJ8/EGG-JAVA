/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Electrodomestico {
    Scanner reader = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private final void comprobarConsumoEnergetico(char letra) {
        char letraF = 'F';
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            this.consumoEnergetico = letra; 
        }else{
            this.consumoEnergetico = letraF;
        }
        
        
    }

    private final void comprobarColor(String color) {
        if (color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO") || color.equalsIgnoreCase("ROJO") || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS")) {
            color = color;
            this.color = color;
        } else {
            color = "blanco";
            this.color = color;
        }
    }


      
  public void crearElectrodomestico(){
      
      String letter;
      char letra;
      System.out.println("Ingrese el color del electrodomestico: ");
      String color = reader.next().toUpperCase();
      comprobarColor(color);
      do{
      System.out.println("Ingrese el consumo energetico(A, B, C, D, E , F. EN CASO DE INGRESAR UNA LETRA INCORRECTA SE DESIGNA F): ");
      letter = reader.next();
      letra = letter.toUpperCase().charAt(0);
      }while(letter.length() > 1);
      comprobarConsumoEnergetico(letra);
      
      System.out.println("Ingrese el peso del electrodomestico ");
      double peso = reader.nextDouble();
      this.peso = peso;
      
      double precio = 1000;
      
      precioFinal(precio, letra, peso);
      
      
  }
            
  
  public void precioFinal(double precio, char letra, double peso){
     
      
      switch (letra) {
          case 'A':
               precio = precio + 1000;
               break;
          case 'B':
            precio = precio + 800;
               break;
          case 'C':
              precio = precio + 600;
               break;
          case 'D':
              precio = precio + 500;
               break;
          case 'E':
              precio = precio + 300;
               break;
          case 'F':
              precio = precio + 100;
              break;
      }
      
      if (peso >= 1 && peso < 20) {
          this.precio = precio + 100;
          
      } else if(peso >= 20 && peso < 50){
          this.precio = precio+ 500;
      }else if(peso >= 50 && peso < 80){
         this.precio = precio + 800;
      }else{
        this.precio = precio + 1000;
      }
      
  }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
