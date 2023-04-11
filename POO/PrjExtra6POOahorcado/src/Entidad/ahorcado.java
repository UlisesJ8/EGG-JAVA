/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class ahorcado {
    private String[] palabra = new String[getCantidadL()] ; 
    private int cantidadL;
    private int cantJug;
    private int encontradas;

    public ahorcado() {
    }

    public ahorcado(String[] palabra, int cantidadL, int cantJug, int encontradas) {
        this.palabra = palabra;
        this.cantidadL = cantidadL;
        this.cantJug = cantJug;
        this.encontradas = encontradas;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }
   
  
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadL() {
        return cantidadL;
    }

    public void setCantidadL(int cantidadL) {
        this.cantidadL = cantidadL;
    }

    public int getCantJug() {
        return cantJug;
    }

    public void setCantJug(int cantJug) {
        this.cantJug = cantJug;
    }
    
    
    
    
    
    
}
