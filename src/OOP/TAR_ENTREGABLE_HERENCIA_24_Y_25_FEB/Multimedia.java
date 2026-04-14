package OOP.TAR_ENTREGABLE_HERENCIA_24_Y_25_FEB;

public abstract class Multimedia {
    protected int identificador;
    private static int contador = 0;
    private boolean finalizado;
    String titulo;
    int año;
    public Multimedia(String titulo, int año) {
        contador++;
        this.identificador = contador;
    }
    public void dar_por_finalizado(){
        finalizado = true;
        System.out.println(titulo + " ha finalizado");
    }

}
