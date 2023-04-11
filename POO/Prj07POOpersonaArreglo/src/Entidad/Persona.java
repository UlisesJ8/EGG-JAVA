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
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private boolean edadM;
    private int nIMC;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura, boolean edadM, int nIMC) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edadM = edadM;
        this.nIMC = nIMC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isEdadM() {
        return edadM;
    }

    public void setEdadM(boolean edadM) {
        this.edadM = edadM;
    }

    public int getnIMC() {
        return nIMC;
    }

    public void setnIMC(int nIMC) {
        this.nIMC = nIMC;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", edadM=" + edadM + ", nIMC=" + nIMC + '}';
    }
    
    
    
    
    
}
