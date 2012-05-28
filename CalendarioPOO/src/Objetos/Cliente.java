

package Objetos;


public class Cliente {
    
    private static int id=1;
    private int idCliente;
    private String nombre;
    private String apellido;
    private TipoCliente tipoCliente;
    private String email;
    private String tel;
    private String fax;
    
    public Cliente(){
    }
    
    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido= apellido;
        this.idCliente = id;
        id++;
    }
    
    public Cliente(String nombre, String apellido, TipoCliente tipoCliente){
        this.nombre = nombre;
        this.apellido= apellido;
        this.tipoCliente = tipoCliente;
        this.idCliente = id;
        id++;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
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
    
    public String toString(){
        return this.nombre + " " + this.apellido;
    }
    
}
