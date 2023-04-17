/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaces.CalculosFormas;

/**
 *
 * @author Equipo
 */
public final class Circulo<T> implements CalculosFormas {

    private double radio;
    private double diametro;
    private double pi = Math.PI;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double perimetro() {
        double perimetro = pi* diametro;
         return perimetro;
    }

    @Override
    public double area() {
        double area = Math.pow((pi*radio),2);
        return area;
    }
    
    

    
    
    
    
}
