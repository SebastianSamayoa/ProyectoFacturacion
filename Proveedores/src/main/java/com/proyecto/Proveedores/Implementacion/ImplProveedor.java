package com.proyecto.Proveedores.Implementacion;

import com.proyecto.Proveedores.Interfaces.IntProveedor;
import com.proyecto.Proveedores.Objetos.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class ImplProveedor implements IntProveedor<Proveedor> {

    List<Proveedor> ListProveedor;

    public ImplProveedor() {
        ListProveedor = new ArrayList<>();
    }

    @Override
    public void Crear(String Nombre, String Nit) {
        try {
            Proveedor pro = new Proveedor(ListProveedor.size(), Nombre, Nit);
            ListProveedor.add(pro);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Eliminar(String Nit) {
    try {
        ListProveedor.removeIf(x->x.getNit().equals(Nit));
    }catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    }

    @Override
    public Proveedor Actualizar(String Nombre, String Nit) {

        try {
            Proveedor p = this.Buscar(Nit);
            p.setNombre(Nombre);
            return p;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }

    }

    @Override
    public List<Proveedor> ObtenerTodos() {
        return ListProveedor;
    }

    @Override
    public Proveedor Buscar(String Nit) {
        try {
            return ListProveedor.stream().filter(x->x.getNit().equals(Nit)).findFirst().orElse(null);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
