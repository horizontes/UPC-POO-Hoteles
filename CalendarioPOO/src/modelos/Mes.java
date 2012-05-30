/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.ControlesGenerales;
import java.util.Date;
import javax.swing.JOptionPane;

public class Mes {
  
    private Fecha fecha;
    
    public Mes(){
   }

    public Fecha getFecha() {
        return fecha;
    }
    
   public Mes(Date date){
       if(ControlesGenerales.validarNulos(date)){
       this.fecha = new Fecha(date);
       }else{
           JOptionPane.showMessageDialog(null, "Valor nulo en: >>>" + getClass());
       }
   }
   
    @Override
   public String toString(){
       return ControlesGenerales.traduccion(this.fecha.getMes(), true) + " \n" + this.fecha.getAnio();
   }
   
}
