package com.proyecto.Proveedores.Objetos;

public class Proveedor {
    Integer Id;
    String Nombre;
    String Nit;

    public Proveedor(Integer id, String nombre, String nit) {
        Id = id;
        Nombre = nombre;
        Nit = nit;
    }

    public Proveedor() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Nit='" + Nit + '\'' +
                '}';
    }
}
