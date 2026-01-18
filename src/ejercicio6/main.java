package ejercicio6;

public class main {
    public static void main(String[] args) {
        System.out.println("--- INICIO DE LAS PRUEBAS ---");

        // 1. Creamos un objeto Texto con capacidad máxima de 10 caracteres
        System.out.println("1. Creando texto con límite de 10...");
        Texto miTexto = new Texto(10);
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");

        // 2. Probamos añadir caracteres (Principio y Final)
        System.out.println("2. Añadiendo 'O' al inicio y 'K' al final...");
        miTexto.añadirCaracterPrincipio('O'); // Queda: "O"
        miTexto.añadirCaracterFinal('K');     // Queda: "OK"
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");

        // 3. Probamos añadir una cadena (String)
        System.out.println("3. Añadiendo 'HOLA ' al principio...");
        miTexto.añadirCadenaPrincipio("HOLA "); // Queda: "HOLA OK" (longitud 7)
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");

        // 4. PRUEBA DE FUEGO: Intentar superar el límite
        // Tenemos "HOLA OK" (7 caracteres). El límite es 10. Quedan 3 libres.
        // Intentamos añadir "MUNDO" (5 caracteres). NO DEBERÍA DEJARNOS.
        System.out.println("4. Intentando añadir 'MUNDO' (no debería caber)...");
        miTexto.añadirCadenaFinal("MUNDO");

        // Comprobamos si cambió algo
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");

        // 5. Rellenar justo lo que falta
        // Faltan 3 huecos. Añadimos "!!!"
        System.out.println("5. Añadiendo '!!!' (debería caber justo)...");
        miTexto.añadirCadenaFinal("!!!"); // Queda: "HOLA OK!!!" (longitud 10)
        miTexto.mostrarInformacion();

    }
}
