/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.persistencias;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import jdbcextraprj01.dominio.Casas.Casas;

/**
 *
 * @author Equipo
 */
public final class CasasDAO extends DAO {
    
public Collection<Casas> listaCasas(LocalDate fecha_desde, LocalDate fecha_hasta) throws Exception{
    Date fecha_des = java.sql.Date.valueOf(fecha_desde);
    Date fecha_has = java.sql.Date.valueOf(fecha_hasta);
    
    try {
       
       String sql = "SELECT * FROM casas "
            + "WHERE pais = 'Reino Unido' "
            + "AND fecha_desde = '" + fecha_des + "' "
            + "AND fecha_hasta = '" + fecha_has + "';";
        consultarBase(sql);
        
        Casas casas = null;
        Collection<Casas>listaCasas = new ArrayList<>();
        while (resultado.next()) {   
            casas = new Casas();
            casas.setId_casa(resultado.getInt(1));
            casas.setCalle(resultado.getString(2));
            casas.setNumero(resultado.getInt(3));
            casas.setCodigo_postal(resultado.getString(4));
            casas.setCiudad(resultado.getString(5));
            casas.setPais(resultado.getString(6));
            casas.setFecha_desde(resultado.getDate(7).toLocalDate());
            casas.setFecha_hasta(resultado.getDate(8).toLocalDate());
            casas.setTiempo_minimo(resultado.getInt(9));
            casas.setTiempo_maximo(resultado.getInt(10));
            casas.setPrecio_habitacion(resultado.getDouble(11));
            casas.setTipo_vivienda(resultado.getString(12));
            listaCasas.add(casas);
        }
         desconectarBase();
        return listaCasas;
    } catch (Exception e) {
        desconectarBase();
        throw e;
    }





}

public Collection<Casas> listaCasasEnFechaDada(LocalDate fechaAlquiler, LocalDate fechaFinAlqui, int estadia) throws Exception{
    Date fecha_des = java.sql.Date.valueOf(fechaAlquiler);
    Date fecha_has = java.sql.Date.valueOf(fechaFinAlqui);
    try {
       
       String sql = "SELECT * FROM casas "
            + "WHERE fecha_desde  <= '"+ fecha_des + "' AND fecha_Hasta >= '"+ fechaFinAlqui+"' AND tiempo_maximo >= " + estadia + " AND tiempo_minimo <= " + estadia+";" ;
        consultarBase(sql);
        
        Casas casas = null;
        Collection<Casas>listaCasas = new ArrayList<>();
        while (resultado.next()) {   
            casas = new Casas();
            casas.setId_casa(resultado.getInt(1));
            casas.setCalle(resultado.getString(2));
            casas.setNumero(resultado.getInt(3));
            casas.setCodigo_postal(resultado.getString(4));
            casas.setCiudad(resultado.getString(5));
            casas.setPais(resultado.getString(6));
            casas.setFecha_desde(resultado.getDate(7).toLocalDate());
            casas.setFecha_hasta(resultado.getDate(8).toLocalDate());
            casas.setTiempo_minimo(resultado.getInt(9));
            casas.setTiempo_maximo(resultado.getInt(10));
            casas.setPrecio_habitacion(resultado.getDouble(11));
            casas.setTipo_vivienda(resultado.getString(12));
            listaCasas.add(casas);
        }
         desconectarBase();
        return listaCasas;
    } catch (Exception e) {
        desconectarBase();
        throw e;
    }





}

public void AumentarPrecio() throws Exception{

    try {
        
        String sql = "Update Casas SET precio_habitacion = precio_habitacion + (precio_habitacion*0.05)";
        insertarModificarEliminar(sql);
        
        desconectarBase();
    } catch (Exception e) {
        desconectarBase();
        throw e;
    }

}

public Collection<Casas>mostrarAumento() throws Exception{
    try {
       
       String sql = "SELECT * FROM casas ";
        consultarBase(sql);
        Casas casas = null;
        Collection<Casas>listaCasas = new ArrayList<>();
        while (resultado.next()) {   
            casas = new Casas();
            casas.setId_casa(resultado.getInt(1));
            casas.setCalle(resultado.getString(2));
            casas.setNumero(resultado.getInt(3));
            casas.setCodigo_postal(resultado.getString(4));
            casas.setCiudad(resultado.getString(5));
            casas.setPais(resultado.getString(6));
            casas.setFecha_desde(resultado.getDate(7).toLocalDate());
            casas.setFecha_hasta(resultado.getDate(8).toLocalDate());
            casas.setTiempo_minimo(resultado.getInt(9));
            casas.setTiempo_maximo(resultado.getInt(10));
            casas.setPrecio_habitacion(resultado.getDouble(11));
            casas.setTipo_vivienda(resultado.getString(12));
            listaCasas.add(casas);
        }
         desconectarBase();
        return listaCasas;
    } catch (Exception e) {
        desconectarBase();
        throw e;
    }


}

public Collection<String>paises() throws Exception{
    try {
        String sql = "Select c.pais, count(c.pais) from estancias_exterior.casas c group by c.pais;";
        consultarBase(sql);
        Collection<String>listaPaises = new ArrayList<>();
        while (resultado.next()) {
            listaPaises.add(resultado.getString(1));
        }
        desconectarBase();
        return listaPaises;
    } catch (Exception e) {
    desconectarBase();
    throw e;
    }






}

public Collection<Integer>paisesCantidad() throws Exception{
    try {
      String sql = "Select c.pais, count(c.pais) from estancias_exterior.casas c group by c.pais;";
        consultarBase(sql);
        Collection<Integer>listaCantidad = new ArrayList<>();
        while (resultado.next()) {
            listaCantidad.add(resultado.getInt(2));
        }
        desconectarBase();
        return listaCantidad;
    } catch (Exception e) {
    desconectarBase();
    throw e;

}

}

public Collection<Casas>HousesClear() throws Exception{
    try {
       
      String sql = "Select c.* from estancias_exterior.casas c " +
            "LEFT JOIN estancias_exterior.comentarios co on c.id_casa = co.id_casa " +
            "Where c.pais = 'Reino Unido' AND co.comentario like '%limpia%';";
        consultarBase(sql);
        Casas casas = null;
        Collection<Casas>listaLimpias = new ArrayList<>();
        while (resultado.next()) {
            casas = new Casas();
            casas.setId_casa(resultado.getInt(1));
            casas.setCalle(resultado.getString(2));
            casas.setNumero(resultado.getInt(3));
            casas.setCodigo_postal(resultado.getString(4));
            casas.setCiudad(resultado.getString(5));
            casas.setPais(resultado.getString(6));
            casas.setFecha_desde(resultado.getDate(7).toLocalDate());
            casas.setFecha_hasta(resultado.getDate(8).toLocalDate());
            casas.setTiempo_minimo(resultado.getInt(9));
            casas.setTiempo_maximo(resultado.getInt(10));
            casas.setPrecio_habitacion(resultado.getDouble(11));
            casas.setTipo_vivienda(resultado.getString(12));
            listaLimpias.add(casas);
        }
        desconectarBase();
        return listaLimpias;
    } catch (Exception e) {
    desconectarBase();
    throw e;

}

}







}