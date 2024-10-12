package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Equipo {
    private String nombre;
    private String pais;
    private LinkedList<EquipoParticipante> listaparticipaciones;
    private LinkedList<Atleta> listaatletas;

    public Equipo(String nombre, String pais,LinkedList<Atleta>listaatletas){
        this.nombre = nombre;
        this.pais = pais;
        this.listaatletas = listaatletas;
        this.listaparticipaciones = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LinkedList<EquipoParticipante> getListaparticipaciones() {
        return listaparticipaciones;
    }

    public void setListaparticipaciones(LinkedList<EquipoParticipante> listaparticipaciones) {
        this.listaparticipaciones = listaparticipaciones;
    }

    public LinkedList<Atleta> getListaatletas() {
        return listaatletas;
    }

    public void setListaatletas(LinkedList<Atleta> listaatletas) {
        this.listaatletas = listaatletas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    /**
     * Comprueba si existe un equipo con el mismo nombre
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipo other = (Equipo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public void agregarparticipacion(EquipoParticipante participacion){
        listaparticipaciones.add(participacion);
    }
}
