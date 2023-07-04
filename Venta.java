/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class Venta {

   private LocalDate fecha;
    private static int cantTickets;
    private int numeroTicket;
     private ArrayList<Producto> listProductos = new ArrayList<>();

    public Venta(LocalDate fecha, int numeroTicket) {
        this.fecha = fecha;
        this.numeroTicket = numeroTicket;
    }
    
    public double Calcular_venta(){
        double Totalventa = 0;
        for(Producto p: listProductos){
            Totalventa+=p.getPrecio();
        }
    
        return Totalventa;
    }
    
    public double importeTotalDesc(){
        double descontado=0;
        
        for(Producto p: listProductos){
        descontado+=pn.CalcularDesc();
        
        }
        return descontado;
    }
    
    

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static int getCantTickets() {
        return cantTickets;
    }

    public static void setCantTickets(int cantTickets) {
        Venta.cantTickets = cantTickets;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {
        this.listProductos = listProductos;
    }
}
