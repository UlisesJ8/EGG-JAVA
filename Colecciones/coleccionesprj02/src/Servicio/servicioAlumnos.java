/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioAlumnos {
    private Scanner reader;
    private ArrayList<Alumnos> lista;
    Alumnos estudiante = new Alumnos();

    public servicioAlumnos() {
        this.lista = new ArrayList();
        this.reader = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void cargarAlumnos(){
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno: ");
        String alumno = reader.next();
        

        for (int i = 0; i < 3; i++) {
        System.out.println("Ingrese la nota " + (i+1) + " del alumno");
        int nota = reader.nextInt();
        notas.add(nota);
        }

        lista.add(new Alumnos(alumno, notas));

    }
    
  
    
    public void notaFinal(){
    
    Iterator <Alumnos> it = lista.iterator();
    System.out.println("Ingrese el nombre del alumno que desee saber el promedio?");
    String al = reader.next();
    
        for (Alumnos alumnos : lista) {
            if(alumnos.getAlumno().equalsIgnoreCase(al))   { 
               double promedio =  prome(alumnos.getNotas());
                System.out.println("El promedio del alumno "+ al + " es: " + promedio);
            }
        
        
        }
            
            
        
        }
    
    
    public static double prome (ArrayList<Integer> notas){
        double prom = 0;
        for (Integer nota : notas) {
            prom += nota;
        }
 
       prom = prom / 3;

       return prom;
    }
    
       
        
        
        
 
    
}
