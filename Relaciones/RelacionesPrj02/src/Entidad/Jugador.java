/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Jugador {
    Scanner reader = new Scanner(System.in);
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = "Jugador " + String.valueOf(id);
    }

    
    
    
    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = "Jugador " + String.valueOf(id);
        this.mojado = false;
    }
    
    
    public boolean disparo(revolverDeAgua revolver){
       System.out.println("Dispara");
       revolver.siguienteChorro();
       if(revolver.mojar() == true){
           System.out.println("el " + nombre + " se mojo");
           mojado = true;
          return true;
       }else{
           System.out.println("Se salva " + nombre);
          return false;
       }
       

    }


    public Scanner getReader() {
        return reader;
    }

    public void setReader(Scanner reader) {
        this.reader = reader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre + String.valueOf(id);
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
