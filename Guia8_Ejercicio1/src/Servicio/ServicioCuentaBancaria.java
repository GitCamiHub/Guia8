/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class ServicioCuentaBancaria {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(CuentaBancaria cuenta1){
        
        System.out.println("Ingrese el numero de cuenta.");
        cuenta1.setNumeroCuenta(leer.nextInt());
            
        System.out.println("Ingrese DNI.");
        cuenta1.setDniCliente(leer.nextLong());
        
        System.out.println("Ingrese saldo actual.");
        cuenta1.setSaldoActual(leer.nextDouble());
        
        return cuenta1;
    }
    
    public void ingresar(CuentaBancaria cuenta1){
        System.out.println("Monto a ingresar:");
        double dinero = leer.nextDouble();
        cuenta1.setSaldoActual(cuenta1.getSaldoActual()+ dinero);
    
    }
    
    public void retirar(CuentaBancaria cuenta1){
        System.out.println("Monto a retirar:");
        double dinero = leer.nextDouble();
        
        if (dinero <= cuenta1.getSaldoActual()){
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()- dinero);
            System.out.println("Extracción realizada");
            System.out.println("Saldo actual = $" + cuenta1.getSaldoActual());
        }else{
            System.out.println("Fondo insuficiente. Solo puede retirar $" + cuenta1.getSaldoActual());
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta1){
        System.out.println("Monto a extraer:");
        double dinero = leer.nextDouble();
        
        if (dinero<=(cuenta1.getSaldoActual()*0.2)) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()- dinero);
            System.out.println("Extracción realizada");
            System.out.println("Saldo actual = $" + cuenta1.getSaldoActual());
        }else{
            System.out.println("El monto supera el 20% del saldo actual."
                    + " Para extracciones mayores elija la opcion 'Retirar dinero'");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta1){
        System.out.println("El saldo actual es $"+ cuenta1.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta1){
        System.out.println(cuenta1.toString());
   
    }
    
}
