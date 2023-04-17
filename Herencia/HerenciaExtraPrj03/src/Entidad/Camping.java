/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Camping extends AlojamientoExtrahotelero{
    private int capacidadCarpas;
    private int cantidadBanios;
    private boolean restaurante;

    public Camping(int capacidadCarpas, int cantidadBanios, boolean restaurante, String privacidad, double mtsCuadrados) {
        super(privacidad, mtsCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public Camping() {
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
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
        return "Camping{" + "capacidadCarpas=" + capacidadCarpas + ", cantidadBanios=" + cantidadBanios + ", restaurante=" + restaurante + '}';
    }

  
    
    
    
}
