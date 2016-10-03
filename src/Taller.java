import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * Created by Cristina on 03/10/2016.
 */

public class Taller {

    private Map<Persona, Coche> reparaciones = new TreeMap<>(Comparator.comparing(Persona::getNumSeguridadSocial));

    public Coche registrarReparacion(Persona persona, Coche coche){
        return null;
    }

    public Coche obtenerCoche(Persona persona){
        return null;
    }

    public Set<Persona> obtenerClientes(){
        return null;
    }

}