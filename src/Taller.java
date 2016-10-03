import java.util.*;

/**
 * Created by Cristina on 03/10/2016.
 */

public class Taller {

    private Map<Persona, Coche> reparaciones = new TreeMap<>(Comparator.comparing(Persona::getNombre));

    public void registrarReparacion(Persona persona, Coche coche){
        reparaciones.put(persona, coche);
    }

    public Coche obtenerCoche(Persona persona){
        return reparaciones.get(persona);
    }

    // Saldrá ordenado por el comparador que hay en el treemap
    public Set<Persona> obtenerClientes(){
        return reparaciones.keySet();
    }

}