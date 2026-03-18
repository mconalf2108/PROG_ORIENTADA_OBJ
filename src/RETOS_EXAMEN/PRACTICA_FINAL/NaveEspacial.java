package RETOS_EXAMEN.PRACTICA_FINAL;

public abstract class NaveEspacial implements Comparable{
    private String matricula;
    protected int puntosEstructura;
    private double velocidadBase;

    public NaveEspacial(String matricula,  double velocidadBase) {
        this.matricula = matricula;
        this.puntosEstructura = 1000;
        this.velocidadBase = velocidadBase;
    }

    @Override
    public int compareTo(Object o) {
        NaveEspacial otro = (NaveEspacial) o;
        return this.getMatricula().compareTo(otro.getMatricula());
    }
    public void recibirDano(int cantidad){
        this.puntosEstructura -= cantidad;
        if(this.puntosEstructura <= 0){
            System.out.println(this.matricula + " ha sido destruida");
        }
    }
    public abstract void activarHabilidad();


    // GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }

    public int getPuntosEstructura() {
        return puntosEstructura;
    }

    public double getVelocidadBase() {
        return velocidadBase;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" +
                "matricula='" + matricula + '\'' +
                ", puntosEstructura=" + puntosEstructura +
                '}';
    }

    public void setPuntosEstructura(int puntosEstructura) {
        if(this.puntosEstructura <= 1000){
        this.puntosEstructura = puntosEstructura;
        }else{
            System.out.println("ERROR: LOS PUNTOS DEBEN SER 1000 o inferior");
        }

}
}
