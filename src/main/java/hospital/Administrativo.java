package hospital;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Administrativo extends Empleado{
    
    private Grupo grupo;

    public Administrativo(String nombre, String apellidos, String numeroDni, 
            String numeroSeguridadSocial, double salario,
            Grupo grupo) {
        super(nombre, apellidos, numeroDni, numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }
    
    public void registrarDocumento() {
        System.out.println(this.getNombre() + " ha registrado un documento.");
    }

    @Override
    public void tomarCafe() {
        System.out.println(this.getNombre() + "se toma un cafe junto al despacho.");
    }
    
    @Override
    public double calcularIRPF() {
        switch(this.grupo.toString()){
            case "A1":
            case "A2":
                return this.getSalario() * 0.18;
            default:
                return this.getSalario() * 0.16;
        }
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
