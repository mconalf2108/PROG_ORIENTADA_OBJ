import ColeccionesyGenericosyMaps.Ejercicio13.Cliente;
import ColeccionesyGenericosyMaps.Ejercicio13.Saludo;

import java.util.ArrayList;
import java.util.List;

public static class Ejercicio13_2 {

    public static <T> List<String> saludarGrupo(T[] tabla,
                                                Saludo<T> generarSaludo ){
        List<String> listaResultados = new ArrayList<>();

        for (T elemento : tabla){
            String saludoGenerado =  generarSaludo.generar(elemento);
            listaResultados.add(saludoGenerado);
        }
        return listaResultados;
    }
}
public static void main(String[] args) {

    // 1. Preparamos la "tabla" (Array) de Clientes
    Cliente[] misClientes = {
            new Cliente("Empresa Alfa"),
            new Cliente("Roberto Gómez"),
            new Cliente("Tecnologías Omega")
    };

    // 2. Rescatamos la Lambda del ejercicio 13.1 (Las instrucciones de cómo saludar)
    Saludo<Cliente> saludoFormal = (cliente) -> "Estimado/a " + cliente.getNombre() + ", es un placer saludarle.";

    List<String> listaFinal = Ejercicio13_2.saludarGrupo(misClientes, saludoFormal);

    // 4. Imprimimos el resultado para comprobar que ha funcionado
    System.out.println("--- LISTA DE SALUDOS GENERADOS ---");
    listaFinal.forEach(saludo -> System.out.println(saludo));
}
