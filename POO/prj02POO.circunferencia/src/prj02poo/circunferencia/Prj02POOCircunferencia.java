/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj02poo.circunferencia;

import CircunferenciaServicio.CircunferenciaServicio;
import Entidad.Circunferencia;
/**
 *
 * @author Equipo
 */
public class Prj02POOCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio cir1 = new CircunferenciaServicio();
        Circunferencia cir = cir1.crearCircunferencia();
        cir1.calcularArea(cir);
        cir1.calcularPerimetro(cir);
        
        
        
    }
    
}
