/*Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos:
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir 
algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además,
comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.*/
package Servicio;

import Entidades.Persona;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
 
    
    public Persona crearPersona(Persona p){
      
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        
        String sexo;
        do{
        System.out.print("Sexo (H, M, O): ");
        sexo = leer.next().toUpperCase();
        if (sexo.equals("H")||sexo.equals("M")||sexo.equals("O")){
           p.setSexo(sexo);
        }else{
            System.out.println("Debe ingresar una letra correcta");
        }
        }while(!sexo.equals("H")&&!sexo.equals("M")&&!sexo.equals("O"));
        System.out.print("Altura: ");
        p.setAltura(leer.nextDouble());
        System.out.print("Peso: ");
        p.setPeso(leer.nextDouble());
        return p;
    }
            
    public boolean esMayorDeEdad(Persona p){
        return p.getEdad()>=18;
      
    }
    
    public int calcularIMC(Persona p){
        double calculo;
        calculo = p.getPeso()/(Math.pow(p.getAltura(),2));
        
        if(calculo<20){
           return -1;
        }else if (calculo<=25){
           return 0;
        }else{
           return 1;
        }
    }
    
   
    }
    



