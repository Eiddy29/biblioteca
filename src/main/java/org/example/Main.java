package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private String codigo;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getcodigo() {
        return codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public String toString() {
        return "Libro{" +
                "titulo=" + titulo + '\'' +
                " autor=" + autor + '\'' +
                " codigo=" + codigo + '\'' +
                " disponible=" + disponible +
                '}';
    }
}

class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro se agrego correctamente.");
    }

    public void buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(libro);
                return;
            }
        }
        System.out.println("El nombre del libro no se encuentra en la base.");
    }

    public void buscarLibroPorAutor(String autor) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros de ese autor.");
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No se han guardado libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
