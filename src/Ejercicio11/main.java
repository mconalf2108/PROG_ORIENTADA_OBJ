package Ejercicio11;

public class main {
    public static void main(String[] args) {
        Lista miLista = new Lista();


        miLista.insertarAlFinal(6);
        miLista.insertarAlFinal(7);
        miLista.insertarAlPrincipio(1);
        miLista.insertarAlPrincipio(2);
        miLista.insertarAlPrincipio(3);
        miLista.getElementoPorIndice(4);
        miLista.getElementosInsertados();
        miLista.mostrarElementos();

    }
}
