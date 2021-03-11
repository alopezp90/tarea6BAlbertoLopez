package hospital;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public abstract class Empleado extends Persona {

    private String numeroSeguridadSocial;
    private double salario;

    public Empleado(String nombre, String apellidos, String numeroDni,
            String numeroSeguridadSocial, double salario) {
        super(nombre, apellidos, numeroDni);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public double calcularIRPF() {
        return salario * 0.12;
    }

    public abstract void tomarCafe();

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
