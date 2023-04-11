/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej15;

/**
 *
 * @author Equipo
 */
public class PracJavaEj15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vector = new int[101];
        rellenarMatriz(vector);
        escribirMatriz(vector);
       
       
        
         
        
    }
    
    
    public static void rellenarMatriz(int[]vector){
     for(int i = 0; i < 101; i++){
            
        vector[i] = i;
        
        }
    
    }
   
    public static void escribirMatriz(int[]vector ){
    
    for(int i = 100; i > 0; i--){
            
             System.out.println(vector[i]);
        
        }
    }
   
    
}
