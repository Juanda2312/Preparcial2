package co.edu.uniquindio.poo.model;

import java.util.Date;
import java.util.LinkedList;

public class EventoDeportivo {
    private String nombre;
    private Date fechainicio;
    private String ubicacion;
    private Deporte deporte;
    private TipoEvento	tipoevento;
    private LinkedList<Participante> listaParticipantes;

    public EventoDeportivo(String nombre, Date fechainicio,String ubicacion,Deporte deporte, TipoEvento tipoevento,LinkedList<Participante> listaParticipantes){
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.ubicacion = ubicacion;
        this.deporte = deporte;
        this.tipoevento = tipoevento;
        this.listaParticipantes = listaParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public TipoEvento getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(TipoEvento tipoevento) {
        this.tipoevento = tipoevento;
    }


    public LinkedList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(LinkedList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    /**
     * Comprueba si existe un evento deportivo con el mismo nombre
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventoDeportivo other = (EventoDeportivo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    
}
