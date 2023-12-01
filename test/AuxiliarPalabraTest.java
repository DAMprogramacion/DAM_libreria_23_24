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
        assertTrue(AuxiliarPalabra.empiezaPorVocal("a"), "a");
        assertTrue(AuxiliarPalabra.empiezaPorVocal("ó"), "ó");

    }

    @Test
    void acabaPorVocal() {
        assertNull(AuxiliarPalabra.acabaPorVocal(null));
        assertTrue(AuxiliarPalabra.acabaPorVocal("amigo"), "amigo");
        assertFalse(AuxiliarPalabra.acabaPorVocal("juan"), "juan");
        assertTrue(AuxiliarPalabra.acabaPorVocal("AMIGO"), "AMIGO");
        assertFalse(AuxiliarPalabra.acabaPorVocal("JUAN"), "JUAN");
        assertTrue(AuxiliarPalabra.acabaPorVocal("olé"), "olé");
        assertTrue(AuxiliarPalabra.acabaPorVocal("OLÉ"), "OLÉ");
        assertTrue(AuxiliarPalabra.acabaPorVocal("a"), "a");
        assertTrue(AuxiliarPalabra.acabaPorVocal("ó"), "ó");
    }

    @Test
    void obtenerNumeroDeVocales() {
        assertNull(AuxiliarPalabra.obtenerNumeroDeVocales(null));
        assertEquals(0, AuxiliarPalabra.obtenerNumeroDeVocales(""));
        assertEquals(0, AuxiliarPalabra.obtenerNumeroDeVocales("nyz"));
        assertEquals(1, AuxiliarPalabra.obtenerNumeroDeVocales("a"));
        assertEquals(4, AuxiliarPalabra.obtenerNumeroDeVocales("cigüeña"));
        assertEquals(3, AuxiliarPalabra.obtenerNumeroDeVocales("CAMIÓN"));
    }

    @Test
    void contieneLetra() {
        assertNull(AuxiliarPalabra.contieneLetra(null, ' '));
        assertFalse(AuxiliarPalabra.contieneLetra("", ' '));
        assertFalse(AuxiliarPalabra.contieneLetra("pepe", ' '));
        assertTrue(AuxiliarPalabra.contieneLetra("pepe y juan", ' '));
        assertTrue(AuxiliarPalabra.contieneLetra("pepe", 'p'));
        assertTrue(AuxiliarPalabra.contieneLetra("PEPE", 'P'));
        assertTrue(AuxiliarPalabra.contieneLetra("JOSÉ", 'É'));

    }

    @Test
    void esUnPalindromo() {
        assertNull(AuxiliarPalabra.esUnPalindromo(null));
        assertTrue(AuxiliarPalabra.esUnPalindromo("rotor"));
        assertFalse(AuxiliarPalabra.esUnPalindromo("casa"));
        assertTrue(AuxiliarPalabra.esUnPalindromo(""));
        assertTrue(AuxiliarPalabra.esUnPalindromo("Rotor"));


    }

    @Test
    void sonPalabrasIguales() {
        assertNull(AuxiliarPalabra.sonPalabrasIguales(null, "ppdp"));
        assertNull(AuxiliarPalabra.sonPalabrasIguales("", null));
        assertNull(AuxiliarPalabra.sonPalabrasIguales(null, null));
        assertNotEquals("juan", "pedro");
        assertTrue(AuxiliarPalabra.sonPalabrasIguales("juan", "juan"));
        assertTrue(AuxiliarPalabra.sonPalabrasIguales("juan", "JUAN"));
    }

    @Test
    void tieneLongitudCorrecta() {
        assertTrue(AuxiliarPalabra.tieneLongitudCorrecta("hambre"));
        assertFalse(AuxiliarPalabra.tieneLongitudCorrecta("hola"));

    }

    @Test
    void tieneMayuscula() {
    }
}