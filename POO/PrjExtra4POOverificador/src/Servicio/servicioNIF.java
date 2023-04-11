/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioNIF {
   Scanner reader = new Scanner(System.in);
    
   public NIF crearNif(){
        NIF usuario = new NIF();
        System.out.println("Ingrese su DNI(Sin puntos)");
        usuario.setDNI(reader.nextInt());
        int resto = usuario.getDNI()% 23;
        String letra[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        for (int i = 0; i < 23; i++) {
           if(resto == i){
               usuario.setLetra(letra[i]);
               break;
           }
        }
    
    
    
    
    return usuario;
    }
    
    public void mostrar(NIF usuario){
    
        System.out.println(usuario.getDNI() + "-" + usuario.getLetra());
    
    
    
    }
    
}
