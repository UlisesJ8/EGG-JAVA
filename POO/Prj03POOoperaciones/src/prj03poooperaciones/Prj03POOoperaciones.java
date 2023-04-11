/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj03poooperaciones;

import Servicio.ServicioOperacion;
import Entidad.Operacion;
/**
 *
 * @author Equipo
 */
public class Prj03POOoperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioOperacion nums = new ServicioOperacion();
        Operacion numeros1 = nums.CrearOperacion();
        nums.sumar(numeros1);
        nums.restar(numeros1);
        nums.multiplicar(numeros1);
        nums.dividir(numeros1);
 
        
        
        
        
        
        
    }
    
}
