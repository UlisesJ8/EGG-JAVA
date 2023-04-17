/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioBarco;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcosMotor;
import Entidad.Veleros;
import Entidad.Yates;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioBarco {
    ArrayList<Alquiler> lista = new ArrayList<>();
    Scanner reader = new Scanner(System.in);
    
    public Alquiler datosCliente(){  // metodo para ingresar los datos del alquiler y para guardar el barco que ocupara el amarre
        boolean flag = false;
        System.out.println("Ingrese el DNI del cliente:");
        int dni = reader.nextInt();
        reader.nextLine();
        
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = reader.nextLine();
        
        LocalDate diaAlquiler = null;
        do{  /// bucle do while para validar que la fecha ingresada este dentro de rangos validos es decir que se antes del dia de hoy o es valido el numero ingresado para dia, mes y anio
            System.out.println("Ingrese el dia , mes y anio que alquilo el amarre");
            int dia = reader.nextInt(); int mes = reader.nextInt(); int anio = reader.nextInt(); 
            try {
                diaAlquiler = LocalDate.of(anio, mes, dia);
                flag = true;
            
            } catch (Exception e) {
                flag = false;
            }
            
        }while(flag == false || diaAlquiler.isAfter(LocalDate.now()));
                
        
        flag = false;
        LocalDate diaDevolucion = null;
        do{ // bucle do while generado para validar si la fecha ingresada es correcta 
        System.out.println("Ingrese la fecha de devolucion: ");
        int dia1 = reader.nextInt(); int mes1 = reader.nextInt(); int anio1 = reader.nextInt();
            try {
                diaDevolucion = LocalDate.of(anio1, mes1, dia1);
                flag = true;
            } catch (Exception e) {
                flag = false;
            }
        
        }while(flag == false);
        
        System.out.println("Ingrese posicion del amarre: ");
        int posicion = reader.nextInt();
        
        
        Barco barco = menuBarco();
        Alquiler alquila = new Alquiler(nombre, dni, diaAlquiler, diaDevolucion, posicion, barco);
        lista.add(alquila);
        VerificarFechaDeAlquiler(lista);
        return alquila; 
    
    }
    
    private void VerificarFechaDeAlquiler(ArrayList<Alquiler>lista){ // Metodo para comprobar si la fecha ingresada por el usuario de un posible segundo barco  es igual a la de otro en la posicion del amarre, para evitar que se ocupen dos amarres juntos 
        for (int i = 0; i < lista.size(); i++) {
            LocalDate fechaIncio = lista.get(i).getDia();
            LocalDate fechaFin = lista.get(i).getVencimiento();
            
            for (int j = i+1 ; j < lista.size(); j++) {
                
                if(lista.get(j).getDia().isAfter(fechaIncio) && lista.get(j).getDia().isBefore(fechaFin) || lista.get(j).getVencimiento().isAfter(fechaIncio) && lista.get(j).getVencimiento().isBefore(fechaFin) ){
                    if(lista.get(i).getPosicion() == lista.get(j).getPosicion()){      
                        do{
                        System.out.println("La posicion ingresada ya se encuentra ocupada en esa fecha por otro Barco, por favor ingrese otra posicion");
                        lista.get(j).setPosicion(reader.nextInt());
                        }while(lista.get(i).getPosicion() == lista.get(j).getPosicion());
                    }    
                }
                
            }
            
        }
        
        
        
        
    }
    
    
       private Barco datosDeIngreso() { // creo un metodo que devuelva los atributos generales de un barco y lo creo privado para que no se acceda desde otro paquete.
        System.out.println("Ingrese la matricula del barco: ");
        String matricula = reader.next();
        System.out.println("Ingrese la eslora en mts del barco: ");
        int eslora = reader.nextInt();
        System.out.println("Ingrese el anio de fabricacion: ");
        int anio = reader.nextInt();
        Barco barco = new Barco(matricula, eslora, anio);
        return barco;
    }


    
    
    private Barco menuBarco() { // metodo para crear un menu de barco e ingresar datos del barco correspondiendo la opcion ingresada.
        int op ;
        boolean flag = true;
        Barco barco = datosDeIngreso();
        do {
            System.out.println("Ingrese la opcion del barco que desea crear:");
            System.out.println("1.VELERO");
            System.out.println("2.BARCO A MOTOR");
            System.out.println("3.YATE");
            op = reader.nextInt();
            switch (op) {
                case 1:  
                    System.out.println("Cuantos mastiles tiene el velero?");
                    int mastil = reader.nextInt();
                    flag = false; 
                    barco = new Veleros(mastil, barco.getMatricula(), barco.getEslora(), barco.getAnioFabricacion());
                    break;
                case 2:
                    System.out.println("Ingrese la potencia del motor en CV");
                    int CV = reader.nextInt();
                    flag = false;
                    barco = new BarcosMotor(CV, barco.getMatricula(), barco.getEslora(), barco.getAnioFabricacion());
                    break;
                case 3:
                    System.out.println("Ingrese la potencia del motor en CV");
                    int CVyates = reader.nextInt();
                    System.out.println("Ingrese el numero de camarotes");
                    int camarotes = reader.nextInt();
                    flag = false;
                    barco = new Yates(CVyates, camarotes, barco.getMatricula(), barco.getEslora(), barco.getAnioFabricacion());
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
            
        } while (flag == true);
        
      return barco;
        
    }
    
    public double calcularAlquiler(Barco barco, Alquiler alquila){
    double precioAlquiler = 0;
    long diferencia;
    diferencia = ChronoUnit.DAYS.between(alquila.getDia(), alquila.getVencimiento());
    if(barco instanceof Veleros){
    precioAlquiler = (diferencia * (barco.getEslora()*10)) + ((Veleros) barco).getMastiles();
   
    }
    if(barco instanceof BarcosMotor){
    precioAlquiler = (diferencia * (barco.getEslora()*10)) + ((BarcosMotor) barco).getPotenciaMotor();
    
    }
    if(barco instanceof Yates) {
    precioAlquiler = (diferencia * (barco.getEslora()*10)) + ((Yates) barco).getPotenciaCV() + ((Yates) barco).getNumeroCamarotes();
    }
    
    return precioAlquiler;
    }
    
    
    

}
