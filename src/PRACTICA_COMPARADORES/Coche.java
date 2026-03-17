package PRACTICA_COMPARADORES;

public class Coche extends Vehiculo {
    String matricula;
    Tomador tomador;

    public Coche(String matricula, String marca, String modelo) {
        super(marca, modelo);
        this.matricula = matricula;
    }

    public Tomador getTomador() {
        return tomador;
    }



    public void setTomador(Tomador tomador) {
        this.tomador = tomador;
    }

    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        if (o instanceof Coche) {
            Coche otroCoche = (Coche) o;
            if (this.matricula != null && otroCoche.getMatricula() != null) {
                resultado = this.matricula.compareTo(otroCoche.getMatricula());
            } else if (this.matricula != null && otroCoche.getMatricula() == null) {
                resultado = -1;
            } else if (this.matricula == null && otroCoche.getMatricula() != null) {
                resultado = 1;
            } else
                resultado = super.compareTo(o);
        } else {
            resultado = super.compareTo(o);
        }
        return resultado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString() {
        return super.toString() + ", Matrícula: " + (matricula != null ? matricula : "N/A");
    }
}