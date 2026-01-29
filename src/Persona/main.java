package Persona;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona [] persona = new Persona[1];
        for (int i = 0; i <1; i++) {
            System.out.println("introduzca su nombre");
                String nombre = sc.next();
            System.out.println("introduzca su DNI");
                String DNI = sc.next();
            System.out.println("introduzca su edad");
                double edad = sc.nextDouble();
            System.out.println("introduzca su peso");
                double peso = sc.nextDouble();
            System.out.println("introduzca su altura");
                double altura = sc.nextDouble();

                Persona personaArray = new Persona(nombre,edad,DNI,peso,altura);
                persona[i] = personaArray;
        }
        for (int i = 0; i < persona.length; i++) {
             double IMC = persona[i].calcularIMC();
            if(IMC ==-1){
                System.out.println(persona[i].getNombre() + "esta en su peso ideal ");
            }
            if(IMC ==0){
                System.out.println(persona[i].getNombre() + "esta por debajo de su  peso ideal ");
            }
            if(IMC == 1){
                System.out.println(persona[i].getNombre() + "esta en sobrepeso ");
            }
        }

    }
}
