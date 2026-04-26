package EJEMPLO_EXAMEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class pruebaCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 65, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 100, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 45, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 75, 10, 400));
        Informe<Curso> informeAlumnos = curso -> "El curso " +curso.getTitulo()+ " tiene "+ curso.getAlumnos() +" matriculados";
        Informe<Curso> informeHoras = curso -> "El curso "+ curso.getTitulo() + " tiene una duracion total de "+curso.getDuracion();
        System.out.println(informeAlumnos.generarInforme(cursos.get(1)));
        System.out.println(informeHoras.generarInforme(cursos.get(3)));
        // Apartado D: Filtrar y mostrar
        cursos.stream()
                .filter(curso -> curso.getVideos() > 50) // 1. Filtramos (operación intermedia)
                .forEach(System.out::println);
        cursos.stream()
                .filter((curso) -> curso.getDuracion() < 500)
                .forEach(System.out::println);
        cursos.stream()
                .sorted()
                .forEach(System.out::println);
        cursos.stream()
                //.sorted(Comparator.comparing(curso -> curso.getDuracion())) // este es el metodo moderno
                .sorted((c1,c2)-> Integer.compare(c1.getDuracion(),c2.getDuracion()))
                .forEach(System.out::println);
    }



}
