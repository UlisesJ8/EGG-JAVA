/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej12;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class PracJavaEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mensaje;
        int longi;
        char Ol;
        char Ll;
        do{
        System.out.println("Hola soy el dispositivo RS232");
        System.out.println("Ingrese una palabra o frase de 5 caracteres que inicie con X y termine en O :");
        System.out.println("Si desea salir ingrese la cadena: &&&&&");
        mensaje = leer.nextLine();
        mensaje = mensaje.toLowerCase();
        longi = mensaje.length();
        Ol = mensaje.charAt(0);
        Ll = mensaje.charAt(longi-1);
            
            if(longi == 5 && Ol == 'x' && Ll == 'o'){
            System.out.println("Secuencia correcta");
            }else if(mensaje.equals("&&&&&") == true){
            System.out.println("Usted salio del programa");
            break;
            }else{
            System.out.println("Secuencia incorrecta");
            }
            
        }while(mensaje.equals("&&&&&") != true);
        
        
        
        
    }
    
}
