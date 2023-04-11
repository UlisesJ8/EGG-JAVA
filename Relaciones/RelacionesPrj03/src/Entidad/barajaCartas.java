/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enumeraciones.numeros;
import Enumeraciones.palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class barajaCartas {
    private ArrayList<Carta> barajaInicial = new ArrayList();
    private ArrayList<Carta> barajaNueva = new ArrayList();
    private Scanner reader = new Scanner(System.in).useDelimiter("\n");
    
    
    public barajaCartas() {
        for (palo aux : palo.values()) {
            String p = aux.getNombre();
            for (numeros num : numeros.values()) {
                String n = num.getNumeros();
                Carta c = new Carta(p, n);
                barajaInicial.add(c);
            }
        } 
    }

   
    
    public void barajar(){
       Collections.shuffle(barajaInicial);
    }

    public  void siguienteCarta() {
        if(barajaInicial.isEmpty() ){
            System.out.println("No hay mas cartas");
        }else{
            System.out.println(barajaInicial.get(0));
            barajaNueva.add(barajaInicial.get(0));
            barajaInicial.remove(0);
        }
    }

    public void cartasDisponibles(){
        System.out.println("La cantidad de cartas disponibles por repartir es: " + barajaInicial.size());
    }
    
    
    public void darCartas(){
        ArrayList<Carta> barajaMomentanea = new ArrayList();
        System.out.println("Ingrese el numero de cartas que desea ver: ");
        int contador = reader.nextInt();
        if(contador <=  barajaInicial.size()){
        for (int i = 0; i < contador; i++) {
            barajaMomentanea.add(barajaInicial.get(i));
            barajaNueva.add(barajaInicial.get(i));
            barajaInicial.remove(i);
        }
            System.out.println("La cantidad de cartas pedidas son "+ contador);
            System.out.println(barajaMomentanea.toString()+ "\n");
            barajaMomentanea.clear();
        }else{
            System.out.println("La cartas pedidas son mas de las que quedan en la baraja");
        }
        
        
        
        
    }
    
    public void cartasMonton(){
        if (barajaNueva.isEmpty()) {
            System.out.println("No salio ninguna carta todavia");
        }else{
            System.out.println("las cartas que salieron son: "+ barajaNueva.size());
            System.out.println(barajaNueva.toString());
                   
        }
    
    }
    
    
    public void mostrarBaraja(){
        System.out.println("Las cartas resultantes son " + barajaInicial.size());
        System.out.println(barajaInicial.toString());
    
    }
    
    
    
}
