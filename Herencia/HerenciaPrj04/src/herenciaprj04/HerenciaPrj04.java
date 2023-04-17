/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaprj04;

import Entidad.Circulo;
import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class HerenciaPrj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        double radio = reader.nextDouble();
        System.out.println("Ingrese el diametro del circulo");
        double diametro = reader.nextDouble();
        
        Circulo circle = new Circulo(radio, diametro);
        double area = circle.area();
        double perimetro = circle.perimetro();
        System.out.println("El area es: " + area + " y el perimetro es: " + perimetro);
        System.out.println("Ingrese la base del rectangulo");
        double base = reader.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = reader.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        area = rectangulo.area();
        perimetro = rectangulo.perimetro();
        System.out.println("El area es: "+area  +" y el perimetro es: "+ perimetro);
    }
    
}
