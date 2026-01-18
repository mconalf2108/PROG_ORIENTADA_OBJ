package ejercicio6;
import java.time.LocalDateTime;
public class Texto {
    int longitudMaxima;
    public String cadena;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaUltimaModificacion;

    public Texto(int longitudMaxima){
        this.longitudMaxima = longitudMaxima;
        this.cadena = "";
        this.fechaCreacion =LocalDateTime.now();;
        this.fechaUltimaModificacion = null;
    }
    public void añadirCaracterPrincipio(char caracter){
        String añadido;
        añadido =  caracter + cadena ;
        if(añadido.length()<= longitudMaxima){
            cadena = añadido;
            fechaUltimaModificacion= LocalDateTime.now();;
        }
    }
    public void añadirCaracterFinal(char caracter){
    String añadido;
    añadido =  cadena + caracter ;
    if(añadido.length()<= longitudMaxima){
        cadena = añadido;
        fechaUltimaModificacion= LocalDateTime.now();;
    }
    }
    public void añadirCadenaPrincipio(String valorAñadir){
        String añadido;
        añadido = valorAñadir + cadena;
        if(añadido.length() <=longitudMaxima){
            cadena = añadido;
            fechaUltimaModificacion= LocalDateTime.now();;
        }
    }

    public void añadirCadenaFinal(String valorAñadir){
        String añadido;
        añadido = cadena +  valorAñadir;
        if(añadido.length() <=longitudMaxima){
            cadena = añadido;
            fechaUltimaModificacion= LocalDateTime.now();;
        }
    }
    public int contarVocales(){
        int contadorVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = Character.toLowerCase(cadena.charAt(i));
            if (letra == 'a' ||letra =='e' ||letra == 'i'
                    ||letra == 'o' ||letra == 'u' ) {
                contadorVocales++;
            }

        }return contadorVocales;
    }
    public void mostrarInformacion(){
        System.out.println("La cadena resultante es "+cadena);
        System.out.println("la cantidad de vocales "+contarVocales());
        System.out.println("La longitud maxima que permitiste fue "+longitudMaxima);
        System.out.println("Fecha creación: " + fechaCreacion);
        System.out.println("Última modificación: " + fechaUltimaModificacion);
    }
}
