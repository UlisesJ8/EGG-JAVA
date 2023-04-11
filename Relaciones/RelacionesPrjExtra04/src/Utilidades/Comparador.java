/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author Equipo
 */
public class Comparador {
    
    public static Comparator<Alumno> comparatorVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
           return Double.compare(o2.getCantidadVotos(), o1.getCantidadVotos());
        }
    };
    
    
}
