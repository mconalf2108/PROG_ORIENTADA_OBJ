package OOP.PRACTICA_MINECRAFT;

public abstract class Materiales {
    private String nombre;
    private int masa;
    private int capacidadQuemarse;
    private int capacidadDiluirse;
    private boolean sonMovibles;

    public String getNombre() {
        return nombre;
    }

    public int getMasa() {
        return masa;
    }

    public int getCapacidadQuemarse() {
        return capacidadQuemarse;
    }

    public int getCapacidadDiluirse() {
        return capacidadDiluirse;
    }

    public boolean isSonMovibles() {
        return sonMovibles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasa(int masa) {
        if(masa > 0 && masa < 1000){
            this.masa = masa;
        }
    }

    public void setCapacidadQuemarse(int capacidadQuemarse) {
        if(capacidadQuemarse > 0 && capacidadQuemarse < 100){
            this.capacidadQuemarse = capacidadQuemarse;
        }
    }

    public void setCapacidadDiluirse(int capacidadDiluirse) {
        if(capacidadQuemarse > 0 && capacidadQuemarse < 100){
            this.capacidadQuemarse = capacidadQuemarse;
        }
    }

    public void setSonMovibles(boolean sonMovibles) {
        this.sonMovibles = sonMovibles;
    }
}
