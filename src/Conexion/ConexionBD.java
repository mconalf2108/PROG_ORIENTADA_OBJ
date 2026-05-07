package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // 1. Configuramos las credenciales (¡Fíjate en el puerto 3307!)
    private static final String URL = "jdbc:mysql://172.22.254.28:3308/centro_educativo";
    private static final String USUARIO = "admin";
    private static final String PASSWORD = "1234";

    // 2. Creamos el método que nos devolverá la conexión lista para usar
    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Indicamos qué driver vamos a usar
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Intentamos establecer la conexión con los datos de arriba
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("¡Conexión establecida con éxito a centro_educativo!");

        } catch (ClassNotFoundException e) {
            System.out.println(" Error: No se ha encontrado el Driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" Error de credenciales o la base de datos está apagada.");
            e.printStackTrace();
        }

        return conexion;
    }
}