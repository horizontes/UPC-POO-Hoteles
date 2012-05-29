
package Objetos;

import java.util.Date;


public class Reserva {
    
    private static int id=1;
    private int idReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private int dia;
    private int mes;
    private int anio;
    private EstadoReserva estado;
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
    
    public Reserva(Cliente cliente, Habitacion habitacion, int dia, int mes, int anio,
            String estadoReserva){
        this.cliente=cliente;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        this.estado = new EstadoReserva(estadoReserva);
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
        return "El Hotel 'TU CASA' te da la bienvenida\n\n\n"+
                "Detalle de factura\n\n"+
                "Fecha de emsión:\t\t\t" + new Fecha(new Date()).toComplet()+
                "\nId de Reserva:\t\t\t" + this.idReserva +
                "\nNombre de Cliente:\t\t\t" + this.getCliente().toString() +
                "\nNumero de Habitacion:\t\t\t" + this.getHabitacion().getNumHabitacion() +
                "\nTipo de Habitacion:\t\t\t" + this.getHabitacion().getTipoHabitacion().toString() +
                "\nPrecio por Dia:\t\t\t" + this.getHabitacion().getTipoHabitacion().getPrecio() +
                "\nDescuento:\t\t\t" + "0.00" +
                "\nFecha de Reserva:\t\t\t" + this.dia+"/"+this.mes+"/"+this.anio +
                "\nUsuario del sistema:\t\t\t" + "Cgarrido" + 
                "\nEstado de la reserva:\t\t\t" + this.estado +
                "\n\n\nVisitenos nuevamente.";
               
    }
    
    
}
