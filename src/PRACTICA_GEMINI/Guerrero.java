package PRACTICA_GEMINI;

public class Guerrero extends Personaje implements Atacante{
    public Guerrero(String nombre, int nivel, int puntosVida, Gremio gremioNovato) {
        super(nombre, nivel, puntosVida,gremioNovato);
    }


    @Override
    public void atacar() {
        System.out.println("El guerrero "+this.getNombre()+ " ataca con su espada");
        System.out.println();
    }
}
