package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Atleta;
import co.edu.uniquindio.poo.model.Deporte;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.EventoDeportivo;
import co.edu.uniquindio.poo.model.Participante;
import co.edu.uniquindio.poo.model.Persona;
import co.edu.uniquindio.poo.model.TipoEvento;

import java.util.LinkedList;

public class EmpresaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void CRUDpersonaTest() {
        LOG.info("Iniciado test");
        
        Empresa empresa = new Empresa("UQ");
        String resultado = empresa.agregarpersona(null);
        assertEquals("No se pudo agregar", resultado);

        Atleta atleta = new Atleta("Juan", "Rodrigues", null, "Español", Deporte.VOLLEYBALL, (byte)(5), null);
        resultado = empresa.agregarpersona(atleta);
        assertEquals("Ha sido agregada correctamente", resultado);

        resultado = empresa.agregarpersona(atleta);
        assertEquals("No se pudo agregar", resultado);

        resultado = empresa.eliminarpersona(atleta);
        assertEquals("Ha sido eliminado correctamente", resultado);

        resultado = empresa.eliminarpersona(atleta);
        assertEquals("No se a podido eliminar", resultado);

        resultado = empresa.eliminarpersona(null);
        assertEquals("No se a podido eliminar", resultado);

        empresa.agregarpersona(atleta);
        Persona persona = empresa.buscarpersona(atleta);
        assertEquals(atleta, persona);

        persona = empresa.buscarpersona(persona);
        resultado = persona.getNombre();
        assertEquals("Juan", resultado);

        resultado = empresa.ActualizarAtleta(atleta, "Paco", "Perez", null, "Español", Deporte.VOLLEYBALL, (byte)(7), null);
        assertEquals("La información del atleta ha sido actualizada", resultado);

        persona = empresa.buscarpersona(persona);
        resultado = persona.getNombre();
        assertEquals("Paco", resultado);

        LOG.info("Finalizando test");
    }

    @Test
    public void EventoNatacionCompeticionTest(){
        LOG.info("Iniciado test");

        Empresa empresa = new Empresa("UQ DEPORTES");

        Atleta atleta1 = new Atleta("Juan", "Rodriguez", null, "Colombiano", Deporte.NATACION, (byte)(4), null);
        empresa.agregarpersona(atleta1);
        Atleta atleta2 = new Atleta("Paco", "Sanchez", null, "Peruano", Deporte.NATACION, (byte)(9), null);
        empresa.agregarpersona(atleta2);

        LinkedList<Participante> listaParticipantes = new LinkedList<>();

        Participante participacion = new Participante((byte)(25), "Colombia", atleta1);
        atleta1.agregarparticipacion(participacion);
        listaParticipantes.add(participacion);
        participacion = new Participante((byte)(30), "perú", atleta2);
        atleta2.agregarparticipacion(participacion);
        listaParticipantes.add(participacion);

        EventoDeportivo finalnatacionuq = new EventoDeportivo("Final de natacion uq", null, "UQ", Deporte.NATACION, TipoEvento.COMPETICION, null, listaParticipantes);
        empresa.agregarEvento(finalnatacionuq);

        LinkedList<Participante> resultado = empresa.EventoNatacionCompeticion();

        assertEquals(listaParticipantes, resultado);

        LOG.info("Finalizando test");
    }
}
