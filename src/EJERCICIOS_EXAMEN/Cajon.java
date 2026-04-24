package EJERCICIOS_EXAMEN;

public class Cajon<T>{
    T objetoGuardado;
    public void guardar(T objetoGuardado){
      this.objetoGuardado = objetoGuardado;
    }
    public T sacar(){
        return objetoGuardado;
    }

    static void main(String[] args) {
        Cajon<String> c = new Cajon();
        Cajon<Integer> c2 = new Cajon();
        c.guardar("I");
        c2.guardar(1);
    }
}
