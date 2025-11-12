/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.cifpaviles.dam.actividad5_tema1_josemanuel;

/**
 *
 * @author josemmr
 */
public class Principal {

    public static Alumno[] alumnos = new Alumno[5];
    public static int indice = 0;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FormularioAlumno formulario = new FormularioAlumno();
                formulario.setVisible(true);
            }
        });
    }
}

