/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj05poocuentas;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prj05POOCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        CuentaServicio cuentaUsuario = new CuentaServicio();
        Cuenta nCuenta = cuentaUsuario.crearCuenta();
        
        int op = 0;
        do{
            System.out.println("Ingrese la opcion que desea realizar: ");
            System.out.println("1. Ingresar saldo");
            System.out.println("2. Retirar saldo");
            System.out.println("3. Extraccion rapida de saldo");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            op = reader.nextInt();
            switch(op){
                case 1:
                     cuentaUsuario.ingresar(nCuenta);
                    break;
                case 2:
                    cuentaUsuario.retirar(nCuenta);
                    break;
                case 3:
                    cuentaUsuario.extraccionRapida(nCuenta);
                    break;
                case 4:
                    cuentaUsuario.consultarSaldo(nCuenta);
                    break;
                case 5:
                    cuentaUsuario.consultarDatos(nCuenta);
                    break;
                case 6:
                    System.out.println("Usted salio del programa. Saludos");
                    break;
                   
                default: 
                    System.out.println("Usted ingreso una opcion incorrecta");
                    
            
            } 
        
        }while(op != 6);
 
        
    }
    
}
