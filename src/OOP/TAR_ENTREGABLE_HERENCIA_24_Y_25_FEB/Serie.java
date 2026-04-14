package OOP.TAR_ENTREGABLE_HERENCIA_24_Y_25_FEB;

import java.util.Arrays;

public class Serie extends Multimedia{
    private String creadorSerie;
    private int numTemporadas;
    private String [] capitulos;

    public Serie(String titulo, int anio,String creadorSerie, int numTemporadas, String[] capitulos) {
        super(titulo,anio);
        this.creadorSerie = creadorSerie;
        this.numTemporadas = numTemporadas;
        this.capitulos = capitulos;
    }
        public void add_capitulo(String capitulo){
            Arrays.copyOf(this.capitulos,this.capitulos.length+1);
            for (int i = 0; i < this.capitulos.length; i++) {
                //Aniadimos en la última posicion
                this.capitulos[capitulo.length()-1] = capitulo;
            }
        }
        public boolean eliminarCapitulo(String capitulo){
            int pos = 0;
            boolean encontrado = false;

            for (int i = 0; i < capitulos.length; i++) {
                if (this.capitulos[i].equals(capitulo)){
                    pos = i;
                    encontrado = true;
                }
                if(encontrado){
                    String [] temporal = new String[this.capitulos.length-1];
                    System.arraycopy(this.capitulos,0, temporal,0,pos);
                    System.arraycopy(this.capitulos, pos+1 , temporal,pos,capitulos.length-1-pos);
                }else{
                   return encontrado;
                }
            }
            return encontrado;
        }

    public String getTitulo() {
        return titulo;
    }

    public String getCreadorSerie() {
        return creadorSerie;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String[] getCapitulos() {
        return capitulos;
    }

}
