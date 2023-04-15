/*Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto
a través de un método constructor. Luego, en RaicesServicio las operaciones que
se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime
las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    
    public void ingresarValores(Raices r){
        System.out.println("Ingrese el valor de a = ");
        r.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b = ");
        r.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c = ");
        r.setC(leer.nextDouble());
    }
    
    public double getDiscriminante(Raices r){
        double discriminante;
        
        discriminante= (Math.pow(r.getB(),2))-(4*r.getA()*r.getC());
        
        return discriminante;
    }
    
    public boolean tieneRaices(Raices r){
        if (getDiscriminante(r)<=0) {
            return false;
        }
        return true;
    }
    
     public boolean tieneRaiz(Raices r){
        if (getDiscriminante(r)<0||getDiscriminante(r)>0) {
            return false;
        }
        return true;
    }
     
    public void obtenerRaices(Raices r){
       
           calcular(r);
   
    }
    
    
    public void calcular(Raices r){
        double raiz;
        double raiz1;
        double raiz2;
        if (tieneRaices(r)) {
            raiz1 = (-r.getB()+ (Math.sqrt(getDiscriminante(r))))/(2*r.getA());
            raiz2 = (-r.getB()- (Math.sqrt(getDiscriminante(r))))/(2*r.getA());
            System.out.println("Raiz 1 = " + raiz1);
            System.out.println("Raiz 2 = " + raiz2);
        } else if(tieneRaiz(r)){
            raiz = (-r.getB()+ (Math.sqrt(getDiscriminante(r))))/(2*r.getA());
            System.out.println("Raiz = " + raiz);
        }else{
            System.out.println("La ecuación no tiene raices.");
        }
    }
}
