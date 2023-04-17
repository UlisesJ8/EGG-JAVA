/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author Equipo
 */
public class Alquiler {
   protected String nombre;
    protected int dni;
    protected LocalDate dia;
    protected LocalDate vencimiento;
    protected int posicion;
    protected Barco barco;

    public Alquiler(String nombre, int dni, LocalDate dia, LocalDate vencimiento, int posicion, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.dia = dia;
        this.vencimiento = vencimiento;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler " + "nombre=" + nombre + ", dni=" + dni + ", dia=" + dia + ", vencimiento=" + vencimiento + ", posicion=" + posicion;
    }
    
    
    
    
    
    
    
}
