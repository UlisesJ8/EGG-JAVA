/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mascotapp.enumeraciones;

/**
 *
 * @author Equipo
 */
public enum RazaPerruna {
    BEAGLE(32131, "Beagle"), COCKER(2323, "Cocker"), PITBULL(553, "Pitbull"), BORDER_COLLIE(33411, "Border Collie");

    private Integer codigo;
    private String valor;
    
    private RazaPerruna(Integer codigo, String valor){
        this.codigo = codigo;
        this.valor = valor;
    
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
    
    
    

}
