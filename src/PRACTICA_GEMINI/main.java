package PRACTICA_GEMINI;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // 1. Creamos los Gremios (Nombre, Reputación)
        Gremio gremioElite = new Gremio("Caballeros de la Mesa Redonda", 9999);
        Gremio gremioNovato = new Gremio("Cazadores de Ratas", 100);
        Gremio gremioEmpate = new Gremio("Magos Oscuros", 100); // Misma rep que el novato para forzar desempate

// 2. Creamos los Personajes (Nombre, Nivel, Vida, Gremio)
// Magos
        Mago m1 = new Mago("zErEf", 90, 500, gremioElite);        // Gremio top
        Mago m2 = new Mago("AlBuS", 50, 300, gremioEmpate);       // Gremio bajo (Empatará con g1)
        Mago m3 = new Mago("aAnG", 20, 150, null);                // Lobo solitario (Nulo)

// Guerreros
        Guerrero g1 = new Guerrero("aRtUrO", 60, 800, gremioNovato); // Gremio bajo (Empatará con m2)
        Guerrero g2 = new Guerrero("zOrRo", 30, 250, null);          // Lobo solitario (Nulo)

// 3. El Array Polimórfico
        Personaje[] listaPersonajes = {m1, m2, m3, g1, g2};
        for (int i = 0; i < listaPersonajes.length; i++) {
            if(listaPersonajes[i] instanceof Mago ){
                ((Mago)listaPersonajes[i]).curar();
            }
            if(listaPersonajes[i] instanceof Guerrero){
                ((Guerrero) listaPersonajes[i]).atacar();
            }
        }
        System.out.println("ORDENAR POR NIVEL Y VIDA DESCENDENTE");
        Arrays.sort(listaPersonajes);
        for (int i = 0; i < listaPersonajes.length; i++) {
            System.out.println(listaPersonajes[i]);
        }
        System.out.println("ORDENAR POR COMPARATOR");
        Arrays.sort(listaPersonajes,new ComparadorPorGremio());
        for (int i = 0; i < listaPersonajes.length; i++) {
            System.out.println(listaPersonajes[i]);
        }
    }
}
