package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.function.Consumer;

public class Ejercicio13_16 {
    public static <T> void paraCada(T[] tabla, Consumer<T> c){
        for(int i = 0; i < tabla.length; i++){
            c.accept(tabla[i]);
        }
    }
    public  static void main(String[] args) {
        Cliente c1 = new Cliente("mauro",18);
        Cliente c2 = new Cliente("maria",19);
        Cliente c3 = new Cliente("marco",23);
        Cliente [] tabla ={c1,c2,c3};
        Consumer<Cliente> mostrarPorPantalla = (cliente)  -> System.out.println
                ("Nombre: "+cliente.getNombre()+" Edad: "+cliente.getEdad());
        paraCada (tabla, mostrarPorPantalla);
    }
}
