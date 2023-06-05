/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcextraprj01.dominio.Familias;

import java.util.Collection;
import jdbcextraprj01.persistencias.FamiliasDAO;

/**
 *
 * @author Equipo
 */
public class FamiliasService {
    private FamiliasDAO dao;

    public FamiliasService() {
        this.dao = new FamiliasDAO();
    }
    
    public void Familias3Hy10a() throws Exception{
        
        try {
            Collection<Familias>listaFamilia = dao.Familias3Hy10a();
            for (Familias u: listaFamilia) {
                System.out.println(u.toString());
            }
        } catch (Exception e) {
         throw new Exception("No existen familias de 3 hijos y menores 10 anios");
        }
    
    
    }
    
    
}
