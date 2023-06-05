/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesprj02;

/**
 *
 * @author Equipo
 */
public class ExcepcionesPrj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = new int[5];
        
        try{
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println("Se paso de largo vuelve a arreglar el array");
        
        
        
        }
        
    }
    
}
