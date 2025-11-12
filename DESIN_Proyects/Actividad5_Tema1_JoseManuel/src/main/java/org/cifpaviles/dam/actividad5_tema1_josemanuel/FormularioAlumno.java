/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cifpaviles.dam.actividad5_tema1_josemanuel;

/**
 *
 * @author josemmr
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioAlumno extends JFrame {
    private JTextField txtNombre, txtApellidos, txtEmail, txtEdad, txtTelefono;
    private JLabel lblError;
    private JButton btnAgregar;

    public FormularioAlumno() {
        setTitle("Formulario Alumno");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 5, 5));

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Apellidos:"));
        txtApellidos = new JTextField();
        add(txtApellidos);

        add(new JLabel("Email:"));
        txtEmail = new JTextField();
        add(txtEmail);

        add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        add(txtEdad);

        add(new JLabel("Teléfono:"));
        txtTelefono = new JTextField();
        add(txtTelefono);

        btnAgregar = new JButton("Añadir");
        add(btnAgregar);

        lblError = new JLabel("No se pueden agregar más de 5 alumnos.");
        lblError.setForeground(Color.RED);
        lblError.setVisible(false);
        add(lblError);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarAlumno();
            }
        });
    }

    private void agregarAlumno() {
        if (Principal.indice >= Principal.alumnos.length) {
            lblError.setVisible(true);
            return;
        }

        try {
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            String email = txtEmail.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String telefono = txtTelefono.getText();

            Alumno nuevo = new Alumno(nombre, apellidos, email, edad, telefono);
            Principal.alumnos[Principal.indice] = nuevo;
            Principal.indice++;

            lblError.setVisible(false);
            limpiarCampos();

            JOptionPane.showMessageDialog(this,
                "Alumno agregado correctamente. Total alumnos: " + Principal.indice);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una edad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEmail.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
    }
}

