package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase test para la clase Resta_Nacho
 * Prueba que los métodos funcionen correctamente.
 * @author Adrián I. Pérez
 * @version 1.0
 */
class Resta_NachoTest {

    private Resta_Nacho resta;

    /**
     * BeforeEach hace que el método setUp se ejecute antes de cada prueba.
     * Es, básicamente, la configuración inicial necesaria. En este caso:
     *   - Crea un objeto de la clase Resta_Nacho
     *   - Realiza dos operaciones del método restaAcumulada, necesarias para
     *     probar el método getValorAcumulado()
     */
    @BeforeEach
    void setUp() {
        resta = new Resta_Nacho();
        resta.restaAcumulada(7.5);
        resta.restaAcumulada(2.0);
    }

    /**
     * Prueba unitaria del método restaDosReales().
     * Primer assert:
     *  - El valor esperado es 5.5.
     *  - El valor inicial es 7.5.
     *  - El valor que se resta es 2.0.
     * Segundo assert:
     *  - El valor esperado es -5.5.
     *  - El valor inicial es 2.0.
     *  - El valor que se resta es 7.5.
     */
    @Test
    void restaDosReales() {
        assertEquals(5.5, resta.restaDosReales(7.5,2.0));
        assertEquals(-5.5, resta.restaDosReales(2.0,7.5));
    }

    /**
     * Prueba unitaria del método restaDosEnteros().
     * Primer assert:
     *  - El valor esperado es 5.
     *  - El valor inicial es 7.
     *  - El valor que se resta es 2.
     * Segundo assert:
     *  - El valor esperado es -5.
     *  - El valor inicial es 2.
     *  - El valor que se resta es 7.
     */
    @Test
    void restaDosEnteros() {
        assertEquals(5, resta.restaDosEnteros(7,2));
        assertEquals(-5, resta.restaDosEnteros(2,7));
    }

    /**
     * Prueba unitaria del método restaTresReales().
     * Primer assert:
     *  - El valor esperado es 4.0.
     *  - El valor inicial es 7.5.
     *  - El primer valor que se resta es 2.0.
     *  - El segundo valor que se resta es 1.5.
     * Segundo assert:
     *  - El valor esperado es -4.0.
     *  - El valor inicial es 2.0.
     *  - El primer valor que se resta es -1.5 y, al ser negativo, se sumaría
     *  al inicial.
     *  - El segundo valor que se resta es 1.5.
     */
    @Test
    void restaTresReales() {
        assertEquals(4.0, resta.restaTresReales(7.5,2.0, 1.5));
        assertEquals(-4.0, resta.restaTresReales(2.0,-1.5, 7.5));
    }

    /**
     * Prueba unitaria del método restaAcumulada()
     *  - El primer valor que se resta al acumulado es 7.5.
     *  - El segundo valor que se resta al acumulado es 2.0.
     */
    @Test
    void restaAcumulada() {
        resta.restaAcumulada(7.5);
        resta.restaAcumulada(2.0);
        resta.restaAcumulada(-7.5);
        resta.restaAcumulada(-2.0);
    }

    /**
     * Prueba unitaria del método getValorAcumulado()
     * Teniendo en cuenta los valores de la resta acumulada, se espera un valor
     * final de la resta acumulada de -9.5, porque se inicia en 0.0, se resta
     * 7.5 en primer lugar y, en segundo lugar, se resta 2.0.
     */
    @Test
    void getValorAcumulado() {
        assertEquals(-9.5, resta.getValorAcumulado());
    }
}