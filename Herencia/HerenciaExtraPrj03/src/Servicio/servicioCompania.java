/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.AlojamientoExtrahotelero;
import Entidad.Camping;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Hoteles;
import Entidad.Residencias;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioCompania {

    Scanner reader = new Scanner(System.in);

    private Hoteles crearHotel() {
        System.out.println("Ingrese la cantidad de pisos del hotel: ");
        int cantidadPisos = reader.nextInt();
        System.out.println("Ingrese la cantidad de habitaciones del hotel: ");
        int cantidadHabitaciones = reader.nextInt();
        System.out.println("Ingrese la cantidad de camas del hotel: ");
        int numeroDeCamas = reader.nextInt();

        Hoteles hotel = new Hoteles(cantidadHabitaciones, numeroDeCamas, cantidadPisos, 0);
        return hotel;
    }

    private AlojamientoExtrahotelero crearExtra() {
        String op = "";
        do {
            System.out.println("Es pivado o no (si/no)? ");
            op = reader.next();
        } while (!op.equalsIgnoreCase("no") && !op.equalsIgnoreCase("si"));

        System.out.println("Indicar la cantidad de metros cuadrados del lugar: ");
        double cantidadMts = reader.nextDouble();
        AlojamientoExtrahotelero aloja = new AlojamientoExtrahotelero(op, cantidadMts);
        return aloja;
    }

    public Hotel4 crearHotel4Estrellas() {
        String gym = "";
        Hoteles hot = crearHotel();
        do {
            System.out.println("Ingrese que gimnasio es 'A' o 'B': ");
            gym = reader.next();
        } while (!gym.equalsIgnoreCase("a") && !gym.equalsIgnoreCase("b"));
        reader.nextLine();
        System.out.println("Ingrese el nombre del restaurante: ");
        String nombreResta = reader.nextLine();
        System.out.println("Ingrese la capacidad del restaurante");
        int cantidadResta = reader.nextInt();
        double precioHabitacion = 50 + (hot.getCantidadPisos() * hot.getCantidadHabitaciones() * hot.getNumeroDeCamas());

        if (cantidadResta < 30) {
            precioHabitacion = precioHabitacion + 10;
        } else if (cantidadResta >= 30 && cantidadResta <= 50) {
            precioHabitacion = precioHabitacion + 30;
        } else {
            precioHabitacion = precioHabitacion + 50;
        }

        if (gym.equalsIgnoreCase("a")) {
            precioHabitacion = precioHabitacion + 50;
        } else {
            precioHabitacion = precioHabitacion + 30;
        }

        Hoteles hotelfour = new Hotel4(gym, nombreResta, cantidadResta, hot.getCantidadHabitaciones(), hot.getNumeroDeCamas(), hot.getCantidadPisos(), precioHabitacion);
        return (Hotel4) hotelfour;

    }

    public Hotel5 crearHotel5Estrellas() {
        Hotel4 hot = crearHotel4Estrellas();
        System.out.println("Ingrese la cantidad de salones de conferencia:");
        int cantidadSalon = reader.nextInt();
        System.out.println("Ingrese la cantidad de Suites: ");
        int cantidadSuites = reader.nextInt();
        System.out.println("Ingrese la cantidad de limosinas: ");
        int limo = reader.nextInt();
        double precioHab = hot.getPrecioHabitacion() + (15 * limo);
        Hoteles hotelFive = new Hotel5(cantidadSalon, cantidadSuites, limo, hot.getGimnasio(), hot.getNombreDelRestaurante(), hot.getCapacidadRestaurante(), hot.getCantidadHabitaciones(), hot.getNumeroDeCamas(), hot.getCantidadPisos(), precioHab);
        return (Hotel5) hotelFive;
    }
    
    public Camping crearCamping(){
    AlojamientoExtrahotelero aloja = crearExtra();
        System.out.println("Ingrese la capacidad maxima de carpas");
        int carpas = reader.nextInt();
        System.out.println("Ingrese la cantidad de banios: ");
        int banios = reader.nextInt();
        boolean restaurante = true;
        String op = "";
        do{
            System.out.println("Hay restaurante en el camping? (si/no)");
            op = reader.nextLine();
        }while(!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("si"));
        
        if(op.equalsIgnoreCase("si")){
        restaurante = true;
        }else{
        restaurante = false;
        }
        
        AlojamientoExtrahotelero camping = new Camping(carpas, banios, restaurante, aloja.getPrivacidad(), aloja.getMtsCuadrados());
        return (Camping) camping;
    }
    
    
    public Residencia crearResidencia(){
    AlojamientoExtrahotelero alojamiento = crearExtra();
        System.out.println("Ingrese la cantidad de habitaciones de la residencia: ");
        int cantidadHab = reader.nextInt();
        boolean gremio = true;
        String op = "";
        do{
            System.out.println("Se hacen descuentos a gremios? (si/no)");
            op = reader.nextLine();
        }while(!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
        if (op.equalsIgnoreCase(op)) {
            
        } else {
        }
        
    AlojamientoExtrahotelero residencia = new Residencias(0, true, true, alojamiento.getPrivacidad(), alojamiento.getMtsCuadrados());
    return residencia;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
