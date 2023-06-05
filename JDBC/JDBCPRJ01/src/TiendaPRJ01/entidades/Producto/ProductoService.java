/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaPRJ01.entidades.Producto;


import TiendaPRJ01.entidades.Fabricante.FabricanteService;
import TiendaPRJ01.persistencias.ProductoDAO;
import java.util.Collection;


/**
 *
 * @author Equipo
 */
public class ProductoService {
    
    private ProductoDAO dao;
    private FabricanteService servicioFabricante = new FabricanteService();
    
    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public Collection<Producto> listarProductos() throws Exception{
    
        try {
            Collection<Producto>Productos = dao.listaProductos();    
            return Productos;
        } catch (Exception e) {
            throw e;
        }
    
    
    }

    public void imprimirProductosNombres() throws Exception{
        
        try {
            Collection<Producto>Productos = listarProductos();
            if (Productos.isEmpty()) {
                throw new Exception("Error. No exite producto para imprimir");
            }else{
                for (Producto u : Productos) {
                    System.out.println(u.getNombre()); 
                }
            }
            }catch (Exception e) {
            throw e;
         }

    }
    

    public void imprimirProductosNombresYPrecio() throws Exception{
        
        try {
            Collection<Producto>Productos = listarProductos();
            if (Productos.isEmpty()) {
                throw new Exception("Error. No exite producto para imprimir");
            }else{
                for (Producto u : Productos) {
                    System.out.println("Nombre: " + u.getNombre() + ", Precio: " + u.getPrecio() ); 
                }
            }
            }catch (Exception e) {
            throw e;
         }

    }
    
     public Collection<Producto> productosEntre() throws Exception{
    
        try {
            Collection<Producto>ProductosEntre = dao.productosEntre();
            return ProductosEntre;
        } catch (Exception e) {
            throw e;
        }
    
    
    }
    
     public void imprimirProductosEntre() throws Exception{
        
        try {
            Collection<Producto>productosEntre = productosEntre();
            if (productosEntre.isEmpty()) {
                throw new Exception("Error. No exite producto para imprimir");
            }else{
                for (Producto u : productosEntre) {
                    System.out.println(u.getNombre()); 
                }
            }
            }catch (Exception e) {
            throw e;
         }

    }
    
     public Collection<Producto> portatiles() throws Exception{
     
         try {
             Collection<Producto>portatiles = dao.portatil();
             return portatiles;  
         } catch (Exception e) {
         throw e;
         }
     }
    
    public void imprimirPortatiles() throws Exception{
    
        try {
            Collection<Producto>portatiles = portatiles();
            if (portatiles.isEmpty()) {
                throw new Exception("No existen portatiles");
            } else {
                for (Producto u : portatiles) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        
        }
        }
        
    public void productoBarato() throws Exception{
        
        try {
            Producto produc = dao.barato();
            if (produc == null) {
                throw new Exception("No exite el producto barato");
            } else {
                System.out.println("Producto mas barato");
                System.out.println("Nombre:" + produc.getNombre() + ", Precio: " + produc.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }

    }

    
    public void CrearProducto (String nombre, double precio, int codigo_fabricante) throws Exception{
            
        try{
            
        if (nombre == null || nombre.trim().isEmpty()) {
           throw new  Exception("No ingreso un nombre");
        }
        if (precio < 0 ) {
           throw new  Exception("No ingreso un precio");
        }
       
        if (codigo_fabricante <= 0 || servicioFabricante.comprobarFabricante(codigo_fabricante) == false) {
           throw new  Exception("No ingreso un codigo de fabricante existente");
        }
        
        Producto produc = new Producto();
        produc.setNombre(nombre);
        produc.setPrecio(precio);
        produc.setCodigo_fabricante(codigo_fabricante);
        dao.IngresarProducto(produc);
        }catch(Exception e){
        
        throw e;
        }
    }
    
    public void comprobarProducto(int codP) throws Exception{
        boolean comprobar = false;
        try {
            comprobar = dao.comprobarProducto(codP);
            if (comprobar == false) {
                throw new Exception("No existe el producto");
            }
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    public void ModificarProducto(int codP, String nombreP,double precioP,int codF) throws Exception{
    
        try {
            if (nombreP == null || nombreP.trim().isEmpty()) {
           throw new  Exception("No ingreso un nombre");
        }
        if (precioP < 0 ) {
           throw new  Exception("No ingreso un precio");
        }
       
        if (codF <= 0 || servicioFabricante.comprobarFabricante(codF) == false) {
           throw new  Exception("No ingreso un codigo de fabricante existente");
        }
           dao.modificarProducto(codP, nombreP, precioP, codF);
        } catch (Exception e) {
            throw e;
        }
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
