package com.proyecto.Clientes.Objeto;

public class Telefono {
    Integer Id;
    String Telefono;

    public Telefono(Integer id, String telefono) {
        Id = id;
        Telefono = telefono;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
