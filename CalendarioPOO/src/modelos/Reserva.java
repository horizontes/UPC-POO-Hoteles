
package modelos;

import controladores.ControlesGenerales;
import java.util.Date;
import javax.swing.JOptionPane;


public class Reserva {
    
    private static int id=1;
    private int idReserva;
    private Pasajero pasajero;
    private Habitacion habitacion;
    private int dia;
    private int mes;
    private int anio;
    private EstadoReserva estado;
    //private Fecha fecha;
    
    public Reserva(Pasajero pasajero, Habitacion habitacion, int dia, int mes, int anio){
        
        if(ControlesGenerales.validarNulos(pasajero)&&ControlesGenerales.validarNulos(habitacion)&&
                ControlesGenerales.validarNumerosValidos(dia*mes*anio)){
        
        this.pasajero=pasajero;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        id++;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido en: " + pasajero + " " + habitacion + ">>>" + getClass());
        }
    }
    
    public Reserva(Pasajero pasajero, Habitacion habitacion, int dia, int mes, int anio,
            String estadoReserva){
        if(ControlesGenerales.validarNulos(pasajero)&&ControlesGenerales.validarNulos(habitacion)&&
                ControlesGenerales.validarNumerosValidos(dia*mes*anio)&&ControlesGenerales.validarNulos(estadoReserva)){
        this.pasajero=pasajero;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        this.estado = new EstadoReserva(estadoReserva);
        id++;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido en: " + pasajero + " " + habitacion + ">>>" + getClass());
        }
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

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
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
                "\nNombre de Cliente:\t\t\t" + this.getPasajero().toString() +
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
