package Ejercicios_GEMINI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Reto2 {
    public static void main(String[] args) {
        List<Videojuego> catalogo = new ArrayList<Videojuego>();
        Videojuego v1 = new Videojuego("Fortnite",50,800,true);
        Videojuego v2 = new Videojuego("Rocket League",70,10,true);
        Videojuego v3 = new Videojuego("Call of duty",30,50,true);
        Videojuego v4 = new Videojuego("Valorant",200,40,true);

        Videojuego [] tablaFiltrada = {v1,v2,v3,v4};
        catalogo.stream()
                .filter(videojuego -> videojuego.isEsMultijugador() && videojuego.getPrecio() < 60)
                .sorted(Comparator.comparing(Videojuego::getVentas).reversed())
                .map(videojuego -> videojuego.getTitulo())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(tablaFiltrada));

    }
}
