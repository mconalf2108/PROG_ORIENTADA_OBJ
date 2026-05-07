package ExamenClase;

import java.util.Objects;

public class Animal {
    private String especie;
    private String sexo;

    public Animal(String especie, String sexo) {
        this.especie = especie;
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(especie, animal.especie) && Objects.equals(sexo, animal.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, sexo);
    }
}
