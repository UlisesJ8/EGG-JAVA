/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaPRJ01.entidades.Fabricante;

import TiendaPRJ01.persistencias.FabricanteDAO;

/**
 *
 * @author Equipo
 */
public class FabricanteService {
    
    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

  
    public boolean  comprobarFabricante (int codigo_fabricante) throws Exception{
        boolean comprobar = false;
        try {
            comprobar = dao.Comprobar(codigo_fabricante);
        } catch (Exception e) {
            throw new Exception("No existe fabricante");
        }

    return comprobar;
    
    }
    
    public void CrearFabricante(String nombreFabricante) throws Exception{
        try {
            if (nombreFabricante == null || nombreFabricante.trim().isEmpty()) {
                throw new Exception("No ingreso un nombre de fabricante");
            }
            dao.crearFabricante(nombreFabricante);
        } catch (Exception e) {
            throw e;
        }
    
    
    }
    
    
    
    
    
    
}
