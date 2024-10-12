package co.edu.uniquindio.poo.model;

import java.util.Date;
import java.util.LinkedList;

public class Persona {
    private String nombre;
    private String apellido;
    private Date fechanacimiento;
    private String nacionalidad;
    private Deporte deporte;
    private LinkedList<Participante> listaparticipaciones;

    public Persona(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.nacionalidad = nacionalidad;
        this.deporte = deporte;
        this.listaparticipaciones = new LinkedList<>();
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

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public LinkedList<Participante> getListaparticipaciones() {
        return listaparticipaciones;
    }

    public void setListaparticipaciones(LinkedList<Participante> listaparticipaciones) {
        this.listaparticipaciones = listaparticipaciones;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
        return result;
    }

    /**
     * Comprueba si existe otra persona con el mismo nombre, apellidos y fecha de nacimiento
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (fechanacimiento == null) {
            if (other.fechanacimiento != null)
                return false;
        } else if (!fechanacimiento.equals(other.fechanacimiento))
            return false;
        return true;
    }

    public void agregarparticipacion(Participante participacion){
        listaparticipaciones.add(participacion);
        }
}
