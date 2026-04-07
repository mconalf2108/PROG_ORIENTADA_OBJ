package examen_recuperacion;
public class Ejercicio1_MainFrase {
    public static void main(String[] args) {
        String arrayf3[] = {"Holaaaaaa"};
        String arrayf4[] = {"H"};
        Ejercicio1_Frase f1 = new Ejercicio1_Frase(5);
        Ejercicio1_Frase f2 = new Ejercicio1_Frase();
        Ejercicio1_Frase f3 = new Ejercicio1_Frase(arrayf3,2);
        Ejercicio1_Frase f4 = new Ejercicio1_Frase(arrayf4,2);

        System.out.println("COMPROBACION DE INSERCION Y DE BORRADO");
        f2.insertarPalabra("hola");
        f2.insertarPalabra("caracola");
        f2.insertarPalabra("estoy");
        f2.insertarPalabra("haciendo");
        f2.insertarPalabra("un");
        f2.insertarPalabra("examen");
        f2.imprimirFraseInvertida();
        f2.imprimirFrase();
        f2.obtenerPalabraMasCorta();
        f2.obtenerPalabraMasLarga();
        f2.estadoFrase();


        System.out.println("COMPROBACION DE TAMAÑO");
        f1.insertarPalabra("hola");
        f1.insertarPalabra("caracolafffffffffffff");
        f1.insertarPalabra("estoy");
        f1.insertarPalabra("haciendo");
        f1.imprimirFraseInvertida();
        f1.imprimirFrase();


        System.out.println("La palabra mas larga esta contenida en la frase : ");
        System.out.println(obtenerFraseConPalabraMasLarga(f3,f4));

    }
    public static int obtenerFraseConPalabraMasLarga(Ejercicio1_Frase f1, Ejercicio1_Frase f2) {
        int res = f1.obtenerPalabraMasLarga().compareTo(f2.obtenerPalabraMasLarga());
        int resultado ;
        if(res == 0 ) {
            resultado = 0;
        }else if(res > 0){
            resultado =  f1.getId_frase();
        }else {
            resultado = f2.getId_frase();
        }
        return resultado;
    }

}
