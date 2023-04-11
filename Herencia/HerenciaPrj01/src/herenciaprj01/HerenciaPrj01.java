/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaprj01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Equipo
 */
public class HerenciaPrj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        //Declaracion de otro objeto Perro
        Animal perro2 = new Perro("Pelusa", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        //Declaracion del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        //Declaracion del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }
    
}
