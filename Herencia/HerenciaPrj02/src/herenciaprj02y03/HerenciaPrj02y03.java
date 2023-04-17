/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaprj02y03;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class HerenciaPrj02y03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        double sumaElectro = 0;
        
        //Herencia 03
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Creado la lavadora N"+(i+1)+"!");
            Lavadora lavarropa = new Lavadora();
            lavarropa.crearLavadora();
            lista.add(lavarropa);
            sumaElectro = sumaElectro + lavarropa.getPrecio();
            System.out.println("Creado la TV N"+(i+1)+"!");
            Televisor tv = new Televisor();
            tv.crearTelevisor();
            lista.add(tv);
            sumaElectro = sumaElectro + tv.getPrecio();
        }

        System.out.println("La suma de todos los electrodomesticos es: " + sumaElectro);




// Herencia 02
//        Lavadora lavarropa =  new Lavadora();
//        System.out.println("Creando Lavadora");
//        lavarropa.crearLavadora();
//        System.out.println("Creando TV");
//        Televisor tv = new Televisor();
//        tv.crearTelevisor();

        
        
       
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
