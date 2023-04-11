/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class VendedorServicio {

    public Vendedor altaVendedor() {
        Vendedor v1 = new Vendedor();
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor:");
        v1.setNombre(reader.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(reader.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(reader.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar el vendedor");
        int dia = reader.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar el vendedor");
        int mes = reader.nextInt();
        System.out.println("Ingrese el anio que comenzo a trabajar el vendedor");
        int anio = reader.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        v1.setFechaIncio(fecha);
        return v1;
    }
    
    public void SueldoMensual (Vendedor v1){
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        double ventas = reader.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getComisiones() + v1.getSueldoBasico());
        System.out.println("el sueldo mensual del vendedor: "
                + v1.getNombre()+ " es de $ "+ v1.getSueldoMensual());
 
    }
    
    public void vacaciones(Vendedor v1){
    Date hoy = new Date();
    int antiguedad = hoy.getYear() - v1.getFechaIncio().getYear();
    
        if (antiguedad < 5) {
            System.out.println("Le corresponder 14 dias de vacaciones");
        }else if(antiguedad < 10){
        System.out.println("Le corresponder 21 dias de vacaciones");
        }else if(antiguedad < 20){
        System.out.println("Le corresponder 28 dias de vacaciones");
        }else if(antiguedad > 20){
        System.out.println("Le corresponder 35 dias de vacaciones");
        }else {
        System.out.println("El empleado tiene vacaciones proporcionales");
        }

    }

}
