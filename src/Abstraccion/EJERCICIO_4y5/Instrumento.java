package Abstraccion.EJERCICIO_4y5;
import java.util.Arrays;

public abstract class Instrumento {
    protected Nota[] melodia;

    public Instrumento() {
        this.melodia = new Nota[0]; // Inicializamos array vacío
    }

    // add() añade nuevas notas
    public void add(Nota n) {
        this.melodia = Arrays.copyOf(this.melodia, this.melodia.length + 1);
        this.melodia[this.melodia.length - 1] = n;
    }

    // Método abstracto: Obligamos a los hijos a definir CÓMO suenan
    public abstract void interpretar();
}
