/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.parcial1;

/**
 *
 * @author leysa
 */
public class ProductoSimple extends Producto{
    
    private double costo;
    public ProductoSimple() {
    }

    public ProductoSimple(double costo, String nombre, int cantidad, double precio, String codigo) {
        super(nombre, cantidad, precio, codigo);
        this.costo = costo;
    }


    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
