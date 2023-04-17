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
public class Televisor extends Electrodomestico {
    Scanner reader = new Scanner(System.in);
    public double resolucion;
    public boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        String comprueba = "";
        boolean flag = false;
        System.out.println("Ingrese la resolucion de la TV: ");
        resolucion = reader.nextDouble();
        do{
        System.out.println("La TV tiene un sintonizador de TDT??(si/no)");
        comprueba = reader.next();
            if ( comprueba.equalsIgnoreCase("si") || comprueba.equalsIgnoreCase("no")) {
                flag = true;
            }
        }while(flag == false); 

        if(comprueba.equalsIgnoreCase("si")) {
            TDT = true;
        } else {
            TDT = false;
        }
        precioFinal(precio, consumoEnergetico, peso, resolucion, TDT);
        System.out.println("El electrodomestico es: " + color);
        System.out.println("El electrodomestico es de consumo energetico: " + consumoEnergetico);
        System.out.println("El electrodomestico tiene un peso de: " + peso);
        System.out.println("El precio final de la TV es: " + precio);

    }

    public void precioFinal(double precio, char letra, double peso,double resolucion, boolean TDT) {
        super.precioFinal(precio, letra, peso); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
         
        if (resolucion > 40 && TDT == true) {
           this.precio = precio + (precio * 0.30) + 500;
        }else if (resolucion > 40 && TDT == false) {
            this.precio = precio + (precio*0.30);
        }else if(resolucion < 40 && TDT == true){
            this.precio = precio + 500;
        }else{
            this.precio = precio;
        }
    }

    

}
