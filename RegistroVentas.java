/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class RegistroVentas {

    private ArrayList<Venta> listVentas = new ArrayList<>();

    public RegistroVentas() {
    }

    public double Calcular_total_ventas() {
        double total = 0;
        for (Venta v : listVentas) {
            total += v.Calcular_venta();

        }
        return total;
    }

    public double ImporteDescuento() {
        double TotalDescontado = 0;
        for (Venta v : listVentas) {
            TotalDescontado += v.importeTotalDesc();

        }

        return TotalDescontado;
    }
    
    public void Mostrar_ventas(){
        
    
    }

    public ArrayList<Venta> getListVentas() {
        return listVentas;
    }

    public void setListVentas(ArrayList<Venta> listVentas) {
        this.listVentas = listVentas;
    }
}
