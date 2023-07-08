package supermarket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {

    private LocalDate fecha;
    private static int numeroVentaActual = 1;
    private int numeroVenta;
    private List<Producto> productos;
    private double descuentoTotal;

    public Venta() {
        this.fecha = LocalDate.now();
        this.productos = new ArrayList<>();
        this.numeroVenta = numeroVentaActual++;
        this.descuentoTotal = 0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        if (producto instanceof PrimeraNecesidad) {
            double descuento = producto.getPrecio() * 0.1;
            descuentoTotal += descuento;
            producto.aplicarDescuento(descuento);
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public double calcularTotalVenta() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + " - Precio: $" + producto.getPrecio());
        }
    }

    public int getCantidadProductosPrimeraNecesidad() {
        int cantidad = 0;
        for (Producto producto : productos) {
            if (producto instanceof PrimeraNecesidad) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int getCantidadProductosPrecioCuidado() {
        int cantidad = 0;
        for (Producto producto : productos) {
            if (producto.esPrecioCuidado()) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }
}
