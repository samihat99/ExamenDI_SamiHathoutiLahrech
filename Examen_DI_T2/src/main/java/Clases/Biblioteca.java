package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * This class represents a library in the library system.
 */
public class Biblioteca {
    private List<Libro> libros;
    private List<Prestamo> prestamos;
    private List<Usuario> usuarios;
    /**
     * Returns the library's books.
     * @return A list of books.
     */
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }
    /**
     * Adds a new book to the library.
     * @param idLibro A string containing the book's ID.
     * @param titulo A string containing the book's title.
     * @param isbn A string containing the book's ISBN.
     */
    public void altaLibro(String idLibro, String titulo, String isbn) {
        Libro libro = new Libro();
        libro.setIdLibro(idLibro);
        libro.setTitulo(titulo);
        libro.setIsbn(isbn);
        libros.add(libro);
    }
    /**
     * Removes a book from the library.
     * @param idLibro A string containing the book's ID.
     */
    public void bajaLibro(String idLibro) {
        libros.removeIf(libro -> libro.getIdLibro().equals(idLibro));
    }
    /**
     * Loans a book to a user.
     * @param idLibro A string containing the book's ID.
     * @param dniUsuario A string containing the user's DNI.
     */
    public void prestar(String idLibro, String dniUsuario) {
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getDniUsuario().equals(dniUsuario))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (new Date().before(usuario.getFechaAltaSancion())) {
            throw new RuntimeException("User is penalized");
        }

        Prestamo prestamo = new Prestamo();
        prestamo.setIdLibro(idLibro);
        prestamo.setDniUsuario(dniUsuario);
        prestamo.setFechaDevolucion(new Date());
        prestamos.add(prestamo);
    }
    /**
     * Returns a book from a user.
     * @param idLibro A string containing the book's ID.
     * @param dniUsuario A string containing the user's DNI.
     */
    public void devolver(String idLibro, String dniUsuario) {
        Prestamo prestamo = prestamos.stream()
                .filter(p -> p.getIdLibro().equals(idLibro) && p.getDniUsuario().equals(dniUsuario))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Loan not found"));

        if (new Date().after(prestamo.getFechaDevolucion())) {
            Usuario usuario = usuarios.stream()
                    .filter(u -> u.getDniUsuario().equals(dniUsuario))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("User not found"));
            usuario.sancionar();
        }
        prestamos.remove(prestamo);
    }




    // getters and setters
}