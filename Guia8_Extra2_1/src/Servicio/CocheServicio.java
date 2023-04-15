/*Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla. */
package Servicio;

import Entidades.Coche;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class CocheServicio {
    Scanner leer = new Scanner(System.in);
    Coche auto = new Coche();
    
    public void crearCoche(Coche auto){
        System.out.print("Marca: ");
        auto.setMarca(leer.next());
        System.out.print("Modelo: ");
        auto.setModelo(leer.next());
        System.out.print("Precio: $");
        auto.setPrecio(leer.nextDouble());
    }
    
  
}
