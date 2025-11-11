/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.cifpaviles.dam.actividad4_tema1_josemanuel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 *
 * @author josemmr
 */
public class Actividad4_Tema1_JoseManuel extends JFrame{

    private final Dimension tamañoInicial = new Dimension(400, 300);
    private final Dimension tamañoRedimensionado = new Dimension(600, 400);

    private JButton btnColor;
    private JButton btnRedimensionar;
    private JButton btnRestaurar;

    public Actividad4_Tema1_JoseManuel() {
        
        setTitle("Interfaz con botones funcionales");
        setSize(tamañoInicial);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        btnColor = new JButton("Cambiar color de fondo");
        btnRedimensionar = new JButton("Redimensionar a 600x400");
        btnRestaurar = new JButton("Restaurar tamaño original");

        setLayout(new FlowLayout()); 
        add(btnColor);
        add(btnRedimensionar);
        add(btnRestaurar);

        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                Color colorAleatorio = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                getContentPane().setBackground(colorAleatorio);
            }
        });

        btnRedimensionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(tamañoRedimensionado);
            }
        });

        btnRestaurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(tamañoInicial);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Actividad4_Tema1_JoseManuel().setVisible(true);
            }
        });
    }
}
