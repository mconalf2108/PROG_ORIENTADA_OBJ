package ExamenClase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PruebaCiudades {

    public static void main(String[] args) {
        List<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Madrid", "España", 3300000, false, 80, true, 3));
        ciudades.add(new Ciudad("Barcelona", "España", 1600000, true, 60, true, 2));
        ciudades.add(new Ciudad("Valencia", "España", 800000, true, 40, false, 0));
        ciudades.add(new Ciudad("París", "Francia", 2100000, false, 120, true, 1));
        ciudades.add(new Ciudad("Split","Croacia", 200000, true, 70, false, 0));
        ciudades.add(new Ciudad("Dubrovnik","Croacia", 180000, true, 70, false, 0));
        ciudades.add(new Ciudad("Roma", "Italia", 2800000, true, 200, false, 0));


        //Ejercicio3a
        ReporteCiudad reporteCorto = ciudad-> "La ciudad "+ ciudad.getNombre() +" se encuentra en "+ciudad.getPais();

        //Ejercicio3b
        ReporteCiudad reporteTuristico = ciudad ->
                "La ciudad "+ ciudad.getNombre() + " tiene " + ciudad.getMonumentosHistoricos() + " monumentos historicos y cuenta con "+ ciudad.getHabitantes() + " habitantes";
        // Ejercicio3c
        System.out.println("APARTADO C");
        System.out.println(reporteCorto.generar(new Ciudad("Madrid", "España", 3300000, false, 200, true, 3)));
        System.out.println(reporteTuristico.generar(new Ciudad("Roma", "España", 2800000, false, 200, true, 3)));

        //Ejercicio3d
        System.out.println("APARTADO D");
        ciudades.stream()
                .filter(Ciudad::isTienePlaya)
                .forEach(System.out::println);

        //Ejercicio 3e
        System.out.println("APARTADO E");
        ciudades.stream()
                .filter(ciudad -> ciudad.isVisitado() && ciudad.getHabitantes() > 2000000)
                .sorted(Comparator.comparing(ciudad -> ciudad.getNombre()))
                .forEach(System.out::println);
        // Ejercicio 3f
        System.out.println("APARTADO F");
         List<String>ciudadList = ciudades.stream()
                 .filter(ciudad -> !ciudad.isVisitado() && ciudad.isTienePlaya())
                 .sorted(Comparator.comparing(Ciudad::getHabitantes).reversed())
                 .map(ciudad -> ciudad.getNombre().toUpperCase())
                 .toList();
        System.out.println(ciudadList);

        //Ejercicio 3g
         ciudades.stream()
                 .filter(ciudad -> ciudad.getNombre().equals("Croacia"))
                 .forEach(ciudad-> ciudad.setVisitado(true));

         // Ejercicio 3h
        ciudades.stream()
                .filter(ciudad -> ciudad.getNombre().equals("España"));
    }
}
