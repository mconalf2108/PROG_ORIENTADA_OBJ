package ColeccionesyGenericosyMaps;

import java.util.*;

public class Matricula {

    Map<String, Integer> matricula = new HashMap<>();

    public static void main(String[] args) {
        Matricula mat = new Matricula();
        String alumno = "Pepe";
        String alumno2 = "Juan";

        mat.matricularAlumno(alumno);
        mat.matricularAlumno(alumno2);
        mat.matricularAlumno(alumno);

        System.out.println("Registro de matrículas: " + mat.matricula);
    }

    public boolean matricularAlumno(String alumno) {
        boolean res = false;
        boolean existe = matricula.containsKey(alumno);

        if (existe) {
            int numConvocatorias = matricula.get(alumno);

            if (numConvocatorias < 4) {
                matricula.put(alumno, numConvocatorias + 1);
                res = true;
            } else {
                System.out.println("El alumno " + alumno + " ya ha agotado las 4 convocatorias");
                res = false;
            }
        } else {
            // Si no existe, lo creamos con valor 1
            matricula.put(alumno, 1);
            res = true;
        }
        return res;
    }

    public int contarMatriculasAgotadas() {
        int contador = 0;
        for (Integer convocatoria : matricula.values()) {
            if (convocatoria == 4) {
                contador++;
            }
        }
        return contador;
    }

    Set<String> obtenerPosiblesMatriculas() {

        Set<String> posiblesMatriculas = new HashSet<>();

        for (String alumno : matricula.keySet()) {
            if (matricula.get(alumno) < 4) {
                posiblesMatriculas.add(alumno);
            } else {
                System.out.println("El alumno no puede matricularse el año que viene");
            }
        }
        return posiblesMatriculas;
    }
}