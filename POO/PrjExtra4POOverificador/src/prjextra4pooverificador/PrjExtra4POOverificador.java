/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjextra4pooverificador;

import Entidad.NIF;
import Servicio.servicioNIF;

/**
 *
 * @author Equipo
 */
public class PrjExtra4POOverificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioNIF usuario = new servicioNIF();
        NIF usu = usuario.crearNif();
        
        usuario.mostrar(usu);
        
        
        
    }
    
}
