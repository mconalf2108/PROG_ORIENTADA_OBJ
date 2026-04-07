package examen_recuperacion;

public class Ejercicio1_Frase {
    private String[] arrayPalabras = new String[0];
    private int tamañoFrase;
    private static String diccionario = "RAE";
    private int id_frase;
    private static int contador = 0;

    public Ejercicio1_Frase() {
        this.arrayPalabras = new String[10];
    }

    public Ejercicio1_Frase(int tamañoFrase) {
        this.tamañoFrase = tamañoFrase;
    }

    public Ejercicio1_Frase(String[] arrayPalabras, int tamañoFrase) {
        this.arrayPalabras = arrayPalabras;
        this.tamañoFrase = tamañoFrase;
        contador++;
        this.id_frase = contador;
    }

    boolean insertarPalabra(String pal) {
        boolean insertada = false;
        if ( "".equals(pal)) {
            System.out.println("No se puede insertar una palabra nula o vacía");
        } else {
           for (int i = 0; i < this.arrayPalabras.length; i++) {
               if (this.arrayPalabras[i]==null ) {
                   this.arrayPalabras[i] = pal;
                   insertada = true;
                   break;
               }
           }
        }

        return insertada;
    }

    boolean eliminarPalabra(String pal) {
        boolean eliminada = false;
        int i = 0;
        int posicion = 0;
        while (!eliminada && i < this.arrayPalabras.length) {
            if (this.arrayPalabras[i] != null && this.arrayPalabras[i].equals(pal)) {
                posicion = i;
                eliminada = true;
            }
            i++;
        }
        if(!eliminada){
            System.out.println();
            System.out.println("La palabra no existe");
        }else{
            String[] temp = new String[this.arrayPalabras.length - 1];
            System.arraycopy(this.arrayPalabras, 0, temp, 0, posicion);
            System.arraycopy( this.arrayPalabras, posicion + 1, temp, posicion, temp.length - posicion);
            this.arrayPalabras = temp;
        }
        return eliminada;
    }


    public String obtenerPalabraMasLarga() {
        String palabraMasLarga = "";
        for (int i = 0; i < this.arrayPalabras.length; i++) {
            if ("".equals(this.arrayPalabras[i])) {
                System.out.println("No se puede mostrar una palabra nula o vacía");
            } else if (this.arrayPalabras[i] != null && this.arrayPalabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = this.arrayPalabras[i];
            }
        }
        return palabraMasLarga;
    }

    public String obtenerPalabraMasCorta() {
        // valor maximo para inicializar
        String palabraMasCorta = "holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        for (int i = 0; i < this.arrayPalabras.length; i++) {
            if ("".equals(this.arrayPalabras[i])) {
                System.out.println("No se puede mostrar una palabra nula o vacía");
            } else if (this.arrayPalabras[i] != null && this.arrayPalabras[i].length() < palabraMasCorta.length()) {
                palabraMasCorta = this.arrayPalabras[i];
            }
        }
        System.out.println("La palabra mas corta de la lista es " + palabraMasCorta);

        return palabraMasCorta;
    }

    public void estadoFrase() {
        int restantes = 0;
        for (int i = 0; i < this.arrayPalabras.length; i++) {
            if (this.arrayPalabras[i] == null) {
                restantes++;
            }
        }
        System.out.println("Quedan " + restantes + " palabras para completar la frase");
    }
    public void imprimirFrase(){
        System.out.println("La frase normal es : ");
        for (int i = 0; i < this.arrayPalabras.length; i++) {
            if(this.arrayPalabras[i] != null){
                System.out.print(this.arrayPalabras[i]+ " ");
            }
        }
        System.out.println();
    }
    public void imprimirFraseInvertida(){
        System.out.println("La frase invertida es : ");
      for (int i = this.arrayPalabras.length - 1; i >= 0; i--) {
          if(this.arrayPalabras[i] != null){
              System.out.print(this.arrayPalabras[i]+ " ");
          }
      }
        System.out.println();
    }




    public String[] getArrayPalabras() {
        return arrayPalabras;
    }

    public int getTamañoFrase() {
        return tamañoFrase;
    }

    public static String getDiccionario() {
        return diccionario;
    }

    public int getId_frase() {
        return id_frase;
    }

    public static int getContador() {
        return contador;
    }
}

