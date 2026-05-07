package Proyecto.vista;

import javax.swing.*;
import java.awt.*;

public class VistaListadoAlumnos extends JFrame {
    public JTable tablaAlumnos;
    public JComboBox<String> comboCursos;
    public JButton btnRefrescar, btnIrAAñadir;

    public VistaListadoAlumnos() {
        setTitle("Gestión de Alumnos - Centro Educativo");
        setSize(750, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Filtrar por curso:"));

        // Añadimos todos los cursos solicitados
        comboCursos = new JComboBox<>(new String[]{
                "Todos los cursos", "1 DAW", "2 DAW", "1 DAM", "2 DAM", "1 SMR", "2 SMR"
        });
        btnRefrescar = new JButton("Refrescar");
        btnIrAAñadir = new JButton("Añadir alumno");

        panelSuperior.add(comboCursos);
        panelSuperior.add(btnRefrescar);
        panelSuperior.add(btnIrAAñadir);

        tablaAlumnos = new JTable();
        // Evitamos que el usuario pueda editar las celdas directamente en la tabla
        tablaAlumnos.setDefaultEditor(Object.class, null);

        add(panelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(tablaAlumnos), BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }
}