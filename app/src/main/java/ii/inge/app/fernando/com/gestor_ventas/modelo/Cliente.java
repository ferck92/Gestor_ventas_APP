package ii.inge.app.fernando.com.gestor_ventas.modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

    public String idCliente;

    public String nombres;

    public String apellidos;

    public String telefono;

    public Cliente(String idCliente, String nombres, String apellidos, String telefono) {
        this.idCliente = idCliente;//1
        this.nombres = nombres;//2
        this.apellidos = apellidos;//3
        this.telefono = telefono;//4
    }

    public String toString(){
        return nombres + " " + apellidos;
    }
}
