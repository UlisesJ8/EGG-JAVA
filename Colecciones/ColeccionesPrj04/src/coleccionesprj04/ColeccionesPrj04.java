/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesprj04;

import Entidad.Peliculas;
import Servicio.servicioPelicula;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ColeccionesPrj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peliculas peli = new Peliculas();
        servicioPelicula movie = new servicioPelicula();
        boolean flag = true;
        Scanner reader = new Scanner(System.in);
        String op;
        do{
            movie.cargarPeliculas();
            System.out.println("Desea cargar otra pelicula?(si/no)");
            op = reader.next();
            if (op.equalsIgnoreCase("si")) {
                flag = true;
            }
            if(op.equalsIgnoreCase("no")){
                flag = false;
            }
            
            while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no")) {                
                System.out.println("Ingrese una opcion correcta ");
                System.out.println("Desea cargar otro alumno?(si/no)");
                op = reader.next();
                
                if(op.equalsIgnoreCase("no")){
                flag = false;
                }
            }
            
        }while(flag == true);
        
        movie.mostrarPeliculas();
        movie.mostrarPeliculasMayorA1();
        movie.ordenarMayor();
        movie.ordenarMenor();
        movie.ordenarTitulo();
        movie.ordenarDirector();
        
        
        
        
        
        
        
    }
    
}
