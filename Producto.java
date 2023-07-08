/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package supermarket;


public class Producto {

    protected String nombre;
    protected double precio;
    protected boolean esPrecioCuidado;

    public Producto(String nombre, double precio, boolean esPrecioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = esPrecioCuidado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esPrecioCuidado() {
        return esPrecioCuidado;
    }

    public void aplicarDescuento(double descuento) {
        this.precio -= descuento;
    }

}
