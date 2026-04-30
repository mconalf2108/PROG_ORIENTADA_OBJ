package EXAMEN_CLAUDE;

@FunctionalInterface
public interface Transformador<T, R> {
    R transformar(T elemento);
}