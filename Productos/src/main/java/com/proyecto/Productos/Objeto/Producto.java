package com.proyecto.Productos.Objeto;

public class Producto {

    Integer id;
    String nombre;
    String marca;
    double precio;

    public Producto(Integer id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
