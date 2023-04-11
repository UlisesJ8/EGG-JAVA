/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj14pootienda;

import Entidad.Movil;
import Servicio.movilServicio;

/**
 *
 * @author Equipo
 */
public class Prj14POOtienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        movilServicio celular = new movilServicio();
        Movil celu = celular.cargarCelular();
   
        celular.ingresarCodigo(celu);
        
        celular.imprimirDatos(celu);
        
        
        
    }
    
}
