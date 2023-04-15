/*Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package guia8_extra2_7;

import Entidades.Mes;
import Servicio.MesServicio;

/**
 *
 * @author BANGHO
 */
public class Guia8_Extra2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MesServicio s1 = new MesServicio();
       Mes m1 = new Mes();
       
       s1.adivinarMes(m1);
    
}
}
