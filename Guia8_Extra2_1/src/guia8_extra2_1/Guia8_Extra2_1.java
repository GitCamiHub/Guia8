
package guia8_extra2_1;

import Entidades.Coche;
import Servicio.CocheServicio;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia8_Extra2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CocheServicio c1 = new CocheServicio();
        
        Coche a1 = new Coche();
        Coche a2 = new Coche();
        Coche a3 = new Coche();
        
        System.out.println("Ingrese datos del auto");
        System.out.println("--------------------------");
        System.out.println("Auto 1.");
        c1.crearCoche(a1);
        System.out.println("--------------------------");
        System.out.println("Auto2.");
        c1.crearCoche(a2);
        System.out.println("--------------------------");
        System.out.println("Auto 3.");
        c1.crearCoche(a3);
        System.out.println(" ");
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        
    }
    
}
