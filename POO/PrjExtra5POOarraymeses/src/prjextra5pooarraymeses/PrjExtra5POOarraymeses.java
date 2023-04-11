/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjextra5pooarraymeses;

import Entidad.meses;
import Servicio.servicioMeses;

/**
 *
 * @author Equipo
 */
public class PrjExtra5POOarraymeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       servicioMeses mesSecreto = new servicioMeses();
       meses mesS = mesSecreto.cargarMeses();
       
       mesSecreto.adivinarMes(mesS);
       
       
       
       
    }
    
}
