/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.Servicios;

import java.util.Date;
import java.util.List;
import jpalibreria.Entidades.Cliente;
import jpalibreria.Entidades.Prestamo;
import jpalibreria.persistencia.PrestamoDAO;

/**
 *
 * @author Equipo
 */
public class PrestamoServicio {
    private final PrestamoDAO dao;

    public PrestamoServicio() {
        this.dao = new PrestamoDAO();
    }
   
     
    public void crearPrestamo(Prestamo prestamo) throws Exception{
        dao.CrearPrestamo(prestamo);
        System.out.println("Prestamo creado correctamente");
    }
    
    public void EliminarPrestamo(int id) throws Exception{
        dao.eliminarPrestamo(id);
        System.out.println("Prestamo eliminado correctamente");
    }
    
    public Prestamo consultarPrestamo(int id){
       Prestamo prestamo = dao.consultarPrestamo(id);
        return prestamo;
    }
    
    public void modificarPrestamo(int id) throws Exception{
        dao.modificar(id);
    }
    
    public void CargarDevolucion(Date fechaDevolucion, Prestamo prestamo) throws Exception{
        dao.CargarDevolucion(fechaDevolucion, prestamo);
    }
    
    public List<Prestamo>BuscarTodosLosPrestamos(List<Cliente>listaClientes)throws Exception{
        List<Prestamo>listaPrestamos = dao.BuscarTodosLosPrestamos(listaClientes);
                return listaPrestamos;
    }
    
    
}
