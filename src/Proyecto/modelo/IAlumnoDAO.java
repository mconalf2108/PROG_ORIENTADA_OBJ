
package Proyecto.modelo;

import java.util.List;

public interface IAlumnoDAO {
    List<Alumno> listarTodos();
    List<Alumno> filtrarPorCurso(String curso);
    boolean insertar(Alumno a);
    boolean actualizar(Alumno a);
}