/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj04poorectangulo;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author Equipo
 */
public class Prj04POOrectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RectanguloServicio r1 = new RectanguloServicio();
       Rectangulo rec = r1.cargarDatos();
       r1.calcularPerimetro(rec);
       r1.calcularSuperficie(rec);
       r1.dibujarRectangulo(rec);
       
       
       
    }
    
}
