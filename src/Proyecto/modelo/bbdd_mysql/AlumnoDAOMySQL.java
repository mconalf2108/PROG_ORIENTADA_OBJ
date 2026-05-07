package Proyecto.modelo.bbdd_mysql;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Proyecto.modelo.Alumno;
import Proyecto.modelo.IAlumnoDAO;

public class AlumnoDAOMySQL implements IAlumnoDAO {

    @Override
    public List<Alumno> listarTodos() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumno";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String nombreCurso = "1 DAW"; // Aquí iría la lógica de tu tabla curso real
                if(rs.getInt("id_curso") == 2) nombreCurso = "2 DAM";

                lista.add(new Alumno(
                        rs.getInt("id_alumno"), rs.getString("nombre"), rs.getString("email"),
                        rs.getInt("isMayorEdad"), rs.getInt("id_curso"), nombreCurso
                ));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }

    @Override
    public List<Alumno> filtrarPorCurso(String curso) {
        List<Alumno> filtrados = new ArrayList<>();
        for (Alumno a : listarTodos()) {
            if (a.getNombreCurso().equals(curso)) {
                filtrados.add(a);
            }
        }
        return filtrados;
    }

    @Override
    public boolean insertar(Alumno a) {
        String sql = "INSERT INTO alumno (nombre, email, isMayorEdad, id_curso) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getEmail());
            ps.setInt(3, a.getIsMayorEdad());
            ps.setInt(4, a.getIdCurso());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) { return false; }
    }
    @Override
    public boolean actualizar(Alumno a) {
        String sql = "UPDATE alumno SET nombre = ?, email = ?, isMayorEdad = ?, id_curso = ? WHERE id_alumno = ?";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, a.getNombre());
            ps.setString(2, a.getEmail());
            ps.setInt(3, a.getIsMayorEdad());
            ps.setInt(4, a.getIdCurso());
            ps.setInt(5, a.getId()); // La ID es clave para saber a quién actualizar

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}