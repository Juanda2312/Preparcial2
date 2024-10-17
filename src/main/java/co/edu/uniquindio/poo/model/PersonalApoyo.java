package co.edu.uniquindio.poo.model;

import java.util.Date;
import java.util.LinkedList;

public class PersonalApoyo extends Participante{
    private LinkedList<Date> experienciaprevia;

    public PersonalApoyo(String nombre, String apellido, Date fechanacimiento, String nacionalidad, Deporte deporte, Byte edad, String pais, LinkedList<Date> experienciaprevia){
        super(nombre, apellido, fechanacimiento, nacionalidad, deporte, edad, pais);
        this.experienciaprevia = experienciaprevia;
    }

    public LinkedList<Date> getExperienciaprevia() {
        return experienciaprevia;
    }

    public void setExperienciaprevia(LinkedList<Date> experienciaprevia) {
        this.experienciaprevia = experienciaprevia;
    }
}
