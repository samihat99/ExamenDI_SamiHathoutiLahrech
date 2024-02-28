package Clases;

import java.util.Date;

/**
 * This class represents a loan in the library system.
 */
public class Prestamo {
    private String idLibro;
    private String dniUsuario;
    private Date fechaDevolucion;

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
     * Gets the DNI of the user.
     * @return A string representing the user's DNI.
     */
    public String getDniUsuario() {
        return dniUsuario;
    }

    /**
     * Sets the DNI of the user.
     * @param dniUsuario A string containing the user's DNI.
     */
    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    /**
     * Gets the return date of the loan.
     * @return A Date object representing the return date of the loan.
     */
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Sets the return date of the loan.
     * @param fechaDevolucion A Date object containing the return date of the loan.
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}