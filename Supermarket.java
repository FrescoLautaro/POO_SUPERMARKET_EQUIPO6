
package supermarket;


public class Supermarket {

    public static void main(String[] args) {
        RegistroVentas registro = new RegistroVentas();

        Venta venta1 = new Venta();
        venta1.agregarProducto(new Producto("Arroz", 50.0, true));
        venta1.agregarProducto(new PrimeraNecesidad("Leche", 80.0, true));
        venta1.agregarProducto(new Producto("Pan", 25.0, false));
        registro.agregarVenta(venta1);

        Venta venta2 = new Venta();
        venta2.agregarProducto(new Producto("Aceite", 100.0, true));
        venta2.agregarProducto(new Producto("Galletas", 30.0, false));
        venta2.agregarProducto(new PrimeraNecesidad("Azucar", 50.0, false));
        registro.agregarVenta(venta2);

        registro.mostrarVentas();
    }
}
