/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class Poliza {
    private Vehiculo autos;
    private int numeroPoliza;
    private String fechaInicio;
    private String fechaFin;
    private int cantidadC;
    private String formaPago;
    private double montoTotal;
    private boolean incluyeGranizo;
    private double montonMaxGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo autos, int numeroPoliza, String fechaInicio, String fechaFin, int cantidadC, String formaPago, double montoTotal, boolean incluyeGranizo, double montonMaxGranizo, String tipoCobertura) {
        this.autos = autos;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadC = cantidadC;
        this.formaPago = formaPago;
        this.montoTotal = montoTotal;
        this.incluyeGranizo = incluyeGranizo;
        this.montonMaxGranizo = montonMaxGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }


    public Vehiculo getAutos() {
        return autos;
    }

    public void setAutos(Vehiculo autos) {
        this.autos = autos;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadC() {
        return cantidadC;
    }

    public void setCantidadC(int cantidadC) {
        this.cantidadC = cantidadC;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontonMaxGranizo() {
        return montonMaxGranizo;
    }

    public void setMontonMaxGranizo(double montonMaxGranizo) {
        this.montonMaxGranizo = montonMaxGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{ autos=" + autos + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantidadC=" + cantidadC + ", formaPago=" + formaPago + ", incluyeGranizo=" + incluyeGranizo + ", montonMaxGranizo=" + montonMaxGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
    
    
}
