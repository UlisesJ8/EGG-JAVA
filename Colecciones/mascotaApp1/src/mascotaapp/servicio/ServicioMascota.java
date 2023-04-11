/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author Equipo
 */
public class ServicioMascota {
    
    private Scanner reader; 
    private List<Mascota> mascotas;
    
    public ServicioMascota(){
     this.reader = new Scanner(System.in).useDelimiter("\n");
     this.mascotas = new ArrayList();
    }
    
    public void agregarMascota(Mascota m){
    mascotas.add(m);
    }
    public Mascota crearMascota(){
        System.out.println("Introducir nombre ");
        String nombre = reader.next();
        
        System.out.println("introducir apodo");
        String apodo = reader.next();
        System.out.println("Introducir tipo");
        String tipo = reader.next();
//    
//        String mascota = nombre + "" + apodo + "" + tipo;
        
       
        
        return new Mascota(nombre, apodo, tipo);
        
        
    }
    
    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la lista mascotas son ");
        for (Mascota aux : mascotas) {
            System.out.println(aux);
            
        }
        System.out.println("cantidad = "+ mascotas.size());
        
        
    }
    
    /**
     * Crear mascotas todos chiquitos
     * @param cantidad equivale a la cantidad de mascotas a crear y anadir a la lista
     */
    public void fabricaChiquitos(int cantidad){
        for (int i = 0; i < cantidad; i++) {
                mascotas.add(new Mascota("Fer", "chiquito", "Beagle"));
//            Mascota aux = new Mascota("Fer", "chiquito", "Beagle");       Otra forna de agregarlo
//            mascotas.add(aux);    
        }
    
    }
    
    
    /**
     * 
     * Crear mascotas pdidiendo datos por teclado
     *
     *@param cantidad
     */
    public void fabricaMascotas(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
    
    }
    //TODO ana;ir Try and Catch
    public void actualizarMascota(int index) {
       
        if (index <= (mascotas.size()-1)) {
            System.out.println("");
            System.out.println("--------Actualizar-----------");
        
        Mascota m = crearMascota();
        mascotas.set(index, m);    
            
            
        }else{
        
            System.out.println("Fallo al actualizar, El indice es erroneo");
        }
        
       
    }

    public void eliminarMascota(int index){
   
    if (index <= (mascotas.size()-1)) {
           mascotas.remove(index);
            
            
        }else{
        
            System.out.println("Fallo al eliminar, El indice es erroneo");
        }
    }
    
    
    public void  eliminarMascotaPorNombre(String  nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombre)){
            
            mascotas.remove(i);
            }
            
            
            
        }
    
    
    }
    
    
       public void  actualizarMascotaPorNombre(String  nombreViejo, String nombreNuevo){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);
            
            }
            
            
            
        }


    }
}
