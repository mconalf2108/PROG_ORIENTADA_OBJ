package EJERCICIO_6y7;

public class CajaCarton extends Caja{
    private static double superficieTotal = 0;
    private int etiqueta;
    public CajaCarton(double ancho, double alto, double fondo,  int etiqueta) {
        super(ancho, alto, fondo, Unidades.cm);
        this.etiqueta = etiqueta;
        double superficieEstaCaja = 2 * (ancho * alto + ancho * fondo + alto * fondo);
        superficieTotal += superficieEstaCaja;
    }
    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }
    public static double getSuperficieTotal() {
        return superficieTotal;
    }
    public int getEtiqueta() {
        return etiqueta;
    }
}