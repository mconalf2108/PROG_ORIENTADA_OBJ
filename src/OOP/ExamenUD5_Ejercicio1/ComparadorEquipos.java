package OOP.ExamenUD5_Ejercicio1;

import java.util.Comparator;

public class ComparadorEquipos implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int resultado = 0;
        if(o1 instanceof Profesional && o2 instanceof Profesional){
            Profesional p1 = (Profesional) o1;
            Profesional p2 = (Profesional) o2;
            resultado = p1.nombreEquipo.compareTo(p2.nombreEquipo);
        }else if(o1 instanceof Amateur && o2 instanceof Amateur) {
            Amateur a1 = (Amateur) o1;
            Amateur a2 = (Amateur) o2;
            resultado = Integer.compare(a1.dorsal, a2.dorsal);
        }
        return resultado;
    } // He intentado comparar comprobando si es profesional o es amateur, por equipo los ordena correctamente pero por dorsal imrpime 0 todo el rato
}
