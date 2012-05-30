

package modelos;

import controladores.ControlesGenerales;
import javax.swing.JOptionPane;



public class TipoHabitacion {
    
    private String tipo;
    private double precio;
    
    public TipoHabitacion(){
    }
    
    public TipoHabitacion(String tipo, double precio) {
        if(ControlesGenerales.validarNulos(tipo)&&ControlesGenerales.validarNumerosValidos((int)precio)){
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
        if(ControlesGenerales.validarNulos(tipo)){
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
    
}
