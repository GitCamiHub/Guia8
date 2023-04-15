/*A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la 
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular
un porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. 
Para esto, podemos crear unos métodos adicionales.*/

package guia8_ejercicio3;

import Entidades.Persona;
import Servicio.ServicioPersona;


/**
 *
 * @author BANGHO
 */
public class Guia8_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       ServicioPersona sp = new ServicioPersona();
       Persona p1 = new Persona();
       Persona p2 = new Persona();
       Persona p3 = new Persona();
       Persona p4 = new Persona();
  
        System.out.println("Ingresar datos.");
        System.out.println("--------------------------");
        System.out.println("Persona 1");
        p1 = sp.crearPersona(p1);
        System.out.println("--------------------------");
        System.out.println("Persona 2");
        p2 = sp.crearPersona(p2);
        System.out.println("--------------------------");
        System.out.println("Persona 3");
        p3 = sp.crearPersona(p3);
        System.out.println("--------------------------");
        System.out.println("Persona 4");
        p4 = sp.crearPersona(p4);
        System.out.println("--------------------------");
       
       
        int vectorIMC[] = {sp.calcularIMC(p1), sp.calcularIMC(p2),sp.calcularIMC(p3), sp.calcularIMC(p4)};
        boolean vectorEdad[] = {sp.esMayorDeEdad(p1), sp.esMayorDeEdad(p2), sp.esMayorDeEdad(p3), sp.esMayorDeEdad(p4)};
     
        porcentajeIMC( sp, p1, p2, p3, p4,vectorIMC);
        porcentajeEdad(sp, p1, p2, p3, p4, vectorEdad);
      
    }
     
      public static void porcentajeIMC(ServicioPersona sp,Persona p1, Persona p2, Persona p3, Persona p4, int[]vectorIMC){
          int pesoMenor = 0;
          int pesoIdeal = 0;
          int pesoMayor = 0;

      for (int i = 0; i < 4; i++) {
              switch (vectorIMC[i]) {
                  case 1:
                      pesoMayor++;
                      break;
                  case 0:
                      pesoIdeal++;
                      break;
                  case -1:
                      pesoMenor++;
                      break;
              }
      }
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("El porcentaje de personas con bajo peso es: " + (pesoMenor*100)/4 + "%");
      System.out.println("El porcentaje de personas con peso ideal es: " + (pesoIdeal*100)/4 + "%");
      System.out.println("El porcentaje de personas con sobrepeso es: " + (pesoMayor*100)/4 + "%");
  }

      public static void porcentajeEdad(ServicioPersona sp,Persona p1, Persona p2, Persona p3, Persona p4, boolean[]vectorEdad){
     
      int edadMayor = 0;
      int edadMenor = 0;

      for (int i = 0; i < 4; i++) {
          if (vectorEdad[i] == true) {
              edadMayor++;
          } else {
              edadMenor++;
          }
      }
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("El porcentaje de personas mayores de edad es: " + (edadMenor*100)/4+ "%");
      System.out.println("El porcentaje de personas menores de edad es: " + (edadMayor*100)/4+"%");
      
  }
    }


         
       
      
        
 
