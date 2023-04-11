/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotaapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mascotaapp.entidades.Mascota;
import mascotaapp.entidades.Usuario;
import mascotapp.enumeraciones.RazaGatuna;
import mascotapp.enumeraciones.RazaPerruna;
import mascotapp.enumeraciones.SexoHumano;

/**
 *
 * @author Equipo
 */
public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Mascota m1= new Mascota("fer", "chiquito", "perro");
        Mascota m2 = new Mascota("Pepa", "Filomena", "Perro");
        
        List <Mascota> mascotas = new ArrayList();
        
        mascotas.add(m1);
        mascotas.add(m2);
        
        Usuario u = new Usuario();
 
        u.setApellido("Santana");
        u.setSexo(SexoHumano.HOMBRE);
        u.setNacimiento(new Date(99, 10, 04));
        
        
            u.setMascotaFavorita(m1);
            u.setMascota(mascotas);
            
            System.out.println(u.toString());
        
        
//        Mascota m1 = new Mascota<RazaPerruna>("Fer","Chiquito","Gato");
//        m1.setRaza(RazaPerruna.BEAGLE);
//        System.out.println(m1.toString());
//        
//        Mascota m2 = new Mascota<RazaGatuna>("Pepa","Lola","Gato");
//        m2.setRaza(RazaGatuna.NARANJOSO);
//        
//        System.out.println(m2.toString());
        
//            System.out.println(RazaPerruna.BEAGLE.getCodigo());
//            System.out.println(RazaPerruna.BEAGLE.getValor());
//            System.out.println(RazaPerruna.BEAGLE);
//            System.out.println(RazaPerruna.BEAGLE.toString());
//            
//           Usuario u = new Usuario();
//           u.setSexo(SexoHumano.MUJER);
//           System.out.println(u.getSexo());
//
//        String razaInput = "BEAGLE";
//        
//        for (RazaPerruna aux : RazaPerruna.values()) {
//            
//            if (aux.toString().equals(razaInput)) {
//                System.out.println("RazaPerruna input es igual al enum " + aux);
//            }
            
//            if (aux.equals(razaInput)) {           NO SE PUEDE REALIZAR DE ESTA FORMA YA QUE NO ES EL MISMO TIPO DE DATO
//                System.out.println("RazaPerruna input es igual al enum " + aux);
//            }
            
            
            
//            
//        }
    }   
}
