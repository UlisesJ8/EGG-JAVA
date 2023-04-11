/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesprj02;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.revolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class RelacionesPrj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador player = new Jugador();
        revolverDeAgua revolver = new revolverDeAgua();
        Juego game = new Juego();
        game.llenarJuego();
        game.jugar();
       
    }
    
}
