package Proyecto.vista.gui;

import javax.swing.*;
import java.awt.*;

public class VistaEditarAlumno extends JFrame {
    public JTextField txtId, txtNombre, txtEmail;
    public JComboBox<String> comboMayorEdad, comboCurso;
    public JButton btnActualizar, btnCancelar;

    public VistaEditarAlumno() {
        setTitle("Modificar Datos del Alumno");
        setSize(350, 350);
        setLayout(new GridLayout(6, 2, 15, 15));

        add(new JLabel("ID Alumno:"));
        txtId = new JTextField();
        txtId.setEnabled(false); // No se puede tocar la ID
        add(txtId);

        add(new JLabel("Nombre:")); txtNombre = new JTextField(); add(txtNombre);
        add(new JLabel("Email:")); txtEmail = new JTextField(); add(txtEmail);
        add(new JLabel("Mayor de edad:")); comboMayorEdad = new JComboBox<>(new String[]{"Si", "No"}); add(comboMayorEdad);
        add(new JLabel("Curso:"));
        comboCurso = new JComboBox<>(new String[]{"1 DAW", "2 DAW", "1 DAM", "2 DAM", "1 SMR", "2 SMR"});
        add(comboCurso);

        btnActualizar = new JButton("Actualizar");
        btnCancelar = new JButton("Cancelar");
        add(btnActualizar);
        add(btnCancelar);

        setLocationRelativeTo(null);
    }
}