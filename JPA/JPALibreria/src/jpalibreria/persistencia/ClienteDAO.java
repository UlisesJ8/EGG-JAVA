/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpalibreria.persistencia;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpalibreria.Entidades.Cliente;

/**
 *
 * @author Equipo
 */
public class ClienteDAO extends DAO<Cliente>{
    Scanner reader = new Scanner(System.in);
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPALibreriaPU");
    private EntityManager em = EMF.createEntityManager();

   
    public void CrearCliente(Cliente objeto) throws Exception {
        super.Crear(objeto); 
        System.out.println("Creado correctamente");
    }

    public void eliminarCliente(int id) throws Exception {
        Cliente cliente = consultarCliente(id);
        super.eliminar(cliente); 
        System.out.println("Eliminado Correctamente");
    }

    public void modificarCliente(int id) throws Exception {
        
        try{
            conectar();
            Cliente cliente = consultarCliente(id);
            if(cliente != null){
            System.out.println("Que desea modificar?");
            System.out.println("1.DNI");
            System.out.println("2. Nombre");
            System.out.println("3. Apellido");
            System.out.println("4 Telefono");
            int op = reader.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el DNI(sin puntos):");
                    int dni = reader.nextInt();
                    cliente.setDocumento(dni);
                    super.modificar(cliente);
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo nombre");
                    reader.nextLine();
                    String nombre = reader.nextLine();
                    cliente.setNombre(nombre);
                    super.modificar(cliente);
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo apellido");
                    reader.nextLine();
                    String apellido = reader.nextLine();
                    cliente.setApellido(apellido);
                    super.modificar(cliente);
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo telofono");
                    reader.nextLine();
                    String celu = reader.nextLine();
                    cliente.setTelefono(celu);
                    super.modificar(cliente);
                    break;
                default:
                    System.out.println("Error. Opcion incorrecta.");
            }
            }else{
                System.out.println("No existe cliente con ese id.");
            }
        }catch(Exception e){
            throw new Exception("Error inesperado.");
        }finally{
        desconectar();
        }
        
        }
    
    public Cliente consultarCliente(int id){
        Cliente cliente = new Cliente();
        
        try{
            conectar();
            cliente = em.find(Cliente.class, id);
        return cliente;
        }catch(Exception e){
            return null;
        }finally{
        desconectar();
        }
    }
    
    
    public List<Cliente>listaDni(long dni){
       
        try {
            conectar();
            List<Cliente>listaDni = em.createQuery("SELECT c FROM Cliente c Where c.documento = :documento").setParameter("documento", dni).getResultList();
            return listaDni;
        } catch (Exception e) {
            return null;
        } finally {
        desconectar();
        }
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
