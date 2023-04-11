/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj09poomatematica;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Equipo
 */
public class Prj09POOmatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ser = new MatematicaServicio();
        Matematica ma = ser.crearNumero();
        
        ser.devolverMayor(ma);
        ser.calcularPotencia(ma);
        ser.CalcularRaiz(ma);
        
        
        
        
        
        
        
    }
    
}
