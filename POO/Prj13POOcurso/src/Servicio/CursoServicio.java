/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class CursoServicio {
    Scanner reader = new Scanner(System.in);
    
    
    public CursoServicio(){
        this.reader = new Scanner(System.in);
    }
    
    
    public void cargarAlumnos(Curso alumno){
        String[] listaDeAlumnos = new String[5];
        String nombre = "";
        reader.nextLine();
        for (int i = 0; i < 5; i++) {
          
            System.out.println("Ingrese el nombre del alumno "+ (i+1));
            nombre = reader.nextLine();
            listaDeAlumnos[i] = nombre;
             
        }
        
        alumno.setAlumnos(listaDeAlumnos);
        
    }

    
    public Curso crearCurso(){
        String nombreCur;
        String turno = "";
        Curso cs = new Curso();
        
         
         do{
         System.out.println("Nombre del curso de los alumnos(A O B) ") ;
         nombreCur = reader.nextLine().toLowerCase();
         }while(!"a".equalsIgnoreCase(nombreCur) && !"b".equalsIgnoreCase(nombreCur));
         
         cs.setNombreCurso(nombreCur);
         
         System.out.println("Ingrese la cantidad de horas que van por dia");
         cs.setCantidadHorasPorDia(reader.nextInt());
         
         System.out.println("Ingrese la cantidad de dias que van por semana");
         cs.setCantidadDiasPorSemana(reader.nextInt());
         
         do{
             
         System.out.println("A que turno pertenecen los alumnos ingrese 'M' para turno Mañana o 'T' para turno Tarde ");
         
         turno = reader.next().toLowerCase();
         
         }while( !"M".equalsIgnoreCase(turno) && !"T".equalsIgnoreCase(turno));
         
         cs.setTurno(turno);
         
         System.out.println("Que precio por hr se le cobra a los alumnos");
         
         cs.setPrecioPorHora(reader.nextInt());
         

         
         cargarAlumnos(cs);
         
         return cs;

    }
       


    public void calcularGananciaSemanal(Curso alumno){
        double ganancia;
        ganancia = alumno.getCantidadDiasPorSemana()*alumno.getCantidadHorasPorDia()*alumno.getPrecioPorHora();
        
        
        System.out.println("Los alumnos son: "+Arrays.toString(alumno.getAlumnos()));
        System.out.println("El nombre del curso es: "+alumno.getNombreCurso());
        System.out.println("El turno es: " + alumno.getTurno());
        System.out.println("La cantidad de dias por semana es: "+alumno.getCantidadDiasPorSemana());
        System.out.println("La cantidad de hs por dia es: "+alumno.getCantidadHorasPorDia());
        System.out.println("El costo de la hora es de: "+ alumno.getPrecioPorHora());
        System.out.println("La ganancia semanal es de: "+ ganancia);
    
    
    
    }
 
    
    
    
    
    
    
    
    
    
}
