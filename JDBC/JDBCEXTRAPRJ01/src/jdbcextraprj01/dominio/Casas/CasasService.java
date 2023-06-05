/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.dominio.Casas;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import jdbcextraprj01.persistencias.CasasDAO;

/**
 *
 * @author Equipo
 */
public class CasasService {
    private CasasDAO dao;

    public CasasService() {
        this.dao = new CasasDAO();
    }
    
    public void AlquilerEntrePeriodo(LocalDate fecha_desde, LocalDate fecha_hasta ) throws Exception {
    
        try {
           
           Collection<Casas>listaCasas = dao.listaCasas(fecha_desde, fecha_hasta);
            
            for (Casas u : listaCasas) {
                System.out.println(u.toString());
            }
            
        } catch (Exception e) {
            
            throw new Exception("No hay casas disponibles en esa fecha en REINO UNIDO.");
        }
    }
    
    public void AlquilerFechaDada(LocalDate fechaAlquiler , LocalDate fechaFinAlqui, int estadia) throws Exception{
        
        try {
           
           Collection<Casas>listaCasas = dao.listaCasasEnFechaDada(fechaAlquiler, fechaFinAlqui,  estadia);
            
            for (Casas u : listaCasas) {
                System.out.println(u.toString());
            }
            
        } catch (Exception e) { 
            throw new Exception("No hay casas disponibles en esa fecha dada.");
        }
    
    }
    
    public void AumentarPrecio() throws Exception{
    
        try {
            dao.AumentarPrecio();
            Collection<Casas> lista = dao.mostrarAumento();
            for (Casas u : lista) {
                System.out.println(u.toString());
            }
        } catch (Exception e) {
        throw new Exception("No se pudo aumentar precio");
        }

    
    }
    
    public void NumCasasPais() throws Exception{
    
        try {
            Collection<String> pais = dao.paises();
            Collection<Integer> cantidad = dao.paisesCantidad();
            Iterator<String> pa = pais.iterator();
            Iterator<Integer> ca = cantidad.iterator();
            while (pa.hasNext() && ca.hasNext()) {     
                String variablepais = pa.next();
                int variableCantidad = ca.next();
                System.out.println("Pais: " + variablepais + " Cantidad : " + variableCantidad);
                
            }
        } catch (Exception e) {
        throw new Exception("No se pudo conseguir el numero de casas por pais");
        }
    
    
    
    
    
    
    
    }
    
    public void HouseKindomClear() throws Exception{
        try {
            Collection<Casas>housesClear = dao.HousesClear();
             for (Casas u : housesClear) {
                 System.out.println(u.toString());
            }
            
        } catch (Exception e) {
            throw new Exception("No hay casas con comentarios de limpias");
        
        }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
