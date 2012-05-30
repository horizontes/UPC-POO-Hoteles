package modelos;

import controladores.ControlesGenerales;
import javax.swing.JOptionPane;

public class Pasajero {

    private static int id = 1;
    private int idCliente;
    private String nombre;
    private String apellido;
    private TipoPasajero tipoCliente;
    private String email;
    private String tel;
    private String fax;

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido) {
        if (ControlesGenerales.validarNulos(nombre) && ControlesGenerales.validarNulos(apellido)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.idCliente = id;
            id++;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido: " + nombre + "," + apellido + ">>>" + getClass());
        }
    }

    public Pasajero(String nombre, String apellido, TipoPasajero tipoCliente) {
        if (ControlesGenerales.validarNulos(nombre) && ControlesGenerales.validarNulos(apellido)
                &&ControlesGenerales.validarNulos(tipoCliente)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.tipoCliente = tipoCliente;
            this.idCliente = id;
            id++;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido: " + nombre + "," + apellido + ">>>" + getClass());
        }
    }

    public void setTipoCliente(TipoPasajero tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPasajero getTipoCliente() {
        return tipoCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
