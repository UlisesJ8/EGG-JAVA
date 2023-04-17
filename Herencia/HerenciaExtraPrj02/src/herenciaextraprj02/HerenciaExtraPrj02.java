/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaextraprj02;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Servicio.servicioEdificio;
import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class HerenciaExtraPrj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioEdificio serv = new servicioEdificio();
        ArrayList<Edificio> lista = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
        
        Edificio polideportivo = serv.crearPolideportivo();
        lista.add(polideportivo);
        Edificio edificioDeOf = serv.crearEdificioDeOficinas();
        lista.add(edificioDeOf);
            
            
        }
        
        for (Edificio edificio : lista) {
            System.out.println(edificio.toString());          
            edificio.calcularSuperficie(edificio.getAncho(), edificio.getAlto(), edificio.getLargo());
            edificio.calcularVolumen(edificio.getAncho(), edificio.getAlto(), edificio.getLargo());
            
            if (edificio instanceof EdificioDeOficinas){
            ((EdificioDeOficinas) edificio).cantPersonas(); 
            }
        }
 
       
        
        
    }
    
}
