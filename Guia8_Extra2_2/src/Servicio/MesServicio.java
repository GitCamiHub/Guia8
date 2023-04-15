
package Servicio;

import Entidades.Mes;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class MesServicio {
    Scanner leer = new Scanner(System.in);
    Mes m = new Mes();
    
    public void adivinarMes (Mes adivinar){
       String vector[]={"enero ","febrero ","marzo ","abril","mayo ","junio ","julio ","agosto ","septiembre ","octubre ","noviembre ","diciembre "};
       m.setMesSecreto(vector[3]);
       
       String mesAdivinar;

            int contador=0;
            System.out.println("Adivine el mes secreto. Ingrese el mes en minusculas.");
            
            do{
                mesAdivinar = leer.next().toLowerCase();
                contador++;
                if (mesAdivinar.equals(m.getMesSecreto())){
                    System.out.println("--------------------------");
                    System.out.println("ADIVINASTE!!");
                    System.out.println("--------------------------");
                    System.out.println("El mes secreto era: " + m.getMesSecreto());
                    break;
                }else{
                    System.out.println("INCORRECTO. Intentos restantes: " + (3-contador));
                }
            }while (contador<=2);
        }
    }

