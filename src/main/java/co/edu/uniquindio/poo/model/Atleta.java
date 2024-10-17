package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Atleta extends Participante{
    private Byte añosexperiencia;

    public Atleta(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, Byte edad, String pais, Byte añosexperiencia){
        super(nombre, apellido, fechanacimiento, nacionalidad, deporte, edad, pais);
    }

    public Byte getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(Byte añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

}
