
package Objetos;


public class Reserva {
    
    private static int id=1;
    private int idReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private int dia;
    private int mes;
    private int anio;
    //private Fecha fecha;
    
    public Reserva(){
    }
    
    public Reserva(Cliente cliente, Habitacion habitacion, int dia, int mes, int anio){
        this.cliente=cliente;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        id++;
    }

    public Fecha getFecha() {
        return new Fecha(this.dia, this.mes, this.anio);
    }
    
    public int getIdReserva() {
        return idReserva;
    }
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public String toString(){
        return "Reservado";
    }
    
    public String toDetail(){
        return this.cliente +"\n" + this.habitacion + " - " + this.habitacion.getTipoHabitacion() + "\n" + this.dia+"/"+this.mes+"/"+this.anio;
    }
    
    
}
