
package guia8_extra2;

import Entidades.NIF;
import Servicios.NIFService;

/**
 *
 * @author BANGHO
 */
public class Guia8_Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService nifS = new NIFService();
        NIF n1 = new NIF();
        
      nifS.crearNif(n1);
      nifS.mostrar(n1);
    }
    
}
