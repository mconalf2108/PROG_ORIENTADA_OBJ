package OOP.PRACTICA_COMPARADORES;

public class Tomador implements Comparable {
    String  nombreCompania;
    String nifAsegurado;
    public Tomador(String nombreCompania, String nifAsegurado) {
        this.nombreCompania = nombreCompania;
        this.nifAsegurado = nifAsegurado;
    }

    public int compareTo(Object o) {
        Tomador otro = (Tomador) o;
        int resCompania = this.nombreCompania.compareTo(otro.nombreCompania);
        if (resCompania != 0) {
            return resCompania;
        }
        return this.nifAsegurado.compareTo(otro.nifAsegurado);
    }

    public String toString() {
        return "[" + nombreCompania + " - " + nifAsegurado + "]";
    }
}