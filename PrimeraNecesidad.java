/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ET36
 */
public class PrimeraNecesidad {

     private int desc;

    public PrimeraNecesidad(int desc, String nombre, double precio, boolean precioCuidado) {
        super(nombre, precio, precioCuidado);
        this.desc = desc;
        double prodTotal = precio -(precio*desc/100);
        
    }

    public double CalcularDesc() {
        int descontado=0;
        double prodTotal = 0;
        prodTotal = precio -(precio*desc/100);
        descontado=precio-prodTotal;
        return descontado;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }
}

