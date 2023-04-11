/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesprjextra02;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Servicio.cineServicio;
import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class RelacionesPrjExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cineServicio ser = new cineServicio();
        ArrayList<Espectador>lista = ser.crearEspectadores();
        Cine cinema = ser.llenarSala(lista);
        ser.mostrarPelicula(cinema);
        ser.espectadoresIngresados(cinema);
        System.out.println("SALA DE LA PELICULA!");
        ser.mostrarCine(cinema);
      
       
    }
    
}
