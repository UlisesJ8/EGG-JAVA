/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.meses;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioMeses {
    Scanner reader = new Scanner(System.in);
   
  public meses cargarMeses(){
       
   meses cargados = new meses();
   String mesesCargados[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
   cargados.setCompleto(mesesCargados);
   
   return cargados;
   } 
   
   public void adivinarMes(meses cargados){
       boolean adivino = false;
       System.out.println("Adivine el mes del año:");
       String mesIngresado = reader.nextLine();
       
       do{
           
        if(mesIngresado.equalsIgnoreCase(cargados.getMesSecreto())){
            
            adivino = true;
            break;
        }else{
            System.out.println("Error. Usted no adivino el mes");
            System.out.println("Ingrese nuevamente el mes");
            mesIngresado = reader.nextLine();
        }
        
          
        }while(adivino == false);
       
       System.out.println("Usted adivino!! Felicitacioness.");
       
   }
   
   
   
   
    
}
