/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaextraprj04;

import Entidad.Estudiantes;
import Entidad.Persona;
import Entidad.PersonalDeServicio;
import Entidad.Profesores;
import Servicio.servicioFacultad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class HerenciaExtraPrj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();
        servicioFacultad serv = new servicioFacultad();
        Profesores teacher = serv.crearProfesor();
        Estudiantes student = serv.crearEstudiante();
        PersonalDeServicio personService = serv.crearPersonalDeServicio();
        
        lista.add(teacher);
        lista.add(student);
        lista.add(personService);
        
        lista.add(new Estudiantes("matematica", "pepe", "perez", 41457852, "soltero"));
        lista.add(new Profesores("Matematica", 2015, 3, "Martin", "Benavides", 34578946, "casado"));
        lista.add(new PersonalDeServicio("Biblioteca", 2008, 1, "Geronimo", "Lopez", 25748958, "viudo"));
        
        
        int op = 0;
        do{
        System.out.println("---------Menu-----------");
        System.out.println("1. Cambio el estado civil de una persona: ");
        System.out.println("2. Reasignacion de despacho de un empleado: ");
        System.out.println("3. Matriculacion de un estudiante de un nuevo curso: ");
        System.out.println("4. Cambio de departamento de un profesor: ");
        System.out.println("5. Traslado de seccion de un empleado del personal de servicio");
        System.out.println("6. Imprimir Estudiantes, Profesores y Personal de Servicio");
        System.out.println("7.Salir");
        op = reader.nextInt();
        
            switch (op) {
                case 1:
                    serv.cambiarEstadoCivil(lista);
                    break;
                    case 2:
                    serv.reasignarDespacho(lista);
                    break;
                    case 3:
                    serv.matriculacionEstudiante(lista);
                    break;
                    case 4:
                    serv.cambioDepartamentoProfesor(lista);
                    break;
                    case 5:
                    serv.tasladoSeccionEmpleado(lista);
                    break;
                    case 6:
                    serv.imprimir(lista);
                    break;
                    case 7:
                        System.out.println("Usted Salio del programa! Hasta luego");
                    break;
                default:
                    System.out.println("Usted eligio una opcion incorrecta.");
            }
        
        }while(op != 7);
        
        
        
        
        
    }
    
}
