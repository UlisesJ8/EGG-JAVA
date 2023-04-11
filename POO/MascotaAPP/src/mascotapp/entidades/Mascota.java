/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author Equipo
 */
public class Mascota {
    
    private String nombre;
    private String apodo;
    private String tipo;
    private int edad;
    private String raza;
    private boolean cola;
    private String color;
    private int energia;
    
    public Mascota(){
     this.energia = 1000;
    
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if(tipo.equals("Perro") ||tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo")  || tipo.equals("Carpincho")){
            this.tipo = tipo;
        }
        this.energia = 1000;
    }
    
    
    
    public Mascota(String nombre, String apodo, String tipo, int edad, String raza, boolean cola, String color) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.raza = raza;
        this.cola = cola;
        this.color = color;
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        if(nombre.length() > 0){
        this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isCola() {
        return cola;
    }

    public String getColor() {
        return color;
    }
    /**
     * Funcion destinada a pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    
    }
    /**
     * Funcion destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
     public int pasear(int energiaRestar, int vueltas){
        
         for (int i = 0; i < vueltas; i++) {
             energia -= energiaRestar;
         }
         
//         energia -= energiaRestar;
        
        
        
        
        return energia;
    
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", raza=" + raza + ", cola=" + cola + ", color=" + color + ", energia=" + energia + '}';
    }

  
            
    
    
    
    
    
    
    
}
