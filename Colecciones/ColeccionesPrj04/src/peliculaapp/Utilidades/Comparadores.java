/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculaapp.Utilidades;

import Entidad.Peliculas;
import java.util.Comparator;





/**
 *
 * @author Equipo
 */
public class Comparadores {
       
    public static Comparator<Peliculas> ordenarMay = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return Double.compare(t1.getDuracion(), t.getDuracion());
            
        }
    };
    
 public static Comparator<Peliculas> ordenarMen = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return Double.compare(t.getDuracion(), t1.getDuracion());
        }
    };
 
  public static Comparator<Peliculas> ordenarTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
 
 public static Comparator<Peliculas> ordenarDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
 
 
}
