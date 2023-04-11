/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesprjextra01;

import Entidad.Perro;
import Entidad.Persona;
import Enumeraciones.nombresPerros;
import Enumeraciones.nombresPersonas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class RelacionesPrjExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Persona> per = new ArrayList();
        ArrayList<Perro> dog = new ArrayList();
// Bucle para crear todos los perrros
        for (nombresPerros perro : nombresPerros.values()) {
            String canino = perro.getNombrePerro();
            dog.add(new Perro(canino, false));
        }
//Bucle para crear todas las personas
        for (nombresPersonas aux : nombresPersonas.values()) {
            String nom = aux.getNombrePer();
            per.add(new Persona(nom));
        }
        //Bucle para asignar a cada persona un perro
        for (Persona aux : per) {
            boolean adoptado = false;
                do{
                    adoptado = false;
                    System.out.println(aux.getNombre() + " que perro queres adoptar?");
            
                for (Perro perro : dog) {
                    System.out.println(perro.toString());
                }
            
            String adoptar = reader.next();
            
                 for (int i = 0; i < dog.size(); i++) {
                    Perro aux2 = dog.get(i);
                        if (adoptar.equalsIgnoreCase(aux2.getNombre()) && aux2.isAdoptado() == false) {
                            aux2.setAdoptado(true);
                            aux.setPerros(aux2);
                            adoptado = true;
                        } 
                
                }
            
            if(adoptado == true){
                System.out.println("Perfecto! Usted adopto este perro");
            }else{
                System.out.println("El perro esta adoptado o no se encuentra entre las opciones");
            }
          }while(adoptado == false);
          }
        for (Persona aux3 : per) {
            System.out.println(aux3.toString2());
        }
        
        

    }
    
}
