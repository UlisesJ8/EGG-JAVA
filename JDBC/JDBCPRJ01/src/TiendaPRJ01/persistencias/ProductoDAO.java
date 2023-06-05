/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaPRJ01.persistencias;

import TiendaPRJ01.entidades.Fabricante.FabricanteService;
import TiendaPRJ01.entidades.Producto.Producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Equipo
 */
public final class ProductoDAO extends DAO {
   // private final FabricanteService serviciofabricante;
    
    public Collection<Producto> listaProductos() throws Exception{

        try {
            String sql = "Select * from Producto"; 
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto>listaProductos = new ArrayList<Producto>();
            
        while (resultado.next()) {
            producto = new Producto();
            producto.setCodigo(resultado.getInt(1));
            producto.setNombre(resultado.getString(2));
            producto.setPrecio(resultado.getDouble(3));
            producto.setCodigo_fabricante(resultado.getInt(4));
            listaProductos.add(producto);
        }
            desconectarBase();
            return listaProductos;
            
        } catch (Exception e) {
        e.printStackTrace();
         desconectarBase();
        throw e;
        }
        
    }
    
        public Collection<Producto> productosEntre() throws Exception{
        
            try {
                String sql = "SELECT * FROM PRODUCTO WHERE precio >= 120 AND precio <= 202";
                consultarBase(sql);
                Producto producto = null;
                Collection<Producto>listaProductosEntre = new ArrayList<Producto>();
                while (resultado.next()) {
                    producto = new Producto(resultado.getInt(1), resultado.getString(2), resultado.getDouble(3), resultado.getInt(4));
                    listaProductosEntre.add(producto);
                }
                 desconectarBase();
                return listaProductosEntre;
            } catch (Exception e) {
                e.printStackTrace();
                desconectarBase();
                throw e;
            }

        }
        
        public Collection<Producto> portatil() throws Exception{
        
            try {
                String sql = "SELECT * FROM PRODUCTO WHERE nombre like '%Portatil%'";
                consultarBase(sql);
                Producto producto = null;
                Collection<Producto>listaPortatiles = new ArrayList<Producto>();
                while (resultado.next()) {
                    producto = new Producto(resultado.getInt(1), resultado.getString(2), resultado.getDouble(3), resultado.getInt(4));
                    listaPortatiles.add(producto);
                }
                 desconectarBase();
                return listaPortatiles;
            } catch (Exception e) {
                e.printStackTrace();
                 desconectarBase();
                throw e;
            }

        }
        
        public Producto barato() throws Exception{
        
            try {
                
                String sql = "SELECT nombre, precio FROM PRODUCTO order by precio asc limit 1 ";
                consultarBase(sql);
                Producto product = new Producto();
                while(resultado.next()){
                product.setNombre(resultado.getString(1));
                product.setPrecio(resultado.getDouble(2));
                }
                desconectarBase();
                return product;
            } catch (Exception e) {
                e.printStackTrace();
                 desconectarBase();
                throw e;
            }
  
        }
        
        public void IngresarProducto (Producto producto) throws Exception{
        
            try {
                if (producto == null) {
                    throw new Exception("Debe indicar producto");
                }
                String sql = "INSERT INTO Producto ( nombre, precio, codigo_fabricante) "
                    + "VALUES (  '" + producto.getNombre() + "' ," + producto.getPrecio() + " , " + producto.getCodigo_fabricante()+ " );";
                insertarModificarEliminar(sql);
                
            } catch (Exception e) {
                throw e;
            
            }finally{
                desconectarBase();
            }

        }
        
        public boolean comprobarProducto(int codP) throws Exception{
        boolean comprobar = false;
        try {
            String sql = "SELECT codigo FROM producto ;";
            consultarBase(sql);
            while (resultado.next()) {
                if (codP == resultado.getInt(1)) {
                    comprobar = true;
                    break;
                }
            }
           desconectarBase();
            return comprobar;
        } catch (Exception e) {
            e.printStackTrace();
             desconectarBase();
            throw e;
        }
 
        }
        
        public void modificarProducto(int codP, String nombreP, double precioP,int codF) throws Exception{
        
            try {
                String sql = "UPDATE Producto SET "
                        + "nombre = '"+ nombreP + "',  precio = "+ precioP + ", codigo_fabricante = " + codF  
                        + " Where codigo = " + codP + ";";
                
                insertarModificarEliminar(sql);
            } catch (Exception e) {
            
            
            
            }finally{
                 desconectarBase();
            }
        
        
        
        
        
        }
        
        
        
        
        
        
    }
    

