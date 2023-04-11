/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class CuentaServicio {
    Scanner reader = new Scanner(System.in);
    
    
    public Cuenta crearCuenta(){

        Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        cuenta1.setNumeroCuenta(reader.nextInt());
        System.out.println("Ingrese el DNI del cliente sin '.'");
        cuenta1.setDNI(reader.nextInt());
        System.out.println("Ingrese el saldo actual");
        cuenta1.setSaldoActual(reader.nextInt());
        return cuenta1;
        
    }
    
    public void ingresar(Cuenta cuenta1){
        System.out.println("Cuanto desea ingresar?");
        double ingreso = reader.nextDouble(); 
        ingreso = cuenta1.getSaldoActual()+ ingreso;
        cuenta1.setSaldoActual((int) ingreso); 
    
    }
    
    public void retirar(Cuenta cuenta1){
    System.out.println("Cuanto desea retirar?(si usted intenta retirar mas de lo que posee su cuenta quedara en 0)");
    double retiro = reader.nextDouble();
    if(retiro > cuenta1.getSaldoActual()){
        System.out.println("Su saldo actual es 0");
    }else{
     retiro = cuenta1.getSaldoActual() - retiro;
        System.out.println("Su saldo es de: "+ retiro); 
        cuenta1.setSaldoActual((int) (cuenta1.getSaldoActual()-retiro));
    }

   
    }
    
    public void extraccionRapida(Cuenta cuenta1){
        System.out.println("Por el metodo de extraccion rapida solamente puede extraer un 20% de su saldo actual.");
        System.out.println("Cuanto desea retirar?");
        double extraerRapido = reader.nextDouble();
        
        while(extraerRapido > (cuenta1.getSaldoActual()*0.20)){
            System.out.println("Ustedes esta intentando retirar mas del 20%. Por favor intente nuevamente");
            System.out.println("Por el metodo de extraccion rapida solamente puede extraer un 20% de su saldo actual.");
            System.out.println("Cuanto desea retirar?");
            extraerRapido = reader.nextDouble();
            
        }
        cuenta1.setSaldoActual((int) (cuenta1.getSaldoActual()-extraerRapido));
        System.out.println("Usted retiro: "+ extraerRapido);
        System.out.println("Su saldo actual es de " + (cuenta1.getSaldoActual()));
    }
    
    
    public void consultarSaldo(Cuenta cuenta1){
    
        System.out.println("Su saldo actual es de: $"+ cuenta1.getSaldoActual());

    
    }
    
    public void consultarDatos(Cuenta cuenta1){
    
        
        System.out.println("El numero de cuenta es : "+ cuenta1.getNumeroCuenta());
        System.out.println("El DNI del cliente es: "+cuenta1.getDNI());
        System.out.println("El saldo actual de la cuenta es de: "+ cuenta1.getSaldoActual());
        
    
    }
    
    
    
    
}
