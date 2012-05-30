package modelos;

import controladores.ControlesGenerales;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Habitacion {

    private int numHabitacion;
    private String denominacion;
    private TipoHabitacion tipoHabitacion;

    public Habitacion(int numHabitacion) {

        if (ControlesGenerales.validarNumerosValidos(numHabitacion)) {
            this.numHabitacion = numHabitacion;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido en: " + numHabitacion + ">>>" + getClass());
        }

    }

    public Habitacion(int numHabitacion, TipoHabitacion tipoHabitacion) {
        if (ControlesGenerales.validarNumerosValidos(numHabitacion) && ControlesGenerales.validarNulos(tipoHabitacion)) {
            this.numHabitacion = numHabitacion;
            this.tipoHabitacion = tipoHabitacion;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido en: " + numHabitacion + ">>>" + getClass());
        }
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String toString() {
        return String.valueOf(this.numHabitacion);
    }
}
