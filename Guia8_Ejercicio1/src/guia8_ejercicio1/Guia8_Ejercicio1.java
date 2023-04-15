
package guia8_ejercicio1;

import Entidad.CuentaBancaria;
import Servicio.ServicioCuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia8_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ServicioCuentaBancaria s1 = new ServicioCuentaBancaria();
     CuentaBancaria cuenta1 = new CuentaBancaria();
     cuenta1 = s1.crearCuenta(cuenta1);//llegan los 3 datos
     int opcion;
     do{
        System.out.println(" ");
        System.out.println("Elija una opcion:");
        System.out.println("1.Ingresar dinero");
        System.out.println("2.Retirar dinero");
        System.out.println("3.Extracción rápida");
        System.out.println("4.Consultar saldo");
        System.out.println("5.Consultar datos");
        System.out.println("6.Salir");
        System.out.println(" ");
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();
     
        switch (opcion) {
            case 1:
                s1.ingresar(cuenta1);
                break;
            case 2:
                s1.retirar(cuenta1);
                break;
            case 3:
                s1.extraccionRapida(cuenta1);
                break;
            case 4:
                s1.consultarSaldo(cuenta1);
                break;
            case 5:
                s1.consultarDatos(cuenta1);
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
           
            default:
                System.out.println("Elija una opcion correcta");
        }
     
    }while (opcion!=6);
    
}
}
