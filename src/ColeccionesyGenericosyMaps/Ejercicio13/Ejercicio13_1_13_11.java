package ColeccionesyGenericosyMaps.Ejercicio13;

import java.util.Arrays;

import static java.lang.CharSequence.compare;

public class Ejercicio13_1_13_11 {
    public static void main(String[] args) {
        Saludo<String> saludoParaNombres = (nombre) ->
                "Hola,"+ nombre+" este es un saludo para nombres";
        Saludo<Cliente> saludoParaCliente = (cliente) ->
                "Buenas "+ cliente.getNombre() +" bienvenido";

        System.out.println("--- PRUEBAS CON STRINGS ---");
        System.out.println(saludoParaNombres.generar("Ana"));
        System.out.println(saludoParaNombres.generar("Carlos"));

        System.out.println("\n--- PRUEBAS CON CLIENTES ---");
        Cliente cliente1 = new Cliente("Empresa Tecnológica S.A.");
        Cliente cliente2 = new Cliente("Laura Gómez");

        System.out.println(saludoParaCliente.generar(cliente2));
        System.out.println(saludoParaCliente.generar(cliente1));
        Cliente [] tClie = {cliente1, cliente2};
        Arrays.stream(tClie)
                .sorted((c1, c2) -> compare(c1.getNombre(), c2.getNombre()))
                .forEach(cliente ->
                        System.out.println("El nombre del cliente es " + cliente.getNombre() + " y su edad es de " + cliente.getEdad()));
    }
}
