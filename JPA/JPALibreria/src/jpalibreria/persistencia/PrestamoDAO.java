/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.persistencia;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpalibreria.Entidades.Cliente;
import jpalibreria.Entidades.Libro;
import jpalibreria.Entidades.Prestamo;
import static jpalibreria.Entidades.Prestamo_.libro;
import jpalibreria.Servicios.LibroService;

/**
 *
 * @author Equipo
 */
public class PrestamoDAO extends DAO<Prestamo> {

    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPALibreriaPU");
    private EntityManager em = EMF.createEntityManager();
    Scanner reader = new Scanner(System.in);
    LibroService libroService = new LibroService();

    public void CrearPrestamo(Prestamo objeto) throws Exception {
        super.Crear(objeto);
        System.out.println("Creado correctamente");
    }

    public void eliminarPrestamo(int id) throws Exception {
        Prestamo prestamo = consultarPrestamo(id);
        super.eliminar(prestamo);
        System.out.println("Eliminado correctamente");
    }

    public void modificar(int id) throws Exception {
        Prestamo prestamo = new Prestamo();
        try {
            conectar();
            prestamo = consultarPrestamo(id);
            if (prestamo != null) {
                System.out.println("Que desea modificar?");
                System.out.println("1.Fecha Prestamo");
                System.out.println("2.Fecha Devolucion");
                System.out.println("3.Libro");
                System.out.println("4.Cliente");
                int op = reader.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Ingrese la fecha del prestamo(dia-mes-anio):");
                        int diaP = reader.nextInt();
                        int mesP = reader.nextInt();
                        int anioP = reader.nextInt();
                        Date fechaPrestamo = new Date(anioP, mesP, diaP);
                        prestamo.setFechaPrestamo(fechaPrestamo);

                        break;
                    case 2:
                        System.out.println("Ingrese la fecha de devolucion(dia-mes-anio):");
                        int diaD = reader.nextInt();
                        int mesD = reader.nextInt();
                        int anioD = reader.nextInt();
                        Date fechaDevolucion = new Date(anioD, mesD, diaD);
                        prestamo.setFechaPrestamo(fechaDevolucion);

                        break;
                    case 3:
                        do {
                            System.out.println("Ingrese el titulo del libro que se prestara:");
                            String nombre = reader.nextLine();
                            Libro libro = new Libro();
                            libro = libroService.buscarLibroPorTitulo(nombre);
                            if (libro == null) {
                                System.out.println("El libro ingresado no existe");
                            }
                        } while (libro == null);

                        prestamo.setLibro((Libro) libro);

                        break;
                    case 4:

                        System.out.println("Ingrese e nombre del cliente:");
                        String nombreC = reader.nextLine();
                        System.out.println("Ingrese el apellido del cliente:");
                        String apellidoC = reader.nextLine();
                        System.out.println("Ingrese el DNI:");
                        long dni = reader.nextLong();
                        System.out.println("Ingrese el telofono del cliente:");
                        String telefono = reader.nextLine();
                        Cliente cliente = new Cliente(dni, nombreC, apellidoC, telefono);
                        prestamo.setCliente(cliente);

                        break;
                    default:
                        System.out.println("Ingreso una opcion incorrecta");
                }

                super.modificar(prestamo);
            } else {
                System.out.println("No existe el prestamo ingresado");
            }

        } catch (Exception e) {
            throw new Exception("Error inesperado.");
        } finally {
            desconectar();
        }

    }

    public Prestamo consultarPrestamo(int id) {
        Prestamo prestamo = new Prestamo();

        try {
            conectar();
            prestamo = em.find(Prestamo.class, id);
            return prestamo;
        } catch (Exception e) {
            return null;
        } finally {
            desconectar();
        }
    }

    public void CargarDevolucion(Date fechaDevolucion, Prestamo prestamo) throws Exception {

        try {
            conectar();
            prestamo.setFechaDevolucion(fechaDevolucion);
            super.modificar(prestamo);
        } catch (Exception e) {
            throw new Exception("Error inesperado.");
        } finally {
            desconectar();
        }

    }
    
     public List<Prestamo>BuscarTodosLosPrestamos(List<Cliente>listaClientes){
         try {
             conectar();
             List<Prestamo>listaPrestamos = (List<Prestamo>) em.createQuery("SELECT p FROM Prestamo p LEFT JOIN p.cliente c WHERE c.documento = :documento").setParameter("documento", listaClientes.get(0).getDocumento()).getResultList();
             return listaPrestamos;
         } catch (Exception e) {
             return null;
         } finally {
             desconectar();
         }
         
         
     
     
     }
    

}

