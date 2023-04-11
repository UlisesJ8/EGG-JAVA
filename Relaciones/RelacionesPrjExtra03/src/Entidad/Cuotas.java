/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Cuotas {
    private Poliza poli;
    private int[] numeroCuota = new int[poli.getCantidadC()];
    private double MontoTotal;
    private boolean Pago;
    private String fechaVencimiento;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(Poliza poli, double MontoTotal, boolean Pago, String fechaVencimiento, String formaPago) {
        this.poli = poli;
        this.MontoTotal = poli.getMontoTotal() / poli.getCantidadC();
        this.Pago = Pago;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = poli.getFormaPago();
    }

    public Poliza getPoli() {
        return poli;
    }

    public void setPoli(Poliza poli) {
        this.poli = poli;
    }

    public int[] getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int[] numeroCuota) {
        for (int i = 1; i < poli.getCantidadC(); i++) {
            numeroCuota[i] = i;
            this.numeroCuota[i] = numeroCuota[i];
        }
    }

    public double getMontoTotal() {
        return MontoTotal ;
    }

    public void setMontoTotal(double MontoTotal) {
        this.MontoTotal = poli.getMontoTotal() / poli.getCantidadC();
    }

    public boolean getPago() {
        return Pago;
    }

    public void setPago(boolean Pago) {
        this.Pago = Pago;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = poli.getFormaPago();
    }

    @Override
    public String toString() {
        return "Cuotas{" + "poli=" + poli + ", numeroCuota=" + numeroCuota + ", MontoTotal=" + MontoTotal + ", Pago=" + Pago + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
    
    
    
    
}
