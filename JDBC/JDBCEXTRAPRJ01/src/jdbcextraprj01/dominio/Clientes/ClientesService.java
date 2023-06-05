/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.dominio.Clientes;

import java.util.Collection;
import java.util.Iterator;
import jdbcextraprj01.dominio.Casas.Casas;
import jdbcextraprj01.persistencias.ClienteDAO;

/**
 *
 * @author Equipo
 */
public class ClientesService {
    private ClienteDAO dao;

    public ClientesService() {
        this.dao = new ClienteDAO();
    }
    
    public void email() throws Exception{
        try {
            Collection<Clientes>listaClientes = dao.Emails();
            for (Object u : listaClientes) {
                System.out.println(u.toString());
            }
        
        } catch (Exception e) {
            throw new Exception("No hay clientes con email HOTMAIL");
        }
    
    
    }
    
    public void ClientesQueAlquilaron() throws Exception{
    
        try {
            Collection<Clientes>listaCli = dao.estadiaCli();
            Collection<Casas>ListaCasa = dao.estadiaCasa();
            Iterator<Clientes> iteratorCli = listaCli.iterator();
            Iterator<Casas> iteratorCasa = ListaCasa.iterator();
            while (iteratorCli.hasNext() && iteratorCasa.hasNext()) {                
                Clientes cli = iteratorCli.next();
                Casas ca = iteratorCasa.next();
                
                System.out.println(cli.toString() + ca.toString());
                
            }
            
            
        } catch (Exception e) {
            throw new Exception("No hay clientes con estadia");
        }
    
    
    
    
    
    }
    
    public void ClientesQueAlquilaronMenosDatosCli() throws Exception{

      try {
            Collection<Clientes>listaCli = dao.estadiaCliMenosDatos();
            Collection<Casas>ListaCasa = dao.estadiaCasa();
            Iterator<Clientes> iteratorCli = listaCli.iterator();
            Iterator<Casas> iteratorCasa = ListaCasa.iterator();
            while (iteratorCli.hasNext() && iteratorCasa.hasNext()) {                
                Clientes cli = iteratorCli.next();
                Casas ca = iteratorCasa.next();
                
                System.out.println("Cliente: Nombre: "+ cli.getNombre()+", Pais: "+ cli.getPais()+", Ciudad:"+ cli.getCiudad() +" || "+ ca.toString());
                
            }

        } catch (Exception e) {
            throw new Exception("No hay clientes con estadia");
        }

    
    }
    
}
