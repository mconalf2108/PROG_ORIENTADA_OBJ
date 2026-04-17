package ColeccionesyGenericosyMaps;

import java.time.LocalTime;
import java.util.*;

public class Ejercicio12_14<T> {
    Scanner sc = new Scanner(System.in);
    Map<LocalTime, Double> registros = new HashMap<>();

    public static void main(String[] args) {
        Ejercicio12_14 app = new Ejercicio12_14();
        app.iniciarMenu();
    }

    public void iniciarMenu() {
        int num = 0;
        while (num != 4) {
            System.out.println("------MENU PRINCIPAL------");
            System.out.println("--------------------");
            System.out.println("1.Nuevo Registro");
            System.out.println("2.Listar Registros");
            System.out.println("3.Mostrar estadística");
            System.out.println("4.Salir");

            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Introduce la temperatura");
                    double temperatura = sc.nextDouble();
                    nuevoRegistro(temperatura);
                    System.out.println("Registro finalizado");
                    break;
                case 2:
                    System.out.println("Listando registros...");
                    listarRegistros();
                    break;
                case 3:
                    System.out.println("Mostrando estadísticas");
                    mostrarEstadistica();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                default:
                    System.out.println("ERROR");
            }
        }
    }

    public boolean nuevoRegistro(double temperatura) {
        boolean resultado = true;
        registros.put(LocalTime.now(), temperatura);

        return resultado;
    }

    public void listarRegistros() {
        for (Map.Entry<LocalTime, Double> entry : registros.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void mostrarEstadistica() {
        double valorMaximo = -20000;
        double valorMinimo = 20000;
        double promedio = valorMaximo / valorMinimo;
        int contador = 0;


        for (Map.Entry<LocalTime, Double> entry : registros.entrySet()) {
            if (entry.getValue() > valorMaximo) {
                valorMaximo = entry.getValue();
            }
            if (entry.getValue() < valorMinimo) {
                valorMinimo = entry.getValue();
            }
            promedio += entry.getValue();
            contador++;
        }
        System.out.println("Valor Maximo: " + valorMaximo);
        System.out.println("Valor Minimo: " + valorMinimo);
        System.out.println("Promedio: " + promedio / contador);
    }
}
