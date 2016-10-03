import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Cristina on 03/10/2016.
 */

public class RegistroVehiculos {

    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7

    public Optional<Coche> obtenerVehiculo(String matricula) {
        return coches.stream().findFirst().filter(coche -> coche.getMatricula().equals(matricula));
        //coches.stream().filter(coche -> coche.getMatricula().equals(matricula));
    }

    public void eliminarVehiculo(String matricula) {
        coches.removeIf(coche -> coche.getMatricula().equals(matricula));
    }

    public Optional<Coche> obtenerVehiculoPrecioMax() {
        return coches.stream().max(Comparator.comparing(Coche::getPrecio));
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        return coches.stream().filter(coche -> coche.getMarca().equals(marca)).collect(Collectors.toList());
    }

    public List<Coche> obtenerTodos() {
        return coches.stream().collect(Collectors.toList());
    }
}