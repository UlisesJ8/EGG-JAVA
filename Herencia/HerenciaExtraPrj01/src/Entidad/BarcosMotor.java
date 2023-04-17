/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Equipo
 */
public class BarcosMotor extends Barco{
   private int potenciaMotor;

    public BarcosMotor() {
    }

    public BarcosMotor(int potenciaMotor, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaMotor = potenciaMotor;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "BarcosMotor{" + "potenciaMotor=" + potenciaMotor + '}';
    }
   
   
   
   
}
