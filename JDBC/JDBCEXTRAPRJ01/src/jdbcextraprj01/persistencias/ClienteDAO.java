/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.persistencias;

import java.util.ArrayList;
import java.util.Collection;
import jdbcextraprj01.dominio.Casas.Casas;
import jdbcextraprj01.dominio.Clientes.Clientes;

/**
 *
 * @author Equipo
 */
public final class ClienteDAO extends DAO {
    
    public Collection<Clientes> Emails() throws Exception{
    
        try {
            String sql = "Select * FROM CLIENTES WHERE email like '%Hotmail%' ";
            consultarBase(sql);
            Clientes cliente = null;
            Collection<Clientes>listaClientes = new ArrayList<>();
            while (resultado.next()) {                
                cliente = new Clientes(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8));
                listaClientes.add(cliente);
  
            }
            desconectarBase();
            return listaClientes;
        } catch (Exception e) {
         desconectarBase();
         throw e;
        }
    
    
    
    
    
    
    
    
    }
    
     public Collection<Clientes> estadiaCli() throws Exception{
    
        try {
            String sql = "Select Cli.*, Ca.* from estancias_exterior.clientes Cli\n" +
            "left join  estancias_exterior.estancias es on  Cli.id_cliente = es.id_cliente\n" +
            "Left join estancias_exterior.casas Ca on es.id_casa = Ca.id_casa; ";
            consultarBase(sql);
            Clientes cliente = null;
            Collection<Clientes>listaClientes = new ArrayList<>();
            while (resultado.next()) {                
                cliente = new Clientes(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getString(5), resultado.getString(6), resultado.getString(7), resultado.getString(8));
                listaClientes.add(cliente);
  
            }
            desconectarBase();
            return listaClientes;
        } catch (Exception e) {
         desconectarBase();
         throw e;
        }
    
    
    
    
    
    
    
    
    }
       public Collection<Casas> estadiaCasa() throws Exception{
    
        try {
            String sql = "Select Cli.*, Ca.* from estancias_exterior.clientes Cli\n" +
            "left join  estancias_exterior.estancias es on  Cli.id_cliente = es.id_cliente\n" +
            "Left join estancias_exterior.casas Ca on es.id_casa = Ca.id_casa; ";
            consultarBase(sql);
            Casas casas = null;
            Collection<Casas>listaCasas = new ArrayList<>();
            while (resultado.next()) {                
            casas = new Casas();
            casas.setId_casa(resultado.getInt(9));
            casas.setCalle(resultado.getString(10));
            casas.setNumero(resultado.getInt(11));
            casas.setCodigo_postal(resultado.getString(12));
            casas.setCiudad(resultado.getString(13));
            casas.setPais(resultado.getString(14));
            casas.setFecha_desde(resultado.getDate(15).toLocalDate());
            casas.setFecha_hasta(resultado.getDate(16).toLocalDate());
            casas.setTiempo_minimo(resultado.getInt(17));
            casas.setTiempo_maximo(resultado.getInt(18));
            casas.setPrecio_habitacion(resultado.getDouble(19));
            casas.setTipo_vivienda(resultado.getString(20));
            listaCasas.add(casas);
  
            }
            desconectarBase();
            return listaCasas;
        } catch (Exception e) {
         desconectarBase();
         throw e;
        }
  
    
    }
  
        public Collection<Clientes> estadiaCliMenosDatos() throws Exception{
    
        try {
            String sql = "Select Cli.nombre, Cli.pais, Cli.ciudad from estancias_exterior.clientes Cli\n" +
            "left join  estancias_exterior.estancias es on  Cli.id_cliente = es.id_cliente\n" +
            "Left join estancias_exterior.casas Ca on es.id_casa = Ca.id_casa; ";
            consultarBase(sql);
            Clientes cliente = null;
            Collection<Clientes>listaClientes = new ArrayList<>();
            while (resultado.next()) {                
                cliente = new Clientes();
                cliente.setNombre(resultado.getString(1));
                cliente.setPais(resultado.getString(2));
                cliente.setCiudad(resultado.getString(3));
                listaClientes.add(cliente);
  
            }
            desconectarBase();
            return listaClientes;
        } catch (Exception e) {
         desconectarBase();
         throw e;
        }
   
    
    }
        
}
