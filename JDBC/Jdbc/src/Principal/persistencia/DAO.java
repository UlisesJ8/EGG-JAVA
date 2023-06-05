/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.persistencia;







import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Equipo
 */
public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "perros";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException {
 
    try{
        Class.forName(DRIVER);
        String urlBaseDeDatos = "jdbc:mysql://localhost:3306/"+DATABASE + "?useSSL=false";
        conexion = (Connection) DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        
    }catch(ClassNotFoundException | SQLException ex){
        throw ex;
    }
    
    }
    
    protected void desconectarBase() throws Exception{
    
        try{
         if (resultado != null) {
            resultado.close();
            }
            if (sentencia != null) {
            sentencia.close();
            }
         if (conexion != null) {
             conexion.close();
         }
        }catch(Exception e){
        throw e;
        }
    }
    
    protected void insertarModificarEliminar (String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            // conexion.rollback();
            /*
             Descomentar la linea anterior si desean tener en cuenta el rollback.
            Correr el siguiente script en Workbench
            SET autocommit=1;
            COMMIT;
                ***SIN EL ROLLBACK IGUAL ANDA

                */
            throw ex;
        }finally{
            desconectarBase();
        }
    
    }
    
    protected void consultarBase(String sql ) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado =  sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    
    
    
    }
    
    
    
    
}
