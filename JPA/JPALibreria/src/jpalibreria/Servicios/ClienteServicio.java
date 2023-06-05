/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.Servicios;

import java.util.List;
import jpalibreria.Entidades.Cliente;
import jpalibreria.persistencia.ClienteDAO;

/**
 *
 * @author Equipo
 */
public class ClienteServicio {
    private final ClienteDAO dao;

    public ClienteServicio() {
        this.dao = new ClienteDAO();
    }
    
     
    public void crearCliente(Cliente cliente) throws Exception {
        dao.CrearCliente(cliente);
    
    }
    
    public void EliminarCliente(int id) throws Exception{
        dao.eliminarCliente(id);
    }
    
    public Cliente consultarCliente(int id){
        Cliente cliente = dao.consultarCliente(id);
        return cliente;
    }
    
    public void modificarCliente(int id) throws Exception{
        dao.modificarCliente(id);
       
    }
    
    
    public List<Cliente>listaClientesDNI(long dni) throws Exception{
        List<Cliente>listaClientesDni = dao.listaDni(dni);
        return listaClientesDni;
    }
    
    
    
}
