/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Hoteles {

    protected int cantidadHabitaciones;
    protected int numeroDeCamas;
    protected int cantidadPisos;
    protected double precioHabitacion;

    public Hoteles() {
    }

    public Hoteles(int cantidadHabitaciones, int numeroDeCamas, int cantidadPisos, double precioHabitacion) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public int compare(Hoteles h, Hoteles h2) {
            return Double.compare(h.getPrecioHabitacion(), h2.getPrecioHabitacion());
            
        }

    @Override
    public String toString() {
        return "Hoteles{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroDeCamas=" + numeroDeCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

}
