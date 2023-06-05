/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.Servicios;

import jpalibreria.Entidades.Autor;
import jpalibreria.persistencia.AutorDAO;

/**
 *
 * @author Equipo
 */
public class AutorService {
    private final AutorDAO dao;

    public AutorService() {
        this.dao = new AutorDAO();
    }

    
    public void crearAutor(Autor autor) throws Exception{
        dao.Crear(autor);
    
    }
    
    public void EliminarAutor(int id) throws Exception{
        dao.EliminarAutor(id);
    }
    
    public Autor consultarAutor(int id){
       Autor autor = dao.ConsultarAutor(id);
    return autor;
    }
    
    public void modificarAutor(int id) throws Exception{
    dao.modificarAutor(id);
       
    }
    
    public Autor buscarPorNombre(String nombreA) throws Exception{
    Autor autor = dao.buscarAutorPorNombre(nombreA);
    return autor;
    }
    
    public boolean validarRepetidoAutor(String nombreA){
    boolean validar = dao.validarRepetidoAutor(nombreA);
    return validar;
    }
    
    
}
