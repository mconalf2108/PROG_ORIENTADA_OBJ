package EXAMEN_CLAUDE2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class pruebaProductos {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>(Arrays.asList(
                new Producto(1, "Laptop Pro", "Informatica", 1200.00, 15),
                new Producto(2, "Raton Ergonomico", "Informatica", 45.00, 80),
                new Producto(3, "Escritorio Oak", "Mobiliario", 350.00, 10),
                new Producto(4, "Silla Gaming", "Mobiliario", 280.00, 25),
                new Producto(5, "Monitor 4K", "Informatica", 499.00, 30),
                new Producto(6, "Lampara LED", "Iluminacion", 29.00, 120),
                new Producto(7, "Teclado Mecanico", "Informatica", 110.00, 50),
                new Producto(8, "Estanteria Metal", "Mobiliario", 195.00, 8)
        ));
        // ■ EJERCICIO 1
        // Apartado 1a:
        Set <String> categoriasUnicas = new HashSet<>();
        for (Producto producto : productos) {
            categoriasUnicas.add(producto.getCategoria());
        }
        System.out.println("Las categorias son: " + categoriasUnicas);

        // Apartado 1b:

         Map<String,List<Producto>> productosByCategoria = new LinkedHashMap<>();
        for (Producto producto : productos) {
            if (!productosByCategoria.containsKey(producto.getCategoria())) {
                productosByCategoria.put(producto.getCategoria(), new ArrayList<>());
            }
            productosByCategoria.get(producto.getCategoria()).add(producto);
        }
        for(Map.Entry<String,List<Producto>> entry : productosByCategoria.entrySet()) {
            System.out.println("Categoria: " + entry.getKey());
        }

        // Apartado 1c:

        Iterator<String> iterator = categoriasUnicas.iterator();
        while (iterator.hasNext()) {
            String cateogoria = iterator.next();
            if(cateogoria.contains("I")){
                iterator.remove();
            }
        }
        System.out.println("Las categorias que NO contienen I son : " + categoriasUnicas);

        // Apartado 1d:
        Set<Producto> productosDesordenados = new HashSet<Producto>(productos);
        System.out.println("Productos desordenados: " + productosDesordenados);
        Set<Producto> productosOrdenados = new TreeSet<Producto>(productos);
        System.out.println("Productos ordenados: " + productosOrdenados);

        // Apartado 1e:
        // ■ EJERCICIO 2
        // Apartado 2a:
        // Apartado 2b:
        // Apartado 2c:
        // Apartado 2d:
        // Apartado 2e: (añade etiquetas antes del stream)
        // Apartado 2f:
        // Apartado 2g:
        // ■ EJERCICIO 3
        // Apartado 3a:
        // Apartado 3b:
        // Apartado 3c:
        // Apartado 3d:
    }

    // Método genérico — Ejercicio 3c
    public static <T, R> List<R> transformarTodos(
            List<T> lista, Convertidor<T, R> c) {
        // TODO
        return null;
    }
}
