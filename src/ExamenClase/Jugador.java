package ExamenClase;

import java.util.Objects;

public class Jugador {
     private String nombre;
     private String DNI;
     private String posicion;

    public Jugador(String nombre, String DNI, String posicion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jugador jugador)) return false;
        return Objects.equals(DNI, jugador.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }

    public int compareTo(Jugador o) {
        Jugador j = (Jugador) o;
        return nombre.compareToIgnoreCase(j.getNombre());
    }
}
