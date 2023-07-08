/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package supermarket;


public class PrimeraNecesidad extends Producto {

    public PrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
    }

    @Override
    public void aplicarDescuento(double descuento) {

        double descuentoPrimeraNecesidad = precio * 0.1;
        this.precio -= descuentoPrimeraNecesidad;

    }
}
