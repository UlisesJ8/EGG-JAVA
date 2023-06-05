/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.persistencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Equipo
 */
public abstract class DAO {
     
     protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "estancias_exterior";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    
    protected void conectarBase() throws Exception {
        try {
           Class.forName(DRIVER);
           String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
           conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (Exception e) {
         throw  e;
        }
    }
    
    protected void desconectarBase() throws Exception{
    try {
            if(resultado != null){
                resultado.close();
            }
            if(conexion != null){
                conexion.close();
            }
            if(sentencia != null){
             sentencia.close();
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insertarModificarEliminar(String sql ) throws Exception{
    
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
        throw e;
        }finally{
         desconectarBase();
        }
    }
    
    
    protected void consultarBase(String sql) throws Exception{
    
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
        throw e;
        }
    
    
    
    
    }
    
    
    
}
