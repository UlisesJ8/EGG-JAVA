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
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private String domicilio;
    private int telefono;
    private ArrayList<Vehiculo> autos;
    private ArrayList<Poliza> poli;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int dni, String email, String domicilio, int telefono, ArrayList<Vehiculo> autos, ArrayList<Poliza> poli) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.autos = autos;
        this.poli = poli;
    }

    public ArrayList<Poliza> getPoli() {
        return poli;
    }

    public void setPoli(ArrayList<Poliza> poli) {
        this.poli = poli;
    }

    public ArrayList<Vehiculo> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Vehiculo> autos) {
        this.autos = autos;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", email=" + email + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
}
