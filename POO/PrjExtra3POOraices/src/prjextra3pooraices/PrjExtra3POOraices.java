/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjextra3pooraices;

import Entidad.Raices;
import Servicio.servicioRaices;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PrjExtra3POOraices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        servicioRaices numeros = new servicioRaices();
        Raices valores = numeros.getDiscriminante();     
        numeros.calcular(valores);

        
    }
    
}
