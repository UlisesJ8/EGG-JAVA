/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.utilidades;

import java.util.Comparator;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author Equipo
 */
public class Comparadores {
      public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {
           return o2.getNombre().compareTo(o1.getNombre());
        }
    };
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {
            return o2.getEdad().compareTo(o1.getEdad());
        }
    };
}
