package supermarket;

import java.util.ArrayList;
import java.util.List;


public class RegistroVentas {

    private List<Venta> ventas;

    public RegistroVentas() {
        this.ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (Venta venta : ventas) {
            total += venta.calcularTotalVenta();
        }
        return total;
    }

    public double calcularTotalDescuentos() {
        double totalDescuentos = 0;
        for (Venta venta : ventas) {
            totalDescuentos += venta.getDescuentoTotal();
        }
        return totalDescuentos;
    }

    public void mostrarVentas() {
        for (Venta venta : ventas) {
            System.out.println("Venta numero: " + venta.getNumeroVenta());
            System.out.println("Fecha: " + venta.getFecha());
            System.out.println("Total: $" + venta.calcularTotalVenta());
            System.out.println("Descuento aplicado: $" + venta.getDescuentoTotal());
            System.out.println("Cantidad de productos de primera necesidad: " + venta.getCantidadProductosPrimeraNecesidad());
            System.out.println("Cantidad de productos con precios cuidados: " + venta.getCantidadProductosPrecioCuidado());
            System.out.println("Productos:");
            venta.mostrarProductos();
            System.out.println("------------------------");
        }
        System.out.println("Total en ventas: $" + calcularTotalVentas());
        System.out.println("Total de descuentos: $" + calcularTotalDescuentos());
    }
}
