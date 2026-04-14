package OOP.ExamenUD5_Ejercicio1;

import java.util.Arrays;

public class Maraton {

    // 1. Declaración de Arrays con tamaño fijo
    static Juez[] jueces = new Juez[2];
    static Voluntario[] voluntarios = new Voluntario[2];
    static Corredor[] corredores = new Corredor[10];

    public static void main(String[] args) {

        // 2. Instanciación de Jueces (2)
        jueces[0] = new Juez("Antonio Pérez", "12345678A", 45, "Española", 101);
        jueces[1] = new Juez("Martina García", "87654321B", 38, "Italiana", 102);

        // 3. Instanciación de Voluntarios (2)
        voluntarios[0] = new Voluntario("Luis Soler", "11223344C", 20, "Española", 5, "Reparto de agua");
        voluntarios[1] = new Voluntario("Elena Pozo", "55667788D", 22, "Española", 21, "Corte de calle");

        // 4. Instanciación de 10 Corredores (7 Profesionales + 3 Amateurs)

        // --- 7 PROFESIONALES ---
        // Restricción: 2 del mismo equipo ("Betis Runner")
        // Restricción: 3 de la misma nacionalidad ("Portuguesa")
        corredores[0] = new Profesional("Joao Silva", "P1", 28, "Portuguesa", 1, Categoria.SENIOR_MASCULINO, "Betis Runner", "FED001");
        corredores[1] = new Profesional("Tiago Gomes", "P2", 30, "Portuguesa", 2, Categoria.SENIOR_MASCULINO, "Betis Runner", "FED002");
        corredores[2] = new Profesional("Ana Costa", "P3", 26, "Portuguesa", 3, Categoria.SENIOR_FEMENINO, "Sevilla Élite", "FED003");

        corredores[3] = new Profesional("Gomez Noya", "P4", 42, "Española", 4, Categoria.VETERANO_MASCULINO, "Maratón Jerez", "FED004");
        corredores[4] = new Profesional("Maite Zúñiga", "P5", 41, "Española", 5, Categoria.VETERANO_FEMENINO, "Sevilla Élite", "FED005");
        corredores[5] = new Profesional("John Smith", "P6", 29, "Inglesa", 6, Categoria.SENIOR_MASCULINO, "London AC", "FED006");
        corredores[6] = new Profesional("Sara Connor", "P7", 35, "Estadounidense", 7, Categoria.SENIOR_FEMENINO, "Cyberdyne Team", "FED007");

        // --- 3 AMATEURS ---
        // Completamos la restricción de: "al menos dos de cada categoría" (Ya tenemos 3 Senior M, 2 Senior F, 2 Vet M, 2 Vet F)
        corredores[7] = new Amateur("Fermín Cacho", "A1", 45, "Española", 100, Categoria.VETERANO_MASCULINO);
        corredores[8] = new Amateur("Marta López", "A2", 44, "Española", 101, Categoria.VETERANO_FEMENINO);
        corredores[9] = new Amateur("Carlos Ruiz", "A3", 25, "Española", 102, Categoria.SENIOR_MASCULINO);

        // 5. Muestra de resultados y prueba de funcionalidad
        System.out.println("=== ESTADO DE LA MARATÓN DE SEVILLA ===\n");

        System.out.println(">> Listado de Jueces:");
        for (int i = 0; i < jueces.length; i++) {
            jueces[i].mostrarDetalles();
        }

        System.out.println("\n>> Listado de Voluntarios:");
        for (Voluntario v : voluntarios) { // También se puede usar for-each con arrays
            v.mostrarDetalles();
        }

        //EJERCICIO 1 - ANADIR_CORREDOR

        // Ejemplo de inserción usando el nuevo método
        Profesional p1 = new Profesional("Tiago Silva", "12345678X", 28, "Portuguesa", 1, Categoria.SENIOR_MASCULINO, "Betis Runner", "FED001");
        // Intentamos añadirlo dos veces para probar la validación
        anadirCorredor(p1);
        // Intentamos añadir otro objeto distinto pero con el MISMO NIF
        Profesional p1_repetido = new Profesional("Tiago Duplicado", "12345678X", 30, "Portuguesa", 99, Categoria.SENIOR_MASCULINO, "Otro Equipo", "FED099");
        anadirCorredor(p1_repetido); // Debería fallar por NIF duplicado

        // Añadimos un Amateur
        Amateur a1 = new Amateur("Pedro Picapiedra", "87654321Z", 45, "Española", 100, Categoria.VETERANO_MASCULINO);

        anadirCorredor(a1);

        //EJERCICIO 1 - OBTENER_GANADORES

        System.out.println("\n>> Registro de Marcas y detalles de Corredores:");
        for (Corredor c : corredores) {
            // Se registra una marca aleatoria
            int marcaAzar = (int) (Math.random() * 50 + 130);
            c.registrarMarca(marcaAzar);
            c.mostrarDetalles();
            System.out.println("--------------------------------------");
        }


        obtenerGanadoresCarrera(corredores);

        //EJERCICIO 1 - OBTENER_GANADORES

        //IMPLEMENTAR LAS PRUEBAS DE ORDENACIÓN DE LOS CORREDORES
        System.out.println("ordenando por tiempo de forma ascendente...");
        Arrays.sort(corredores);
        for (Corredor c : corredores) {
            System.out.println(c);
        }
        System.out.println("Ordenando por Equipos o por dorsal...");
        for (Corredor c : corredores) {
            Arrays.sort(corredores, new ComparadorEquipos());
                for (Corredor corredor : corredores) {
                    System.out.println(corredor);
                }
        }
    }


    public static boolean anadirCorredor(Corredor nuevo) {
        boolean resultado = false;
        for (int i = 0; i < corredores.length; i++) {
            if(corredores[i] == null) {
                for (int j = 0; j < corredores.length; j++) {
                    if (corredores[j] != null && !corredores[j].equals(nuevo)) {
                        corredores[i] = nuevo;
                        resultado = true;
                    }
                }
            }
        }
        return resultado;
    }

    public static void obtenerGanadoresCarrera(Corredor[] corredores) {
        int tiempoProfesional =100000000;
        String nombre = "";
        ;
        // Iba a comparar por categoria y los ordenaba con una variable externa inicializandola con max value y actualizandola cada vez que hubeiera un numero menor
        //pero nose como se hace la comparacion if(categoria1 == Categoria.SENIOR_MASCULINO  ){


        }

}
