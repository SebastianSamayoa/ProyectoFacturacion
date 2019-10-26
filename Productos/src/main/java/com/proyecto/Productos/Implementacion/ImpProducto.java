package com.proyecto.Productos.Implementacion;

import com.proyecto.Productos.Interface.IntProducto;
import com.proyecto.Productos.Objeto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ImpProducto implements IntProducto {

    List<Producto> ListProducto;

    public ImpProducto() {
        ListProducto = new ArrayList<>();
    }

    @Override
    public void Crear(String nombre, String marca, double precio) {
        try {
            Producto producto = new Producto(ListProducto.size(),nombre,marca,precio);
            ListProducto.add(producto);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Producto Buscar(Integer id) {
        try {
            return ListProducto.stream().filter(x->x.getId()==id).findFirst().orElse(null);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public void Eliminar(Integer id) {
        try {
            ListProducto.removeIf(x->x.getId()==id);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Producto> Obtenertodos() {
        return ListProducto;
    }

    @Override
    public Producto Actualizar(Integer id, String nombre, String marca, double precio) {
        Producto p = this.Buscar(id);
        p.setMarca(marca);
        p.setNombre(nombre);
        p.setPrecio(precio);
        return p;
    }

}