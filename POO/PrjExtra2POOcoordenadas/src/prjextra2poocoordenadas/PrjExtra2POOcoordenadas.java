/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjextra2poocoordenadas;

import Entidad.Puntos;
import Servicio.puntosServicio;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PrjExtra2POOcoordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        puntosServicio coordenada = new puntosServicio(); 
        Puntos coor = coordenada.crearPuntos();
        
        coordenada.calcularDistancia();
        
        
        
        
    }
    
}
