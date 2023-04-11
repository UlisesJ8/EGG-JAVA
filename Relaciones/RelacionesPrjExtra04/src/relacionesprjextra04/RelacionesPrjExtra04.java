/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesprjextra04;

import Entidad.Alumno;
import Entidad.Simulador;
import Entidad.Voto;
import java.util.ArrayList;
/**
 *
 * @author Equipo
 */
public class RelacionesPrjExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno estudiante = new Alumno();
       Simulador sim = new Simulador();
       Voto vot = new Voto();
       ArrayList<String> nombre = sim.nombre();
       ArrayList<String> apellido = sim.apellido();
       ArrayList<String> nombreCompleto = sim.nombreCompleto(nombre, apellido);
       ArrayList<Integer> dnis = sim.generarDNI(nombreCompleto);
       ArrayList<Alumno> lista = sim.llenarAleatorio(nombreCompleto, dnis);
       
       sim.imprimirAlumnos(lista);
      
       
       ArrayList<Voto> votando = sim.votacion(lista);
       
       sim.mostrarAlum(lista, votando);
       sim.recuentoVotos(lista);
       sim.facilitadores(lista);
       
       
       
    }
    
}
