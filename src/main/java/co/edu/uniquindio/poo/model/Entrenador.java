package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Entrenador extends Participante{
    private String especializacion;

    public Entrenador(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, Byte edad, String pais, String especializacion){
        super(nombre, apellido, fechanacimiento, nacionalidad, deporte, edad, pais);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
