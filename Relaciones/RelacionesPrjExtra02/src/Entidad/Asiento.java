/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class Asiento {
    private String ubicacion;
    private Espectador espectador;

    public Asiento(String ubicacion, Espectador espectador) {
        this.ubicacion = ubicacion;
        this.espectador = espectador;
    }

    public Asiento() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        String ocupacion = ubicacion.toString();
                if(espectador == null){
                 ocupacion = ocupacion.concat("   |");
                }else{
                 ocupacion = ocupacion.concat(" X |");
                }
                return ocupacion;
    }
    
    
    
    
}
