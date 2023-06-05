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
import jpalibreria.Entidades.Editorial;

/**
 *
 * @author Equipo
 */
public class EditorialDAO extends DAO<Editorial> {
    Scanner reader = new Scanner(System.in);
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPALibreriaPU");
    private EntityManager em = EMF.createEntityManager();

    @Override
    public void Crear(Editorial editorial) throws Exception {
        super.Crear(editorial);
        System.out.println("Creado correctamente");
    }
    
  
    public void EliminarEditorial(int id) throws Exception{
        Editorial editorial = ConsultarEditorial(id);
        super.eliminar(editorial);
        System.out.println("Se borro la editorial seleccionada");
    
    }

    public Editorial ConsultarEditorial(int id) {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
        
    }
    
    
    public void modificarEditorial(int id) throws Exception{
        Editorial editorial = ConsultarEditorial(id);
        System.out.println("Ingrese el nuevo Nombre de la editorial:");
        String nombre = reader.nextLine();
        editorial.setNombre(nombre);
        super.modificar(editorial);
    }
    
    public Editorial buscarEditorial(String nombreE){
        try{
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombreE).getSingleResult();
        return editorial;
        }catch(Exception e){
        return null;
        }finally {
        desconectar();
        }

    }
    
    
    public boolean validarRepetidoEditorial(String nombreEditorial){
   
    try{
        conectar();
        List<Editorial> listaEditorial =  em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombreEditorial).getResultList();
        if (listaEditorial.isEmpty()) {
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
