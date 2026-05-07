package Conexion;

public class Main {
    public static void main(String[] args) {

        // Instanciamos nuestro DAO
        AlumnoDAO dao = new AlumnoDAO();

        System.out.println("Iniciando pruebas de Base de Datos...");

        // 1. Vemos qué alumnos hay inicialmente (los que pusiste en tu script SQL)
        dao.mostrarAlumnos();

        // 2. Insertamos un alumno nuevo (Fíjate que lo meto al curso 1)
        dao.insertarAlumno("Marcos IA", "marcos.ia@correo.com", 1, 1);

        // 3. Vemos la lista para comprobar que Marcos se ha añadido
        dao.mostrarAlumnos();

        // 4. Uy, me equivoqué en el correo de Marcos. Vamos a actualizarlo.
        // *NOTA*: Asumo que Marcos será el ID 8 (ya que tenías 7 alumnos en tu script).
        // Si no es el 8, fíjate en la consola qué ID le ha dado y cámbialo aquí abajo.
        dao.actualizarEmail(8, "marcos.nuevo@iesmartinezm.es");

        // 5. Borramos a Lola López (que en tu script es el ID 2)
        dao.borrarAlumno(2);

        // 6. Lista final para ver cómo ha quedado todo
        System.out.println("RESULTADO FINAL:");
        dao.mostrarAlumnos();
    }
}