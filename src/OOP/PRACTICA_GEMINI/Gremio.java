package OOP.PRACTICA_GEMINI;

public class Gremio {
    private String nombreGremio;
    private int reputacion;

    public Gremio(String nombreGremio, int reputacion) {
        this.nombreGremio = nombreGremio;
        this.reputacion = reputacion;
    }
    public String getNombreGremio() {
        return nombreGremio;
    }

    public int getReputacion() {
        return reputacion;
    }

    @Override
    public String toString() {
        return "Gremio{" +
                "nombreGremio='" + nombreGremio + '\'' +
                ", reputacion=" + reputacion +
                '}';
    }
}
