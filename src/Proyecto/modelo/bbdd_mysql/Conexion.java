package Proyecto.modelo.bbdd_mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    // ¡Ojo! Estos son los datos de tu Máquina Virtual por VPN
    private static final String URL = "jdbc:mysql://172.22.254.28:3308/centro_educativo";
    private static final String USUARIO = "admin";
    private static final String CLAVE = "1234";

    public static Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (Exception e) {
            System.err.println(" Error de conexión: " + e.getMessage());
        }
        return cn;
    }
}