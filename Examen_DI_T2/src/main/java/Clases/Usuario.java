package Clases;

import java.util.Calendar;
import java.util.Date;

/**
 * This class represents a user in the library system.
 */
public class Usuario {
    private String dniUsuario;
    private Date fechaAltaSancion;

    /**
     * Applies a sanction to the user.
     */
    public void sancionar() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        this.fechaAltaSancion = calendar.getTime();
    }

    /**
     * Removes the sanction from the user.
     */
    public void quitarSancion() {
        this.fechaAltaSancion = null;
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
     * Gets the sanction start date of the user.
     * @return A Date object representing the sanction start date of the user.
     */
    public Date getFechaAltaSancion() {
        return fechaAltaSancion;
    }

    /**
     * Sets the sanction start date of the user.
     * @param fechaAltaSancion A Date object containing the sanction start date of the user.
     */
    public void setFechaAltaSancion(Date fechaAltaSancion) {
        this.fechaAltaSancion = fechaAltaSancion;
    }
}