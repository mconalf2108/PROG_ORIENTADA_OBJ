package OOP.Restaurante;

public class main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("CADENA MAURO");
        Plato plato1 = new Plato(" macarrones",100,Categoria.TAPA,2);
        Plato plato2 = new Plato(" spageti",200,Categoria.TAPA,3);
        Plato plato3 = new Plato(" pizza",300,Categoria.TAPA,4);
        Empleado empleado1 = new Empleado("Mauro",Cargo.CAMARERO);
        Empleado empleado2 = new Empleado("Juan", Cargo.CAMARERO);
        Empleado empleado3 = new Empleado("Victor",Cargo.COCINERO);
        restaurante.añadirPlato(plato1);
        restaurante.añadirPlato(plato2);
        restaurante.añadirPlato(plato3);

        restaurante.añadirEmpleado(empleado1);
        restaurante.añadirEmpleado(empleado2);
        restaurante.añadirEmpleado(empleado3);

        restaurante.mostrarListaEmpleados();
        restaurante.mostrarListaPlatos();

        restaurante.mostrarStockPlatos();
    }
}
