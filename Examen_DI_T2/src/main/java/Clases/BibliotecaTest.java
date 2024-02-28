package Clases;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains tests for the Biblioteca class.
 */
public class BibliotecaTest {
    /**
     * Tests the prestar method of the Biblioteca class.
     */
    @Test
    public void testPrestar() {
        Biblioteca biblioteca = new Biblioteca();
        // setup data

        // test case: libro no existe
        assertThrows(Exception.class, () -> biblioteca.prestar("nonexistentId", "existingDni"));

        // test case: usuario no existe
        assertThrows(Exception.class, () -> biblioteca.prestar("existingId", "nonexistentDni"));

        // test case: libro existe, usuario existe
        assertDoesNotThrow(() -> biblioteca.prestar("existingId", "existingDni"));
    }

    /**
     * Tests the devolver method of the Biblioteca class.
     */
    @Test
    public void testDevolver() {
        Biblioteca biblioteca = new Biblioteca();
        // setup data

        // test case: devolucion en fecha
        assertDoesNotThrow(() -> biblioteca.devolver("existingId", "existingDni"));

        // test case: devolucion fuera de fecha
        assertThrows(Exception.class, () -> biblioteca.devolver("existingId", "existingDni"));
    }

    /**
     * Tests the altaLibro method of the Biblioteca class.
     */
    @Test
    public void testAltaLibro() {
        Biblioteca biblioteca = new Biblioteca();
        // setup data

        // test case: atributos unicos no repetidos
        assertDoesNotThrow(() -> biblioteca.altaLibro("uniqueId", "uniqueTitle", "uniqueIsbn"));

        // test case: atributos unicos repetidos
        assertThrows(Exception.class, () -> biblioteca.altaLibro("existingId", "existingTitle", "existingIsbn"));
    }
}