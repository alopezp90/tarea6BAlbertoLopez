package hospital;

import java.time.LocalDate;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private Nif dni;
    
    public Persona(String nombre, String apellidos, String numeroDni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = new Nif(numeroDni);
    }
    
    public void renovarNif(LocalDate fechaSolicitud){
        this.dni.setVigencia(fechaSolicitud.plusYears(10));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Nif getDni() {
        return dni;
    }

    public void setDni(Nif dni) {
        this.dni = dni;
    }
}
