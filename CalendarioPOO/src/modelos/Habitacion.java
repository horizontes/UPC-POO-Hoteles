package modelos;

import controladores.ControlesGenerales;
import javax.swing.JOptionPane;

public class Habitacion implements InterfaceGeneral {

    private int numHabitacion;
    private String denominacion;
    private TipoHabitacion tipoHabitacion;
    public boolean errorObject;
    public boolean errorInt;

    public Habitacion(int numHabitacion) {

        if (validarNumerosValidos(numHabitacion)) {
            this.numHabitacion = numHabitacion;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido en: " + numHabitacion + ">>>" + getClass());
        }

    }

    public Habitacion(int numHabitacion, TipoHabitacion tipoHabitacion) {
        if (validarNumerosValidos(numHabitacion) && ControlesGenerales.validarNulos(tipoHabitacion)) {
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
    
    @Override
    public boolean validarNulos(Object campo) {
        if (campo != null) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarIgualesObject(Object variable1, Object variable2) {
        if (variable1.equals(variable2)) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarNumerosValidos(int numero) {
        if (numero <= 0) {
            errorInt = true;
            return false;
        }
        return true;
    }

    @Override
    public boolean isErrorInt() {
        return this.errorInt;
    }

    @Override
    public boolean isErrorObject() {
        return this.errorObject;
    }
}
