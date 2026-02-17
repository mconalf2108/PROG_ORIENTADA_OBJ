package OOP.BufferCircular;

public class BufferCircular {
    private Integer[] buffer;
    private int indiceInsertar;
    private int indiceLeer;
    private int cantidad; //  para saber si está lleno o vacío

    public BufferCircular() {
        this.buffer = new Integer[10]; // Tamaño 10
        this.indiceInsertar = 0;
        this.indiceLeer = 0;
        this.cantidad = 0;
    }

    public int getIndiceInsertar() {
        return indiceInsertar;
    }

    public int getIndiceLeer() {
        return indiceLeer;
    }

    public boolean insertar(Integer num) {

        if (cantidad == buffer.length) {
            return false;
        }
        this.buffer[indiceInsertar] = num;
        indiceInsertar++;
        if (indiceInsertar >= buffer.length) {
            indiceInsertar = 0;
        }

        cantidad++;
        return true;
    }

    public Integer leer() {
        Integer numeroADevolver = null;

        if (cantidad == buffer.length ) {
            return null;
        }
        numeroADevolver = this.buffer[indiceLeer];
        this.buffer[indiceLeer] = null;
        indiceLeer++;

        if (indiceLeer >= buffer.length) {
            indiceLeer = 0;
        }

        cantidad--; // Restamos uno a la cuenta
        return numeroADevolver;
    }

    public int estadoBuffer() {
        return cantidad * 10;
    }
}