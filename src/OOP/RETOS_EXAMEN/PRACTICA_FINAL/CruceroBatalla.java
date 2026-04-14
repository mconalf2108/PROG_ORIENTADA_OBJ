package OOP.RETOS_EXAMEN.PRACTICA_FINAL;

public class CruceroBatalla extends NaveEspacial implements Mantenible{
    private int escudos;
    public CruceroBatalla(String matricula, double velocidadBase) {
        super(matricula, velocidadBase);
        this.escudos = 500;
    }
    @Override
    public void recibirDano(int cantidad) {
        if (cantidad <= this.escudos){
           this.escudos -= cantidad;
            System.out.println("Absorbiendo el daño de los escudos...");
        }else{
            int danioRestante = cantidad - this.escudos;
            super.recibirDano(danioRestante) ;
        }
    }

    @Override
    public void reparar(int cantidad) {
        setPuntosEstructura(this.puntosEstructura + cantidad);
        System.out.println("Crucero reparado. Estructura actual: " + this.puntosEstructura);
    }
    @Override
    public boolean necesitaMantenimiento() {
        return this.puntosEstructura < 500;
    }

    @Override
    public void activarHabilidad() {
        System.out.println("sobrecarga de armas activada. Escudos al 0% para desviar energía.");
        this.escudos = 0;
    }
}
