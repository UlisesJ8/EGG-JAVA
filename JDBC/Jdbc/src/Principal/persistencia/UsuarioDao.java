/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.persistencia;

import Principal.dominio.usuario.Usuario;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Equipo
 */
public final class UsuarioDao extends DAO {

    public void guardarUsuario(Usuario usuario) throws Exception {

        try {
            if (usuario == null) {
                throw new Exception("Debe indicar un usuario");
            }

            String sql = "INSERT INTO Usuario(correoElectronico, clave)"
                    + "VALUES ( ' " + usuario.getCorreoElectronico() + " ' , ' " + usuario.getClave() + "' );";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception {

        try {
            if (usuario == null) {
                throw new Exception("Debe indicar un usuario que desea modificar");
            }

            String sql = "UPDATE Usuario SET"
                    + "clave = '" + usuario.getClave() + " ' WHERE correoElectronico =  ' " + usuario.getCorreoElectronico() + "';";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void EliminarUsuario(String correoElectronico) throws Exception {
        
        try {
            String sql = "DELETE FROM Usuario WHERE correoElectronico = ' " + correoElectronico + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw  e;
        }
        
        
        
        
    }
    
    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception{
    
        try {
            
            String sql = "Select * FROM Usuario "
                    + "WHERE correoElectronico = '" + correoElectronico + "'";
            consultarBase(sql);
            
            Usuario usuario = null;
            
            while (resultado.next()) {                
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    
    
    
    }
    
     public Usuario buscarUsuarioPorId(Integer id) throws Exception {
        try {

            String sql = "SELECT * FROM Usuario "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    
    
    
    
    public Collection<Usuario> listarUsuarios() throws Exception {
        try {
            String sql = "Select correoElectronico, clave FROM Usuario";
            consultarBase(sql);
            Usuario usuario = null;
            Collection<Usuario> usuarios = new ArrayList<>();
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setCorreoElectronico(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
                usuarios.add(usuario);
            }
            desconectarBase();
            return usuarios;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw  new Exception("Error de sistema");
        
        }
    
    
    
    
    
    
    }
}
