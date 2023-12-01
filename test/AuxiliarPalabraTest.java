import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuxiliarPalabraTest {
    @Test
    void testObtenerNumeroDeLetras() {
        assertEquals(-1, AuxiliarPalabra.obtenerNumeroDeLetras(null));
        assertEquals(2, AuxiliarPalabra.obtenerNumeroDeLetras("do"));
        assertEquals(0, AuxiliarPalabra.obtenerNumeroDeLetras(""));
        assertEquals(5, AuxiliarPalabra.obtenerNumeroDeLetras("12345"));
    }

    @Test
    void empiezaPorVocal() {
        assertNull(AuxiliarPalabra.empiezaPorVocal(null));
        assertTrue(AuxiliarPalabra.empiezaPorVocal("amigo"), "amigo");
        assertFalse(AuxiliarPalabra.empiezaPorVocal("juan"), "juan");
        assertTrue(AuxiliarPalabra.empiezaPorVocal("Amigo"), "Amigo");
        assertFalse(AuxiliarPalabra.empiezaPorVocal("Juan"), "Juan");
        assertTrue(AuxiliarPalabra.empiezaPorVocal("ébano"), "ébano");
        assertTrue(AuxiliarPalabra.empiezaPorVocal("Ébano"), "Ébano");
    }
}