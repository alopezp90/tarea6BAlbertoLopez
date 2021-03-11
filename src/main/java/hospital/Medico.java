package hospital;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String nombre, String apellidos, String numeroDni,
            String numeroSeguridadSocial, double salario,
            String especialidad) {
        super(nombre, apellidos, numeroDni, numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularIRPF() {
        return this.getSalario() * 0.21;
    }

    @Override
    public void tomarCafe() {
        System.out.println("Dr. " + this.getApellidos() + " toma café junto a la sala de espera.");
    }
    
    public void tratarPaciente(Paciente paciente, String medicina) {
        paciente.tomarMedicina(medicina);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
