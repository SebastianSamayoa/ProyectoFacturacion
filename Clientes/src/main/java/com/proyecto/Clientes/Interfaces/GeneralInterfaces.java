package com.proyecto.Clientes.Interfaces;

import java.util.List;

public interface GeneralInterfaces <E> {
    void Crear(E e);
    void Editar(E e);
    void Eliminar(Integer Id);
    E Buscar(Integer Id);
    List<E> ObtenerTodos();
}
