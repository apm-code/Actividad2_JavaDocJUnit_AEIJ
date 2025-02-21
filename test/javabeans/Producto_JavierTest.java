package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Producto_JavierTest {
    private Producto_Javier producto;

    /**
     * BeforeEach hace que el método setUp se ejecute antes de cada prueba.
     * Crea un objeto de la clase Producto_Javier.
     */

    @BeforeEach
    void setUp()  {
        producto = new Producto_Javier();
    }
    /**
     * Prueba unitaria del método productoDosReales().
     * Primer assert:
     *  - El valor esperado es 6.25.
     *  - El valor inicial es 2.5.
     *  - El valor que se multiplica es 2.5.
     */
    @Test
    void productoDosReales() {
        assertEquals(6.25, producto.productoDosReales(2.5,2.5));
    }

    /**
     * Prueba unitaria del método productoDosEnteros().
     * Primer assert:
     *  - El valor esperado es 4.
     *  - El valor inicial es 2.
     *  - El valor que se multiplica es 2.
     */

    @Test
    void prodcutoDosEnteros() {
        assertEquals(4, producto.prodcutoDosEnteros(2,2));
    }

    /**
     * Prueba unitaria del método productoTresReales().
     * Primer assert:
     *  - El valor esperado es 15.625.
     *  - El valor inicial es 2.5.
     *  - El primer valor que se multiplica es 2.5.
     *  - El segundo valor que se multiplica es 2.5.
     */

    @Test
    void productoTresReales() {
        assertEquals(15.625, producto.productoTresReales(2.5,2.5,2.5));
    }

    /**
     * Prueba unitaria del método potencia().
     * Primer assert:
     *  - El valor esperado es 8.
     *  - El valor de la base es 2.
     *  - El valor de las veces que se repite el numero de la base es 3.
     */

    @Test
    void potencia() {
        assertEquals(8, producto.potencia(2,3));
    }
}