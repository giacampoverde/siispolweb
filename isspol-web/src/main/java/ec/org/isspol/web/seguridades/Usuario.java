package ec.org.isspol.web.seguridades;

import java.io.Serializable;

/**
 * Created by santiago.yacelga on 29/03/2017.
 */
public class Usuario implements Serializable {
   private  String id;
   private String nombre;
   private String apellido;

   public Usuario (){

   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
