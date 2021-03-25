/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.parcial1;

import java.util.ArrayList;
import parcial.parcial1.ProductoSimple;

/**
 *
 * @author leysa
 */
public class Inventario {

    ArrayList<ProductoSimple> productos = new ArrayList<>();

    public String registarProducto(ProductoSimple producto) {
        String resul = "";
        if (buscar(producto)) {
            for (ProductoSimple producto1 : productos) {
                if (producto.getCodigo() == producto1.getCodigo()) {
                   producto1.aumentarCantidad(producto.getCantidad());
                   resul = "Su nueva cantidad de producto es de "+producto1.getCantidad();
                }
            }
        } else {
            if (producto.getCantidad() <= 0) {
                resul = "La cantidad del producto debe ser mayor a 0";
            } else {
                resul = guardar(producto);
            }
        }
        return resul;
    }

    public boolean buscar(ProductoSimple producto) {
        for (ProductoSimple producto1 : productos) {
            if (producto.getCodigo() == producto1.getCodigo()) {
                return true;
            }
        }
        return false;
    }

    public String guardar(ProductoSimple producto) {
        this.productos.add(producto);
        return "Producto registrado correctamente";
    }
}
