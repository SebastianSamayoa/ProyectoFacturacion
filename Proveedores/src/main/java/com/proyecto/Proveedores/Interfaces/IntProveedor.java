package com.proyecto.Proveedores.Interfaces;

import java.util.List;

public interface IntProveedor<Proveedor> {
    void Crear(String Nombre, String Nit);
    void Eliminar(String Nit);
    Proveedor Actualizar(String Nombre, String Nit);
    List<Proveedor> ObtenerTodos();
    Proveedor Buscar(String Nit);
}
