package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Participante extends Persona {
    private Byte edad;
    private String pais;

    public Participante(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, Byte edad, String pais){
        super(nombre,apellido,fechanacimiento,nacionalidad,deporte);
        this.edad = edad;
        this.pais = pais;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}