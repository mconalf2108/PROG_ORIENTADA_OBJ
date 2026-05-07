package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlumnoDAO {

    // 1. CREATE: Insertar un nuevo alumno
    public void insertarAlumno(String nombre, String email, int isMayorEdad, int idCurso) {
        String sql = "INSERT INTO alumno (nombre, email, isMayorEdad, id_curso) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionBD.conectar();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, nombre);
            pst.setString(2, email);
            pst.setInt(3, isMayorEdad);
            pst.setInt(4, idCurso);

            pst.executeUpdate();
            System.out.println("✅ Alumno '" + nombre + "' insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar alumno.");
            e.printStackTrace();
        }
    }

    // 2. READ: Mostrar todos los alumnos
    public void mostrarAlumnos() {
        String sql = "SELECT * FROM alumno";
        try (Connection con = ConexionBD.conectar();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            System.out.println("\n--- LISTA DE ALUMNOS ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_alumno") +
                        " | Nombre: " + rs.getString("nombre") +
                        " | Email: " + rs.getString("email"));
            }
            System.out.println("------------------------\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3. UPDATE: Modificar el email de un alumno usando su ID
    public void actualizarEmail(int idAlumno, String nuevoEmail) {
        String sql = "UPDATE alumno SET email = ? WHERE id_alumno = ?";
        try (Connection con = ConexionBD.conectar();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, nuevoEmail);
            pst.setInt(2, idAlumno);

            int filas = pst.executeUpdate();
            if (filas > 0) {
                System.out.println("✏️ Email actualizado correctamente para el ID " + idAlumno);
            } else {
                System.out.println("⚠️ No se encontró ningún alumno con el ID " + idAlumno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 4. DELETE: Borrar un alumno de la base de datos
    public void borrarAlumno(int idAlumno) {
        String sql = "DELETE FROM alumno WHERE id_alumno = ?";
        try (Connection con = ConexionBD.conectar();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, idAlumno);

            int filas = pst.executeUpdate();
            if (filas > 0) {
                System.out.println("🗑️ Alumno con ID " + idAlumno + " borrado del sistema.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}