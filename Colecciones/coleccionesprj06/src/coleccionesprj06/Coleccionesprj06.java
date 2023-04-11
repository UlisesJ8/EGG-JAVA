/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesprj06;

import Entidad.Producto;
import Servicio.servicioProducto;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Coleccionesprj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Producto pro = new Producto();
        Servicio.servicioProducto product = new servicioProducto();
        int op = 0;
        String eli = "";
        do {
            System.out.println("-----MENU------");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Modificar precio de un producto ingresado");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Productos");
            System.out.println("5. Salir");
            op = reader.nextInt();
            switch (op) {
                case 1:
                 product.cargarProducto();
                 break;
                case 2:
                    System.out.println("Que producto desea cambiar el precio?");
                    reader.nextLine();
                    String cambio = reader.nextLine();
                    product.modificarPrecio(cambio);
                    break;
                case 3:
                    System.out.println("Que producto desea eliminar?");
                    reader.nextLine();
                    eli = reader.nextLine();
                    product.eliminarProducto(eli);
                    break;
                case 4:
                    product.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Usted salio del programa. Hasta Luego!");
                    break;
                default:
                    System.out.println("Usted ingreso una opcion incorrecta. Reintente nuevamente");
                    break;

            }

        } while (op != 5);


        
        
        
        
        
    }
    
}
