package RETOS_EXAMEN.PRACTICA_FINAL;

public class NaveExploracion extends NaveEspacial{
    boolean modoSigilo = false;
    public NaveExploracion(String matricula, double velocidadBase) {
        super(matricula, velocidadBase);

    }
    @Override
    public void activarHabilidad() {
        if(!this.modoSigilo) {
            this.modoSigilo = true;
        }else{
            this.modoSigilo = false;
        }
    }

    @Override
    public void recibirDano(int cantidad) {
        if(this.modoSigilo) {
            if (Math.random() < 0.5) {
                System.out.println("¡Maniobra evasiva exitosa! La nave esquiva el ataque.");
            } else {
                System.out.println("El sigilo falló y el enemigo acertó el disparo.");
                super.recibirDano(cantidad);
            }
        }
    }

    public void setModoSigilo(boolean modoSigilo) {
        this.modoSigilo = modoSigilo;
    }
}
