/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.persistencia;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpalibreria.Entidades.Autor;

/**
 *
 * @author Equipo
 */
public class AutorDAO extends DAO<Autor> {
    Scanner reader = new Scanner(System.in);
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPALibreriaPU");
    private EntityManager em = EMF.createEntityManager();

    @Override
    public void Crear(Autor autor) throws Exception {
        super.Crear(autor);
        System.out.println("Creado correctamente");
    }
    
  
    public void EliminarAutor(int id) throws Exception{
        Autor autor = ConsultarAutor(id);
        super.eliminar(autor);
        System.out.println("Eliminado correctamente");
    }

    public Autor ConsultarAutor(int id) {
        Autor autor = new Autor();
        try{
        conectar();
        autor = em.find(Autor.class, id);
        }catch(Exception e){
        autor = null;
        }finally{
        desconectar();
        }
        return autor;
    }
    
    
    public void modificarAutor(int id) throws Exception{
        Autor autor = ConsultarAutor(id);
        if(autor != null){
        System.out.println("Ingrese el nombre del nuevo autor: ");
        String nombre = reader.nextLine();
        autor.setNombre(nombre);
        super.modificar(autor);
        }else{
        throw new Exception("No se encontro autor");
        } 
    }
    
    public Autor buscarAutorPorNombre(String nombre) throws Exception{
        try{
          conectar();
           return (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        }catch(Exception e){
            return null;
        }finally{
        desconectar();
        }
        }
    
    
    public boolean validarRepetidoAutor(String nombreA){
   
    try{
        conectar();
        List<Autor> listaAutor =  em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombreA).getResultList();
        if (listaAutor.isEmpty()) {
           return false; 
        }else{
            System.out.println("Ese libro ya se encuentra en la base de datos");
            return true;
        }
    }catch(Exception e){
        return false;
    }finally{
    desconectar();
    }
    }
    
    

    
}
