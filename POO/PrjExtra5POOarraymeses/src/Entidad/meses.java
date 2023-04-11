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
public class meses {
    private String[] completo = new String[11];
    private String mesSecreto;

    public meses() {
    }

    public meses(String[] completo, String mesSecreto) {
        this.completo = completo;
        this.mesSecreto = completo[10];
    }

    public String[] getCompleto() {
        return completo;
    }

    public void setCompleto(String[] completo) {
        this.completo = completo;
    }

    public String getMesSecreto() {
        return mesSecreto = completo[10];
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = completo[10];
    }
    
    
}
