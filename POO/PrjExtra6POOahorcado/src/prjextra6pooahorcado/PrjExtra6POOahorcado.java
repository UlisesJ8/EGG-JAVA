/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjextra6pooahorcado;

import Entidad.ahorcado;
import Servicio.servicioAhorcado;

/**
 *
 * @author Equipo
 */
public class PrjExtra6POOahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioAhorcado juego = new servicioAhorcado();
        ahorcado game = juego.crearJuego();        
         
        juego.juego(game);
                
                
    }
    
}
