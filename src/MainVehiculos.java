/**
 * Created by Cristina on 03/10/2016.
 */
public class MainVehiculos {

    public static void main(String[] args) {

        Coche Jaguar= new Coche ("1234ENG", "Jaguar", "TheRoadIsYours", 200000);
        Coche BMW= new Coche ("9065AME", "BMW", "LoveAtFirstDrive", 60000);
        Coche Lexus= new Coche ("5638DDD", "Lexus", "FastAndGlorious", 120000);
        Coche Austin= new Coche ("3564GER", "Austin", "BeLikeBond", 150000);
        Coche RomeoAlfaJulietta= new Coche ("4749JAV", "RomeoAlfaJulietta", "DramaMasterpiece", 12000);

        RegistroVehiculos registro = new RegistroVehiculos();

        registro.registrarVehiculo(Jaguar);
        registro.registrarVehiculo(BMW);
        registro.registrarVehiculo(Lexus);
        registro.registrarVehiculo(Austin);
        registro.registrarVehiculo(RomeoAlfaJulietta);

        // Debes comprobar que el HashSet no permite duplicados
        registro.registrarVehiculo(RomeoAlfaJulietta);

        System.out.println("Todos: "+registro.obtenerTodos());

        registro.obtenerVehiculo("1234ENG").ifPresent(coche -> System.out.println("\nCoche con matrícula 1234ENG: "+coche));


        // Bucle expresado en Java8
        registro.obtenerVehiculosMarca("Lexus").forEach(coche -> System.out.println("Buscando Lexus: "+coche));

        registro.obtenerVehiculoPrecioMax().ifPresent(coche -> System.out.println("Coche precio máximo: "+coche));

        System.out.println("Eliminando coche con matrícula 1234ENG");
        registro.eliminarVehiculo("1234ENG");

        System.out.println(registro.obtenerTodos());
    }
}