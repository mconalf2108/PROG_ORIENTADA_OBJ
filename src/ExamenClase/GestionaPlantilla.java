package ExamenClase;

import java.util.*;

public class GestionaPlantilla extends ordenarPorDorsal {
    static Scanner sc = new Scanner(System.in);

    static boolean altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        boolean resultado = false;
        System.out.println("Intentando dar de alta el jugador...");
        for (Map.Entry<Integer, Jugador> jugador : plantilla.entrySet()) {
            if (jugador.getKey().equals(dorsal) && jugador.getValue().equals(plantilla.get(dorsal))) {
                System.out.println("No se puede añadir el jugador");
            } else {
                System.out.println("Ingresa el nombre del jugador: ");
                String nombre = sc.nextLine();
                System.out.println("Ingresa el DNI del jugador: ");
                String DNI = sc.nextLine();
                System.out.println("Ingresa la posicion del jugador: ");
                String posicion = sc.next();

                Jugador JugadorNuevo = new Jugador(nombre, DNI, posicion);
                plantilla.put(dorsal, JugadorNuevo);
                resultado = true;
                System.out.println("EXITO, jugador añadido correctamente");
            }
        }
        return resultado;
    }

    static boolean eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        boolean resultado = false;
        for (Map.Entry<Integer, Jugador> jugador : plantilla.entrySet()) {
            if (jugador.getKey().equals(dorsal)) {
                plantilla.remove(dorsal);
                resultado = true;
            } else {
                System.out.println("El jugador que quieres eliminar no esta en la lista");
            }
        }
        return resultado;
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        System.out.println("Mostrando jugadores ordenados por dorsal...");
        Arrays.sort(plantilla.keySet().toArray(),new ordenarPorDorsal());
        plantilla.forEach((dorsal, jugador) -> {
            System.out.println(jugador + "\n" + dorsal);

        });
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        System.out.println("Mostrando jugadores ordenados por nombre...");
        plantilla.forEach((dorsal, jugador) -> {
            System.out.println(jugador + "\n" + dorsal);
        });
    }



}
