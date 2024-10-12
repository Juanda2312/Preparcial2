package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Entrenador extends Persona{
    private String especializacion;

    public Entrenador(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, String especializacion){
        super(nombre, apellido, fechanacimiento, nacionalidad, deporte);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
