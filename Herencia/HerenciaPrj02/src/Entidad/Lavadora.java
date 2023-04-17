/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Lavadora extends Electrodomestico {

    Scanner reader = new Scanner(System.in);
    public double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la carga del Lavarropa");
        this.carga = reader.nextDouble();
        precioFinal(precio, consumoEnergetico, peso, carga);
        System.out.println("El electrodomestico es: " + color);
        System.out.println("El electrodomestico es de consumo energetico: " + consumoEnergetico);
        System.out.println("El electrodomestico tiene un peso de: " + peso);
        System.out.println("El PRECIO ES: " + precio);

    }

    public void precioFinal(double precio, char letra, double peso, double carga) {
        super.precioFinal(precio, letra, peso); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
       
        if (carga > 30) {
            this.precio = precio + 500;
       }else{
            this.precio = precio;
        }
        
        
        
    }
    
}
