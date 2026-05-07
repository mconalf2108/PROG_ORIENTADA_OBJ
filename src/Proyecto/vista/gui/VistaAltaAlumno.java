package Proyecto.vista.gui;

import javax.swing.*;
import java.awt.*;

public class VistaAltaAlumno extends JFrame {
    public JTextField txtNombre, txtEmail;
    public JComboBox<String> comboMayorEdad, comboCurso;
    public JButton btnGuardar, btnCancelar;

    public VistaAltaAlumno() {
        setTitle("Nuevo Registro de Alumno");
        setSize(350, 300);
        setLayout(new GridLayout(5, 2, 15, 15));

        add(new JLabel("Nombre Completo:")); txtNombre = new JTextField(); add(txtNombre);
        add(new JLabel("Correo Electrónico:")); txtEmail = new JTextField(); add(txtEmail);
        add(new JLabel("¿Es mayor de edad?:")); comboMayorEdad = new JComboBox<>(new String[]{"Si", "No"}); add(comboMayorEdad);

        add(new JLabel("Curso Matriculado:"));
        comboCurso = new JComboBox<>(new String[]{"1 DAW", "2 DAW", "1 DAM", "2 DAM", "1 SMR", "2 SMR"});
        add(comboCurso);

        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        add(btnGuardar);
        add(btnCancelar);

        setLocationRelativeTo(null);
    }
}