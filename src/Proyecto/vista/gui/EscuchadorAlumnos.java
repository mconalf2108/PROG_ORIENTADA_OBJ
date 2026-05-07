package Proyecto.vista.gui;

import Proyecto.controlador.GestionAlumnos;
import Proyecto.modelo.Alumno;
import Proyecto.vista.VistaListadoAlumnos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class EscuchadorAlumnos implements ActionListener {
    private VistaListadoAlumnos vListado;
    private VistaAltaAlumno vAlta;
    private VistaEditarAlumno vEditar;
    private GestionAlumnos servicio;

    public EscuchadorAlumnos(VistaListadoAlumnos vListado, VistaAltaAlumno vAlta, VistaEditarAlumno vEditar, GestionAlumnos servicio) {
        this.vListado = vListado;
        this.vAlta = vAlta;
        this.vEditar = vEditar;
        this.servicio = servicio;

        // Eventos de botones
        this.vListado.btnRefrescar.addActionListener(this);
        this.vListado.btnIrAAñadir.addActionListener(this);
        this.vAlta.btnCancelar.addActionListener(this);
        this.vAlta.btnGuardar.addActionListener(this);
        this.vEditar.btnCancelar.addActionListener(this);
        this.vEditar.btnActualizar.addActionListener(this);

        // NUEVO: Editar al hacer DOBLE CLIC en una fila
        this.vListado.tablaAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Detecta doble clic
                    int fila = vListado.tablaAlumnos.getSelectedRow();
                    if (fila != -1) {
                        prepararEdicion(fila);
                    }
                }
            }
        });

        refrescarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vListado.btnRefrescar) {
            refrescarTabla();
        } else if (e.getSource() == vListado.btnIrAAñadir) {
            vAlta.setVisible(true); vListado.setVisible(false);
        } else if (e.getSource() == vAlta.btnCancelar) {
            vAlta.setVisible(false); vListado.setVisible(true);
        } else if (e.getSource() == vEditar.btnCancelar) {
            vEditar.setVisible(false); vListado.setVisible(true);
        } else if (e.getSource() == vAlta.btnGuardar) {
            guardarAlumno();
        } else if (e.getSource() == vEditar.btnActualizar) {
            actualizarAlumnoBD();
        }
    }

    private void refrescarTabla() {
        // ID está en el modelo (columna 0) pero la ocultaremos en la vista
        String[] columnas = {"ID", "Nombre", "Email", "Mayor de edad", "Curso"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        String filtro = (String) vListado.comboCursos.getSelectedItem();
        List<Alumno> lista = servicio.obtenerAlumnos(filtro);

        for (Alumno a : lista) {
            Object[] fila = {a.getId(), a.getNombre(), a.getEmail(), a.getMayorEdadTexto(), a.getNombreCurso()};
            modelo.addRow(fila);
        }

        vListado.tablaAlumnos.setModel(modelo);
        // OCULTAR COLUMNA ID VISUALMENTE
        vListado.tablaAlumnos.removeColumn(vListado.tablaAlumnos.getColumnModel().getColumn(0));
    }

    private int obtenerIdCurso(String nombreCurso) {
        switch (nombreCurso) {
            case "1 DAW": return 1;
            case "2 DAW": return 2;
            case "1 DAM": return 3;
            case "2 DAM": return 4;
            case "1 SMR": return 5;
            case "2 SMR": return 6;
            default: return 1;
        }
    }

    private void prepararEdicion(int fila) {
        // Accedemos al modelo porque la columna 0 (ID) está oculta en la vista
        int id = (int) vListado.tablaAlumnos.getModel().getValueAt(fila, 0);
        String nombre = (String) vListado.tablaAlumnos.getModel().getValueAt(fila, 1);
        String email = (String) vListado.tablaAlumnos.getModel().getValueAt(fila, 2);
        String mayor = (String) vListado.tablaAlumnos.getModel().getValueAt(fila, 3);
        String curso = (String) vListado.tablaAlumnos.getModel().getValueAt(fila, 4);

        vEditar.txtId.setText(String.valueOf(id));
        vEditar.txtNombre.setText(nombre);
        vEditar.txtEmail.setText(email);
        vEditar.comboMayorEdad.setSelectedItem(mayor);
        vEditar.comboCurso.setSelectedItem(curso);

        vEditar.setVisible(true);
        vListado.setVisible(false);
    }

    private void guardarAlumno() {
        int isMayor = vAlta.comboMayorEdad.getSelectedItem().equals("Si") ? 1 : 0;
        int idCurso = obtenerIdCurso((String) vAlta.comboCurso.getSelectedItem());

        Alumno a = new Alumno(0, vAlta.txtNombre.getText(), vAlta.txtEmail.getText(), isMayor, idCurso, "");
        if (servicio.registrarNuevoAlumno(a)) {
            JOptionPane.showMessageDialog(vAlta, "Guardado con éxito");
            vAlta.setVisible(false); vListado.setVisible(true);
            refrescarTabla();
        }
    }

    private void actualizarAlumnoBD() {
        int id = Integer.parseInt(vEditar.txtId.getText());
        int isMayor = vEditar.comboMayorEdad.getSelectedItem().equals("Si") ? 1 : 0;
        int idCurso = obtenerIdCurso((String) vEditar.comboCurso.getSelectedItem());

        Alumno a = new Alumno(id, vEditar.txtNombre.getText(), vEditar.txtEmail.getText(), isMayor, idCurso, "");
        if (servicio.modificarAlumno(a)) {
            JOptionPane.showMessageDialog(vEditar, "Actualizado con éxito");
            vEditar.setVisible(false); vListado.setVisible(true);
            refrescarTabla();
        }
    }
}