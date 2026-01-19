package ejercicio6;

public class main {
    public static void main(String[] args) {
        System.out.println("--- INICIO DE LAS PRUEBAS ---");

       /* // 1. Creamos un objeto Texto con capacidad máxima de 10 caracteres
        System.out.println("1. Creando texto con límite de 10...");
        Texto miTexto = new Texto(10);
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");


        System.out.println("2. Añadiendo 'O' al inicio y 'K' al final...");
        miTexto.añadirCaracterPrincipio('O');
        miTexto.añadirCaracterFinal('K');
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");


        System.out.println("3. Añadiendo 'HOLA ' al principio...");
        miTexto.añadirCadenaPrincipio("HOLA ");
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");



        System.out.println("4. Intentando añadir 'MUNDO' (no debería caber)...");
        miTexto.añadirCadenaFinal("MUNDO");

        // Comprobamos
        miTexto.mostrarInformacion();
        System.out.println("--------------------------");

        // Faltan 3 huecos
        System.out.println("5. Añadiendo '!!!' ");
        miTexto.añadirCadenaFinal("!!!");
        miTexto.mostrarInformacion();

    }
}
