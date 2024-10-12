package co.edu.uniquindio.poo.model;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.Date;

public class Empresa {

    private String nombre;
    private LinkedList<Persona> listapersonas;
    private LinkedList<EventoDeportivo> listaeventos;
    private LinkedList<Equipo> listaequipos;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.listapersonas = new LinkedList<>();
        this.listaeventos = new LinkedList<>();
        this.listaequipos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Persona> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(LinkedList<Persona> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public LinkedList<EventoDeportivo> getListaeventos() {
        return listaeventos;
    }

    public void setListaeventos(LinkedList<EventoDeportivo> listaeventos) {
        this.listaeventos = listaeventos;
    }

    public LinkedList<Equipo> getListaequipos() {
        return listaequipos;
    }

    public void setListaequipos(LinkedList<Equipo> listaequipos) {
        this.listaequipos = listaequipos;
    }

    /**
     * Agrega una persona si esta no existe ya en la lista
     * @param persona
     * @return un mensaje indicando si se agrego o no pudo ser agregada
     */
    public String agregarpersona(Persona persona){
        String mensaje = "No se pudo agregar";
        if (persona != null){
            Persona personaaux = buscarpersona(persona);
            if (personaaux == null){
                listapersonas.add(persona);
                mensaje = "Ha sido agregada correctamente";
            }
        }
        return mensaje;
    }

    /**
     * Busca una persona en la lista de personas
     * @param persona
     * @return la persona si se encuentra o null si no se encuentra
     */
    public Persona buscarpersona(Persona persona){
        Persona personaencontrada = null;
        if (persona != null) {
            if (listapersonas.contains(persona)) {
                personaencontrada = persona;
            }
        }
        return personaencontrada;
    }

    /**
     * Elimina una persona de la lista de personas si existe en esta
     * @param persona
     * @return un mensaje indicando si se eliminó o no se pudo eliminar
     */
    public String eliminarpersona(Persona persona){
        String mensaje = "No se a podido eliminar";
        if (persona != null) {
            Persona personaaux = buscarpersona(persona);
            if (personaaux != null) {
                listapersonas.remove(persona);
                mensaje = "Ha sido eliminado correctamente";
            }
        }
        return mensaje;
    }
    
    /**
     * Actualiza la información de un atleta si es que existe en la lista
     * @param atleta
     * @param nombre
     * @param apellido
     * @param fechanacimiento
     * @param nacionalidad
     * @param deporte
     * @param añosexperiencia
     * @param equipo
     * @return un mensaje indicando si se actualizó o no
     */
    public String ActualizarAtleta(Atleta atleta, String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, Byte añosexperiencia, Equipo equipo){
        String mensaje = "No ha podido ser actualizado";
        if (atleta != null) {
            Persona persona = buscarpersona(atleta);
            if (persona != null) {
                int index = listapersonas.indexOf(atleta);
                Persona personaaux = listapersonas.get(index);
                Atleta atletaaux = (Atleta) personaaux;
                atletaaux.setNombre(nombre);
                atletaaux.setApellido(apellido);
                atletaaux.setFechanacimiento(fechanacimiento);
                atletaaux.setNacionalidad(nacionalidad);
                atletaaux.setDeporte(deporte);
                atletaaux.setAñosexperiencia(añosexperiencia);
                atletaaux.setEquipo(equipo);
                mensaje = "La información del atleta ha sido actualizada";
            }
        }
        return mensaje;
    }

    /**
     * Actualiza la informacion de un entrenador si este existe
     * @param entrenador
     * @param nombre
     * @param apellido
     * @param fechanacimiento
     * @param nacionalidad
     * @param deporte
     * @param especializacion
     * @return un mensaje indicando si se actualizó o no
     */
    public String Actualizarentrenador(Entrenador entrenador, String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, String especializacion){
        String mensaje = "No ha podido ser actualizado";
        if (entrenador != null) {
            Persona persona = buscarpersona(entrenador);
            if (persona != null) {
                int index = listapersonas.indexOf(entrenador);
                Persona personaaux = listapersonas.get(index);
                Entrenador entrenadoraux = (Entrenador) personaaux;
                entrenadoraux.setNombre(nombre);
                entrenadoraux.setApellido(apellido);
                entrenadoraux.setFechanacimiento(fechanacimiento);
                entrenadoraux.setNacionalidad(nacionalidad);
                entrenadoraux.setDeporte(deporte);
                entrenadoraux.setEspecializacion(especializacion);
                mensaje = "La información del entrenador ha sido actualizada";
            }
        }
        return mensaje;
    }

    /**
     * Actualiza la informacion de un arbitro siempre y cuando este exista
     * @param arbitro
     * @param nombre
     * @param apellido
     * @param fechanacimiento
     * @param nacionalidad
     * @param deporte
     * @param nivelexperiencia
     * @return un mensaje indicando si si se pudo actualizar o no
     */
    public String Actualizararbitro(Arbitro arbitro, String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, String nivelexperiencia){
        String mensaje = "No ha podido ser actualizado";
        if (arbitro != null) {
            Persona persona = buscarpersona(arbitro);
            if (persona != null) {
                int index = listapersonas.indexOf(arbitro);
                Persona personaaux = listapersonas.get(index);
                Arbitro arbitroaux = (Arbitro) personaaux;
                arbitroaux.setNombre(nombre);
                arbitroaux.setApellido(apellido);
                arbitroaux.setFechanacimiento(fechanacimiento);
                arbitroaux.setNacionalidad(nacionalidad);
                arbitroaux.setDeporte(deporte);
                arbitroaux.setNivelexperiencia(nivelexperiencia);
                mensaje = "La información del arbitro ha sido actualizada";
            }
        }
        return mensaje;
    }

    /**
     * Actualiza la información del personal de apoyo siempre y cuando este exista
     * @param personalapoyo
     * @param nombre
     * @param apellido
     * @param fechanacimiento
     * @param nacionalidad
     * @param deporte
     * @param experienciaprevia
     * @return un mensaje indicando si se actualizo o no
     */
    public String ActualizarPersonalApoyo(PersonalApoyo personalapoyo, String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, LinkedList<Date> experienciaprevia){
        String mensaje = "No ha podido ser actualizado";
        if (personalapoyo != null) {
            Persona persona = buscarpersona(personalapoyo);
            if (persona != null) {
                int index = listapersonas.indexOf(personalapoyo);
                Persona personaaux = listapersonas.get(index);
                PersonalApoyo personalapoyoaux = (PersonalApoyo) personaaux;
                personalapoyoaux.setNombre(nombre);
                personalapoyoaux.setApellido(apellido);
                personalapoyoaux.setFechanacimiento(fechanacimiento);
                personalapoyoaux.setNacionalidad(nacionalidad);
                personalapoyoaux.setDeporte(deporte);
                personalapoyoaux.setExperienciaprevia(experienciaprevia);
                mensaje = "La información del Personal de apoyo ha sido actualizada";
            }
        }
        return mensaje;
    }

    /**
     * Agrega un evento si este no existe ya en la lista
     * @param persona
     * @return un mensaje indicando si se agrego o no pudo ser agregado
     */
    public String agregarEvento(EventoDeportivo evento){
        String mensaje = "No se pudo agregar";
        if (evento != null){
            EventoDeportivo eventoaux = buscarEvento(evento);
            if (eventoaux == null){
                listaeventos.add(evento);
                mensaje = "Ha sido agregado correctamente";
            }
        }
        return mensaje;
    }

    /**
     * Busca un evento en la lista de eventos
     * @param persona
     * @return el evento si se encuentra o null si no se encuentra
     */
    public EventoDeportivo buscarEvento(EventoDeportivo evento){
        EventoDeportivo eventoencontrado = null;
        if (evento != null) {
            if (listaeventos.contains(evento)) {
                eventoencontrado = evento;
            }
        }
        return eventoencontrado;
    }

    /**
     * Elimina un evento de la lista de eventos si existe en esta
     * @param persona
     * @return un mensaje indicando si se eliminó o no se pudo eliminar
     */
    public String eliminarEvento(EventoDeportivo evento){
        String mensaje = "No se a podido eliminar";
        if (evento != null) {
            EventoDeportivo eventoaux = buscarEvento(evento);
            if (eventoaux != null) {
                listaeventos.remove(evento);
                mensaje = "Ha sido eliminado correctamente";
            }
        }
        return mensaje;
    }
    
    /**
     * Actualiza la información de un evento siempre y cuando este exista
     * @param evento
     * @param nombre
     * @param fechainicio
     * @param ubicacion
     * @param deporte
     * @param tipoevento
     * @param listaequipos
     * @param listaParticipantes
     * @return un mensaje indicando si se actualizó o no
     */
    public String ActualizarEvento(EventoDeportivo evento, String nombre, Date fechainicio,String ubicacion,Deporte deporte, TipoEvento tipoevento, LinkedList<EquipoParticipante> listaequipos,LinkedList<Participante> listaParticipantes){
        String mensaje = "No se pudo actualizar";
        if (evento != null) {
            EventoDeportivo eventoaux = buscarEvento(evento);
            if (eventoaux != null) {
                int index = listaeventos.indexOf(evento);
                EventoDeportivo eventoaux2 = listaeventos.get(index);
                eventoaux2.setNombre(nombre);
                eventoaux2.setFechainicio(fechainicio);
                eventoaux2.setUbicacion(ubicacion);
                eventoaux2.setDeporte(deporte);
                eventoaux2.setTipoevento(tipoevento);
                eventoaux2.setListaequipos(listaequipos);
                eventoaux2.setListaParticipantes(listaParticipantes);
                mensaje = "El evento ha sido actualizado correctamente";
            }
        }
        return mensaje;
    }

    /**
     * Agrega un equipo siempre y cuando este no exista en la lista
     * @param equipo
     * @return un mensaje indicando si se agregó o no
     */
    public String agregarEquipo(Equipo equipo){
        String mensaje = "No se ha podido agregar";
        if (equipo!= null) {
            Equipo equipoaux = buscarEquipo(equipo);
            if (equipoaux == null) {
                listaequipos.add(equipo);
                mensaje = "Ha sido agregado correctamente";
            }
        }
        return mensaje;
    }

    /**
     * Busca si un equipo existe en la lista de equipos
     * @param equipo
     * @return El equipo si se encuentra o null si no se encuentra
     */
    public Equipo buscarEquipo(Equipo equipo){
        Equipo equipoencontrado = null;
        if (equipo != null) {
            if (listaequipos.contains(equipo)) {
                equipoencontrado = equipo;
            }
        }
        return equipoencontrado;
    }

    /**
     * Elimina un equipo si este existe en la lista 
     * @param equipo
     * @return un mensaje indicando si se eliminó o no
     */
    public String eliminarEquipo(Equipo equipo){
        String mensaje = "No se ha podido eliminar";
        if (equipo != null) {
            Equipo equipoaux = buscarEquipo(equipo);
            if (equipoaux != null) {
                listaequipos.remove(equipo);
                mensaje = "Ha sido eliminado correctamente";
            }
        }
        return mensaje;
    }

    /**
     * Actualiza la información de un equipo siempre y cuando este exista en la lista
     * @param equipo
     * @param nombre
     * @param pais
     * @param listaatletas
     * @return un mensaje indicando si se actualizo o no
     */
    public String actualizarEquipo(Equipo equipo, String nombre, String pais,LinkedList<Atleta>listaatletas){
        String mensaje = "No se ha podido actualizar";
        if (equipo != null) {
            Equipo equipoaux = buscarEquipo(equipo);
            if (equipoaux != null) {
                int index = listaequipos.indexOf(equipo);
                Equipo equipoaux2 = listaequipos.get(index);
                equipoaux2.setNombre(nombre);
                equipoaux2.setPais(pais);
                equipoaux2.setListaatletas(listaatletas);
                mensaje = "El equipo ha sido actualizado correctamente";
            }
        }
        return mensaje;
    }

    /**
     * Filtra entre la lista de eventos aquellos de tipo natación y de tipo competición y devuelve una linkedlist con los atletas que participaron en ese evento
     * @return linkedlist con los atletas participantes
     */
    public LinkedList<Participante> EventoNatacionCompeticion(){
        return listaeventos.stream().filter(evento -> evento.getDeporte().equals(Deporte.NATACION) && evento.getTipoevento().equals(TipoEvento.COMPETICION)).flatMap(evento -> evento.getListaParticipantes().stream()).collect(Collectors.toCollection(LinkedList::new));
    }
}
