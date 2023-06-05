
package jpalibreria.Servicios;

import java.util.ArrayList;
import java.util.List;
import jpalibreria.Entidades.Libro;
import jpalibreria.persistencia.LibroDAO;

/**
 *
 * @author Equipo
 */
public class LibroService {
    private final LibroDAO dao;

    public LibroService() {
        this.dao = new LibroDAO();
    }
    
  

    public void crearLibro(Libro libro) throws Exception{
    dao.Crear(libro);
    }
    
    public void EliminarLibro(long isbn) throws Exception{
    dao.EliminarLibro(isbn);
    }
    
    public Libro consultarLibro(long isbn){
    Libro libro =  dao.ConsultarLibro(isbn);
    return libro;
    }
    
    public void modificarLibro(long isbn) throws Exception{
    dao.modificarLibro(isbn);
    }
    
    public Libro buscarLibroPorTitulo(String nombreL){
    Libro libro = dao.buscarLibroPorTitulo(nombreL);
    return libro;
    
    }
    
    public List<Libro>buscarLibrosAutor(int IDautor){
        List<Libro>listaLibrosAutor = dao.buscarLibrosAutor(IDautor);
        return listaLibrosAutor;
    }
    
    public List<Libro>buscarLibrosEditorial(int IDeditorial){
        List<Libro>listaLibrosEditorial = dao.buscarLibrosEditorial(IDeditorial);
        return listaLibrosEditorial;
    }
    
    public boolean validarRepetido(String nombre){
    boolean validar = dao.validarRepetido(nombre);
    return validar;
    }
    
}
