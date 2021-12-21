package com.example.amst7.clases;

public class ListLibro {
    public String nombre;
    public String autor;
    public String editorial;
    public String categoria;
    public String descripcion;
    public int imagen;
    /**
     * Clase que crea cada objeto Libro
     * */
    public ListLibro(String nombre, String autor, String editorial, String categoria, String descripcion, int imagen ) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
