package OOP.RETOS_EXAMEN.PRACTICA_FINAL;

public class CargueroPesado extends NaveEspacial implements Mantenible{
    private int cargaActual = 0;
    private int cargaMaxima ;
    public CargueroPesado(String matricula, double velocidadBase,int cargaMaxima) {
        super(matricula, velocidadBase);
        setCargaMaxima(cargaMaxima);
    }

    @Override
    public void reparar(int cantidad) {
        System.out.println("Motores del carguero recalibrados");
    }

    @Override
    public boolean necesitaMantenimiento() {
        boolean res;
        if(this.cargaActual == this.cargaMaxima){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    @Override
    public void activarHabilidad() {
        if(this.cargaActual > 0){
            this.cargaActual = 0;
            System.out.println("Carga eyectada para maniobra evasiva");
        }
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
