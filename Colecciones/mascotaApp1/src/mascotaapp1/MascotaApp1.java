/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import mascotaapp.entidades.Mascota;
import mascotaapp.servicio.ServicioMascota;
import mascotaapp.utilidades.Comparadores;

/**
 *
 * @author Equipo
 */
public class MascotaApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        String[] nombresaArray = new String[5];
        for (int i = 0; i < nombresaArray.length; i++) {
            nombresaArray[i] = "Chiquito "+ i;
        }
        
        for (String var : nombresaArray) {
            System.out.println(var);
        }
        
        //Collections
        
        ArrayList<String> nombresArrayList = new ArrayList();
        
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        System.out.println(nombresArrayList.size());//3
        
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList.size());
        
        System.out.println(Integer.MAX_VALUE); // apretar integer con control para ver funcion . Esto va a mostrar el maximo valor de un array
        */
//       
//       ServicioMascota servMasc = new ServicioMascota();
//       servMasc.fabricaMascotas(1);
//       servMasc.eliminarMascotaPorNombre("Lola");
//       servMasc.mostrarMascotas();
       
       
//       servMasc.crearMascota();
//       servMasc.crearMascota();
//        
//        
//        servMasc.mostrarMascotas();
        
//        servMasc.fabricaChiquitos(40);
//        
//        servMasc.mostrarMascotas();
//        
//        servMasc.fabricaMascotas(2);
//        
//         servMasc.mostrarMascotas();
        
//        servMasc.fabricaMascotas(1);
//        servMasc.mostrarMascotas();
//        servMasc.actualizarMascota(0);
//        servMasc.mostrarMascotas();
//        servMasc.eliminarMascota(3);
//        servMasc.mostrarMascotas();

//        String[] nombres = {"pepe", "pepa"};
//        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
//        List <String> nombresList2 = new ArrayList();
//        nombresList2.addAll(0,nombresList);

//          List<String> nombres = new ArrayList();
//          nombres.add("Lola");
//          nombres.add("Roman");
//          nombres.add("Chiquito");
//          
//          Iterator<String> it = nombres.iterator();
//           while (it.hasNext()) {
//            String aux = it.next();
//               if (aux.equals("Lola")) {
//                   it.remove();
//               }
//               
//        }
//           nombres.forEach((e)-> System.out.println(e));
          
//          for (String aux : nombres) {     NO ES FACIL DE HACER FUNCIONAR. PRODUCE ERROR PORQUE RECORRE LA LISTA Y SE ELIMINAN LOS OBJETOS
//              if(aux.equals("Lola")){
//              nombres.remove(aux);
//              }
////              System.out.println(aux);
//        }
//          for (int i = 0; i < nombres.size(); i++) {
////              System.out.println(nombres.get(i));
//              
//              String m = nombres.get(i);
//              if(m.equals("Lola")){
//              nombres.remove(m);
//              }
//        }

//
//          nombres.forEach((e)-> System.out.println(e));
//          
//            nombres.stream().count();
          
//          
//        ArrayList<Mascota> mascotas = new ArrayList();
//        mascotas.add(new Mascota("FER","chiquito","Perro"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        
//        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
//        Collections.shuffle(mascotas);
//        
//        
//        
//          for (Mascota mascota : mascotas) {
//              System.out.println(mascota);
//        }
//
//          TreeSet<Mascota> mascotas = new TreeSet();
//          mascotas.add(new Mascota("Fer","Chiquito", "Perro"));
//          mascotas.add(new Mascota("Fer","Chiquito", "Perro"));
//          mascotas.add(new Mascota("Fer","Chiquito", "Perro"));
//          mascotas.add(new Mascota("Fer","Chiquito", "Perro"));
//          mascotas.add(new Mascota("Fer","Chiquito", "Perro"));
//          mascotas.add(new Mascota("Fer","Chiquito", "Perro"));
//          mascotas.add(new Mascota("Fer","Chiquito", "Perro"));
//          mascotas.add(new Mascota("Pepa","Lola", "Gato"));
//          mascotas.add(new Mascota("Pepa","Lola", "Gato"));
//          mascotas.add(new Mascota("Pepa","Lola", "Gato"));
//          mascotas.add(new Mascota("Pepa","Lola", "Gato"));
//          mascotas.add(new Mascota("Pepa","Lola", "Gato"));
//          mascotas.add(new Mascota("ZZZ","ZZZ", "ZZZ"));
//          
//          
//          
//          for (Mascota mascota : mascotas) {
//              System.out.println(mascota);
//        }

           HashMap<String, Mascota> mascotas = new HashMap();
           
           mascotas.put("1", new Mascota("Fer", "Chiquito", "Perro"));
           mascotas.put("2", new Mascota("Pepa", "Lola", "Gato"));
           
           
           
//            mascotas.remove("1", new Mascota("Fer", "Chiquito", "Perro")); forma de remover
//            mascotas.remove("1"); Forma de remover elemento
//           nombres.put(1, "Chiquito");
//           nombres.put(Integer.MAX_VALUE, "Lola");
//           
          for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota value = aux.getValue();
           
               System.out.println("key "+ key + " value "+value);
            
        }

          
    }
    
}
