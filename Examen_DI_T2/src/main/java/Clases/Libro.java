package Clases;

import java.util.Date;

/**
 * This class represents a book in the library system.
 */
public class Libro {
    private String idLibro;
    private String titulo;
    private String isbn;
    private String autor;
    private Tematica tematica;
    private Date fechaEdicion;

    public Libro(String idLibro, String title, String isbn, String author, Tematica tematica, Date fechaEdicion) {
    }

    public Libro() {

    }

    /**
     * Gets the ID of the book.
     * @return A string representing the book's ID.
     */
    public String getIdLibro() {
        return idLibro;
    }

    /**
     * Sets the ID of the book.
     * @param idLibro A string containing the book's ID.
     */
    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * Gets the title of the book.
     * @return A string representing the book's title.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the title of the book.
     * @param titulo A string containing the book's title.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Gets the ISBN of the book.
     * @return A string representing the book's ISBN.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the ISBN of the book.
     * @param isbn A string containing the book's ISBN.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets the author of the book.
     * @return A string representing the book's author.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Sets the author of the book.
     * @param autor A string containing the book's author.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Gets the theme of the book.
     * @return An instance of the Tematica enum representing the book's theme.
     */
    public Tematica getTematica() {
        return tematica;
    }

    /**
     * Sets the theme of the book.
     * @param tematica An instance of the Tematica enum containing the book's theme.
     */
    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    /**
     * Gets the publication date of the book.
     * @return A Date object representing the book's publication date.
     */
    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    /**
     * Sets the publication date of the book.
     * @param fechaEdicion A Date object containing the book's publication date.
     */
    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }
}