package hospital;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Paciente extends Persona{

    private String numeroHistoria;

    public Paciente(String nombre, String apellidos, String numeroDni,
            String numeroHistoria) {
        super(nombre, apellidos, numeroDni);
        this.numeroHistoria = numeroHistoria;
    }
    
    public void tomarMedicina(String medicina) {
        System.out.println(this.getNombre() + " toma " + medicina);
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }
}
