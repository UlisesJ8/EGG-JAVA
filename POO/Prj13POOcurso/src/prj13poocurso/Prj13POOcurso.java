/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj13poocurso;

import Entidad.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author Equipo
 */
public class Prj13POOcurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio cur = new CursoServicio();
        Curso cur1 = cur.crearCurso();
        
        cur.calcularGananciaSemanal(cur1);

        
        
    }
    
}
