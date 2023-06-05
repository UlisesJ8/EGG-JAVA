/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.persistencias;

import java.util.ArrayList;
import java.util.Collection;
import jdbcextraprj01.dominio.Familias.Familias;

/**
 *
 * @author Equipo
 */
public final class FamiliasDAO extends DAO{
    
    public Collection<Familias>Familias3Hy10a() throws Exception{
        try {
            String sql = "Select * FROM Familias WHERE num_hijos >= 3 AND edad_maxima < 10";
            consultarBase(sql);
            Familias familia = null;
            Collection<Familias>listaFamilias = new ArrayList<>();
            while (resultado.next()) {                
                familia = new Familias(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getInt(5), resultado.getString(6), resultado.getInt(7));
                listaFamilias.add(familia);
            }
            desconectarBase();
            return listaFamilias;
        } catch (Exception e) {
             desconectarBase();
            throw e;
        }

    }
    
    
    
    
    
    
    
    
}
