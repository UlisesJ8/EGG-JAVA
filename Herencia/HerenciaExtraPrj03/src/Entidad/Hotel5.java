/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Hotel5 extends Hotel4{
    private int cantidadSalonesConfe;
    private  int cantidadSuites;
    private double cantidadLimosinas;

    public Hotel5(int cantidadSalonesConfe, int cantidadSuites, double cantidadLimosinas, String gimnasio, String nombreDelRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroDeCamas, int cantidadPisos, double precioHabitacion) {
        super(gimnasio, nombreDelRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroDeCamas, cantidadPisos, precioHabitacion);
        this.cantidadSalonesConfe = cantidadSalonesConfe;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConfe() {
        return cantidadSalonesConfe;
    }

    public void setCantidadSalonesConfe(int cantidadSalonesConfe) {
        this.cantidadSalonesConfe = cantidadSalonesConfe;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public double getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(double cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
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
        return "Hotel5{" + "cantidadSalonesConfe=" + cantidadSalonesConfe + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + '}';
    }
    
    
    
    
    
    
}
