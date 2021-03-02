
package entity;

import java.util.Date;

/**
 *
 * @author Ignacio
 */
public class Usuario {
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String rut;
    private String password;
    private long rol;
    private Date fechaRegistro;
    private long bloqueado;

    public long getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(long bloqueado) {
        this.bloqueado = bloqueado;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRol() {
        return rol;
    }

    public void setRol(long rol) {
        this.rol = rol;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
