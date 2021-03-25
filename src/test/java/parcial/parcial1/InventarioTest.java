/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.parcial1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leysa
 */
public class InventarioTest {
    
    public InventarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of registarProducto method, of class Inventario.
     */
    @Test
    public void testRegistarProducto() {
        System.out.println("registarProducto");
        String nombre = "";
        ProductoSimple producto = new ProductoSimple(1200,"salchicha",0,2000,"SLCH");
        Inventario instance = new Inventario();
        String expResult = "La cantidad del producto debe ser mayor a 0";
        String result = instance.registarProducto(producto);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
 
    /**
     *         //ARRANQUE // DADO // PREPARAR
        System.out.println("consignar");
        double valor = -200.00;
        String ciudad = "VALLEDUPAR";
        CuentaAhorros instance = new CuentaAhorros("10001", "Cuenta ejemplo", ciudad);
        String expResult = "El valor a consignar es incorrecto";
        String result = instance.consignar(valor, ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
     */
}
