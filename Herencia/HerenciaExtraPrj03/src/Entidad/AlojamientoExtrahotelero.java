/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class AlojamientoExtrahotelero {
    protected String privacidad;
    protected double mtsCuadrados;

    public AlojamientoExtrahotelero() {
    }

    public AlojamientoExtrahotelero(String privacidad, double mtsCuadrados) {
        this.privacidad = privacidad;
        this.mtsCuadrados = mtsCuadrados;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public double getMtsCuadrados() {
        return mtsCuadrados;
    }

    public void setMtsCuadrados(double mtsCuadrados) {
        this.mtsCuadrados = mtsCuadrados;
    }

    @Override
    public String toString() {
        return "AlojamientoExtrahotelero{" + "privacidad=" + privacidad + ", mtsCuadrados=" + mtsCuadrados + '}';
    }
    
}
