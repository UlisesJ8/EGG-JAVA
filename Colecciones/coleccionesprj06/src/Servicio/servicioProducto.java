/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeDebug.map;

/**
 *
 * @author Equipo
 */
public class servicioProducto {
    private HashMap<String, Double> listaProductos;
    private Scanner reader;
    Producto produc = new Producto();
    public servicioProducto(){
        this.listaProductos = new HashMap<>();
        this.reader = new Scanner(System.in).useDelimiter("\n");
            
    }
    
    public Producto cargarProducto(){
        String pro;
        Double pre;
        System.out.println("Ingrese el nombre del Producto");
        pro = reader.nextLine();
        produc.setProducto(pro);
        System.out.println("Ingrese el precio del Producto");
        pre = reader.nextDouble();
        reader.nextLine();
        produc.setPrecio(pre);
        listaProductos.put(pro, pre);
        return new Producto(produc.getProducto(), produc.getPrecio());
    }
    
    public void modificarPrecio(String cambio){
        int cont = 0;
        double nuevoPrecio = 0;
        
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            if(listaProductos.containsKey(cambio)  && (cont < 1) ){
            System.out.println("Ingrese el nuevo precio del producto: " + cambio);
            nuevoPrecio = reader.nextDouble();
            listaProductos.put(key, nuevoPrecio);
            cont += 1;
            }
            
        }

        if (cont == 0) {
            System.out.println("Lo lamento el producto que ingreso no se encuentra en la lista");
        }
    
    }
    
    public void eliminarProducto(String eli){
        listaProductos.remove(eli);
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + "\n"+ "Precio: $" + entry.getValue());
            
        }
    
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

