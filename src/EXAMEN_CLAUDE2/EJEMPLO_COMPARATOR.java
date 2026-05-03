package EXAMEN_CLAUDE2;

public class EJEMPLO_COMPARATOR {
  /*  // Comparator externo: primero por categoría A→Z, luego por precio descendente
    Comparator<Producto> miComparator = Comparator
            .comparing(Producto::getCategoria)
            .thenComparing(Comparator.comparingDouble(Producto::getPrecio).reversed());

    // Lo usas dentro del stream pasándolo a sorted()
    List<Producto> resultado = productos.stream()
            .sorted(miComparator)
            .collect(Collectors.toList());

resultado.forEach(p ->
            System.out.println(p.getNombre() + " | " + p.getCategoria() + " | " + p.getPrecio())
            );

   */
}/*
// Clase externa que implementa Comparator
public class ComparadorProducto implements Comparator<Producto> {
    @Override
    public int compare(Producto p1, Producto p2) {
        int porCategoria = p1.getCategoria().compareTo(p2.getCategoria());
        if (porCategoria != 0) return porCategoria;
        // Precio descendente: comparamos p2 vs p1 (invertido)
        return Double.compare(p2.getPrecio(), p1.getPrecio());
    }
}

// Lo instancias y lo pasas al stream
Comparator<Producto> miComparator = new ComparadorProducto();

List<Producto> resultado = productos.stream()
        .sorted(miComparator)
        .collect(Collectors.toList());
        */
