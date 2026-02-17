package EJERCICIO_6y7;

public class Caja {
    double ancho;
    double alto;
    double fondo;
    Unidades u;

    public Caja(double ancho, double alto, double fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
    }
    public double getVolumen(){
        double vol=0;
        if(u == Unidades.m){
            vol = fondo * alto * ancho * 1000;
        }
        if(u==Unidades.cm){
            vol = (fondo * alto * ancho)/1000000;
        }
        return vol;
    }
    @Override
    public String toString(){
        return "ancho " + ancho +"alto " + alto + "fondo " + fondo + "unidades " + u +"El volumen es " + getVolumen();
    }
}
