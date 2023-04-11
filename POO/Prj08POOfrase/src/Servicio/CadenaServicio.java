/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class CadenaServicio {

    Scanner reader = new Scanner(System.in);

    public Cadena ingresarCadena() {
        Cadena frase = new Cadena();
        System.out.println("Ingrese una frase:");
        frase.setFrase(reader.nextLine());

        return frase;
    }

    public void mostrarVocales(Cadena frase) {
        int carac = 0;
        char[] ch = new char[frase.getLongitud()];
        String fra = frase.getFrase().toLowerCase();

        for (int i = 0; i < frase.getLongitud(); i++) {
            ch[i] = fra.charAt(i);
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                carac += 1;
            }
        }
        System.out.println("La cantidad de vocales que contiene la frase ingresada es de " + carac);
    }

    public void invertiFrase(Cadena frase) {
        String fraseInvertida = "";
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.getFrase().charAt(i);
        }
        System.out.println(fraseInvertida);
    }

    public void vecesRepetido(Cadena frase) {
        String ch;
        String fra = frase.getFrase().toLowerCase();
        int cont = 0;
        do {
            System.out.println("Ingrese un caracter para saber cuantas veces se encuentra en la frase");
            ch = reader.next();
        } while (ch.length() != 1);

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (ch.charAt(0) == fra.charAt(i)) {
                cont += 1;
            }
        }

        System.out.println("El caracter " + ch + " se encuentra " + cont + " veces en la frase");
    }

    public void compararLongitud(Cadena frase) {
        System.out.println("Ingrese la nueva cadena que desea comparar su longitud");
        String frase2 = reader.nextLine();
        if (frase.getLongitud() == frase2.length()) {
            System.out.println("La longitud de ambas cadenas es igual");
        } else {
            System.out.println("La longitud de las cadenas no son iguales");
        }

    }

    public void unirFrases(Cadena frase) {
        String frase2, fraseResul;
        System.out.println("Ingrese la frase que desee concatenar a la otra cadena");
        frase2 = reader.nextLine();
        fraseResul = frase.getFrase().concat(frase2);
        System.out.println("La frase resultante es:");
        System.out.println(fraseResul);

    }

    public void reemplazar(Cadena frase) {
        char ch;
        String fraseResul = "";
        String fra = frase.getFrase();
        System.out.println("Ingrese el caracter por el que desee reemplazar la A en la frase:");
        ch = reader.nextLine().charAt(0);
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (fra.charAt(i) == 'a') {
                fraseResul += ch;
            } else if (fra.charAt(i) == 'A') {
                fraseResul += ch;
            } else {
                fraseResul += fra.charAt(i);
            }
        }

        System.out.println(fraseResul);

    }

    public void contiene(Cadena frase) {
        boolean Contiene = false;
        String ch;
        String fra = frase.getFrase();
        do {
            System.out.println("Ingrese el caracter que desea saber si se encuentra en la Frase:");
            ch = reader.nextLine();
        } while (ch.length() != 1);

        for (int i = 0; i < frase.getLongitud(); i++) {

            if (fra.toLowerCase().contains(ch)) {
                Contiene = true;
                break;
            } else if (fra.toUpperCase().contains(ch)) {
                Contiene = true;
                break;
            }
        }

        System.out.println(Contiene);

    }

}
