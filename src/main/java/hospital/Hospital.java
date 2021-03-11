package hospital;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    
    private Set<Empleado> listaEmpleados;
    private Set<Paciente> listaPacientes;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        
        this.listaEmpleados = new HashSet<>();
        this.listaPacientes = new HashSet<>();
    }
    
    public void contratarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }
    
    public void ingresarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Set<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Set<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Set<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(Set<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
}
