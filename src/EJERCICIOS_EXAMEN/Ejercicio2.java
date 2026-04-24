package EJERCICIOS_EXAMEN;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
        Set<String> matematicas = new HashSet<String>();
        Set<String> historia = new HashSet<String>();
        matematicas.add("Daniel");
        matematicas.add("Luis");
        matematicas.add("Marco");
        matematicas.add("Juan");
        historia.add("Daniel");
        historia.add("Luis");
        historia.add("Marco");
        historia.add("Marta");
        Set<String> temporal =  new HashSet<>(matematicas);
        temporal.retainAll(historia);
        System.out.println("Alumnos que estan en ambas" + temporal);

        temporal = new HashSet<>(matematicas);
        temporal.removeAll(historia);
        System.out.println("Alumnos que estan en solo en Mates" + temporal);

    }
}
