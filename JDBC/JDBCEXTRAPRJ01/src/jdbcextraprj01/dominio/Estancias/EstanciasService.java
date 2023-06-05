/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.dominio.Estancias;

import java.time.LocalDate;
import jdbcextraprj01.persistencias.EstanciaDAO;

/**
 *
 * @author Equipo
 */
public class EstanciasService {
    private EstanciaDAO dao;

    public EstanciasService() {
        this.dao = new EstanciaDAO();
    }
    
   public void SubirEstancia(String nombre, String calle, int numero, String CP, String ciudad, String pais, String email,LocalDate fecha_desde,LocalDate fecha_hasta,int op1) throws Exception{
   
       try {
           dao.SubirEstancia(nombre,calle, numero, CP, ciudad, pais, email, fecha_desde, fecha_hasta, op1);       
           
       } catch (Exception e) {
        throw new Exception("No se pudo subir su estancia");
       
       }
   
   
   }
}
