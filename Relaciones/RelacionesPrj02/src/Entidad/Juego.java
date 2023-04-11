/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import Entidad.Jugador;
import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private revolverDeAgua revolver;
    private Scanner scanner;

    public Juego() {
        scanner = new Scanner(System.in);
    }

    public void llenarJuego() {
        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = scanner.nextInt();
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }
        jugadores = new ArrayList<Jugador>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i, "Jugador"));
        }
        revolver = new revolverDeAgua();
        revolver.llenarRevolver();
    }

    public void ronda() {
        for (Jugador j : jugadores) {
            if (!j.isMojado()) {
                if (j.disparo(revolver)) {
                    return;
                }
            }
        }
    }

    public void jugar() {
        while (true) {
            ronda();
            if (hayGanador()) {
                break;
            } else {
                System.out.println("Nadie se mojó en esta ronda, continuamos...");
                revolver.siguienteChorro();
            }
        }
    }

    public boolean hayGanador() {
        boolean moj = true;
        for (Jugador j : jugadores) {
            if (j.isMojado()) {
            System.out.println(j.toString() + " perdio!!! \n¡¡¡FIN DEL JUEGO");
            moj = false;
            }else{
            moj = true;
            }
        }
      return moj;
    }
}
