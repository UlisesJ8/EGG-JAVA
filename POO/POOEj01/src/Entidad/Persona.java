/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner;
/**
 *
 * @author Equipo
 */
public class Persona {
    public String nombre;
    public int dni;
    public String fechaNac;
    Scanner reading = new Scanner(System.in);
    public Persona() {
    }

    public void  nombrePersona(){
    }
   
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


