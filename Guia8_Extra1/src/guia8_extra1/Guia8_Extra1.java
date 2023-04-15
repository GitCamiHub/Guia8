
package guia8_extra1;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author BANGHO
 */
public class Guia8_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        Raices ecuacion1 = new Raices();
        rs.ingresarValores(ecuacion1);
        rs.obtenerRaices(ecuacion1);

    }

}
