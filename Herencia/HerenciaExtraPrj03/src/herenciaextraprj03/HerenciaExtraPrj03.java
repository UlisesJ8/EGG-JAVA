/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaextraprj03;

import Entidad.AlojamientoExtrahotelero;
import Entidad.Hoteles;
import Servicio.servicioCompania;
import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class HerenciaExtraPrj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioCompania serv = new servicioCompania();
        ArrayList<Hoteles> listahoteles = new ArrayList<>();
        ArrayList<AlojamientoExtrahotelero> listaAlojamiento = new ArrayList<>();
        
        Hoteles hotel4 = serv.crearHotel4Estrellas();
        Hoteles hotel5 = serv.crearHotel5Estrellas();
        AlojamientoExtrahotelero camping = serv.crearCamping();
        AlojamientoExtrahotelero residencia = serv.crearResidencia();
        
        
        
        
    }
    
}
