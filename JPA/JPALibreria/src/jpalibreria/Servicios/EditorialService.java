/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.Servicios;

import jpalibreria.Entidades.Editorial;
import jpalibreria.persistencia.EditorialDAO;

/**
 *
 * @author Equipo
 */
public class EditorialService {
     private final EditorialDAO dao;

    public EditorialService() {
        this.dao = new EditorialDAO();
    }

    public void crearEditorial(Editorial editorial) throws Exception{
        dao.Crear(editorial);
    }
    
    public void EliminarEditorial(int id) throws Exception{
    dao.EliminarEditorial(id);
    
    }
    
    public Editorial consultarEditorial(int id){
    Editorial editorial = dao.ConsultarEditorial(id);
    return editorial;
    }
    
    public void modificarEditorial(int id) throws Exception{
    dao.modificarEditorial(id);
    
    }
    
    public Editorial buscarEditorialPorNombre(String nombreE){
    
    Editorial editorial = dao.buscarEditorial(nombreE);
    return editorial;
    }
    
    public boolean validarRepetidoEditorial(String nombreE){
    boolean validar = dao.validarRepetidoEditorial(nombreE);
    return validar;
    }
    
    
    
    
    
}
