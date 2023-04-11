/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumaracion;

/**
 *
 * @author Equipo
 */
public enum Columna {
    A("A"), B("B"), C("C"), D("D") , E("E") , F("F"); 
    private String Columna;

    private Columna() {
    }

    private Columna(String Columna) {
        this.Columna = Columna;
    }

    public String getColumna() {
        return Columna;
    }

    public void setColumna(String Columna) {
        this.Columna = Columna;
    }
     
    
    
}
