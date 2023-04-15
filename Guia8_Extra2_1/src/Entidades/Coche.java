/*Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla. */
package Entidades;

/**
 *
 * @author BANGHO
 */
public class Coche {
    public String marca;
    public String modelo;
    public double precio;

    public Coche() {
    }

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "Marca = " + marca + ", Modelo = " + modelo + ", Precio = " + precio + '}';
    }
    
    
}
