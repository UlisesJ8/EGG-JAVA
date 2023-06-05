/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Equipo
 */
public class DAO<T> {
    
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPALibreriaPU");
    private EntityManager em = EMF.createEntityManager();
    
      
    // Este método nos permite conectar con la base de datos
    // se verifica si la conexión está realizada, en caso que
    // no esté realizada, se realiza en la línea 24.
    protected void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    // Este método nos permite desconectarnos de la base de datos
    // Se verifica si existe una conexión, y de ser el caso, se
    // cierra la conexión y se desconecta el programa con la base de datos.
    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
    
    protected void Crear(T objeto)throws Exception{
          try {
            conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("No se pudo crear");
        }finally{
            desconectar();
        }
    }
 
    protected void modificar(T objeto) throws Exception{
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("No se pudo modificar");
        }finally{
            desconectar();
        }
    }
    
    protected void eliminar(T objeto) throws Exception{
        try {
            conectar();
            em.getTransaction().begin();
            T objeto1 = em.merge(objeto);
            em.remove(objeto1);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            throw e;
        }finally{
            desconectar();
        }
    }
}
