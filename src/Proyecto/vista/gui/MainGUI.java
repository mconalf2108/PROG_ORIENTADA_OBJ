package Proyecto.vista.gui;


import Proyecto.controlador.GestionAlumnos;
import Proyecto.vista.VistaListadoAlumnos;

import javax.swing.UIManager;

public class MainGUI {
    public static void main(String[] args) {
        // Poner estilo  a las ventanas
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception e) {}

        // 1. Iniciamos el Controlador
        GestionAlumnos controlador = new GestionAlumnos("BBDD");

        // 2. Iniciamos las Vistas
        VistaListadoAlumnos vListado = new VistaListadoAlumnos();
        VistaAltaAlumno vAlta = new VistaAltaAlumno();
        VistaEditarAlumno vEditar = new VistaEditarAlumno(); // NUEVA

        // 3. Unimos todo con el Escuchador
        new EscuchadorAlumnos(vListado, vAlta,vEditar, controlador);

        // 4. Mostramos la ventana principal
        vListado.setVisible(true);
    }
}