/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Libro;
import Entidad.Usuario;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class LibroServicio {
    private Scanner reader = new Scanner(System.in);
    
    public Usuario crearUsuario(){
      Usuario u1 = new Usuario();
        System.out.println("Ingrese el nombre del usuario");
        u1.setNombre(reader.next());
        System.out.println("Ingrese el dni del usuario");
        u1.setDni(reader.nextInt());
        System.out.println("Ingrese la fecha de nacimiento");
        u1.setFechaNac(reader.next());
        return u1;
    }
    
    
    public Libro crearLibro(){
        Libro l1 = new Libro();
        System.out.println("Ingrese el ISBC del libro");
        l1.setISBN(reader.next());
        System.out.println("Ingrese el titulo del libro");
        l1.setTitulo(reader.next());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(reader.next());
        System.out.println("Ingrese el numero de paginas");
        l1.setNumpaginas(reader.nextInt());
        
        return l1; 
        
    }
    
    
   
}
