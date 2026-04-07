package ExamenUD5_Ejercicio1;

public abstract class Corredor extends Participante implements Competible,Comparable {
    int dorsal;
    int contador = 1;
    int tiempo;

    public Corredor(String nombre, String nif, int edad, String nacionalidad, int dorsal, Categoria categoria) {
        super(nombre, nif, edad, nacionalidad);
        contador++;
        dorsal = contador;
    }
    public int compareTo(Object o){
        if(o instanceof Corredor){
            Corredor c = (Corredor) o;
            if(this.getTiempo() > c.getTiempo()){
                return 1;
            }
            else if(this.getTiempo() < c.getTiempo()){
                return -1;
            }
            else{
                return 0;
            }
        }
        return 0;
    }

    @Override
    public void mostrarDetalles() {

    }

    public int getDorsal() {
        return dorsal;
    }

    public int getContador() {
        return contador;
    }

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "dorsal=" + dorsal +
                ", tiempo=" + tiempo +
                '}';
    }

}
