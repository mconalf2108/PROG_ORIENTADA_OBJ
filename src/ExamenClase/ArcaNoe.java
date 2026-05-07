package ExamenClase;

import EXAMEN_CLAUDE.Empleado;

import java.util.*;

public class ArcaNoe {
    Set<Animal> animalesSubidos = new HashSet<>();
    List<Animal> especiesQueHayQueSubir = new ArrayList<>();

    public ArcaNoe(List<Animal> especiesQueHayQueSubir) {
        Set<Animal> especiesQueHayQueSubirSinRepetir = new HashSet<>(especiesQueHayQueSubir);
    }

    public void subirAnimal(Animal animal) {
        for (Animal animal1 : especiesQueHayQueSubir) {
            if (animal1.getEspecie().equals(animal.getEspecie())) {
                animalesSubidos.add(animal);
            } else {
                System.out.println("ERROR, no esta en la lista de los que hay que subir");
            }
        }
    }

    public void MostrarAnimalesSubidos() {
        animalesSubidos.stream()
                .sorted(Comparator.comparing(Animal::getEspecie)
                        .thenComparing(Animal::getSexo))
                .forEach(System.out::println);
    }

    public void MostrarAnimalesRestantes() {
        Set<Animal> animalesRestantes = new HashSet<>();
        for (Animal animal : animalesSubidos) {
            if(Collections.frequency(animalesSubidos, animal) == 0){
                animalesRestantes.add(animal);
            }
        }
        System.out.println("AnimalesRestantes: "+animalesRestantes);
    }

}


