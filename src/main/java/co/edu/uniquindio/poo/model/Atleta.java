package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Atleta extends Persona {
    private Byte añosexperiencia;
    private Equipo equipo;

    public Atleta(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, Byte añosexperiencia, Equipo equipo){
        super(nombre, apellido, fechanacimiento, nacionalidad, deporte);
        this.añosexperiencia = añosexperiencia;
        this.equipo = equipo;
    }

    public Byte getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(Byte añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
