/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.persistencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpalibreria.Entidades.Autor;
import jpalibreria.Entidades.Editorial;
import jpalibreria.Entidades.Libro;

/**
 *
 * @author Equipo
 */
public class LibroDAO extends DAO<Libro>{
    
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPALibreriaPU");
    private EntityManager em = EMF.createEntityManager();
    Scanner reader = new Scanner(System.in);
    @Override
    
    public void Crear(Libro objeto) throws Exception {
        super.Crear(objeto); 
        System.out.println("Creado correctamente");
    }


    
    public void EliminarLibro(long isbn) throws Exception{
        Libro libro = ConsultarLibro(isbn);
        super.eliminar(libro);
        System.out.println("Eliminado correctamente");
    }

    public Libro ConsultarLibro(long isbn) {
        Libro libro = new Libro();
        try{
        conectar();
        libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
        }catch(Exception e){
        libro = null;
        }finally{
            desconectar();
        }
        return libro;
    }

    public void modificarLibro(long isbn) throws Exception {
        try{
        conectar();
        Libro libro = ConsultarLibro(isbn);
        int op;
        if(libro != null){
        do{
        System.out.println("Que desea modificar del libro?");
        System.out.println("1. Titulo");
        System.out.println("2. Anio");
        System.out.println("3. Ejemplares Prestados");
        System.out.println("4. Ejemplares Restantes");
        System.out.println("5. Autor");
        System.out.println("6. Editorial");
        System.out.println("7. Salir");
        op = reader.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese el nuevo titulo");
                reader.nextLine();
                String titulo = reader.nextLine();
                libro.setTitulo(titulo);
                super.modificar(libro);
                
                break;
            case 2:
                System.out.println("Ingrese el nuevo anio");
                int anio = reader.nextInt();
                libro.setAnio(anio);
                super.modificar(libro);
                break;
            case 3:
                System.out.println("Ingrese la cantidad de ejemplares prestados");
                int EP = reader.nextInt();
                libro.setEjemplaresPrestados(EP);
                super.modificar(libro);
                break;
            case 4:
                System.out.println("Ingrese la cantidad de ejemplares restantes");
                int ER = reader.nextInt();
                libro.setEjemplaresRestantes(ER);
                super.modificar(libro);
                break;
            case 5:
                System.out.println("Ingrese el id nuevo Autor");
                int idAutor = reader.nextInt();
                System.out.println("Ingrese el nombre del Autor");
                String Autor = reader.nextLine();
                Autor autor = new Autor(idAutor, Autor);
                libro.setAutor(autor);
               super.modificar(libro);
                break;
            case 6:
                System.out.println("Ingrese el id de la Editorial");
                int idEditorial = reader.nextInt();
                System.out.println("Ingrese el nombre de la Editorial");
                String nombreEditorial = reader.nextLine();
                Editorial editorial = new Editorial(idEditorial, nombreEditorial);
                libro.setEditorial(editorial);
                super.modificar(libro);
                break;
            case 7: 
                System.out.println("Salio correctamente.");
                break;
            default:
                System.out.println("Opcion incorrecta");
                }
            }while(op != 7);
        }else{
            System.out.println("No existe un libro con ese isbn");
        }
        }catch(Exception e){
            throw new Exception("Error inesperado.");
        }finally{
        desconectar();
        }
        
    }


    public Libro buscarLibroPorTitulo(String nombreL){
        try{
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre").setParameter("nombre", nombreL).getSingleResult();
       
        return libro;
        }catch(Exception e){
            return null;
        }finally{
         desconectar();
        }
    }
    
    public List<Libro>buscarLibrosAutor(int IDautor){
    conectar();
    List<Libro>listaLibrosAutor = (List<Libro>) em.createQuery("SELECT l FROM Libro l WHERE l.autor.id = :IDautor").setParameter("IDautor", IDautor).getResultList();
    desconectar();
    return listaLibrosAutor;
    }
    
    public List<Libro>buscarLibrosEditorial(int IDeditorial){
    conectar();
    List<Libro>listaLibrosEditorial = (List<Libro>) em.createQuery("SELECT l FROM Libro l WHERE l.editorial.id = :id").setParameter("id", IDeditorial).getResultList();
    desconectar();
    return listaLibrosEditorial;
    
    
    }
    

    public boolean validarRepetido(String nombreLibro){
    boolean validar;
    try{
        conectar();
        List<Libro> listalibro = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre").setParameter("nombre", nombreLibro).getResultList();
        if (listalibro.isEmpty()) {
           return validar = false; 
        }else{
            System.out.println("Ese libro ya se encuentra en la base de datos");
            return validar = true;
        }
    }catch(Exception e){
        return false;
    }finally{
    desconectar();
    }
    }
    
    
    
    
    
}
