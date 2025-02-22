package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Suma_AdriTest {

    private Suma_Adri sumaAdri; // Instancia de la clase a probar

    @BeforeEach
    void setUp() {
        sumaAdri = new Suma_Adri();
    }

    @Test
    void sumaDosReales() {
        assertEquals(5.5, sumaAdri.sumaDosReales(2.5, 3.0), 0.0001);
        assertEquals(-1.2, sumaAdri.sumaDosReales(-0.7, -0.5), 0.0001);
    }

    @Test
    void sumaDosEnteros() {
        assertEquals(5, sumaAdri.sumaDosEnteros(2, 3));
        assertEquals(-10, sumaAdri.sumaDosEnteros(-5, -5));
    }

    @Test
    void sumaTresReales() {
        assertEquals(6.6, sumaAdri.sumaTresReales(1.1, 2.2, 3.3), 0.0001);
        assertEquals(0.0, sumaAdri.sumaTresReales(-1.5, 1.5, 0.0), 0.0001);
    }

    @Test
    void sumaAcumulada() {
        sumaAdri.sumaAcumulada(5.0);
        assertEquals(5.0, sumaAdri.getValorAcumulado(), 0.0001);

        sumaAdri.sumaAcumulada(2.5);
        assertEquals(7.5, sumaAdri.getValorAcumulado(), 0.0001);
    }
}
