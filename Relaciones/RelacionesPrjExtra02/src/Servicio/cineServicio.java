/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Enumaracion.Columna;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class cineServicio {
    Scanner reader = new Scanner(System.in);
    
    public ArrayList<Espectador> crearEspectadores(){
    ArrayList<Espectador>espectadores = new ArrayList<>();
    Random r = new Random();
    int cantidadDeEspectadores = r.nextInt(49);
    String[] nombres = {"Lucas", "Martina", "Mateo", "Sofía", "Agustín", "Valentina", "Santiago", "Isabella", "Benjamín", "Mía", "Tomás", "Emma", "Joaquín", "Olivia", "Nicolás", "Ana", "Thiago", "Antonella", "Pedro", "María", "Manuel", "Catalina", "Lautaro", "Camila", "Juan", "Renata", "Bautista", "Abril", "Maximiliano", "Rocío", "Felipe", "Lucía", "Ignacio", "Victoria", "Federico", "Emilia", "Ramiro", "Martina", "Emmanuel", "Tiziana", "Leonardo", "Sol", "Jerónimo", "Brisa", "Alexis", "Renzo", "Marta", "Juana", "Gabriel"};
    String[] apellidos = {"García", "Rodríguez", "Martínez", "Hernández", "López", "González", "Pérez", "Sánchez", "Romero", "Sosa", "Alvarez", "Torres", "Ruiz", "Ramírez", "Flores", "Benítez", "Acosta", "Silva", "Molina", "Chávez", "Rojas", "Medina", "Ortiz", "Castillo", "Morales", "Vázquez", "Gómez", "Jiménez", "Díaz", "Fernández", "Álvarez", "Cruz", "Mendoza", "Reyes", "Gutiérrez", "Núñez", "Ramos", "Espinosa", "Castro", "Vargas", "Herrera", "Rivera", "Hernández", "Carrasco", "Guerrero", "Sandoval", "Sánchez", "Chaves", "Stuart", "Cena", "Buendia","Martinez"};
    
    for (int i = 0; i < cantidadDeEspectadores; i++) {
        int edad = r.nextInt(99);
        double dinero = r.nextDouble(4500);
        String nombreCompleto = nombres[i]+apellidos[i];
        espectadores.add(new Espectador(nombreCompleto, edad, dinero));
        }

    return espectadores;
    }
    
    
    public Cine llenarSala(ArrayList<Espectador> lista){
    Random r = new Random();
    LocalTime horario = LocalTime.of(2, 15, 36);
    Pelicula peli = new Pelicula("Sin novedad en el frente", "Edward Berger", 16, horario);
    String mat;
    Asiento [][]s = new Asiento[8][6];
    double precioEntrada = 1580;
        for (int i = 0; i < 8; i++) {
            String fila = String.valueOf(i+1);
            for (int j = 0; j < 6; j++) {  
                switch (j) {
                    case 0:
                        mat = fila + Columna.A;  
                        break;
                    case 1:
                        mat  = fila + Columna.B; 
                        
                        break;
                    case 2:
                        mat = fila + Columna.C; 
                        break;
                    case 3:
                        mat = fila + Columna.D; 
                        break;
                    case 4:
                        mat = fila + Columna.E; 
                        break;
                    case 5:
                        mat= fila + Columna.F; 
                        break;
                    default:
                        throw new AssertionError();
                }
                
                Asiento lugar = new Asiento(mat, null);
                s[i][j] = lugar;
                
            }
            
        }
   
    
        for (int i = 0; i < lista.size(); i++) {
            int lugarFila = r.nextInt(8);
            int lugarColumna = r.nextInt(6);
            while(s[lugarFila][lugarColumna].getEspectador() != null){
            lugarFila = r.nextInt(8);
            lugarColumna = r.nextInt(6);
            }
            
            if (s[lugarFila][lugarColumna].getEspectador() == null) {
                if (lista.get(i).getDinero() >= precioEntrada) {
                    if(lista.get(i).getEdad() >= peli.getEdad()){
                      s[lugarFila][lugarColumna].setEspectador(lista.get(i));
                    }
                }
            }

       }
    
    return new Cine(s, peli, precioEntrada, lista);
    }
    
    public void mostrarPelicula(Cine cinema){
        System.out.println("La pelicula que se esta reproduciendo es: " + cinema.getPelicula().getNombrePelicula());
        System.out.println("Duracion de la pelicula " + cinema.getPelicula().getDuracion());
        System.out.println("Precio de la entrada: " + cinema.getPrecioEntrada());
        System.out.println("El director de la pelicula es : "+ cinema.getPelicula().getDirector());
    
    }
    
    public void espectadoresIngresados(Cine cinema){
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(cinema.getMatriz()[i][j].getEspectador() != null ){
                System.out.println("Posicion: " + cinema.getMatriz()[i][j].getUbicacion());
                System.out.println(cinema.getMatriz()[i][j].getEspectador().toString());
                }
            }
        }
    
    }
    public void mostrarCine(Cine cinema){
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cinema.getMatriz()[i][j].toString() );
            }
            System.out.println("");
        }
    
    
    
    
    
    
    
    }

    
    
    
    
}
