/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Raices {
    private double a;
    private double b;
    private double c;
    private double discriminante1;

    public Raices() {
    }

    public Raices(double a, double b, double c, double discriminante1) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante1 = discriminante1;
    }

    public double getDiscriminante1() {
        return discriminante1;
    }

    public void setDiscriminante1(double discriminante1) {
        this.discriminante1 = discriminante1;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    
    
    
    
    
    
    
    
    
}
