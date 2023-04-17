/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaextraprj01;

import Entidad.Alquiler;
import java.util.ArrayList;
import java.util.Scanner;
import servicioBarco.servicioBarco;

/**
 *
 * @author Equipo
 */
public class HerenciaExtraPrj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        servicioBarco serv = new servicioBarco();
        ArrayList<Alquiler> lista = new ArrayList<>();
        String op = "";
        
        do{
        Alquiler alquilo = serv.datosCliente();
        double precioAlquiler = serv.calcularAlquiler(alquilo.getBarco(), alquilo);
        lista.add(alquilo);  
        System.out.println("El alquiler de su barco es : " + precioAlquiler);
         
        System.out.println("Desea seguir ingresando datos de barcos(si/no)? ");
        op = reader.next();
            while ( !op.equalsIgnoreCase("no") && !op.equalsIgnoreCase("si")) {                
                System.out.println("Ingrese una opcion correcta");
                System.out.println("Desea seguir ingresando datos de barcos(si/no)? ");
                op = reader.next();
            }  
        }while(!op.equalsIgnoreCase("no"));
        
        for (Alquiler aux : lista) {
            System.out.println(aux.toString() +" - " + aux.getBarco().toString());
        }
    }
    
}
