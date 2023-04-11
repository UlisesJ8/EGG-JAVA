/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author Equipo
 */
public class revolverDeAgua {
    private int posicionActual;
    private int posicionAgua;


   
    
    public revolverDeAgua() {
        llenarRevolver();  
    }

    public void llenarRevolver(){
    Random random = new Random();
    posicionActual = random.nextInt(6);
    posicionAgua = random.nextInt(6);

    }
    
    public boolean mojar(){
        if(posicionActual == posicionAgua){
        return true;
        }else{
        return false;
        }
    }
    
    public void siguienteChorro(){
        if(posicionActual == 6){
        posicionActual = 1;
        }else{
        posicionActual = posicionActual+1;
        }
    
    }

    public revolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "revolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    
}
