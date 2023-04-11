
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Entidad.Voto;
import Utilidades.Comparador;
import java.util.Collections;

/**
 *
 * @author Equipo
 */
public class Simulador {
    ArrayList<Alumno> listaAlumn = new ArrayList();
    ArrayList<String> nombre = new ArrayList<>();
    ArrayList<String> apellido = new ArrayList<>();
    ArrayList<String> nombreCompleto = new ArrayList<>();
    ArrayList<Integer> dnis = new ArrayList<>();
    Scanner reader = new Scanner(System.in).useDelimiter("\n");
    Voto vot = new Voto();
    Alumno estudiante = new Alumno();
    
    public ArrayList<String> nombre(){
        nombre.add("Ulises");
        nombre.add("Julian");
        nombre.add("Juan");
        nombre.add("Martin");
        nombre.add("Santiago");
        nombre.add("Ian");
        nombre.add("Cristian");
        nombre.add("Thiago");
        nombre.add("Ariel Francisco");
        nombre.add("Faustino Franco");
        nombre.add("Sol");
        nombre.add("Modesta");
        nombre.add("Anna");
        nombre.add("Galo");
        nombre.add("Maxi");
        nombre.add("Marcelino");
        nombre.add("Poncio");
        nombre.add("Jeremias");
        nombre.add("Gustavo");

    return nombre;
    }
    
    public ArrayList<String> apellido(){
    apellido.add("Santana");
    apellido.add("Tafra");
    apellido.add("Fernandez");
    apellido.add("Rojas");
    apellido.add("Gonzalez");
    apellido.add("Sotelo");
    apellido.add("Andino");
    apellido.add("Donato");
    apellido.add("Rebollo");
    apellido.add("Pedraza");
    apellido.add("Riquelme");
    apellido.add("Llanos");
    apellido.add("Almeida");
    apellido.add("Valenciano");
    apellido.add("Pallares");
    apellido.add("Maza");
    apellido.add("Ribes");
    apellido.add("Molins");
    apellido.add("Torres");

    
    return apellido;
    }
    
    public ArrayList<String> nombreCompleto(ArrayList<String> nombre , ArrayList<String> apellido){
     Random r = new Random();
        for (int i = 0; i < nombre.size(); i++) {
        int numNombre = r.nextInt(nombre.size());
        int numApellido = r.nextInt(apellido.size());
        nombreCompleto.add( nombre.get(numNombre)+" "+ apellido.get(numApellido));
        
        }
    return nombreCompleto;
    }
    
    public ArrayList<Integer> generarDNI(ArrayList<String> nombreCompleto){
    int dni1;
    int min = 1000000;
    int max = 99999999;
    Random r = new Random();
    dni1 = (int) r.nextInt(max - min + 1) + min;
    
        for (int i = 0; i < nombreCompleto.size(); i++) {
            dni1 = (int) r.nextInt(max - min + 1) + min;
            dnis.add(dni1);
        }
    return dnis;
    }
    
    
    
    
    public ArrayList<Alumno> llenarAleatorio(ArrayList<String> nombreCompleto, ArrayList<Integer> dnis ){
        Random r = new Random();
        System.out.println("Ingresar la cantidad de usuarios que desee generar(min. 5 y max 17, en caso de seleccionar una opcion distinta se utilizara el min): ");
        int cont = reader.nextInt();
        boolean detectarDNI = false;
        if(cont < 5 || cont > 17){
           cont = 5; 
        }
            
            
        for (int i = 0; i < cont; i++) {       /// bucle for para crear los usuarios solicitados por el usuario
             int numNombre = r.nextInt(cont); // numero aleatorio de nombre entre 0 y 17
             int numDni = r.nextInt(cont); // numero aleatorio de dni entre 0 y 17
                if(i >= 1){   /// sentencia if para que se ejecute despues de que se cree el primer usuario
                    do{
                        detectarDNI = false;
                        
                    for (Alumno aux : listaAlumn) { // sentencia for para recorrer toda la lista de alumnos 
                        if (aux.getDNI() == dnis.get(numDni)) { // sentencia if para recorrer toda la lista de alumnos y encontrar si hay algun dni que ya se utilizo.
                            detectarDNI = true;
                            numDni = r.nextInt(cont); // numero aleatorio de dni entre 0 y 17
                            break; // con este break salis del bucle for de la lista de alumnos y se genera un numero numero aleatorio de dni
                        } 
                    }
                    
                    }while(detectarDNI == true);
                    
                    Alumno alum = new Alumno(nombreCompleto.get(numNombre), dnis.get(numDni));
                    listaAlumn.add(alum);// agrego estudiante a la lista de alumnos 
                    vot.setEstudiante(alum);// agrego estudiante a la clase voto
                }else{
                    Alumno alum = new Alumno(nombreCompleto.get(numNombre), dnis.get(numDni));
                    listaAlumn.add(alum); // agrego los estudiantes a la lista de alumnos
                    vot.setEstudiante(alum); // agrego estudiante a la clase voto
                   
                }
             
            
        }
        
        
        return listaAlumn;
    }
     

    public void imprimirAlumnos(ArrayList<Alumno>listaAlumn ){
        System.out.println(listaAlumn.toString());
        
    }
    
    
    
    
    // hasta aca voy bien

    public ArrayList<Voto> votacion (ArrayList<Alumno> listaAlumn){
        int numeroAleatorio;
        Random r = new Random();
        ArrayList<Voto> votacion = new ArrayList<>();

        for (Alumno aux : listaAlumn) {
            
            ArrayList<Alumno> votados = new ArrayList<>();
            
            int dniAlumno = aux.getDNI(); // Traigo el dni del alumno que es unico para que no se vote a si mismo. 
            numeroAleatorio = r.nextInt(listaAlumn.size()); // selecciono un numero aleatorio de la cantidad de la lista de alumnos.
 
            while(votados.size() < 3){    // While para  que la lista 
                
                if(dniAlumno !=  listaAlumn.get(numeroAleatorio).getDNI() ){
                    votados.add(listaAlumn.get(numeroAleatorio)); // Agrega el objeto alumno que fue votado
                    listaAlumn.get(numeroAleatorio).setCantidadVotos(listaAlumn.get(numeroAleatorio).getCantidadVotos() + 1); // agrego un voto al usuario seleccionado
                } 
                
                numeroAleatorio = r.nextInt(listaAlumn.size()); // selecciono un numero aleatorio de la cantidad de la lista de alumnos.
            }
            
            Voto vot1 = new Voto(votados, aux);
            votacion.add(vot1);

        }
            return votacion;
      
            
    }
 
       
    
   
    public void mostrarAlum(ArrayList<Alumno> listaAlumn, ArrayList<Voto> votando) {
        ArrayList<Voto> votos = votando;
            
        for (int i = 0; i < votando.size(); i++) { // hago un bucle con la cantidad de clases votos creadas
           
  
            System.out.println("--------------------------------------------------");
            System.out.println("Alumno: "+votando.get(i).getEstudiante().getNombreCompleto()); // imprimo por pantalla el alumno que esta siendo utilizado en el momento
            System.out.println("Cantidad de votos recibidos: " + votando.get(i).getEstudiante().getCantidadVotos()); // imprimo por pantalla la cantidad de votos del alumno utilizado en la lista

            System.out.println("Sus 3 votos fueron: ");
            ArrayList<String> nombres = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                nombres.add(votos.get(i).getVotados().get(j).getNombreCompleto()); // Agrego en un arraylist de String los nombres de los votados por la clase voto del alumno utilizado en I.
            }
            
           Collections.sort(nombres); // ordeno el arraylist en orden por nombre
          
            for (String aux : nombres) { // utilizo un for each para imprimir el arraylist String 
                System.out.println(aux);
            }
    
                
            }

        }

    
      
    public void recuentoVotos(ArrayList<Alumno> listaAlumn){
        int cantidadVotos = 0;
        for (Alumno alumno : listaAlumn) {
            cantidadVotos = cantidadVotos +alumno.getCantidadVotos();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("La cantidad de Votos es de: " + cantidadVotos);
        System.out.println("--------------------------------------------------");
    }
    
    
    
    
    
    
    public void facilitadores(ArrayList<Alumno> listaAlumn){
        
       ArrayList<String>facilitadores1 = new ArrayList<>();
       ArrayList<String>facilitadoresSuplentes = new ArrayList<>();
       ArrayList<Alumno>ordenar = listaAlumn;
       
       
       Collections.sort(ordenar, Comparador.comparatorVotos);
       
        for (Alumno aux3 : listaAlumn) {
            
            if(facilitadores1.size() < 5){
            facilitadores1.add(aux3.getNombreCompleto());
            
            }else{
            facilitadoresSuplentes.add(aux3.getNombreCompleto());
            }
        
        }
        
        
        
        
        
        
        System.out.println("Facilitadores:");
        for (String aux : facilitadores1) {
            System.out.println(aux);
        }
       
        
        System.out.println("---------------------------------------------------");
        
        
        System.out.println("Facilitadores Suplentes:");
        for (String aux2 : facilitadoresSuplentes) {
            System.out.println(aux2);
        }
       
       
        
    }
    
    
    
    
    
    
    
    public Simulador() {
    }

    public ArrayList<Alumno> getListaAlumn() {
        return listaAlumn;
    }

    public void setListaAlumn(ArrayList<Alumno> listaAlumn) {
        this.listaAlumn = listaAlumn;
    }

    public Voto getVot() {
        return vot;
    }

    public void setVot(Voto vot) {
        this.vot = vot;
    }

    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getApellido() {
        return apellido;
    }

    public void setApellido(ArrayList<String> apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Integer> getDnis() {
        return dnis;
    }

    public void setDnis(ArrayList<Integer> dnis) {
        this.dnis = dnis;
    }

    public Scanner getReader() {
        return reader;
    }

    public void setReader(Scanner reader) {
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "Simulador{" + "listaAlumn=" + listaAlumn + ", reader=" + reader + ", vot=" + vot + ", estudiante=" + estudiante + '}';
    }

  

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
