package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

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

        Atleta atleta = new Atleta("Juan", "Rodrigues", null, "colombiano", Deporte.NATACION, (byte)(20), "Colombia", (byte)(5));
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

        Atleta atleta = new Atleta("Juan", "Rodrigues", null, "colombiano", Deporte.NATACION, (byte)(20), "Colombia", (byte)(5));
        empresa.agregarpersona(atleta);
        Atleta atleta2 = new Atleta("Paco", "Perez", null, "Peruano", Deporte.NATACION, (byte)(33), "Peru", (byte)(12));
        empresa.agregarpersona(atleta2);

        LinkedList <Participante> listaResultante = new LinkedList<>();
        listaResultante.add(atleta2);
        listaResultante.add(atleta);

        EventoDeportivo natacionuq = new EventoDeportivo("Final natación UQ", null, "UQ", Deporte.NATACION, TipoEvento.COMPETICION, listaResultante);
        empresa.agregarEvento(natacionuq);

        assertIterableEquals(listaResultante, empresa.EventoNatacionCompeticion());

        Atleta atleta3 = new Atleta("Juan", "Rodrigues", null, "colombiano", Deporte.BALONCESTO, (byte)(20), "Colombia", (byte)(5));
        empresa.agregarpersona(atleta3);
        Atleta atleta4 = new Atleta("Paco", "Perez", null, "Peruano", Deporte.BALONCESTO, (byte)(33), "Peru", (byte)(12));
        empresa.agregarpersona(atleta4);

        LinkedList <Participante> listaParticipantes2 = new LinkedList<>();
        listaParticipantes2.add(atleta3);
        listaParticipantes2.add(atleta4);

        EventoDeportivo BasketUQ = new EventoDeportivo("Final natación UQ", null, "UQ", Deporte.BALONCESTO, TipoEvento.COMPETICION, listaParticipantes2);
        empresa.agregarEvento(BasketUQ);

        assertIterableEquals(listaResultante, empresa.EventoNatacionCompeticion());

        LOG.info("Finalizando test");

        Atleta atleta5 = new Atleta("Pepe", "Rodrigues", null, "colombiano", Deporte.NATACION, (byte)(20), "Colombia", (byte)(5));
        empresa.agregarpersona(atleta5);
        Atleta atleta6 = new Atleta("Manolo", "Perez", null, "Peruano", Deporte.NATACION, (byte)(33), "Peru", (byte)(12));
        empresa.agregarpersona(atleta6);

        LinkedList <Participante> listaParticipantes3 = new LinkedList<>();
        listaParticipantes3.add(atleta5);
        listaParticipantes3.add(atleta6);

        EventoDeportivo natacionuqV2 = new EventoDeportivo("Final natación UQ", null, "UQ", Deporte.NATACION, TipoEvento.COMPETICION, listaResultante);//Otra competición de tipo natación
        empresa.agregarEvento(natacionuqV2);

        listaResultante.add(atleta5);
        listaResultante.add(atleta6);//Se deben agregar los participantes de este segundo evendo dado a que tambien es una competicion de natacion

        //Lista resultante tiene a atleta, atleta2, atleta5 y atleta6
        assertIterableEquals(listaResultante, empresa.EventoNatacionCompeticion());
    }
}
