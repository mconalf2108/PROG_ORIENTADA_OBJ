package PRACTICA_GEMINI;

public class Mago extends Personaje implements Curador{
    public Mago(String nombre, int nivel, int puntosVida, Gremio gremioElite) {
        super(nombre, nivel, puntosVida,gremioElite);
    }

    @Override
    public void curar() {
        System.out.print("El mago "+this.getNombre()+" lanza un hechizo de sanación");
        System.out.println();
    }
}
