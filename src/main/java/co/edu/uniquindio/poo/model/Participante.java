package co.edu.uniquindio.poo.model;

public class Participante {
    private Byte edad;
    private String pais;
    private Persona persona;
    private RolParticipante rol;

    public Participante(Byte edad, String pais, Persona persona){
        this.edad = edad;
        this.pais = pais;
        this.persona = persona;
        RolParticipante rol;
        if (persona instanceof Atleta) {
            rol = RolParticipante.ATLETA;
        }else if (persona instanceof Entrenador) {
            rol = RolParticipante.ENTRENADOR;
        }else if (persona instanceof Arbitro) {
            rol = RolParticipante.ARBITRO;
        }else if (persona instanceof PersonalApoyo) {
            rol = RolParticipante.PERSONALAPOYO;
        }else{
            rol = RolParticipante.OTRO;
        }
        this.rol = rol;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public RolParticipante getRol() {
        return rol;
    }

    public void setRol(RolParticipante rol) {
        this.rol = rol;
    }

}
