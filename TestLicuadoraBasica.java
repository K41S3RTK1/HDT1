import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLicuadoraBasica {
    private LicuadoraBasica licuadora;

    @BeforeEach
    void setUp() {
        licuadora = new LicuadoraBasica();
    }

    @Test
    void testEncenderLicuadora() {
        assertTrue(licuadora.encenderLicuadora(), "La licuadora debería encenderse.");
        assertFalse(licuadora.encenderLicuadora(), "No debería encenderse si ya está encendida.");
    }

    @Test
    void testApagarLicuadora() {
        licuadora.encenderLicuadora();
        assertTrue(licuadora.apagarLicuadora(), "La licuadora debería apagarse.");
        assertFalse(licuadora.apagarLicuadora(), "No debería apagarse si ya está apagada.");
    }

    @Test
    void testLlenarLicuadora() {
        assertTrue(licuadora.llenarLicuadora(), "Debería poder llenarse si está vacía.");
        assertFalse(licuadora.llenarLicuadora(), "No debería llenarse si ya está llena.");
    }

    @Test
    void testVaciarLicuadora() {
        licuadora.llenarLicuadora();
        assertTrue(licuadora.vaciarLicuadora(), "Debería vaciarse correctamente.");
        assertFalse(licuadora.vaciarLicuadora(), "No debería vaciarse si ya está vacía.");
    }

    @Test
    void testIncrementarVelocidad() {
        licuadora.encenderLicuadora();
        licuadora.llenarLicuadora();
        
        assertTrue(licuadora.incrementarVelocidad(1), "Debería incrementar la velocidad a 1.");
        assertTrue(licuadora.incrementarVelocidad(2), "Debería incrementar la velocidad a 2.");
        assertFalse(licuadora.incrementarVelocidad(5), "No debería permitir un salto en la velocidad.");
    }

    @Test
    void testObtenerVelocidadActual() {
        licuadora.encenderLicuadora();
        licuadora.llenarLicuadora();
        
        licuadora.incrementarVelocidad(1);
        assertEquals(1, licuadora.obtenerVelocidadActual(), "La velocidad debería ser 1.");
        
        licuadora.incrementarVelocidad(2);
        assertEquals(2, licuadora.obtenerVelocidadActual(), "La velocidad debería ser 2.");
    }

    @Test
    void testEstaLlena() {
        assertFalse(licuadora.estaLlena(), "La licuadora debería iniciar vacía.");
        licuadora.llenarLicuadora();
        assertTrue(licuadora.estaLlena(), "La licuadora debería estar llena después de llenarla.");
    }
}