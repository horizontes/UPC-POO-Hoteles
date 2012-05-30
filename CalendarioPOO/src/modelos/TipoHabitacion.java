

package modelos;

import javax.swing.JOptionPane;



public class TipoHabitacion implements InterfaceGeneral{
    
    private String tipo;
    private double precio;
    public boolean errorObject;
    public boolean errorInt;
    
    public TipoHabitacion(){
    }
    
    public TipoHabitacion(String tipo, double precio) {
        if(validarNulos(tipo)&&validarNumerosValidos((int)precio)){
        this.precio = precio;
        this.tipo = tipo;
        }else{
            JOptionPane.showMessageDialog(null, "Valor nulo en: " + getClass());
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public TipoHabitacion(String tipo){
        if(validarNulos(tipo)){
        this.tipo = tipo;
        }else{
            JOptionPane.showMessageDialog(null, "Valor nulo en: " + getClass());
        }
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return this.tipo;
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
