/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Producto {

    private String nombre;
    private double precio;
    private boolean precioCuidado;

    public Producto(String nombre, double precio, boolean precioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = precioCuidado;
    }

    
    public String getTipoProd(){
        String tipo="";
        if (precioCuidado == true) 
            CalcularDesc();
        else;
        return tipo;
    }
    
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", precioCuidado=" + precioCuidado + '}';
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isPrecioCuidado() {
        return precioCuidado;
    }

    public void setPrecioCuidado(boolean precioCuidado) {
        this.precioCuidado = precioCuidado;
    }
}
