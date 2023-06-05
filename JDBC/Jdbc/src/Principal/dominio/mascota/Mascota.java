/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.dominio.mascota;

import Principal.dominio.usuario.Usuario;

/**
 *
 * @author Equipo
 */
public class Mascota {
      private int id;
    private String apodo;
    private String Raza;
    private Usuario usuario;

    public Mascota() {
    }

    public Mascota(int id, String apodo, String RAZA, Usuario usuario) {
        this.id = id;
        this.apodo = apodo;
        this.Raza = Raza;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", apodo=" + apodo + ", RAZA=" + Raza + ", usuario=" + usuario + '}';
    }
    
}
