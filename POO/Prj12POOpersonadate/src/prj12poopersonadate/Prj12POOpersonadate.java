/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj12poopersonadate;

import Entidad.persona;
import Servicio.personaServicio;

/**
 *
 * @author Equipo
 */
public class Prj12POOpersonadate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaServicio humano = new personaServicio();
        persona hum = humano.crearPersona();
        
        humano.calcularEdad(hum);
        humano.calcularEdad(hum);
        humano.menorQue(hum, 20);
        humano.mostrarPersona(hum);
    }
    
}
