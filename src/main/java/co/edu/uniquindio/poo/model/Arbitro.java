package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Arbitro extends Participante {
    private String nivelexperiencia;

    public Arbitro(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, Byte edad, String pais, String nivelexperiencia){
        super(nombre, apellido, fechanacimiento, nacionalidad, deporte, edad, pais);
        this.nivelexperiencia = nivelexperiencia;
    }

    public String getNivelexperiencia() {
        return nivelexperiencia;
    }

    public void setNivelexperiencia(String nivelexperiencia) {
        this.nivelexperiencia = nivelexperiencia;
    }
}
