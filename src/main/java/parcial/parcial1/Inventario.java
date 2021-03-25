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
    
    ArrayList <ProductoSimple> productos = new ArrayList<>();
    
    public String registarProducto(ProductoSimple producto ){
        String resul="ll";
        if(producto.getCantidad()<= 0){
         resul = "La cantidad del producto debe ser mayor a 0";
        }else{
        this.productos.add(producto);
        resul = "Producto registrado correctamente";
        }
        return resul;
    }
   
}
