/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class movilServicio {
    Scanner reader = new Scanner(System.in);
    Movil celu = new Movil();
    
    public Movil cargarCelular(){
        System.out.println("Ingrese la marca del Celular");
        celu.setMarca(reader.nextLine());
        System.out.println("Ingrese precio del celular");
        celu.setPrecio(reader.nextDouble());
        System.out.println("Ingrese el modelo del celular");
        celu.setModelo(reader.next());
        System.out.println("Ingrese la memoria Ram del celular");
        celu.setMemoriaRam(reader.nextInt());
        System.out.println("Ingrese el almacenamiento del celular");
        celu.setAlmacenamiento(reader.nextInt());

        return celu;
    }
    
    public void ingresarCodigo(Movil celu){
        System.out.println("Ingrese el codigo del celuar(el codigo es de 7 dimensiones)");
        int[] arrayCod = new int[7];
        int cod;
        int resta = 0;
        boolean flag = false;
        
        do{
            cod = reader.nextInt();
            if (cod < 10000000 && cod > 999999 || cod == 0000000) {
            flag = true;
                for (int i = 6; i >= 0; i--) {
                    resta = cod % 10;
                    cod = cod / 10;
                    arrayCod[i] = resta;
                }
            }else{
            flag = false;
            }
            
        }while(flag == false);
         
        celu.setCodigo(arrayCod);
        
    
        
    }
    
    public void imprimirDatos(Movil celu){
        int[] array = new int[7];
        array = celu.getCodigo();
        System.out.println("El celular ingresado es: " + celu.getMarca());
        System.out.println("El precio del celular es: "+ celu.getPrecio());
        System.out.println("El modelo del celular es: "+ celu.getModelo());
        System.out.println("La memoria Ram es de : "+ celu.getMemoriaRam());
        System.out.println("El almacenamiento del celular es: "+ celu.getAlmacenamiento());
        System.out.print("El codigo es: ");
        for (int i = 0; i < 7; i++) {
            System.out.print("["+array[i]+ "]");
        }
        System.out.println(" ");
    }
    
    
}
