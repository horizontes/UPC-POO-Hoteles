

package Objetos;



public class TipoHabitacion {
    
    private String tipo;

    
    public TipoHabitacion(String tipo){
        this.tipo = tipo;
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
