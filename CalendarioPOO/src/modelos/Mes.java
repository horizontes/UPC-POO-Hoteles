/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.ControlesGenerales;
import java.util.Date;
import javax.swing.JOptionPane;


public class Mes implements InterfaceGeneral{
  
    private Fecha fecha;
    public boolean errorObject;
    public boolean errorInt;
    
    public Mes(){
   }

    public Fecha getFecha() {
        return fecha;
    }
    
   public Mes(Date date){
       if(validarNulos(date)){
       this.fecha = new Fecha(date);
       }else{
           JOptionPane.showMessageDialog(null, "Valor nulo en: >>>" + getClass());
       }
   }
   
    @Override
   public String toString(){
       return ControlesGenerales.traduccion(this.fecha.getMes(), true) + " \n" + this.fecha.getAnio();
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
