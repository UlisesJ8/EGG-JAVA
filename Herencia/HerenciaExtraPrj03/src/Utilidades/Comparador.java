/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Hoteles;
import java.util.Comparator;
/**
 *
 * @author Equipo
 */
public class Comparador {

    public static Comparator<Hoteles> ordenarMayor = new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles h1, Hoteles h2) {
            return Double.compare(h2.getPrecioHabitacion(), h1.getPrecioHabitacion());
        }
    
    };
    
    
    
    
    
    
    
    
    
    }
    
    
    
    

