/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Hotel4 extends Hoteles{
    private String gimnasio;
    private String nombreDelRestaurante;
    private int capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreDelRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroDeCamas, int cantidadPisos, double precioHabitacion) {
        super(cantidadHabitaciones, numeroDeCamas, cantidadPisos, precioHabitacion);
        this.gimnasio = gimnasio;
        this.nombreDelRestaurante = nombreDelRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreDelRestaurante() {
        return nombreDelRestaurante;
    }

    public void setNombreDelRestaurante(String nombreDelRestaurante) {
        this.nombreDelRestaurante = nombreDelRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    @Override
    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    @Override
    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    @Override
    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    @Override
    public int getCantidadPisos() {
        return cantidadPisos;
    }

    @Override
    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    @Override
    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "Hotel4: " + " cantidadHabitaciones= "  + cantidadHabitaciones + ", numeroDeCamas = " + numeroDeCamas + ", cantidadPisos = " + cantidadPisos + ", precioHabitacion = "  + precioHabitacion + ", gimnasio = " + gimnasio + ", nombreDelRestaurante = " + nombreDelRestaurante + ", capacidadRestaurante = " + capacidadRestaurante;
    }

   
            
            
            
            
            
            
            
}
