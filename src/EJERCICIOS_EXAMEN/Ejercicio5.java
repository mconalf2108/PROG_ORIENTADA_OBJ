package EJERCICIOS_EXAMEN;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---SISTEMA DE ALUMNADO/PROFESORES");
        ArrayList<String> listaProfe1 = new ArrayList<>();
        listaProfe1.add("JUAN");
        listaProfe1.add("HUGO");
        listaProfe1.add("JOSE");
        listaProfe1.add("ALVARO");
        listaProfe1.add("MANUEL");
        Map<String, List<String>> academia = new HashMap<>();
        academia.put("profesor1", listaProfe1);
        System.out.println("De que profesor quiere saber su alumnado?");
        String profesor = sc.next();

        if (academia.containsKey(profesor)) {
            System.out.println("Los alumnos son: " + academia.get(profesor));
        } else {
            System.out.println("Ese profesor no está registrado en la academia.");
        }
    }
}
