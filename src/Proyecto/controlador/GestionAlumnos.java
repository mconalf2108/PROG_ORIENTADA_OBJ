package Proyecto.controlador;

import java.util.List;
import Proyecto.modelo.Alumno;
import Proyecto.modelo.IAlumnoDAO;
import Proyecto.modelo.bbdd_mysql.AlumnoDAOMySQL;

public class GestionAlumnos {
    private IAlumnoDAO dao;

    public GestionAlumnos(String origenDatos) {
        if (origenDatos.equalsIgnoreCase("BBDD")) {
            this.dao = new AlumnoDAOMySQL();
        }
    }

    public List<Alumno> obtenerAlumnos(String filtroCurso) {
        if (filtroCurso.equals("Todos los cursos")) {
            return dao.listarTodos();
        }
        return dao.filtrarPorCurso(filtroCurso);
    }

    public boolean registrarNuevoAlumno(Alumno a) {
        return dao.insertar(a);
    }
    public boolean modificarAlumno(Alumno a) {
        return dao.actualizar(a);
    }
}