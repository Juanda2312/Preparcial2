package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Equipo extends Participante{
    private LinkedList<Atleta> listaatletas;

    public Equipo(String nombre, Deporte deporte, String pais, LinkedList<Atleta>listaatletas){
        super(nombre, null, null, null, deporte,null, pais);
        this.listaatletas = listaatletas;
    }

    public LinkedList<Atleta> getListaatletas() {
        return listaatletas;
    }

    public void setListaatletas(LinkedList<Atleta> listaatletas) {
        this.listaatletas = listaatletas;
    }

  
}
