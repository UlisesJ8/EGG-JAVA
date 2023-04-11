/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjextra1poocancion;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PrjExtra1POOcancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Cancion track = new Cancion();
        System.out.println("Ingrese el titulo de la cancion:");
        track.setTitulo(reader.nextLine());
        System.out.println("Ingrese el autor de la cancion");
        track.setAutor(reader.nextLine());
        
        System.out.println("La cancion se llama "+ track.getTitulo()+ " y su autor es "+ track.getAutor() );
        
        
        
        
        
        
    }
    
}
