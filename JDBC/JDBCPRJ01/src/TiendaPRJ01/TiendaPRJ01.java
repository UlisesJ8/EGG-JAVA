/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TiendaPRJ01;

import TiendaPRJ01.entidades.Fabricante.FabricanteService;
import TiendaPRJ01.entidades.Producto.Producto;
import TiendaPRJ01.entidades.Producto.ProductoService;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class TiendaPRJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     Scanner reader = new Scanner(System.in);
     ProductoService productserv = new ProductoService();
     FabricanteService fabricanteserv = new FabricanteService();
     int op;
     
        do{
        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Lista nombres de productos");
        System.out.println("2. Lista con nombre y precio de los productos");
        System.out.println("3. Lista de productos de precio 120-202");
        System.out.println("4. Lista de Portatiles");
        System.out.println("5. Nombre y Precio del producto mas barato");
        System.out.println("6. Ingresar un producto a la base de datos");
        System.out.println("7. Ingresa un fabricante a la base de datos");
        System.out.println("8. Editar un producto con datos a eleccion");
        System.out.println("9.Salir");
        op = reader.nextInt();
        
        switch (op) {
            case 1:
                try {
                  productserv.imprimirProductosNombres();
                } catch (Exception e) {
                  System.out.println("Error la lista de productos no tiene nombres");
                  throw e;
                }
               
                break;
            case 2:
                try {
                 productserv.imprimirProductosNombresYPrecio();
                } catch (Exception e) {
                    System.out.println("Error la lista no tiene productos");
                    throw e;
                }
                break;
            case 3:
                 try {
                 productserv.imprimirProductosEntre();
                } catch (Exception e) {
                    System.out.println("Error la lista no tiene productos entre 120 y 202");
                    throw e;
                }
                break;
            case 4:
                try {
                   productserv.imprimirPortatiles();
                } catch (Exception e) {
                    System.out.println("Error la lista no tiene Portatiles");
                    throw e;
                }
                break;
            case 5:
                try {
                    productserv.productoBarato();
                } catch (Exception e) {
                    System.out.println("No hay producto barato");
                }
                break;
            case 6:
                try {
                    reader.nextLine();
                    System.out.println("Ingrese nombre Producto");
                    String nombre = reader.nextLine();
                    System.out.println("Ingrese precio producto");
                    double precio = reader.nextDouble();
                    System.out.println("Ingrese codigo fabricante");
                    int codigo_fabricante = reader.nextInt();
                    //productserv.CrearProducto("ulises", 200, 15);
                    productserv.CrearProducto(nombre, precio, codigo_fabricante);
            } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
            }
                break;
            case 7:
                try {
                    reader.nextLine();
                    System.out.println("Ingrese nombre del fabricante");
                    String nombreFabricante = reader.nextLine();
                    fabricanteserv.CrearFabricante(nombreFabricante);
            } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
            }
                break;
            case 8:
                try {
                    System.out.println("Usted esta editando un producto!");
                    System.out.println("Ingrese el codigo del producto que desee modificar");
                    int codP = reader.nextInt();
                    productserv.comprobarProducto(codP);
                    reader.nextLine();
                    System.out.println("Ingrese el nuevo nombre del producto");
                    String nombreP = reader.nextLine();
                    System.out.println("Ingrese el nuevo precio del producto");
                    double precioP = reader.nextDouble();
                    System.out.println("Ingrese el nuevo codigo del fabricante");
                    int codF = reader.nextInt();
                    fabricanteserv.comprobarFabricante(codF);
                    productserv.ModificarProducto(codP, nombreP, precioP, codF);
                    
            } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
            }
                break;
            case 9:
                System.out.println("Saliste del programa. Hasta Luego!!!");
                break;
            default:
                throw new AssertionError();
        }
        }while(op != 9);
    }
    
}
