/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaPRJ01.persistencias;

/**
 *
 * @author Equipo
 */
public final class FabricanteDAO extends DAO{
    
    public boolean Comprobar(int codigo_fabricante) throws Exception{
    boolean comprobar = false;
        try {
            String sql = "SELECT codigo FROM fabricante ;";
            consultarBase(sql);
            while (resultado.next()) {
                int codigo = resultado.getInt( 1);
                if (codigo_fabricante == resultado.getInt(1)) {
                    comprobar = true;
                    break;
                }
            }
            desconectarBase();
            return comprobar;
        } catch (Exception e) {
            e.printStackTrace();
             desconectarBase();
            throw e;
        }
       
    }
    
    public void crearFabricante(String nombreFabricante) throws Exception{
        
        try {
            String sql = "INSERT INTO Fabricante(nombre) "
                    + "VALUES( '" + nombreFabricante+ " ' );" ;
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }finally{
             desconectarBase();
        }
    
    
    
    
    
    
    
    
    
    
    }
    

    
}
