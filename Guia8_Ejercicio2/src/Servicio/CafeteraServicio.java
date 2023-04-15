/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe
el tamaño de la taza y simula la acción de servir la taza con la capacidad
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede. El método le informará al usuario si se llenó o no 
la taza, y de no haberse llenado en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
-Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in);
   
    
    public void llenarCafetera(Cafetera cafe){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
       
    }
    
    public void servirTaza(Cafetera cafe){
        System.out.println("Tamaño de la taza (mL):");
        int tamaño = leer.nextInt();
        
        if (tamaño<=cafe.getCantidadActual()){
            cafe.setCantidadActual(cafe.getCantidadActual() - tamaño);
            System.out.println("Taza llena");
        }else{
            System.out.println("No se pudo llenar la taza, quedó con " + cafe.getCantidadActual() + "mL");
            cafe.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafe){
        System.out.println("Cuanto café desea agregar?");
        int agregar = leer.nextInt();
        
        if (agregar + cafe.getCantidadActual()<= cafe.getCapacidadMaxima()){
            cafe.setCantidadActual(cafe.getCantidadActual()+ agregar);
        }else{
            System.out.println("No es posible agregar esa cantidad ya que supera la capacidad máxima.");
        }
    }
}