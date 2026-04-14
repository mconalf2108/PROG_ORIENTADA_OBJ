package OOP.PRACTICA_GEMINI;

public abstract class Personaje implements Comparable {
    private String nombre;
    private int nivel,puntosVida;
    Gremio gremio;

    public Personaje(String nombre, int nivel, int puntosVida,Gremio gremio) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.gremio = gremio;
    }

    @Override
    public int compareTo(Object o) {
        Personaje otro = (Personaje) o;

        int res = Integer.compare(this.getNivel(),otro.getNivel());

        if(res == 0){
            res = Integer.compare(this.getPuntosVida(), otro.getPuntosVida());
        }
        return res;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public Gremio getGremio() {
        return gremio;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosVida=" + puntosVida +
                ", gremio=" + gremio +
                '}';
    }
}
