/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Residencias extends AlojamientoExtrahotelero{
    private int cantidadHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(int cantidadHabitaciones, boolean descuentoGremio, boolean campoDeportivo, String privacidad, double mtsCuadrados) {
        super(privacidad, mtsCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String getPrivacidad() {
        return privacidad;
    }

    @Override
    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    @Override
    public double getMtsCuadrados() {
        return mtsCuadrados;
    }

    @Override
    public void setMtsCuadrados(double mtsCuadrados) {
        this.mtsCuadrados = mtsCuadrados;
    }

    @Override
    public String toString() {
        return "Residencias: "+ "privacidad = " + privacidad + ", mtsCuadrados = " + mtsCuadrados +  ", cantidadHabitaciones = " + cantidadHabitaciones + ", descuentoGremio = " + descuentoGremio + ", campoDeportivo = " + campoDeportivo;
    }
    
    
    
    
    
}
