/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaextraprj03;

import Entidad.AlojamientoExtrahotelero;
import Entidad.Camping;
import Entidad.Hoteles;
import Entidad.Residencias;
import Servicio.servicioCompania;
import Utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collections;

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
        System.out.println("Creando HOTEL 4 ESTRELLAS");
        Hoteles hotel4 = serv.crearHotel4Estrellas();
        System.out.println("Creando HOTEL 5 ESTRELLAS");
        Hoteles hotel5 = serv.crearHotel5Estrellas();
        AlojamientoExtrahotelero camping = serv.crearCamping();
        AlojamientoExtrahotelero residencia = serv.crearResidencia();
        
        listahoteles.add(hotel4);
        listahoteles.add(hotel5);
        listaAlojamiento.add(camping);
        listaAlojamiento.add(residencia);
        
        
        System.out.println("Mostrando todos los alojamientos: ");
        System.out.println(hotel4.toString());
        System.out.println(hotel5.toString());
        System.out.println(camping.toString());
        System.out.println(residencia.toString());
        Comparador compara = new Comparador();
        
        System.out.println("Mostrando hoteles de mas caros a mas baratos ");
        Collections.sort(listahoteles, compara.ordenarMayor);
        for (Hoteles aux : listahoteles) {
            
            System.out.println(aux.toString());
        
        }
        
        
        
        System.out.println("Mostrando los campings con restaurante: ");
        for (AlojamientoExtrahotelero aux2 : listaAlojamiento) {
            
            if(aux2 instanceof Camping){
                if (((Camping) aux2).isRestaurante() == true) {
                    System.out.println(aux2.toString());
                }
            
            }
            
        }
        
        
        System.out.println("Mostrando las residencias que tiene descuento con los gremios: ");
        
        for (AlojamientoExtrahotelero aux3 : listaAlojamiento) {
            
            if(aux3 instanceof Residencias){
                if (((Residencias) aux3).isDescuentoGremio() == true) {
                    System.out.println(aux3.toString());
                }
            
            }
            
        }
        
    }
    
}
