package hospital;

import java.util.ArrayList;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class GestionHospital {

    private static ArrayList<Empleado> crearMedicos() {
        ArrayList<Empleado> listado = new ArrayList<>();
        listado.add(new Medico("Carlos", "Sastre", "23654567", "123456789", 1800, "Traumatologia"));
        listado.add(new Medico("Ignacio", "Martin", "78956453", "123654875", 1780, "Anestesia"));
        return listado;
    }

    private static ArrayList<Empleado> crearAdministrativos() {
        ArrayList<Empleado> listado = new ArrayList<>();
        listado.add(new Administrativo("Javier", "Pareja", "87342398", "987678763", 1450, Grupo.B));
        listado.add(new Administrativo("Alvaro", "Hidalgo", "65748392", "765846300", 1500, Grupo.A1));
        listado.add(new Administrativo("Carlos", "Sevilla", "09837362", "236453728", 1300, Grupo.C1));
        return listado;
    }

    private static ArrayList<Paciente> crearPacientes() {
        ArrayList<Paciente> listado = new ArrayList<>();
        listado.add(new Paciente("Felipe", "del Campo", "76483922", "123"));
        listado.add(new Paciente("Ricardo", "Perez", "76443922", "144"));
        listado.add(new Paciente("Felisa", "Gomez", "12425636", "555"));
        listado.add(new Paciente("Luisa", "Perez", "65746352", "100"));
        listado.add(new Paciente("Alberto", "Lopez", "98756453", "003"));
        return listado;
    }

    public static void main(String[] args) {

        Hospital hospital = new Hospital("MarAlboran", "C/ Fuente de maria Gil 30, Estepona", 300);

        for (Empleado empleado : crearMedicos()) {
            hospital.contratarEmpleado(empleado);
        }

        for (Empleado empleado : crearAdministrativos()) {
            hospital.contratarEmpleado(empleado);
        }

        for (Paciente paciente : crearPacientes()) {
            hospital.ingresarPaciente(paciente);
        }

        for (Empleado empleado : hospital.getListaEmpleados()) {
            empleado.tomarCafe();
        }

        //coge al medico Carlos Sastre
        Medico m1 = null;
        for (Empleado empleado : hospital.getListaEmpleados()) {
            if (empleado instanceof Medico) {
                //(correccion)if (empleado.getClass() == (new Medico("", "", "123456789", "", 0, "").getClass())) {
                if (empleado.getNombre().equals("Carlos") && empleado.getApellidos().equals("Sastre")) {
                    m1 = (Medico) empleado;
                }
            }
        }

        //coge el primer paciente que salga
        Paciente p1 = null;
        for (Paciente paciente : hospital.getListaPacientes()) {
            p1 = paciente;
            break;
        }

        if (m1 != null) {
            m1.tratarPaciente(p1, "Paracetamol");
        }
    }
}
