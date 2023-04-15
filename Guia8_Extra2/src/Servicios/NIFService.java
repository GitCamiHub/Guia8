/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con
su correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo)
y la letra (String o char) que le corresponde. 
Métodos getters y setters para el número de DNI y la letra.
En NIFService se dispondrá de los siguientes métodos:
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra
que le corresponderá. Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y 
la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un 
método que funciona de la siguiente manera: Para calcular la letra se toma 
el resto de dividir el número de DNI por 23 (el resultado debe ser un número 
entre 0 y 22). El método debe buscar en un array (vector) de caracteres la 
posición que corresponda al resto de la división para obtener la letra correspondiente.
La tabla de caracteres es la siguiente: */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearNif(NIF n){
        System.out.println("Ingrese su numero de DNI:");
        n.setDNI(leer.nextLong());
        System.out.println(" ");
    }
    
    public void mostrar(NIF n){
        calcularNif(n);
        System.out.println(n.getDNI() + " - " + n.getLetra());
    }
    
    public void calcularNif(NIF n){
        String vector [] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        for (int i = 0; i < vector.length; i++) {
            if (n.getDNI()%23==i){
                n.setLetra(vector[i]);
            }
        }
    }
}
