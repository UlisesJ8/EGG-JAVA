/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotaapp.entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import mascotapp.enumeraciones.SexoHumano;

/**
 *
 * @author Equipo
 */
public class Usuario {
    
    public String nombre;
    public String apellido;
    public Integer dni;
    public Date nacimiento;
    public String pais;
    public SexoHumano sexo;
    private List<Mascota> mascota;
    
    private Mascota mascotaFavorita;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, Integer dni, Date nacimiento, String pais, SexoHumano sexo, List<Mascota> mascota, Mascota mascotaFavorita) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.sexo = sexo;
        this.mascota = mascota;
        this.mascotaFavorita = mascotaFavorita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public List<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(List<Mascota> mascota) {
        this.mascota = mascota;
    }

    public Mascota getMascotaFavorita() {
        return mascotaFavorita;
    }

    public void setMascotaFavorita(Mascota mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellido);
        hash = 67 * hash + Objects.hashCode(this.dni);
        hash = 67 * hash + Objects.hashCode(this.nacimiento);
        hash = 67 * hash + Objects.hashCode(this.pais);
        hash = 67 * hash + Objects.hashCode(this.sexo);
        hash = 67 * hash + Objects.hashCode(this.mascota);
        hash = 67 * hash + Objects.hashCode(this.mascotaFavorita);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nacimiento, other.nacimiento)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.mascota, other.mascota)) {
            return false;
        }
        return Objects.equals(this.mascotaFavorita, other.mascotaFavorita);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ",\n dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + ",\n mascota=" + mascota + ",\n mascotaFavorita=" + mascotaFavorita + '}';
    }
  
   

    
    
    
}
