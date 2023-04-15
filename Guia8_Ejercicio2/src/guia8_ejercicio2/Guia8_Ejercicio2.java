
package guia8_ejercicio2;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;


/**
 *
 * @author BANGHO
 */
public class Guia8_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio c1 = new CafeteraServicio();
        Cafetera cafe = new Cafetera();
        int opcion;
        do{
        System.out.println(" ");
        System.out.println("Elija una opcion:");
        System.out.println("1.Llenar cafetera");
        System.out.println("2.Servir taza");
        System.out.println("3.Vaciar cafetera");
        System.out.println("4.Agregar cafe");
        System.out.println("5.Ver estado de cafetera");
        System.out.println("6.Salir");
        System.out.println(" ");
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();
     
        switch (opcion) {
            case 1:
                c1.llenarCafetera(cafe);
                break;
            case 2:
                c1.servirTaza(cafe);
                break;
            case 3:
               c1.vaciarCafetera(cafe);
                break;
            case 4:
               c1.agregarCafe(cafe);
                break;
            case 5:
                System.out.println(cafe.toString());
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
