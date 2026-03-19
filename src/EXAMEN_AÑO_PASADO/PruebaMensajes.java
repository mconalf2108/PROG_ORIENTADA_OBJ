package EXAMEN_AÑO_PASADO;

import java.util.Scanner;

public class PruebaMensajes {

    static Mensaje mensajes [] = new Mensaje[0];

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("¿Desea crear un mensaje? S/N");
        while (sc.next().toUpperCase().equals("S")){
            System.out.println("¿Qué desea crear? \n"
                    + "1. Email \n"
                    + "2. WhatsApp \n"
                    + "3. PosIt");
            String tipo = sc.next();
            switch(tipo){
                case "1": crearMail(); break;
                case "2": crearWhatsApp(); break;
                case "3": crearPosIt(); break;
                default: System.out.println("Elija una opción válida");
            }
            System.out.println("¿Desea enviar un nuevo mensaje? S/N");
        }

        //enviarMensajes();

        //mostrarMensajesEnviados();

    }



    private static void crearMail() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el email del destinatario");
        String destinatario = sc.next();
        System.out.println("Introduce el asunto del email");
        String asunto = sc.next();
        System.out.println("Introduce el contenido del email");
        String contenido = sc.next();
        //anadirMensaje(new Email(destinatario,asunto,contenido));
    }

    private static void crearWhatsApp() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el teléfono de destino");
        String destinatario = sc.next();
        System.out.println("Introduce el contenido del whatsApp");
        String contenido = sc.next();
        //anadirMensaje(new WhatsApp(destinatario,contenido));
    }

    private static void crearPosIt() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Qué quieres poner en el posIt");
        String contenido = sc.next();
        //anadirMensaje(new PosIt(contenido));
    }
    private static void anadirMensaje(Mensaje nuevoMensaje) {
        // 1. Ampliamos el array actual en 1 hueco extra
        mensajes = java.util.Arrays.copyOf(mensajes, mensajes.length + 1);

        // 2. Metemos el mensaje nuevo en ese último hueco que acabamos de crear
        mensajes[mensajes.length - 1] = nuevoMensaje;

        System.out.println("Mensaje añadido a la bandeja de salida.");
    }
}
