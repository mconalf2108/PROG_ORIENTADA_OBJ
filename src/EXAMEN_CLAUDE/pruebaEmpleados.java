package EXAMEN_CLAUDE;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class pruebaEmpleados {
    public static void main(String[] args) {
// ■■ Datos iniciales ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        List<Empleado> empleados = new ArrayList<>(Arrays.asList(
                new Empleado(1, "Ana Garcia", "IT", 45000, 6),
                new Empleado(2, "Luis Martinez", "RRHH", 28000, 2),
                new Empleado(3, "Sara Lopez", "IT", 52000, 8),
                new Empleado(4, "Pedro Ruiz", "Ventas", 31000, 4),
                new Empleado(5, "Marta Sanz", "IT", 29000, 1),
                new Empleado(6, "Carlos Diaz", "Ventas", 38000, 5),
                new Empleado(7, "Elena Vega", "RRHH", 26000, 3),
                new Empleado(8, "Tomas Gil", "IT", 61000, 10)

        ));
        Set<String> departamentosUnicos = new HashSet<>();
        departamentosUnicos.stream()
                .forEach(System.out::println);
    }
    // Método genérico — Ejercicio 3c
    public static <T, R> List<R> aplicarATodos(
            List<T> lista, Transformador<T, R> t) {
// TODO
        return null;
    }
}