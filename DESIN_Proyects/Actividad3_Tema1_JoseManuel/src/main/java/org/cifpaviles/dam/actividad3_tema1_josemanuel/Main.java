/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cifpaviles.dam.actividad3_tema1_josemanuel;

/**
 *
 * @author josemmr
 */
public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Manel Morales", 22, "2º DAM", (float) 9.5);
        alumno1.mostrarInfo();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 471, (float) 19.99);
        System.out.println("\nLibro: " + libro1.getTitulo() + " de " + libro1.getAutor());
    }
}