/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj01poo.libro;

import Entidad.Libro;
import Entidad.Usuario;
import Servicio.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prj01POOLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       LibroServicio libro1 = new LibroServicio();
       LibroServicio usuario1 = new LibroServicio();
       
       Usuario u1 = usuario1.crearUsuario();
       
       Libro l1 = libro1.crearLibro();
       
       
    }
    
}
