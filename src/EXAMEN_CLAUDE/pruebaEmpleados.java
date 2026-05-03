package EXAMEN_CLAUDE;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class pruebaEmpleados {
    public static void main(String[] args) {
// ■■ Datos iniciales ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
        List<Empleado> empleados = new ArrayList<>(Arrays.asList(new Empleado(1, "Ana Garcia", "IT", 45000, 6), new Empleado(2, "Luis Martinez", "RRHH", 28000, 2), new Empleado(3, "Sara Lopez", "IT", 52000, 8), new Empleado(4, "Pedro Ruiz", "Ventas", 31000, 4), new Empleado(5, "Marta Sanz", "IT", 29000, 1), new Empleado(6, "Carlos Diaz", "Ventas", 38000, 5), new Empleado(7, "Elena Vega", "RRHH", 26000, 3), new Empleado(8, "Tomas Gil", "IT", 61000, 10)

        ));
        // Ejercicio 1a
        /**Crear un Set<String> llamado departamentosUnicos que contenga, sin duplicados, todos
los departamentos presentes en la lista. Imprimir su contenido por consola.**/

        Set<String> departamentosUnicos = new HashSet<String>();
        for (Empleado emp : empleados) {
            departamentosUnicos.add(emp.getDepartamento());
        }
        System.out.println("Departamentos únicos: " + departamentosUnicos);


        // Ejercicio 1b
        /**Crear un Map<String, List<Empleado>> llamado empleadosPorDepartamento que agrupe
         los empleados según su departamento usando bucles e if/containsKey. Imprimir el mapa
         mostrando, para cada departamento, los nombres de sus empleados.**/

        Map<String, List<Empleado>> empleadosPorDepartamento = new HashMap<>();
        for (Empleado emp : empleados) {
            String departamento = emp.getDepartamento();
            if (!empleadosPorDepartamento.containsKey(departamento)) {
                empleadosPorDepartamento.put(departamento, new ArrayList<>());
            }
            empleadosPorDepartamento.get(departamento).add(emp);
        }
        for (Map.Entry<String, List<Empleado>> entry : empleadosPorDepartamento.entrySet()) {
            System.out.println("Departamento: " + entry.getKey());

            for (Empleado emp : entry.getValue()) {
                System.out.println("  - " + emp.getNombre()); // Imprimimos solo el nombre
            }
        }

        //Ejercicio1c
        /**A partir del Set del apartado a, recorrerlo usando un Iterator explícito y eliminar durante la
        iteración todos los departamentos cuyo nombre tenga menos de 4 caracteres. Imprimir el Set
        resultante.**/

        Iterator<String> iterator = departamentosUnicos.iterator();
        while (iterator.hasNext()) {
            String departamento = iterator.next();
            if (departamento.length() < 4) {
                iterator.remove();
            }
        }
        System.out.println("Mostrando nombres con mas de 4 letras: " + departamentosUnicos);


        // Ejercicio 1d
        /**Demostrar la diferencia de ordenación entre TreeSet y LinkedHashSet: insertar los mismos
         departamentos del apartado a en ambas estructuras e imprimir el resultado de cada una,
         indicando qué criterio de orden aplica cada tipo.**/

        Set<String> departamentosOrdenados = new TreeSet<>(departamentosUnicos);
        System.out.println("TreeSet: " + departamentosOrdenados);
        System.out.println("Criterio TreeSet: Ordena los elementos por su 'orden natural' (alfabéticamente al ser Strings).");

// 2. LinkedHashSet
        Set<String> departamentosDesordenados = new LinkedHashSet<>(departamentosUnicos);
        System.out.println("LinkedHashSet: " + departamentosDesordenados);
        System.out.println("Criterio LinkedHashSet: Mantiene exactamente el orden de inserción (el orden en el que entraron originalmente).");

        // Ejercicio 1e
        /**Crear un Map<String, Empleado> llamado empleadoMejorPagadoPorDpto que asocie a
         cada departamento el empleado con mayor salario. Imprimir el resultado con el formato:
         Dpto [X] → NombreEmpleado (Y EUR)**/

        Map<String, Empleado> empleadoMejorPagadoPorDpto = new LinkedHashMap<>();
        for (Empleado emp : empleados) {
            String departamento = emp.getDepartamento();
            if (!empleadoMejorPagadoPorDpto.containsKey(departamento)) {
                empleadoMejorPagadoPorDpto.put(departamento, emp);
            } else {
                Empleado maximoActual = empleadoMejorPagadoPorDpto.get(departamento);
                if (maximoActual.getSalario() < emp.getSalario()) {
                    empleadoMejorPagadoPorDpto.put(departamento, emp);
                }
            }
        }
        for (Map.Entry<String, Empleado> entry : empleadoMejorPagadoPorDpto.entrySet()) {
            System.out.println("Mejor pagado: " + entry.getKey() + " - " + entry.getValue().getNombre());
        }

        // Ejercicio 2a
        /**Usar filter y map para obtener una List<String> con los nombres en mayúsculas de los
         empleados del departamento "IT" cuyo salario sea superior a 30.000 EUR. Imprimir la lista. **/

        List<String> nombresIT = empleados.stream().filter(emp -> emp.getDepartamento().equals("IT") && emp.getSalario() > 30000)
                .map(empleado -> empleado.getNombre().toUpperCase())
                .toList();
        System.out.println("Nombres IT(>30k): " + nombresIT);

        // Ejercicio 2b
        /**Usar mapToDouble y average para calcular e imprimir el salario medio de los empleados
        con más de 3 años de experiencia. Controlar el caso en que el Optional esté vacío.**/

        OptionalDouble salarioMedio = empleados.stream().filter(emp -> emp.getAniosExperiencia() > 3).mapToDouble(Empleado::getSalario).average();
        if (salarioMedio.isPresent()) {
            // Si tiene algo, sacamos el número real con .getAsDouble()
            System.out.println("Salario medio (>3 años exp): " + salarioMedio.getAsDouble() + " EUR");
        } else {
            // Si el Optional está vacío, mostramos un mensaje alternativo
            System.out.println("No hay empleados con más de 3 años de experiencia para calcular la media.");
        }
        ;
        // Ejercicio 2c
        /**Usar sorted con un Comparator compuesto para ordenar los empleados primero por
         departamento alfabéticamente y, en caso de empate, por salario de forma descendente.
         Imprimir nombre, departamento y salario de cada empleado resultante. **/
        System.out.println("\n--- Ejercicio 2c ---");
        empleados.stream()
                .sorted(Comparator.comparing(Empleado::getDepartamento) // 1. Orden principal: Alfabético por Dpto
                        .thenComparing(Comparator.comparingDouble(Empleado::getSalario).reversed())) // 2. Desempate: Salario descendente
                .forEach(emp -> System.out.println(emp.getNombre() + " | " + emp.getDepartamento() + " | " + emp.getSalario() + " EUR"));
        // Ejercicio 2d
        /**Usar Collectors.groupingBy con Collectors.averagingDouble para obtener un
         Map<String, Double> con el salario medio por departamento. Imprimir cada entrada con el
         formato: **/
        Map<String, Double> salarioMedioPorDpto = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.averagingDouble(Empleado::getSalario)));
        salarioMedioPorDpto.forEach((dpto, media) -> System.out.println("Departamento [" + dpto + "] -> salario medio: " + media + " EUR"));

        // Ejercicio 3a
        Transformador<Empleado, String> resumenEmpleado = emp -> "[" + emp.getId() + "]" + emp.getNombre() + " |" + "Dpto" + emp.getDepartamento() + " |" + " Salario: " + emp.getSalario() + "EUR" + "|" + " Exp:" + emp.getAniosExperiencia() + " años";
        // Ejercicio 3b
        /**Crear una expresión Lambda de tipo Transformador<List<Empleado>, Map<String,Long>>
         llamada contadorPorDpto que, dado un listado de empleados, devuelva un Map con el número
         de empleados por departamento usando Streams internamente. **/

        Transformador<List<Empleado>, Map<String, Long>> contadorPorDpto = listaEmpleados ->
                listaEmpleados.stream()
                        .collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.counting())); // Contar elementos agrupados por una clave

    }

    // Método genérico — Ejercicio 3c
    public static <T, R> List<R> aplicarATodos(List<T> lista, Transformador<T, R> t) {
        List<R> resultados = new ArrayList<>();

        // Recorremos la lista original (tipo T)
        for (T item : lista) {
            // 2. Transformamos el item y metemos el resultado en la nueva lista
            R elementoTransformado = t.transformar(item);
            resultados.add(elementoTransformado);

            // (También puedes hacerlo en una línea: resultados.add(t.transformar(item));)
        }
        // 3. Devolvemos la lista de resultados
        return resultados;
    }
}