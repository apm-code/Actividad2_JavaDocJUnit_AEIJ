package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

/**
 * Clase test para la clase Cociente_Euken
 * Prueba que los métodos funcionen correctamente.
 * @author Ignacio Martinez
 * @version 1.0
 */
class CocienteEukenTest {

    private Cociente_Euken cociente;

    /**
     * BeforeEach hace que el método setUp se ejecute antes de cada prueba.
     * Crea un objeto de la clase Cociente_Euken.
     */
    @BeforeEach
    void setUp() {
        cociente = new Cociente_Euken();
    }

    /**
     * Prueba unitaria del método divisionDosReales().
     * Se prueban dos casos:
     *  - División válida.
     *  - División por cero (esperando NaN).
     */
    @Test
    void testDivisionDosReales() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("10\n2\n".getBytes()));
        assertEquals(5.0, cociente.divisionDosReales(scanner), 0.0001);

        scanner = new Scanner(new ByteArrayInputStream("10\n0\n".getBytes()));
        assertTrue(Double.isNaN(cociente.divisionDosReales(scanner)));
    }

    /**
     * Prueba unitaria del método divisionDosEnteros().
     * Se prueban dos casos:
     *  - División válida.
     *  - División por cero (esperando NaN).
     */
    @Test
    void testDivisionDosEnteros() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("10\n2\n".getBytes()));
        assertEquals(5.0, cociente.divisionDosEnteros(scanner), 0.0001);

        scanner = new Scanner(new ByteArrayInputStream("10\n0\n".getBytes()));
        assertTrue(Double.isNaN(cociente.divisionDosEnteros(scanner)));
    }

    /**
     * Prueba unitaria del método inversaReal().
     * Se prueban dos casos:
     *  - Inversa válida.
     *  - Inversa de cero (esperando NaN).
     */
    @Test
    void testInversaReal() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("2\n".getBytes()));
        assertEquals(0.5, cociente.inversaReal(scanner), 0.0001);

        scanner = new Scanner(new ByteArrayInputStream("0\n".getBytes()));
        assertTrue(Double.isNaN(cociente.inversaReal(scanner)));
    }

    /**
     * Prueba unitaria del método raizCuadrada().
     * Se prueban dos casos:
     *  - Raíz cuadrada válida.
     *  - Raíz cuadrada de un número negativo (esperando NaN).
     */
    @Test
    void testRaizCuadrada() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("9\n".getBytes()));
        assertEquals(3.0, cociente.raizCuadrada(scanner), 0.0001);

        scanner = new Scanner(new ByteArrayInputStream("-1\n".getBytes()));
        assertTrue(Double.isNaN(cociente.raizCuadrada(scanner)));
    }
}
