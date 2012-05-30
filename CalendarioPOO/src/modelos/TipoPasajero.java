

package modelos;

import controladores.ControlesGenerales;
import javax.swing.JOptionPane;


public class TipoPasajero {
    
    private String tipoPasajero;

    public TipoPasajero(String tipoCliente) {
        if(ControlesGenerales.validarNulos(tipoCliente)){
        this.tipoPasajero=tipoCliente;
        }else{
            JOptionPane.showMessageDialog(null, "Valor nulo en: " + getClass());
        }
    }
    
    public String getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(String tipoCliente) {
        this.tipoPasajero = tipoCliente;
    }

}
