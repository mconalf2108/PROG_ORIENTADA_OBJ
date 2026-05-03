package EXAMEN_CLAUDE2;

@FunctionalInterface
public interface Convertidor<T, R> {
    R convertir(T elemento);
}