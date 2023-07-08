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

