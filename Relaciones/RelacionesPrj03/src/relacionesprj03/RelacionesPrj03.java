/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesprj03;

import Entidad.barajaCartas;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class RelacionesPrj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        barajaCartas mazo = new barajaCartas();
        Scanner reader = new Scanner(System.in);
        int op = 0;
        do{
        System.out.println("-------Menu--------");
            System.out.println("1. Barajar");
            System.out.println("2. Mostrar la Siguiente Carta");
            System.out.println("3. Indicar las cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Indicar cartas que salieron");
            System.out.println("6. Mostrar cartas resultantes");
            System.out.println("7. Salir");
            op = reader.nextInt();
            switch (op) {
                case 1:
                    mazo.barajar();
                    break;
                case 2:
                    mazo.siguienteCarta();
                    break;
                case 3:
                    mazo.cartasDisponibles();
                    break;
                case 4:
                    mazo.darCartas();
                    break;
                case 5:
                    mazo.cartasMonton();
                    break;
                case 6:
                    mazo.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Usted salio del programa.");
                    break;    
                default:
                    System.out.println("Usted eligio una opcion incorrecta.");
            }
        
        }while(op != 7);
        
        
        
        
    }
    
}
