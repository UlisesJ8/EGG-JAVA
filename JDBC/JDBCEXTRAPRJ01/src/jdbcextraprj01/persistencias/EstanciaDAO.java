/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.persistencias;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Equipo
 */
public final class EstanciaDAO extends DAO{
    
    public void SubirEstancia(String nombre, String calle, int numero, String CP, String ciudad, String pais, String email,LocalDate fecha_desde,LocalDate fecha_hasta,int op1) throws Exception{

        try {
             Date fecha_des = java.sql.Date.valueOf(fecha_desde);
             Date fecha_has = java.sql.Date.valueOf(fecha_hasta);
             
            String sql = "Select * FROM estancias_exterior.casas Where id_casa = " + op1 +" ;";
            consultarBase(sql);
            resultado.next();
            Date fecha1 = resultado.getDate(7);
            Date fecha2 = resultado.getDate(8);
            if((fecha1.compareTo(fecha_des) > 0) || (fecha2.compareTo(fecha_has) < 0)){
                System.out.println("La casa no se puede ocupar en esa fecha");
            }else{
            String sql1 = "INSERT INTO estancias_exterior.clientes ( nombre, calle, numero, codigo_postal, ciudad, pais, email) VALUES ('" +nombre + "', '" + calle + "', '" + numero + "', '" + CP + "', '" + pais + "', '" + ciudad + "', '" + email + "');";
            insertarModificarEliminar(sql1);
            String sql2 = "SELECT id_cliente FROM estancias_exterior.clientes order by id_cliente desc limit 1;";
            consultarBase(sql2);
            resultado.next();
            int cliente = resultado.getInt(1);
            String sql3 = "INSERT INTO estancias_exterior.estancias ( id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) VALUES ("+ cliente +", " + op1 + ", '" + nombre + "', '" + fecha_des + "', '" + fecha_has + "');";
            insertarModificarEliminar(sql3);
            System.out.println("Perfecto! Su estancia fue cargada");
            }
           desconectarBase();       
        } catch (Exception e) {
        desconectarBase();
        throw e;
   
        }

    }
    
    
    
    
    
    
    
    
    
}
