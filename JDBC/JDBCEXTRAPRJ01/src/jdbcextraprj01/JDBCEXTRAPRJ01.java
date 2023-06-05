/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcextraprj01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import jdbcextraprj01.dominio.Casas.CasasService;
import jdbcextraprj01.dominio.Clientes.ClientesService;
import jdbcextraprj01.dominio.Estancias.EstanciasService;
import jdbcextraprj01.dominio.Familias.FamiliasService;

/**
 *
 * @author Equipo
 */
public class JDBCEXTRAPRJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FamiliasService family = new FamiliasService();
        ClientesService cliente = new ClientesService();
        CasasService house = new CasasService();
        EstanciasService estanciaServi = new EstanciasService();
        int op;
        do {
            try {
                System.out.println("-----MENU-----");
                System.out.println("1. Familias con menos de 3 hijos y con edad maxima de 10 anios");
                System.out.println("2. Casas disponibles entre 1 de agosto de 2020 y 31 de agosto de 2020 en Reino Unido");
                System.out.println("3. Familias cuya direccion de mail es HOTMAIL");
                System.out.println("4. Casas disponibles para fecha dada y numero especifico de dias");
                System.out.println("5. Clientes que realizaron una estancia y discripcion de la casa");
                System.out.println("6. Las estancias que han sido reservadas por un cliente, mostrar el nombre, país, ciudad del cliente y además la información de la casa que reservó.");
                System.out.println("7. Incrementar el precio de las casa un 5% por la devaluacion. Mostrar las mismas actualizadas");
                System.out.println("8. Numero de casas en cada pais");
                System.out.println("9. Casas de Reino Unido que tienen el comentario de limpias");
                System.out.println("10. Insertar nuevos datos en la tabla estancias verificando la disponibilidad de fechas ");
                System.out.println("11. Salir.");
                op = reader.nextInt();
                switch (op) {
                    case 1:
                try {
                    family.Familias3Hy10a();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 2:
                 try {
                     LocalDate fecha_desde = LocalDate.of(2020, 8, 01);
                     LocalDate fecha_hasta = LocalDate.of(2020, 8, 31);
                     house.AlquilerEntrePeriodo(fecha_desde, fecha_hasta);
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 3:
                 try {
                     cliente.email();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 4:
                 try {
                     System.out.println("Ingrese la fecha del alquiler(dia-mes-anio)");
                     int dia = reader.nextInt();
                     int mes = reader.nextInt();
                     int anio = reader.nextInt();
                     LocalDate fechaAlquiler = LocalDate.of(anio, mes, dia);
                     System.out.println("Ingrese la cantidad de dias que se va a quedar");
                     int estadia = reader.nextInt();
                     LocalDate fechaFinAlqui = fechaAlquiler.plusDays(estadia);
                     house.AlquilerFechaDada(fechaAlquiler, fechaFinAlqui, estadia);
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 5:
                 try {
                     cliente.ClientesQueAlquilaron();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 6:
                 try {
                     cliente.ClientesQueAlquilaronMenosDatosCli();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 7:
                 try {
                     house.AumentarPrecio();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 8:
                 try {
                     house.NumCasasPais();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 9:
                 try {
                     house.HouseKindomClear();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 10:
                 try {
                     reader.nextLine();
                     System.out.println("Ingrese su nombre:");
                     String nombre = reader.nextLine();
                     System.out.println("Ingrese su calle:");
                     String calle= reader.nextLine();
                     System.out.println("Ingrese el numero de la calle:");
                     int numero = reader.nextInt();
                     System.out.println("Ingrese el codigo postal: ");
                     reader.nextLine();
                     String CP = reader.nextLine();
                     System.out.println("Ingrese su ciudad: ");
                     String ciudad= reader.nextLine();
                     System.out.println("Ingrese su pais: ");
                     String pais= reader.nextLine();
                     System.out.println("Ingrese su email");
                     String email= reader.nextLine();
                     System.out.println("Fecha desde cual se va a quedar(dia,mes, anio)");
                     int dia = reader.nextInt(); int mes =reader.nextInt(); int anio = reader.nextInt();
                     LocalDate fecha_desde = LocalDate.of(anio, mes, dia);
                     System.out.println("Fecha en la que se retirara del lugar(dia,mes, anio)");
                     int dia2 = reader.nextInt(); int mes2 =reader.nextInt(); int anio2 = reader.nextInt();
                     LocalDate fecha_hasta = LocalDate.of(anio2, mes2, dia2);
                     System.out.println("Ingrese en la casa que se va a quedar!");
                     System.out.println("1. Cow Gate - Edinburg - Reino Unido");
                     System.out.println("2. Royal Mile - Edinburg - Reino Unido");
                     System.out.println("3. Bath - Bath - Reino Unido");
                     System.out.println("4. Station Road - York - Reino Unido");
                     System.out.println("5. Minster Road - Bristol - Reino Unido ");
                     System.out.println("6. St. Andrews - Londo - Reino Unido");
                     System.out.println("7. Londo - Dublin - Irlanda");
                     System.out.println("8. Tulipanes - Amsterdan - Holanda");
                     int op1 = reader.nextInt();
                     estanciaServi.SubirEstancia(nombre,calle, numero, CP, ciudad, pais, email, fecha_desde, fecha_hasta, op1);
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    case 11:
                        System.out.println("Usted salio del programa! HASTA LUEGO.");
                        break;
                    default:
                        System.out.println("Usted ingreso una opcion incorrecta. Reintentelo");
                        break;
                }
            } catch (Exception e) {
                throw e;
            }

        } while (op != 11);
    }

}
