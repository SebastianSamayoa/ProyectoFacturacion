package com.proyecto.Productos.Interface;

import com.proyecto.Productos.Objeto.Producto;
import java.util.List;

public interface IntProducto {

    void Crear(String nombre, String marca, double precio);
    Producto Buscar(Integer id);
    void Eliminar(Integer id);
    List<Producto> Obtenertodos();
    Producto Actualizar(Integer id, String nombre, String marca, double precio);
}
