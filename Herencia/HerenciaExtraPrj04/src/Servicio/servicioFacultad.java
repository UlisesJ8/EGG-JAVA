/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Empleados;
import Entidad.Estudiantes;
import Entidad.Persona;
import Entidad.PersonalDeServicio;
import Entidad.Profesores;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class servicioFacultad {

    Scanner reader = new Scanner(System.in);

    private Persona crearPersona() {
        System.out.println("Ingrese el nombre: ");
        String nombre = reader.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = reader.nextLine();
        System.out.println("Ingrese su DNI: ");
        int dni = reader.nextInt();
        reader.nextLine();
        System.out.println("Ingrese su estado civil: ");
        String estadoCivil = reader.nextLine();

        Persona people = new Persona(nombre, apellido, dni, estadoCivil);
        return people;
    }

    private Empleados crearEmpleados() {
        Persona person = crearPersona();
        System.out.println("Ingrese en anio de incorporacion en la facultad: ");
        int anioIncor = reader.nextInt();
        System.out.println("Ingrese el numero de despacho: ");
        int numeroDespa = reader.nextInt();

        Empleados worked = new Empleados(anioIncor, numeroDespa, person.getNombre(), person.getApellido(), person.getDni(), person.getEstadoCivil());
        return worked;
    }

    public Profesores crearProfesor() {
        System.out.println("Creando Profesor!!");
        Empleados trabajador = crearEmpleados();
        reader.nextLine();
        System.out.println("Ingrese el departamento al que pertenece el profesor: ");
        String despacho = reader.nextLine();
        Profesores teacher = new Profesores(despacho, trabajador.getAnioIncorporacion(), trabajador.getNumeroDespachoAsignado(), trabajador.getNombre(), trabajador.getApellido(), trabajador.getDni(), trabajador.getEstadoCivil());
        return teacher;

    }
    
    public PersonalDeServicio crearPersonalDeServicio(){
        System.out.println("Creando Personal Servicio!!");
        Empleados trabajador = crearEmpleados();
        reader.nextLine();
        System.out.println("Ingrese la seccion a la que pertenece el empleado: ");
        String seccion = reader.nextLine();
        
        PersonalDeServicio peopleService = new PersonalDeServicio(seccion, trabajador.getAnioIncorporacion(), trabajador.getNumeroDespachoAsignado(), trabajador.getNombre(), trabajador.getApellido(), trabajador.getDni(), trabajador.getEstadoCivil());
        return peopleService;
        
    }
    
    public Estudiantes crearEstudiante(){
        System.out.println("Creando Estudiante!!");
        Persona persona = crearPersona();
        System.out.println("Ingrese el curso al que esta matriculado el estudiante : ");
        String cursoMatri = reader.nextLine();
        
        Estudiantes student = new Estudiantes(cursoMatri, persona.getNombre(), persona.getApellido(), persona.getDni(), persona.getEstadoCivil());
        return student;
    }
    
    public void cambiarEstadoCivil(ArrayList<Persona>lista){
        for (Persona aux : lista) {
            System.out.println(aux.toString());
        }
        System.out.println("Ingrese el nombre de la persona que desee cambiar el estado civil: ");
        String nombre = reader.nextLine();
        
        for (Persona aux2 : lista) {
            if(aux2.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Ingrese el nuevo estado civil");
                String estadoCivil = reader.nextLine();
                aux2.setEstadoCivil(estadoCivil);
            }
        }
    
    }
    
    public void reasignarDespacho(ArrayList<Persona>lista){
    
        for (Persona aux : lista) {
            if (aux instanceof Empleados) {
                System.out.println(aux.toString());
            }
        }
        
        System.out.println("Ingrese el 'nombre' de la persona que desee cambiar el numero de despacho: ");
        String nombre = reader.nextLine();
        for (Persona aux2 : lista) {
            if (aux2 instanceof Empleados) {
                if(aux2.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Ingrese nuevo numero de despacho: ");
                    int num = reader.nextInt();
                    ((Empleados) aux2).setNumeroDespachoAsignado(num);
                }
            }
        }
    }
    
    public void matriculacionEstudiante(ArrayList<Persona>lista){
        for (Persona aux : lista) {
            if(aux instanceof Estudiantes){
                System.out.println(aux.toString());
            }
        }
    
        System.out.println("Ingrese el 'nombre' del estudiante que desee matricular en un nuevo curso: ");
        String nombre = reader.nextLine();
        for (Persona aux2 : lista) {
            if (aux2 instanceof Estudiantes) {
                if(aux2.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Ingrese el nuevo nombre del curso");
                    String curso = reader.nextLine();
                    ((Estudiantes) aux2).setCursoMatriculado(curso);
                
                
                }
            
            }    
    
    
        }
    }
    
    public void cambioDepartamentoProfesor(ArrayList<Persona>lista){
    
        for (Persona aux : lista) {
            if(aux instanceof Profesores){
            System.out.println(aux.toString());
            }
        }
        
        System.out.println("Ingrese el 'nombre' del profesor que desee cambiar de departamento: ");
        String nombre = reader.nextLine();
         for (Persona aux2 : lista) {
            if (aux2 instanceof Profesores) {
                if(aux2.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Ingrese el nuevo nombre del departamento del profesor seleccionado: ");
                    String departamento = reader.nextLine();
                    ((Profesores) aux2).setDepartamentoEducativo(departamento);
                }
            }
         }
        
    }
    
    public void tasladoSeccionEmpleado(ArrayList<Persona>lista){
    
        for (Persona aux : lista) {
            if (aux instanceof PersonalDeServicio) {
                System.out.println(aux.toString());
            }  
        }
        
        System.out.println("Ingrese el 'nombre' del empleado que desea cambiar de seccion: ");
        String nombre = reader.nextLine();
        
        for (Persona aux2 : lista) {
            if (aux2 instanceof PersonalDeServicio) {
                if(aux2.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Ingrese la nueva seccion del empleado");
                    String seccion = reader.nextLine();
                    ((PersonalDeServicio) aux2).setSeccionAsignado(seccion);
                }
            }
         }
        
        
        
    }
    
    public void imprimir(ArrayList<Persona>lista){
        for (Persona persona : lista) {
            System.out.println(persona.toString());
        }
    
    }
    
    
    
    
    
    
}
